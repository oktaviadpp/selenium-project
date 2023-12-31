package app.entities.authentication;

import global.variables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Log_001_001_userSuccessfullyLogin_v2{
    public static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) throws InterruptedException {
        login();
    }
    public static String login() throws InterruptedException {

        driver.manage().window().maximize();
        //open main page
//        driver.get("https://secondhand.binaracademy.org/");
//        driver.findElement(By.xpath("//a[@href='/users/sign_in']")).click();

        //call global variables class
        variables variable = new variables();

        //open login page
        driver.get("https://secondhand.binaracademy.org/users/sign_in");
        driver.findElement(By.id("user_email")).sendKeys(variable.correctEmail);
        driver.findElement(By.id("user_password")).sendKeys(variable.correctPwd);
        driver.findElement(By.name("commit")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@role=\"alert\"]")).getText(), "Signed in successfully.");

        String successLogin = login();

        return successLogin;
    }
}
