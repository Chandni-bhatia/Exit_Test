package com.CommonUtilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileRedaer {
	public String getReportConfigPath() throws IOException{
		
		    Properties properties;
		 FileReader reader = new FileReader("properties\\config.properties");
//	        log.info("Created an object of file reader to read the data of config.properties");
		 properties = new Properties();

		 properties.load(reader);
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
}
