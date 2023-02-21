package com.Practice_Automation.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class ConfigDataProvider {
	
	public Properties pro;
	public ConfigDataProvider() throws IOException
	{
		String path=System.getProperty("user.dir")+"/config/config.properties";
		try {
			FileInputStream file= new FileInputStream(path);
			pro =new Properties();
			pro.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public String geturl()
	{
		return pro.getProperty("url");
	}
	public String  getUser()
	{
		return pro.getProperty("id");
	}
	public String getPass()
	{
		return pro.getProperty("pass");
	}
	public String getHomeUrl()
	{
		return pro.getProperty("homeUrl");
	}

}
