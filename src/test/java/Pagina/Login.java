package Pagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Login {
    static WebDriver driver;
    WebDriverWait wait;

    public Login(WebDriver driver){
        this.driver = driver;

    }

    public void preencherCampos(){
        wait = new WebDriverWait(driver, 100);
        WebElement email = driver.findElement(By.id("identifierId"));
        email.sendKeys("contatestete123@gmail.com");

        WebElement next = driver.findElement(By.id("identifierNext"));
        next.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement senha = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        senha.sendKeys("contateste");

        WebElement passNext = driver.findElement(By.id("passwordNext"));
        passNext.click();

    }
}
