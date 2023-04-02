package mtWebCrawler;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<WebCrawler> bots  = new ArrayList<>();
		//bots.add(new WebCrawler("https://www.npr.org",1));
		bots.add(new WebCrawler("https://www.nytimes.com",1));
		bots.add(new WebCrawler("https://abcnews.go.com",2));
		bots.add(new WebCrawler("https://timesofindia.indiatimes.com",3));
		
	
		//bots.add(new WebCrawler("https://www.nytimes.com",3));
		// https://news.google.com
		
		for(WebCrawler w : bots ) {
			try {
				w.getThread().join();
				
			}catch(InterruptedException e ) {
				e.printStackTrace();
			}
		}

	}

}
