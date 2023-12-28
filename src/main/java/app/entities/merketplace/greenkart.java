package app.entities.merketplace;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greenkart {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(3000);

        //for get product that user add
        String[] item = {"Brocolli", "Cucumber", "Beetroot"};
        //
        
        int j =0;

        //get object product
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i=0; i<products.size(); i++) {
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();
            List itemsNeededList = Arrays.asList(item);

            if (itemsNeededList.contains(formattedName)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

                if (j==item.length) {
                    break;
                }
            }
        }
    }
}
