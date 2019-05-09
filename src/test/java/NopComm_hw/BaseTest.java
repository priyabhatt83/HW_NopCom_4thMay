package NopComm_hw;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src\\test\\resourses\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();//getting chrome browser
        //implicit wait applied
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //asking driver to get URL
        driver.get("https://demo.nopcommerce.com/");
        //driver manage the window to maximise
        //driver.manage().window().maximise();
    }
//     @After
//    public void closeBrowser () {
//     driver.close(); }

}
