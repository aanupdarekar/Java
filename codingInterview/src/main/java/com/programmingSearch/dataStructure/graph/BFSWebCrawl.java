package com.programmingSearch.dataStructure.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BFSWebCrawl {

	private Queue<String> queue;
	private ArrayList<String> discoverWebsiteList;

	public static void main(String[] args) {
		BFSWebCrawl bfs = new BFSWebCrawl();
		bfs.bfscrawl("https://www.3m.com/");
	}

	public BFSWebCrawl() {
		queue = new LinkedList<String>();
		discoverWebsiteList = new ArrayList<String>();
	}

	private void bfscrawl(String root) {

		queue.add(root);
		discoverWebsiteList.add(root);

		while (!queue.isEmpty()) {

			String weburl = queue.remove();
			String htmlContent = readUrl(weburl);

			String regexp = "http://(\\w+\\.)*(\\w+)";
			Pattern pattern = Pattern.compile(regexp);
			Matcher match = pattern.matcher(htmlContent);

			while (match.find()) {
				String actualUrl = match.group();

				if (!discoverWebsiteList.contains(actualUrl)) {
					discoverWebsiteList.add(actualUrl);
					System.out.println(" " + actualUrl);
					queue.add(actualUrl);
				}
			}
		}
	}

	private String readUrl(String weburl) {

		System.out.println("Reading url");
		String rawHTML = "";
		URL url;
		try {
			url = new URL(weburl);

			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String readLine = "";
			while ((readLine = in.readLine()) != null) {
				rawHTML += readLine;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rawHTML;
	}

}
