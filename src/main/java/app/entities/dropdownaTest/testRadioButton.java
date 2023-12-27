package app.entities.dropdownaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class testRadioButton {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice");

        driver.findElement(By.name("name")).sendKeys("Chelsea");
        driver.findElement(By.name("email")).sendKeys("chelsea@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
        driver.findElement(By.id("exampleCheck1")).click();
        WebElement gender = driver.findElement(By.id("exampleFormControlSelect1"));
        Select genders = new Select(gender);
        genders.selectByVisibleText("Female");
        driver.findElement(By.id("inlineRadio2")).click();
        driver.findElement(By.name("bday")).sendKeys("27/12/2023");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        
        if (driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).isDisplayed()) {
            Assert.assertTrue(true);
            System.out.println("its enabled");
        }

        driver.close();
    }
    
}
