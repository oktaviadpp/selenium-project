package app.entities.dropdownaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class dynamicDropDown {
    static WebDriver driver;
    static WebDriverWait wait;
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value=\"BLR\"]")).click();
        Thread.sleep(200);

        //for identify object uniquely
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        //checkbox
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        Assert.assertFalse(false);

        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
        //count checkbox
        System.out.println("Total checkbox is= "+driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        driver.close();
    }
}
