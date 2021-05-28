package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage extends BasePage{

    public LoginFormPage(WebDriver driver) {
        super(driver);
    }

    public LoginFormPage digitarUsername(String username){
        driver.findElement(By.xpath("//div[@class='login ng-scope']")).findElement(By.name("username")).sendKeys(username);
        return this;
    }

    public LoginFormPage digitarPassword(String password){
        driver.findElement(By.name("password")).sendKeys(password);
        return this;
    }

    public CreateNewAccountPage clickCreateNewAccount(){
        driver.findElement(By.xpath("//a[@class='create-new-account ng-scope']")).click();
        return new CreateNewAccountPage(driver);
    }

    public CreateNewAccountPage criarNovaConta(String username, String password){
        digitarUsername(username);
        digitarPassword(password);
        clickCreateNewAccount();

        return new CreateNewAccountPage(driver);
    }
}
