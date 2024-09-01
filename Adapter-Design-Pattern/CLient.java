public class Client {
    public static void main(String[] args) {
        // Create XMLData with sample XML content
        XMLData xmlData = new XMLData("<data><item>Example</item></data>");

        // Create an adapter instance
        IMultiRestroApp adapter = new RestroServiceAdapter();

        // Use the adapter to display the introduction
        adapter.displayIntro(xmlData);
    }
}
