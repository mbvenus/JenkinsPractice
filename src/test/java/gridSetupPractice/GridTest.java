package gridSetupPractice;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.ConfigReader;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridTest {

    public static void main(String[] args)  {
//        //Define Desired Capabilities
//        DesiredCapabilities capabilities =new DesiredCapabilities();
//        capabilities.setPlatform(Platform.ANY);
//        capabilities.setBrowserName("chrome");
//
//        //Merge desired capabilities
//        ChromeOptions options = new ChromeOptions();
//        options.merge(capabilities);
//
//        //Create a String variable to store hub url
//        String hubUrl ="http://192.168.1.107:4444/wd/hub";
//
//        //Create a driver object
//        WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);
//
//        //Type test codes...
//        driver.get("http://www.google.com");
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        System.out.println(Driver.getDriver().getTitle());
        Driver.getDriver().close();



    }
}
