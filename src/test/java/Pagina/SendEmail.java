package Pagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendEmail {
    static WebDriver driver;
    WebDriverWait wait;

    public SendEmail(WebDriver driver){
        this.driver = driver;

    }

    public void preencherCampos() {
        wait = new WebDriverWait(driver, 100);
        //        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\":5.mn\"]")));

        WebElement escrever = driver.findElement(By.xpath("//*[@id=\":4g\"]/div/div"));
        escrever.click();

        WebElement para = driver.findElement(By.xpath("//*[@id=\":9o\"]"));
        para.sendKeys("gustavojspro@hotmail.com");

        WebElement assunto = driver.findElement(By.xpath("//*[@id=\":96\"]"));
        assunto.sendKeys("Testete");

        WebElement body = driver.findElement(By.xpath("//*[@id=\":ab\"]"));
        body.sendKeys("Testetetete");

        WebElement enviar = driver.findElement(By.xpath("//*[@id=\":8w\"]"));
        enviar.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("link_vsm")));
    }
}
