package com.Bectron.Flixpert.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String readTheDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("src/test/resource/Content.properties");
		Properties poj=new Properties();
		poj.load(fis);
		String value =poj.getProperty(key);
		return value;
	}
	}

