package app.entities.registration;

import global.randomAccess;
import global.variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class successfullyRegistration {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        variables variable = new variables();
        randomAccess rndm = new randomAccess();

        driver.manage().window().maximize();

        //open main page
        driver.get("https://secondhand.binaracademy.org/");
        driver.findElement(By.xpath("//a[@href='/users/sign_in']")).click();

        //open login page
        driver.get("https://secondhand.binaracademy.org/users/sign_in");
        driver.findElement(By.xpath("//a[contains(@href,'sign_up')]")).click();
        driver.get("https://secondhand.binaracademy.org/users/sign_up");

        driver.findElement(By.id("user_name")).click();
        driver.findElement(By.id("user_name")).sendKeys(rndm.randomName);

        driver.findElement(By.id("user_email")).click();
        driver.findElement(By.id("user_email")).sendKeys(rndm.randomEmail);

        driver.findElement(By.id("user_password")).click();
        driver.findElement(By.id("user_password")).sendKeys(variable.correctPwd);

        driver.findElement(By.name("commit")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@role=\"alert\"]")).getText(), "Welcome! You have signed up successfully.");

        driver.close();
    }
}
