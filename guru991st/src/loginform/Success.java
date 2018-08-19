package loginform;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Success {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.demo.guru99.com/V4/");
		WebElement uname= driver.findElement(By.name("uid"));
		uname.sendKeys("mngr149903");
		WebElement pwd= driver.findElement(By.name("password"));
		pwd.sendKeys("dYnesAq");
		pwd.submit();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));

		// TODO Auto-generated method stub

	}

}
