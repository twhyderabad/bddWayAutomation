package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by apreeti on 12/28/17.
 */
public class DriverManager {
    public static WebDriver driver = null;
    public static String URL;

   public DriverManager(){
        System.setProperty("webdriver.chrome.driver", "<chromedrive_path>");
        driver = new ChromeDriver();
        driver.get("http://localhost:3000");
    }

    public static WebDriver getDriver (){
        return driver;
    }

}
