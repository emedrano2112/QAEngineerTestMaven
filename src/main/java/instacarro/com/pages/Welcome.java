package instacarro.com.pages;
/*
 * Instacarro QA Automation Test
 * Author: Rafael E. Medrano
 * Date: 1/3/2018
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//This class will store the useful locators within the Welcome page
public class Welcome
{
    WebDriver driver;

    By MenuButton = By.cssSelector("#wsb-nav-00000000-0000-0000-0000-000450914915 > ul > li:nth-child(3) > a");
    //Will take this button "SeeCollectionButton" as a checkout success confirmation
    By SeeCollectionButton = By.cssSelector("#wsb-button-00000000-0000-0000-0000-000450914890 > span");

    By MainCheckOutButton = By.cssSelector("#wsb-nav-00000000-0000-0000-0000-000450914915 > ul > li:nth-child(5) > a");

    By LetsTalkTeaTab = By.cssSelector("#wsb-nav-00000000-0000-0000-0000-000450914915 > ul > li:nth-child(4) > a");


    public Welcome(WebDriver driver)
    {
        this.driver = driver;
    }

    public void ClickMenu()
    {
        driver.findElement(MenuButton).click();
    }

    public void ClickCheckOutOnlyButton()
    {
        driver.findElement(MainCheckOutButton).click();
    }

    public void ClickLetsTalk()
    {
        driver.findElement(LetsTalkTeaTab).click();
    }

}
