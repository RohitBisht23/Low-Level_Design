public class MultiRestroApp implements IMultiRestroApp {
    @Override
    public void displayIntro(XMLData xmlData) {
        // Example implementation to display XML data
        System.out.println("Displaying using XML data...");
        System.out.println(xmlData.getXmlContent());
    }
}
