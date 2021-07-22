package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){

    }

    private static WebDriver driver;

    public static WebDriver getDriver()  {


        if ((driver==null)){

            switch (ConfigReader.getProperty("browser")){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver =new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;

                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver =new InternetExplorerDriver();
                    break;

                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver =new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;

                case "remote_chrome":
                    try {
                    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                    desiredCapabilities.setPlatform(Platform.ANY);
                    desiredCapabilities.setBrowserName(BrowserType.CHROME);
//                    ChromeOptions chromeOptions= new ChromeOptions();
//                    chromeOptions.merge(desiredCapabilities);

                        driver= new RemoteWebDriver(new URL("http://192.168.1.107:4444/wd/hub"),desiredCapabilities);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;

                case "remote_firefox":
                    try {
                    DesiredCapabilities desiredCapabilities =new DesiredCapabilities();
                    desiredCapabilities.setPlatform(Platform.ANY);
                    desiredCapabilities.setBrowserName(BrowserType.FIREFOX);

//                        FirefoxOptions firefoxOptions = new FirefoxOptions();
//                        firefoxOptions.merge(desiredCapabilities);


                        driver=new RemoteWebDriver(new URL("http://192.168.1.107:4444/wd/hub"),desiredCapabilities);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;

    }

    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
