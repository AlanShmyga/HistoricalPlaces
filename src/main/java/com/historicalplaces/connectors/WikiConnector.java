package com.historicalplaces.connectors;

/*
 * This class contains all required methods to get all required info from Wikipedia
 */

public class WikiConnector {
	
	private String reqestBody = "https://en.wikipedia.org/w/"
			+ "api.php?action=query&format=json&list=geosearch&gsradius=10000&gscoord=";
	String lat;
	String lon;
	String request = reqestBody + lat + "%7C" + lon;
	
	public void sendWikiRequest(){
		
	}

}
