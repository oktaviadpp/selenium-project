package app.entities.dropdownaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //checklist
        driver.findElement(By.id("checkBoxOption1")).click();
        //verif 
        Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
        Assert.assertTrue(true);

        //uncheck
        driver.findElement(By.id("checkBoxOption1")).click();
        //verif
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
        Assert.assertFalse(false);

        //count checkbox
        driver.findElements(By.cssSelector("input[type='checkbox']")).size();
        System.out.println("Total checkbox is = "+ driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        driver.close();
    }
}
