package com.carbook.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {

	public static Properties prop = new Properties();

	public ConfigReader() throws Exception {
		File f = new File(System.getProperty("user.dir")
				+ "\\src\\test\\resource\\com\\carbook\\config\\Configration.properties");
		FileInputStream fin = new FileInputStream(f);
		prop.load(fin);

	}
	
	public String getUrl() throws Exception {
		String property = prop.getProperty("url");
		if (property==null) {
			throw new Exception();
		}
		return property;
	}
	
	public String getimplicity() throws Exception {
		String property = prop.getProperty("implicitwait");
		if (property==null) {
			throw new Exception();
		}
		return property;
	}
	
	public String getBrowserName() throws Exception {
		String property = prop.getProperty("browserName");
		if (property==null) {
			throw new Exception();
		}
		return property;
	}

}
