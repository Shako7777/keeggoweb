package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import pages.*;
import suporte.ExecutaNavegador;
import suporte.Generator;
import suporte.Screenshot;

import java.io.IOException;

public class InformcoesUserPageObjectsTest {
    private WebDriver driver;
    @Rule
    public TestName test = new TestName();
    @Before
    public void setUp(){
        driver = ExecutaNavegador.executaNavegador();
    }

    @Test
    public void criarUmNovoUsuario() throws IOException, InterruptedException {
        new LoginPage(driver)
                .clickUser()
                .criarNovaConta("Caiovinicius4","Qwert123")
                .criarUsername("Caiovinicius10")
                .digitarEmail("caio_surfing@icloud.com")
                .digitarSenha("Qwert1234")
                .confirmarSenha("Qwert1234")
                .digitarPrimeiroNome("Caio")
                .digitarUltimoNome("Vinicius")
                .digitarCelular("11998877663")
                .selecionarUmPais("Brazil")
                .digitarCidade("São Paulo")
                .digitarEndereco("Rua Keegoo")
                .digitarRegiao("Zona Leste")
                .digitarCEP("08799-112")
                .clicarNoCheckBoxEuConcordo()
                .clicarNoBotaoDeRegistrar();

        Thread.sleep(5000);
        String evidencia = "C:\\Users\\user\\Desktop\\evidencia" + Generator.dataHoraParaArquivo() + test.getMethodName() + ".png";
        Screenshot.takeScreenshot(driver,evidencia);

    }
    @Test
    public void queEstouNaPáginaHome(){
            new HomePage(driver)
                .validarPage()
            .clicarEmTablets()
                    .comprar();
   facoLoginComUsuarioESenha();
             estouNoCarrinho();
            efetuoOPagamento();
    }
    public void facoLoginComUsuarioESenha() {
            new ComprarUmTabletPage(driver)
                    .adicionarAoCarrinho()
                    .clicarEmConfirmar();
    }
    public void estouNoCarrinho() {
        new CarrinhoPage(driver)
                .fazerLogin("Caiovinicius10")
                .digitarSenha("Qwert1234")
                .clicarBotaoLogin();
    }
    public void efetuoOPagamento() {
        new OrderPaymentPage(driver)
                .clickNext()
                .selecionoMeioDePgto()
                .cardNumber("475854876698")
                .codeCard(789)
                .cardHolderName(78)
                .clicarPayment();
    }
    @After
    public void tearDown(){
        driver.close();
    }
}


