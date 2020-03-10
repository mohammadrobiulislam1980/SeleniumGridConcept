package gridconcept;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridTestConcept {

	public static void main(String[] args) throws MalformedURLException {
	DesiredCapabilities cap=DesiredCapabilities.chrome();
	cap.setPlatform(Platform.WIN10);
	URL url=new URL ("http://192.168.81.1:12033/wd/hub");
	WebDriver driver=new RemoteWebDriver(url, cap);
	driver.get("https://www.facebook.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();
	driver.quit();
	
	
	}

}
