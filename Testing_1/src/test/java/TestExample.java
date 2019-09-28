import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestExample {
 public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver wd=new ChromeDriver();

wd.get("http://deluxe-menu.com/popup-mode-sample.html");
wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	 
	 
	 
	 
	 
}
}
