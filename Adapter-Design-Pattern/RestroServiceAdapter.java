public class RestroServiceAdapter implements IMultiRestroApp {
    private final RestroService restroService;

    public RestroServiceAdapter() {
        restroService = new RestroService();
    }

    @Override
    public void displayIntro(XMLData xmlData) {
        JsonData jsonData = convertXMLToJSON(xmlData);
        System.out.println("Displaying fancy menu using converted JSON data...");
        restroService.displayIntro(jsonData);
    }

    private JsonData convertXMLToJSON(XMLData xmlData) {
        // Convert XMLData to JsonData (this is just a mock implementation)
        // In a real application, you'd use a library or parser to perform this
        // conversion
        String xmlContent = xmlData.getXmlContent();
        String jsonContent = "{\"convertedData\": \"" + xmlContent + "\"}"; // Mock conversion
        return new JsonData(jsonContent);
    }
}
