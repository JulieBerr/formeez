public class Internet extends Activity{

		private void updateForecast(){
			String url = String.format(format);
			HttpGet getMethod = new HttpGet(url);
		}
		
		try {
			ResponseHandler<String> responseHandler = new BasicResponseHandler();
			String responseBody = client.execute(getMethod, responseHandler);
			buildForecasts(responseBody);
			String page=generatePage();
			browser.loadDataWithURL(null, page, "text/html", "UTF-8", null);
		}catch (Throwable t){
			Toast.makeText(this, "La requete echoue..."+ t.toString(), 4000)
			.show();
		}
		}

}