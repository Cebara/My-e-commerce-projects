package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ParfemiDevHelper extends BaseHelper {

    public static void Reg() throws InterruptedException {
        String url = "https://parfemi.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://parfemi.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("idAhieCchH")));
        WebElement Registrujse = driver.findElement(By.id("idAhieCchH"));
        Registrujse.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement DatumR = driver.findElement(By.name("dob"));
        DatumR.sendKeys("05.06.1995");
        WebElement IzaberiDatum = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/form/fieldset[1]/div[4]/div/button/span"));
        IzaberiDatum.click();
        Select Pol = new Select(driver.findElement(By.name("gender")));
        Pol.selectByVisibleText("Muški");
        WebElement Mejl = driver.findElement(By.name("email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("password"));
        Pass.sendKeys("Cebic123");
        WebElement Potvrda = driver.findElement(By.name("password_confirmation"));
        Potvrda.sendKeys("Cebic123");
        WebElement Ajd = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/form/div/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Ajd));
        js.executeScript("arguments[0].click();", Ajd);
    }

    public static void LoginHelper() throws InterruptedException{
        String url = "https://parfemi.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://parfemi.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/header/div[1]/div/div/ul/li[2]/a")));
        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[5]/header/div[1]/div/div/ul/li[2]/a"));
        Prijava.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("login[username]")));
        WebElement Mejl = driver.findElement(By.name("login[username]"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Signin = driver.findElement(By.name("send"));
        Signin.click();
    }

    public static void ShopingHelper() throws InterruptedException{
        LoginHelper();
        Thread.sleep(4000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/header/div[2]/div[1]/div/div[2]/nav/ul[1]/li[3]/a/span[2]")));
        WebElement Muski = driver.findElement(By.xpath("/html/body/div[5]/header/div[2]/div[1]/div/div[2]/nav/ul[1]/li[3]/a/span[2]"));
        Muski.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[5]/div/a/span/span/img")));
        WebElement Abercrombie = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[5]/div/a/span/span/img"));
        Abercrombie.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/main/div[1]/div[2]/div/div/div/a")));
        WebElement KorpaPopUp = driver.findElement(By.xpath("/html/body/div[5]/main/div[1]/div[2]/div/div/div/a"));
        KorpaPopUp.click();
        WebElement nastavi = driver.findElement(By.xpath("/html/body/div[5]/main/div[2]/div/div[3]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(nastavi));
        nastavi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("street[0]")));
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Trte Mrte 23");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement Postanski = driver.findElement(By.name("postcode"));
        Postanski.sendKeys("11090");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("065789522");
        WebElement MojaAdr = driver.findElement(By.name("billing-address-same-as-shipping"));
        wdWait.until(ExpectedConditions.elementToBeClickable(MojaAdr));
        js.executeScript("arguments[0].click();", MojaAdr);
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Igoreva 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Postanski2 = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Postanski2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Fon2.sendKeys("064885455");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[6]/main/div/div/div/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kupi));
        js.executeScript("arguments[0].click();", Kupi);
    }

}
