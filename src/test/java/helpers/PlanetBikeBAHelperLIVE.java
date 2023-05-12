package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PlanetBikeBAHelperLIVE extends BaseHelper{

    public static void RegH() throws InterruptedException{
        String url = "https://planetbike.ba/";
        driver.navigate().to(url);
        driver.get("https://planetbike.ba/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/header/div[2]/div[1]/div/div[2]/div[2]/li[1]/a")));
        WebElement Reg = driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div[1]/div/div[2]/div[2]/li[1]/a"));
        Reg.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("Cebic123");
        WebElement potvrda = driver.findElement(By.name("password_confirmation"));
        potvrda.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/form/div/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }

    public static void LoginH() throws InterruptedException{
        String url = "https://planetbike.ba/";
        driver.navigate().to(url);
        driver.get("https://planetbike.ba/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/header/div[2]/div[1]/div/div[2]/div[2]/li[2]/a")));
        WebElement Prijavi = driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div[1]/div/div[2]/div[2]/li[2]/a"));
        Prijavi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("login[username]")));
        WebElement mejl = driver.findElement(By.name("login[username]"));
        mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement pass = driver.findElement(By.name("login[password]"));
        pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }

    public static void PouzeceH() throws InterruptedException{
        String url = "https://planetbike.ba/";
        driver.navigate().to(url);
        driver.get("https://planetbike.ba/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/ul/li[2]/a/img")));
        WebElement Fitnes = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/ul/li[2]/a/img"));
        Fitnes.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[4]/div/a/span/span/img")));
        WebElement Masazer = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[4]/div/a/span/span/img"));
        Masazer.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mail = driver.findElement(By.id("customer-email"));
        Mail.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Hejej 3");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065764566");
        WebElement Sledece = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Sledece));
        Sledece.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("cashondelivery")));
        WebElement POUZECE = driver.findElement(By.id("cashondelivery"));
        js.executeScript("arguments[0].click();", POUZECE);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cashondelivery"));
        js.executeScript("arguments[0].click();", MOJAADR);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Ulica2.sendKeys("Hej 3");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("065875665");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);
        Thread.sleep(3000);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[4]/div/button/span"));
        js.executeScript("arguments[0].click();", Kupi);
    }

    public static void PredracunH() throws InterruptedException{
        String url = "https://planetbike.ba/";
        driver.navigate().to(url);
        driver.get("https://planetbike.ba/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/ul/li[2]/a/img")));
        WebElement Fitnes = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/ul/li[2]/a/img"));
        Fitnes.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[4]/div/a/span/span/img")));
        WebElement Masazer = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[5]/div[2]/div/ol/li[4]/div/a/span/span/img"));
        Masazer.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mail = driver.findElement(By.id("customer-email"));
        Mail.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Hejej 3");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065764566");
        WebElement Sledece = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Sledece));
        Sledece.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("checkmo")));
        WebElement PREDRACUN = driver.findElement(By.id("checkmo"));
        js.executeScript("arguments[0].click();", PREDRACUN);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();", MOJAADR);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Ulica2.sendKeys("Jejeje 3");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Post2.sendKeys("22656");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("065478523");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[3]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);
        Thread.sleep(4000);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[4]/div/button/span"));
        js.executeScript("arguments[0].click();", Kupi);
    }

    public static void SearchH() throws InterruptedException{
        String url = "https://planetbike.ba/";
        driver.navigate().to(url);
        driver.get("https://planetbike.ba/");
        WebElement Kucaj = driver.findElement(By.name("q"));
        Kucaj.sendKeys("bicikl");
        Kucaj.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("amasty-shopby-product-list")));
        WebElement R = driver.findElement(By.id("amasty-shopby-product-list"));
        System.out.println(R.getText());

    }

    public static void KontaktH() throws InterruptedException{
        String url = "https://planetbike.ba/";
        driver.navigate().to(url);
        driver.get("https://planetbike.ba/");
        WebElement kon = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/ul[2]/li[2]/a"));
        kon.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
        WebElement Ime = driver.findElement(By.name("name"));
        Ime.sendKeys("Nikola");
        WebElement mejl = driver.findElement(By.name("email"));
        mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement kom = driver.findElement(By.name("comment"));
        kom.sendKeys("Test");
        WebElement salji = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/form/div/div/button/span"));
        js.executeScript("arguments[0].click();", salji);
    }
}
