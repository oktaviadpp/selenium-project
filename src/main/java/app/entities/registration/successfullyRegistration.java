package app.entities.registration;

import common.launchWeb;
import global.randomAccess;
import global.variables;
import org.openqa.selenium.By;

public class successfullyRegistration extends launchWeb {
    public static void main(String[] args) {
        new launchWeb();
        variables variable = new variables();
        randomAccess rndm = new randomAccess();

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
//        Assert.assertEquals(driver.findElement(By.xpath("//div[@role=\"alert\"]")).getText(), "Welcome! You have signed up successfully.");
//        System.out.println("sukses");
    }
}
