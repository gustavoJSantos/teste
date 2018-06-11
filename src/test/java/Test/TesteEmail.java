package Test;

import Pagina.Login;
import Pagina.SendEmail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TesteEmail {
    static WebDriver driver;
    static Login login;
    static SendEmail sendEmail;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\gustavo.santos\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver  = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        login = new Login(driver);
        sendEmail = new SendEmail(driver);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        driver.close();

    }

    @Test
    public void test() throws Exception {
        login.preencherCampos();
        sendEmail.preencherCampos();
    }
}
