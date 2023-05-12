package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ReproStylishDEVHelper extends BaseHelper {

    public static void RegH() throws InterruptedException {

        String url = "https://reprostylish.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://reprostylish.dev.smartweb.rs/");
        Thread.sleep(3000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[2]/div[2]/ul/li[2]/a")));
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[2]/ul/li[2]/a"));
        Nalog.click();
        WebElement Reg = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[2]/div[2]/div/div/a/span"));
        Reg.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Email = driver.findElement(By.name("email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("password"));
        Pass.sendKeys("Cebic123");
        WebElement Potvrda = driver.findElement(By.name("password_confirmation"));
        Potvrda.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/form/div/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }

    public static void LoginH() throws InterruptedException{
        String url = "https://reprostylish.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://reprostylish.dev.smartweb.rs/");
        Thread.sleep(3000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[2]/div[2]/ul/li[2]/a")));
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[2]/ul/li[2]/a"));
        Nalog.click();
        WebElement Mejl = driver.findElement(By.name("login[username]"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement pass = driver.findElement(By.name("login[password]"));
        pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }
    public static void ShopH() throws InterruptedException{
        String url = "https://reprostylish.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://reprostylish.dev.smartweb.rs/");
        Thread.sleep(3000);
        WebElement ALATI = (driver.findElement(By.id("ui-id-4")));
        Actions action = new Actions(driver);
        action.moveToElement(ALATI).perform();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[3]/nav/ul[2]/li[3]/ul/li[1]/a/span")));
        WebElement Evo = driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/nav/ul[2]/li[3]/ul/li[1]/a/span"));
        Evo.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[2]/div[3]/ol/li[2]/div/a/span/span/img")));
        WebElement Postolje = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[2]/div[3]/ol/li[2]/div/a/span/span/img"));
        Postolje.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[1]/ul/li/button/span"));
        Thread.sleep(4000);
        Nastavi.click();
        Thread.sleep(5000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Trte Mrte 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065489656");
        Thread.sleep(5000);

        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cashondelivery"));
        js.executeScript("arguments[0].click();", MOJAADR);
        Thread.sleep(6000);

        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("kajfakf 3");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Beocani");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Post2.sendKeys("10055");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Fon2.sendKeys("0654865522");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[3]/div/button[1]"));
        Azuriraj.click();
        Thread.sleep(3000);
        WebElement SLAZEMSE = driver.findElement(By.id("agreement__1"));
        SLAZEMSE.click();
        WebElement KUPi = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        KUPi.click();
    }

    public static void SearchH() throws InterruptedException{
        String url = "https://reprostylish.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://reprostylish.dev.smartweb.rs/");
        Thread.sleep(3000);
        WebElement Lupa = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/div[1]"));
        Lupa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement Kucaj = driver.findElement(By.name("q"));
        Kucaj.sendKeys("Ogrlica");
        Kucaj.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]")));
        WebElement R = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]"));
        System.out.println(R.getText());
    }
}
