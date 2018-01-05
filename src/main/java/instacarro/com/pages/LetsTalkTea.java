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

public class LetsTalkTea
{
    WebDriver driver;

    By Name = By.xpath("//*[@id=\"form_78ea690540a24bd8b9dcfbf99e999fea\"]/div[1]/div[1]/input");
    By Email = By.xpath("//*[@id=\"form_78ea690540a24bd8b9dcfbf99e999fea\"]/div[1]/div[2]/input");
    By Subject = By.xpath("//*[@id=\"form_78ea690540a24bd8b9dcfbf99e999fea\"]/div[1]/div[3]/input");
    By Description = By.xpath("//*[@id=\"form_78ea690540a24bd8b9dcfbf99e999fea\"]/div[1]/div[4]/textarea");
    By SubmitButton = By.cssSelector("#form_78ea690540a24bd8b9dcfbf99e999fea > div.form-body > div:nth-child(5) > input");
    By Tittle = By.cssSelector("#wsb-element-00000000-0000-0000-0000-000450914913 > div");

    public LetsTalkTea(WebDriver driver)
    {
        this.driver = driver;
    }

    public void FormCompletion(String u_Name, String u_Email, String u_Subject, String u_Description)
    {
        driver.findElement(Name).sendKeys(u_Name);
        driver.findElement(Email).sendKeys(u_Email);
        driver.findElement(Subject).sendKeys(u_Subject);
        driver.findElement(Description).sendKeys(u_Description);
    }

    public void SubmitClick()
    {
        driver.findElement(SubmitButton).click();
    }

    public void LetsTalkPageConfirm()
    {
        Assert.assertEquals(driver.findElement(Tittle).getText(), "Let's Talk Tea");
        System.out.print("MESSAGE SENT SUCCESSFULLY");
    }
}
