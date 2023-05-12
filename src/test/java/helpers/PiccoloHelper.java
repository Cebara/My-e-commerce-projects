package helpers;

import org.kohsuke.rngom.parse.host.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class PiccoloHelper extends BaseHelper {

    public static void Registracija() throws InterruptedException {
        String url = "https://piccolo.wp1.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://piccolo.wp1.smartweb.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/header/div/div/ul[2]/li[2]/a"));
        Nalog.click();
        WebElement Username = driver.findElement(By.id("reg_username"));
        Username.sendKeys("Nikola");
        WebElement Email = driver.findElement(By.id("reg_email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.id("reg_password"));
        Pass.sendKeys("Cebic123");
        WebElement RegButton = driver.findElement(By.name("register"));
        RegButton.click();
    }

    public static void Login() throws InterruptedException{
        String url = "https://piccolo.wp1.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://piccolo.wp1.smartweb.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/header/div/div/ul[2]/li[2]/a"));
        Nalog.click();
        WebElement UserPolje = driver.findElement(By.id("username"));
        UserPolje.sendKeys("nikola.cebic@smartweb.rs");
        WebElement PassField = driver.findElement(By.id("password"));
        PassField.sendKeys("Cebic123");
        WebElement UlogujSe = driver.findElement(By.name("login"));
        UlogujSe.click();
        Thread.sleep(3000);
    }

    public static void Narucivanje() throws InterruptedException{
        Login();
        WebElement Torbe = driver.findElement(By.xpath("/html/body/header/div/div/ul[1]/li[2]/a"));
        Torbe.click();
        Select MiniFilter = new Select(driver.findElement(By.name("orderby")));
        MiniFilter.selectByVisibleText("Po ceni: niža ka višoj");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[1]/main/ul/li[1]/a/img")));
        WebElement NarandzastaTorbica = driver.findElement(By.xpath("/html/body/div[3]/div[1]/main/ul/li[1]/a/img"));
        NarandzastaTorbica.click();
        WebElement Boja = driver.findElement(By.xpath("/html/body/div[2]/div[2]/main/div[2]/div[2]/form/table/tbody/tr/td/ul/li/div"));
        Actions act = new Actions(driver);
        act.doubleClick(Boja).perform();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/main/div[2]/div[2]/form/div/div[2]/button")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[2]/div[2]/main/div[2]/div[2]/form/div/div[2]/button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/main/div[1]/div/a")));
        WebElement PogledajKorpu = driver.findElement(By.xpath("/html/body/div[2]/div[2]/main/div[1]/div/a"));
        PogledajKorpu.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[3]/div/div/a")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/a"));
        Nastavi.click();
        WebElement Ime = driver.findElement(By.id("billing_first_name"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.id("billing_last_name"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.id("billing_address_1"));
        Ulica.sendKeys("Sretena Mladenovica Mike 5");
        WebElement Grad = driver.findElement(By.id("billing_city"));
        Grad.sendKeys("Beograd");
        WebElement Postcode = driver.findElement(By.id("billing_postcode"));
        Postcode.sendKeys("11090");
        WebElement Fon = driver.findElement(By.id("billing_phone"));
        Fon.sendKeys("0635478955");
        WebElement DrugiPodaci = driver.findElement(By.id("ship-to-different-address-checkbox"));
        DrugiPodaci.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("shipping_first_name")));
        WebElement Ime2 = driver.findElement(By.id("shipping_first_name"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.id("shipping_last_name"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.id("shipping_address_1"));
        Ulica2.sendKeys("Trte 3");
        WebElement Grad2 = driver.findElement(By.id("shipping_city"));
        Grad2.sendKeys("Jejeje");
        WebElement Postkod2 = driver.findElement(By.id("shipping_postcode"));
        Postkod2.sendKeys("11080");
        WebElement Kom = driver.findElement(By.id("order_comments"));
        Kom.sendKeys("Ovo je samo test, ignorisite :)");
        WebElement Naruci = driver.findElement(By.id("place_order"));
        Naruci.click();
        Thread.sleep(4000);
    }

    public static void Search() throws InterruptedException{
        String url = "https://piccolo.wp1.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://piccolo.wp1.smartweb.rs/");
        WebElement Pretraga = driver.findElement(By.name("s"));
        Pretraga.click();
        Pretraga.sendKeys("Cipele");
        Pretraga.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[1]/main")));
        WebElement Result = driver.findElement(By.xpath("/html/body/div[3]/div[1]/main"));
        System.out.println(Result.getText());
        Thread.sleep(4000);
    }
}
