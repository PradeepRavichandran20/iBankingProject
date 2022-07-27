package org.iBankingProject.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	// Object Creation for property class
	Properties pro;

	// Constructor Creation

	public ReadConfig() {

		File src = new File("./Configuration/config.properties");

		try {
			// Open and Read data
			FileInputStream fis = new FileInputStream(src);
			// Initializing object
			pro = new Properties();
			// Load the property file
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());

		}

	}

	// Calling method from baseClass
	public String getApplicationURL() {
		String url = pro.getProperty("baseurl");
		return url;
	}

	public String getUsername() {
		String username = pro.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}

	public String getChromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;

	}

	public String getFirefoxpath() {
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;

	}

}
