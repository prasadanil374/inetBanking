package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	// construtor to read and load the properties file
	public ReadConfig() {
		
		File src = new File("./Configurations/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}catch(Exception e){
			System.out.println("Excetion is "+ e.getMessage());
			
		}
	}
	
	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getuserName() {
		String userName = pro.getProperty("userName");
		return userName;
	}
	
	public String getpassword() {
		String password = pro.getProperty("password");
		return password;
	}
	public String getchromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}

	public String getfirefoxpath() {
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	public String getmsedgepath() {
		String msedgepath = pro.getProperty("msedgepath");
		return msedgepath;
	}
	
	public String getbrowser() {
		String browser = pro.getProperty("browser");
		return browser;
				
	}
	
	

}
