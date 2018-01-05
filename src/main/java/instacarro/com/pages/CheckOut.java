package instacarro.com.pages;
/*
 * Instacarro QA Automation Test
 * Author: Rafael E. Medrano
 * Date: 1/3/2018
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//This class will store the useful locators within the CheckOut page
public class CheckOut
{
    WebDriver driver;

    By email = By.id("email");
    By Name = By.id("name");
    By Address = By.id("address");
    By CardType = By.id("card_type");//Option to be selected will be "Visa"
    By CardNumber = By.id("card_number");
    By CardholderName = By.id("cardholder_name");
    By VerificationCode = By.id("verification_code");
    By PlaceOrderButton = By.cssSelector("#wsb-element-00000000-0000-0000-0000-000452010925 > div > div > form > div > button");

    public CheckOut(WebDriver driver)
    {
        this.driver = driver;
    }

    public void FormCompletion (String u_email, String u_name, String u_Address, String u_CardTypeOption, String u_CardNumber, String u_CardholderName, String u_VerificationCode)
    {
        driver.findElement(email).sendKeys(u_email);
        driver.findElement(Name).sendKeys(u_name);
        driver.findElement(Address).sendKeys(u_Address);
        //Select from the dropdown options
        Select CardTypeDropdown = new Select(driver.findElement(CardType));
        CardTypeDropdown.selectByVisibleText(u_CardTypeOption);

        driver.findElement(CardNumber).sendKeys(u_CardNumber);
        driver.findElement(CardholderName).sendKeys(u_CardholderName);
        driver.findElement(VerificationCode).sendKeys(u_VerificationCode);
    }

    public void PlaceAnOrder()
    {
        driver.findElement(PlaceOrderButton).click();
    }
}
