package com.SauceDemo1.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass 
{
		public static void ScreenshotMethod(WebDriver driver) throws IOException 
{   
		//date&time format code
				Date d=new Date();
				DateFormat d1= new SimpleDateFormat("MM-dd-yy & hh-mm-ss");
				String date=d1.format(d);
				//System.out.println(date);
				
				//scrennshot
				
				TakesScreenshot ts= (TakesScreenshot)driver;
				File sourcefile =ts.getScreenshotAs(OutputType.FILE);
				File dest=new File("C:\\\\Users\\\\apande\\\\Downloads\\\\Screenshot\\\\filepp"+date+".jpg");
				FileHandler.copy(sourcefile, dest);
				System.out.println("screemshot is taken");
}
}