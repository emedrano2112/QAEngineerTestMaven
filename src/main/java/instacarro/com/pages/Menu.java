package instacarro.com.pages;
/*
 * Instacarro QA Automation Test
 * Author: Rafael E. Medrano
 * Date: 1/3/2018
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

//This class will store the useful locators within the Menu page
public class Menu
{
    WebDriver driver;

    By CheckOut = By.cssSelector("#wsb-button-00000000-0000-0000-0000-000451955160 > span");
    By Tittle = By.cssSelector("#wsb-element-00000000-0000-0000-0000-000450914921 > div > h1");

    public Menu(WebDriver driver)
    {
        this.driver = driver;
    }

    public void ClickCheckout()
    {
        driver.findElement(CheckOut).click();
    }

    public void PlaceOrderSucceed()
    {
        Assert.assertEquals(driver.findElement(Tittle).getText(), "Menu");
        System.out.println("ORDER PLACED");
    }
}
