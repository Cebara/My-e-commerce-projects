package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class KafaKodKuceDEVHelper extends BaseHelper {

    public static void RegHelper() throws InterruptedException{
        String url = "https://kafakodkuce.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://kafakodkuce.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[2]/li/a")));
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/li/a"));
        Nalog.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span")));
        WebElement Reg1 = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span"));
        Reg1.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.id("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Email = driver.findElement(By.name("email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("password"));
        Pass.sendKeys("Cebic123");
        WebElement Potvrda = driver.findElement(By.name("password_confirmation"));
        Potvrda.sendKeys("Cebic123");
        WebElement Ajd = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Ajd));
        Ajd.click();
    }

    public static void LoginHelper() throws InterruptedException{
        String url = "https://kafakodkuce.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://kafakodkuce.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[2]/li/a")));
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/li/a"));
        Nalog.click();
        WebElement Email = driver.findElement(By.name("login[username]"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }
    public static void RacunShopping() throws InterruptedException{
        String url = "https://kafakodkuce.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://kafakodkuce.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-6")));
        WebElement KafaKategorija = driver.findElement(By.id("ui-id-6"));
        KafaKategorija.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_40")));
        WebElement Doncaffe = driver.findElement(By.id("product-item-info_40"));
        Doncaffe.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(4000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();
        Thread.sleep(6000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("akjdsalkdja 2");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("068745223");
        Thread.sleep(4000);
        WebElement PREKORACUNA = driver.findElement(By.id("banktransfer"));
        wdWait.until(ExpectedConditions.elementToBeClickable(PREKORACUNA));
        js.executeScript("arguments[0].click();", PREKORACUNA);
//        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-banktransfer"));
//        wdWait.until(ExpectedConditions.elementToBeClickable(MOJAADR));
//        js.executeScript("arguments[0].click();", MOJAADR);
//        Thread.sleep(7000);
//        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
//        Ime2.sendKeys("Nikola");
//        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
//        Prezime2.sendKeys("Cebic");
//        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
//        Ulica2.sendKeys("Trte Mrte 23");
//        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
//        Grad2.sendKeys("Beograd");
//        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
//        Post2.sendKeys("11090");
//        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
//        Fon2.sendKeys("06577445699");
//        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
//        Azuriraj.click();
        Thread.sleep(7000);
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[5]/div[2]/div[3]/div[4]/div/div/button"));
        js.executeScript("arguments[0].click();", Kupi);










    }

    public static void SearchH() throws InterruptedException{
        String url = "https://kafakodkuce.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://kafakodkuce.dev.smartweb.rs/");
        WebElement Lupa = driver.findElement(By.className("searchIcon"));
        Lupa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement Kucaj = driver.findElement(By.name("q"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kucaj));
        Kucaj.sendKeys("Espreso");
        Kucaj.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("amasty-shopby-product-list")));
        WebElement R = driver.findElement(By.id("amasty-shopby-product-list"));
        System.out.println(R.getText());
    }

    public static void KontaktH() throws InterruptedException{
        String url = "https://kafakodkuce.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://kafakodkuce.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[2]/ul[1]/li[1]/a")));
        WebElement KontantButton = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/ul[1]/li[1]/a"));
        KontantButton.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
        WebElement Ime = driver.findElement(By.name("name"));
        Ime.sendKeys("Nikola Test");
        WebElement Mejl = driver.findElement(By.name("email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement poruka = driver.findElement(By.name("comment"));
        poruka.sendKeys("Test");
        WebElement Posalji = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div/button"));
        Posalji.click();

    }
}
