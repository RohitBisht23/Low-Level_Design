class Ractangle {
    int length;
    int breadth;

    int getArea() {
        return length * breadth;
    }
}

class ractangle_class {
    public static void main(String[] args) {
        Ractangle r1 = new Ractangle();
        r1.length = 10;
        r1.breadth = 20;

        System.out.println(r1.getArea());
    }
}