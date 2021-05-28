package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccountPage extends BasePage {
    public CreateNewAccountPage(WebDriver driver){
        super(driver);
    }
    public CreateNewAccountPage criarUsername(String username){
        driver.findElement(By.name("usernameRegisterPage")).sendKeys(username);
        return this;
    }

    public CreateNewAccountPage digitarEmail(String email){
        driver.findElement(By.name("emailRegisterPage")).sendKeys(email);
        return this;
    }

    public CreateNewAccountPage digitarSenha(String senha){
        driver.findElement(By.name("passwordRegisterPage")).sendKeys(senha);
        return this;
    }

    public CreateNewAccountPage confirmarSenha(String confirSenha){
        driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys(confirSenha);
        return this;
    }

    public CreateNewAccountPage digitarPrimeiroNome(String primeiroNome){
        driver.findElement(By.name("first_nameRegisterPage")).sendKeys(primeiroNome);
        return this;
    }

    public CreateNewAccountPage digitarUltimoNome(String ultimoNome){
        driver.findElement(By.name("last_nameRegisterPage")).sendKeys(ultimoNome);
        return this;
    }

    public CreateNewAccountPage digitarCelular(String celular){
        driver.findElement(By.name("phone_numberRegisterPage")).sendKeys(celular);
        return this;
    }

    public CreateNewAccountPage selecionarUmPais(String pais){
        Select selectCountry = new Select(driver.findElement(By.name("countryListboxRegisterPage")));
        selectCountry.selectByVisibleText(pais);
        return this;
    }
    public CreateNewAccountPage digitarCidade(String cidade){
        driver.findElement(By.name("cityRegisterPage")).sendKeys(cidade);
        return this;
    }

    public CreateNewAccountPage digitarEndereco(String endereco){
        driver.findElement(By.name("addressRegisterPage")).sendKeys(endereco);
        return this;
    }

    public CreateNewAccountPage digitarRegiao(String regiao){
        driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys(regiao);
        return this;
    }

    public CreateNewAccountPage digitarCEP(String cep){
        driver.findElement(By.name("postal_codeRegisterPage")).sendKeys(cep);
        return this;
    }

    public CreateNewAccountPage clicarNoCheckBoxEuConcordo(){
        driver.findElement(By.name("i_agree")).click();
        return this;
    }

    public HomePage clicarNoBotaoDeRegistrar(){
        driver.findElement(By.id("register_btnundefined")).click();
        return new HomePage(driver);
    }







}
