package app.entities.authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class userSuccessfullyLogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //open main page
        driver.get("https://secondhand.binaracademy.org/");
        driver.findElement(By.xpath("//a[@href='/users/sign_in']")).click();

        //open login page
        driver.get("https://secondhand.binaracademy.org/users/sign_in");
        driver.findElement(By.id("user_email")).sendKeys("oktavi@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("123456");
        driver.findElement(By.name("commit")).click();

        driver.close();
    }
}
