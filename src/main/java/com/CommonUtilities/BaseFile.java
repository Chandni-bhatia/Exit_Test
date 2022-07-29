package com.CommonUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.stepDefinations.StepDef_TestFeature1;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class BaseFile {
	public static AppiumDriver driver = null;
	 public static org.apache.logging.log4j.Logger logger =LogManager.getLogger();
	public static void setup() throws IOException {
		String xlPath = ".\\DataFiles\\TestData.xlsx";
		FileInputStream inputstream = new FileInputStream(xlPath);
		XSSFWorkbook book = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = book.getSheetAt(0);
		XSSFRow row1 = sheet.getRow(0);

		XSSFRow row2 = sheet.getRow(1);

		XSSFRow row3 = sheet.getRow(2);

		XSSFRow row4 = sheet.getRow(3);

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", row1.getCell(1).toString());
		capabilities.setCapability("deviceName", row2.getCell(1).toString());

        capabilities.setCapability("app", row3.getCell(1).toString());		

		try {
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver(url, capabilities);


		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void terminate() {

		driver.quit();

	}
}
