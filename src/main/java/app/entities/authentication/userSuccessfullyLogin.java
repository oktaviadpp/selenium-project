package app.entities.authentication;

import common.launchWeb;
import common.closeWeb;
import org.openqa.selenium.By;

public class userSuccessfullyLogin extends launchWeb{
    public static void main(String[] args) {
        //launch web using common package
        new launchWeb();

        //open login page
        driver.get("https://secondhand.binaracademy.org/users/sign_in");
        driver.findElement(By.id("user_email")).sendKeys("oktavi@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("123456");
        driver.findElement(By.name("commit")).click();

        //close web using common package
        closeWeb closeweb = new closeWeb();
        closeweb.close();
    }
}