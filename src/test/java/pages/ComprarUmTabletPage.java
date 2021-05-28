package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComprarUmTabletPage extends BasePage {
    public ComprarUmTabletPage(WebDriver driver) {
        super(driver);
    }

    public ComprarUmTabletPage adicionarAoCarrinho(){
        driver.findElement(By.name("save_to_cart")).click();
        return this;
    }

    public CarrinhoPage clicarEmConfirmar(){
        driver.findElement(By.id("checkOutPopUp")).click();
        return new CarrinhoPage(driver);
    }


}
