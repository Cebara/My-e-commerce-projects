package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CentrumHelper extends BaseHelper {

    public static void RegHelper() throws InterruptedException {
        String url = "https://centrumtest.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://centrumtest.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("idyyjMpNu4")));
        WebElement Registracija1 = driver.findElement(By.id("idyyjMpNu4"));
        Registracija1.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Email = driver.findElement(By.name("email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Lozinka = driver.findElement(By.name("password"));
        Lozinka.sendKeys("Cebic123");
        WebElement Potvrda = driver.findElement(By.name("password_confirmation"));
        Potvrda.sendKeys("Cebic123");
        WebElement FinalRegistracija = driver.findElement(By.xpath("/html/body/div[4]/main/div[3]/div/form/div/div[1]/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(FinalRegistracija));
        FinalRegistracija.click();
    }
}
