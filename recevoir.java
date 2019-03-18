public class Internet extends Activity{

	void buildForecaste (String raw) throws Exception {
		DocumentBuilder builder = DocumentBuilderFactory.newInstance();
			.newDocumentBuilder();
		Document doc = builder.parse(new InputSource(new StringReader(raw)));
		NodeList forecastList = doc.getElementByTagsName("");
		for(int i=0; i<forecastList.getLength(); i++){
			Element currentFore = (Element) forecastList.item(i);
		}
		Forecast f = new Forecast();
	}

}