package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchWeb {
    public static WebDriver driver = new ChromeDriver();
    public launchWeb() {
        driver.manage().window().maximize();

        //open main page
        driver.get("https://secondhand.binaracademy.org/");
        driver.findElement(By.xpath("//a[@href='/users/sign_in']")).click();

    }
}
