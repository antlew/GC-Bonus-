package com.gcbootcamp.midterm2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RandomWordsMain {

	static HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

	public static void main(String[] args) throws Exception {

		try {
			BufferedReader br = new BufferedReader(
					new FileReader("C:\\Users\\Anthony\\Desktop\\gcwork\\randomwords.txt"));
			List<String> randomWords = new ArrayList<String>();
			String word = br.readLine();

			while (word != null) {
				randomWords.add(word.replace(">", ""));
				word = br.readLine();
			}
			URLReader(randomWords);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	private static void URLReader(List<String> randomWords) throws Exception {

		BufferedReader sites = new BufferedReader(new FileReader("C:\\Users\\Anthony\\Desktop\\gcwork\\websites.txt"));
		ArrayList<String> urlList = new ArrayList<String>();
		String urls = sites.readLine();

		while (urls != null) {
			urlList.add(urls);
			urls = sites.readLine();
		}

		replaceWords(randomWords, urlList);

		sites.close();

	}

	private static void replaceWords(List<String> randomWords, ArrayList<String> urlList)
			throws MalformedURLException, IOException, FileNotFoundException {
		
		for (int i = 0; i < urlList.size(); i++) {
			System.out.println("File " + i);
			URL webSites = new URL(urlList.get(i));
			BufferedReader in = new BufferedReader(new InputStreamReader(webSites.openStream()));
			PrintWriter print = new PrintWriter("C:\\Users\\Anthony\\Desktop\\gcwork\\" + i + ".html");
			String line = "";
			while ((line = in.readLine()) != null) {
				line = compareList(randomWords, line, webSites);
				print.println(line);
			}
			print.close();
		}
	}

	private static String compareList(List<String> randomWords, String line,URL webSites) {
		for (String randomWord : randomWords) {
			line = line.replaceAll(" " + randomWord + " ", " <mark>" + randomWord + "</mark> ");

		}

		return line;
	}

}
