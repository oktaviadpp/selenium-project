package app.entities.authentication;

import common.closeWeb;
import common.launchWeb;
import global.variables;
import org.openqa.selenium.By;

public class userSuccessfullyLogin extends launchWeb{
    public static void main(String[] args) {
        //launch web using common package
        new launchWeb();
        //call global variables class
        variables variable = new variables();

        //open login page
        driver.get("https://secondhand.binaracademy.org/users/sign_in");
        driver.findElement(By.id("user_email")).sendKeys(variable.correctEmail);
        driver.findElement(By.id("user_password")).sendKeys(variable.correctPwd);
        driver.findElement(By.name("commit")).click();

        //close web using common package
        closeWeb closeweb = new closeWeb();
        closeweb.close();
    }
}
