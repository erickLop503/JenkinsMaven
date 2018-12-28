package com.Maven;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class BaseClass {

	
	
	@Test
    public void setup() {
        //System.setProperty(“webdriver.chrome.driver”, “/Users/ericklopez/Documents/JARfiles/chromedriver”);
        WebDriver  driver = new HtmlUnitDriver();
//        driver.manage().window().fullscreen();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String url= “https://opensource-demo.orangehrmlive.com/index.php/time/viewEmployeeTimesheet“;
    }

}

