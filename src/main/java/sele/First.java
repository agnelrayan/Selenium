package sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "/home/agnel/Downloads/geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		
		String url = "http://demo.guru99.com/test/newtours/";
		String expected="Welcome: Mercury Tours";
		String actual="";
		
		d.get(url);
	}

}