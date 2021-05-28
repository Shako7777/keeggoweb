package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarrinhoPage extends BasePage{
    public CarrinhoPage(WebDriver driver) {
        super(driver);
    }

    public CarrinhoPage fazerLogin(String username){
        driver.findElement(By.name("usernameInOrderPayment")).sendKeys(username);
        return this;
    }

    public CarrinhoPage digitarSenha(String password){
        driver.findElement(By.name("passwordInOrderPayment")).sendKeys(password);
        return this;
    }

    public OrderPaymentPage clicarBotaoLogin(){
        driver.findElement(By.id("login_btnundefined")).click();
        return new OrderPaymentPage(driver);
    }
}
