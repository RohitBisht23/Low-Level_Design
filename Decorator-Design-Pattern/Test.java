class Test {
    public static void main(String[] args) {
        Pizza pizza1 = new Mushroom(new CheezePizza());
        pizza1.createPizza();

        Pizza pizza2 = new Mushroom(new LoadedPizza());
        pizza2.createPizza();
    }
}
