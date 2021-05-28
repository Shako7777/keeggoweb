package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPaymentPage extends BasePage {
    public OrderPaymentPage(WebDriver driver) {
        super(driver);
    }

    public OrderPaymentPage clickNext(){
        driver.findElement(By.id("next_btn")).click();
        return this;
    }

    public OrderPaymentPage selecionoMeioDePgto(){
        driver.findElement(By.name("masterCredit")).click();
        return this;
    }

    public OrderPaymentPage cardNumber(String numero){
        driver.findElement(By.id("creditCard")).sendKeys("4546 7879 8745");
        return this;
    }

    public OrderPaymentPage codeCard(int number ){
        driver.findElement(By.name("cvv_number")).sendKeys("358");
        return this;
    }

    public OrderPaymentPage cardHolderName(int holder){
        driver.findElement(By.name("cardholder_name")).sendKeys("75");
        return this;
    }

    public OrderPaymentPage clicarPayment(){
        driver.findElement(By.id("pay_now_btn_ManualPayment")).click();
        driver.findElement(By.xpath("//span[@class='roboto-regular ng-scope']")).getText();
        return this;
    }


}
