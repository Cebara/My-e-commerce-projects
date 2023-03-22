package helpers;

import org.kohsuke.rngom.parse.host.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PlanetBikeHelper extends BaseHelper {

    private static void Registracija(String Ime, String Prezime, String Email, String Lozinka, String PotvrdaLozinke) throws InterruptedException{
        String url = "https://planetbike.rs/#";
        driver.navigate().to(url);
        driver.get("https://planetbike.rs/#");
        WebElement RegistrationButton = driver.findElement(By.id("idoNLlSnAK"));
        RegistrationButton.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[4]/div/div[2]/ul/li[2]/a")));
        WebElement RegDugme = driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div[2]/ul/li[2]/a"));
        RegDugme.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstname")));
        WebElement ImePolje = driver.findElement(By.id("firstname"));
        ImePolje.sendKeys(Ime);
        WebElement PrezimePolje = driver.findElement(By.id("lastname"));
        PrezimePolje.sendKeys(Prezime);

        WebElement EmailPolje = driver.findElement(By.id("am-email-address"));
        EmailPolje.sendKeys(Email);

        WebElement PassPolje = driver.findElement(By.id("password"));
        PassPolje.sendKeys(Lozinka);
        WebElement PotvrdaPassa = driver.findElement(By.id("password-confirmation"));
        PotvrdaPassa.sendKeys(PotvrdaLozinke);
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div[2]/div[2]/div[1]/form/div/div[1]/button/span"));
        Aj.click();

    }

    public static void DefReg() throws InterruptedException{
        Registracija("Nikola", "Cebic", "nikola.cebic@smartweb.rs", "Cebic123", "Cebic123");

    }

    public static void Login() throws InterruptedException{
        String url = "https://planetbike.rs/#";
        driver.navigate().to(url);
        driver.get("https://planetbike.rs/#");
        WebElement LoginButton = driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div[1]/div/div[2]/div[2]/li[2]/a"));
        LoginButton.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
        WebElement Mejl = driver.findElement(By.id("email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.id("pass"));
        Pass.sendKeys("Cebic123");
        WebElement Upadaj = driver.findElement(By.id("send2"));
        Upadaj.click();
        Thread.sleep(4000);
    }

    public static void LicnoPreuzimanje() throws InterruptedException{
        Login();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/ul/li[3]/a/img")));
        WebElement FitnessKategorija = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/ul/li[3]/a/img"));
        FitnessKategorija.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[2]/ul/li[1]/a/img")));
        WebElement SobniBajsKategorija = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[2]/ul/li[1]/a/img"));
        SobniBajsKategorija.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[1]/div/a/span/span/img")));
        WebElement BodySculpture = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[1]/div/a/span/span/img"));
        BodySculpture.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();



    }


}
