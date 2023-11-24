package app.entities.authentication;

import common.closeWeb;
import common.launchWeb;
import global.variables;
import org.openqa.selenium.By;

import java.time.Duration;

public class Log_001_003_userCantLoginwithIncoretPassword extends launchWeb {
    public static void main(String[] args) {
        new launchWeb();

        //call global variable class
        variables variable = new variables();

        //open login page
        driver.get("https://secondhand.binaracademy.org/users/sign_in");
        driver.findElement(By.id("user_email")).sendKeys(variable.correctEmail);
        driver.findElement(By.id("user_password")).sendKeys(variable.incorrectPwd);
        driver.findElement(By.name("commit")).click();

        //wait error messages
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//div[@role='alert']")).getText();

        closeWeb closeweb = new closeWeb();
        closeweb.close();
    }
}
