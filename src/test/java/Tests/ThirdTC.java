package Tests;
/*
 * Instacarro QA Automation Test
 * Author: Rafael E. Medrano
 * Date: 1/3/
 * with git
 */

import instacarro.com.pages.LetsTalkTea;
import instacarro.com.pages.Welcome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class ThirdTC //To checkout directly from the checkout button from homepage
{
    @BeforeTest
    public void BrowserSetup() {
        String exePath = "C:\\Users\\Medrano\\Documents\\Selenium 2.53\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

    }

    @Test
    public void CheckOutOnly()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.practiceselenium.com/");
        Welcome LetsTalkClick = new Welcome(driver);
        LetsTalkClick.ClickLetsTalk();//Take us to the LetsTalkPage

        LetsTalkTea FormFillIn = new LetsTalkTea(driver);
        FormFillIn.FormCompletion("Candidate", "candidate@mail.com", "Test", "Demo Test");
        FormFillIn.SubmitClick();
        FormFillIn.LetsTalkPageConfirm();
        driver.quit();
    }
}
