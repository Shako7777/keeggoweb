package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public HomePage validarPage(){
        driver.findElement(By.xpath("(//span[@class='roboto-medium ng-binding'])[2]")).getText();
        return new HomePage(driver);
    }

    public HomePage clicarEmTablets(){
        driver.findElement(By.id("tabletsImg")).click();
        return this;
    }

    public ComprarUmTabletPage comprar(){
        driver.findElement(By.name("buy_now")).click();
        return new ComprarUmTabletPage(driver);
    }




}
