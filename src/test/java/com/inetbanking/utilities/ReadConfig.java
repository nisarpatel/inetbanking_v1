package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

//similar pageobject class to read properties file
public class ReadConfig {
	Properties prop;
	public ReadConfig() {
		File file=new File("./Configuration//config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(file);
			prop=new Properties();
			prop.load(fis);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public String getApplicationURL() {
		String url=prop.getProperty("baseURL");
		return url;
	}

	public String getUsername() {
		String username=prop.getProperty("username");
		return username;
	}
	public String getPasssword() {
		String password=prop.getProperty("password");
		return password;
	}
	
	public String getChromePath() {
		String chromepath=prop.getProperty("chromepath");
		return chromepath;
	}
	public String getFirefoxPath() {
		String firefoxpath=prop.getProperty("firefoxpath");
		return firefoxpath;
	}
	public String getIEPath() {
		String iepath=prop.getProperty("iepath");
		return iepath;
	}
}
