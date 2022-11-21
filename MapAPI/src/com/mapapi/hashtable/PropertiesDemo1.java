package com.mapapi.hashtable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class PropertiesDemo1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
//		properties.setProperty("username", "vaibhav");
//		properties.setProperty("password", "vaibhav@123");
//		properties.setProperty("url","localhst:8080");
//		

		properties.setProperty("aaa", "bbb");

		// load the method ->to read/load the properties from a.properties
		properties.load(new FileInputStream("D:\\Vaibhtz45\\MapAPI\\src\\com\\mapapi\\hashtable\\a.properties"));

		System.out.println(properties.get("url"));
		System.out.println(properties.get("password"));
		System.out.println(properties.get("username"));

		properties.setProperty("AAA", "111");

		System.out.println(properties);
		properties.store(System.out,"a");//this method store new object to the streamā
	}

}
