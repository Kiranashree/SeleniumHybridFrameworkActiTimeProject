package com.actitime.demo.generic;

public interface IAutoConstant {
	
	//by default all variables in interface are public static final
	String CONFIG_PATH = "./config.properties";
	String EXCEL_PATH = "./testdata/inputdata.xlsx";
	String GECKO_KEY = "webdriver.gecko.driver";
	String GECKO_VALUE = "./driver/geckodriver.exe";
	String CHROME_KEY = "webdriver.chrome.driver";
	String CHROME_VALUE = "./driver/chromedriver.exe";
	String IE_KEY = "webdriver.ie.driver";
	String IE_VALUE = "./driver/IEDriverServer.exe";

}
