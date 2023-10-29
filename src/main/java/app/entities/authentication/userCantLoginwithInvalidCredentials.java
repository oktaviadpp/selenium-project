package app.entities.authentication;

import common.closeWeb;
import common.launchWeb;
import org.openqa.selenium.By;

import java.time.Duration;

public class userCantLoginwithInvalidCredentials extends launchWeb {
    public static void main(String[] args) {
        new launchWeb();

        //open login page
        driver.get("https://secondhand.binaracademy.org/users/sign_in");
        driver.findElement(By.id("user_email")).sendKeys("oktavi@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("1234567");
        driver.findElement(By.name("commit")).click();

        //wait error messages
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//div[@role='alert']")).getText();

        closeWeb closeweb = new closeWeb();
        closeweb.close();
    }
}
