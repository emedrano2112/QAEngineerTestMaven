package Tests;
/*
 * Instacarro QA Automation Test
 * Author: Rafael E. Medrano
 * Date: 1/3/
 * with git
 */

import instacarro.com.pages.CheckOut;
import instacarro.com.pages.Menu;
import instacarro.com.pages.Welcome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class FirstTCTest {
    @BeforeTest
    public void BrowserSetup() {
        String exePath = "C:\\Users\\Medrano\\Documents\\Selenium 2.53\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

    }

    @Test
    public void CheckOutGreenTea() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.practiceselenium.com/");
        Welcome MenuClick = new Welcome(driver);
        MenuClick.ClickMenu();//Will take us to the menu page

        Menu CheckoutClick = new Menu(driver);
        CheckoutClick.ClickCheckout();//Will take us to the checkout page

        //Fill in the checkout form
        CheckOut FormFillIn = new CheckOut(driver);
        FormFillIn.FormCompletion("candidate@test.com", "Candidate", "Candidate st, #34, Tester, Test.", "Visa", "0001 0001 0001 0001", "Candidate Tester", "123");
        //Click on Place Order
        FormFillIn.PlaceAnOrder();
        //To check if the Menu page came after the click on page order
        CheckoutClick.PlaceOrderSucceed();

        driver.quit();
    }
}
