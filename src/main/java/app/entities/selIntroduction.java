package app.entities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selIntroduction {
    public static void main(String[] args) {
        //invoking browser
        WebDriver driver = new ChromeDriver();

        //fullscreen browser
        driver.manage().window().maximize();

        //call url
        driver.get("https://simsat.pisdev.my.id/");
        // or call url by this code
//        driver.navigate().to("https://simsat.pisdev.my.id/");

        //close browser
        driver.close();
    }
}