package helpers;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PlanetBikeBAHelperDev extends BaseHelper {

    public static void RegH() throws InterruptedException{
        String url = "https://planetbikeba.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://planetbikeba.dev.smartweb.rs/");
        WebElement Registracija = driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div[1]/div/div[2]/div[2]/li[1]/a"));
        Registracija.click();
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Mejl = driver.findElement(By.name("email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("password"));
        Pass.sendKeys("Cebic123");
        WebElement Potvrda = driver.findElement(By.name("password_confirmation"));
        Potvrda.sendKeys("Cebic123");
        WebElement RegButton = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/form/div/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(RegButton));
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        js.executeScript("arguments[0].click();", RegButton);
    }

    public static void LoginH() throws InterruptedException{
        String url = "https://planetbikeba.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://planetbikeba.dev.smartweb.rs/");
        driver.manage().deleteAllCookies();
        WebElement Prijavise = driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div[1]/div/div[2]/div[2]/li[2]/a"));
        Prijavise.click();
        WebElement Mejl = driver.findElement(By.name("login[username]"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        Aj.click();
    }

    public static void Shopping() throws InterruptedException{
        String url = "https://planetbikeba.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://planetbikeba.dev.smartweb.rs/");
        driver.manage().deleteAllCookies();
        WebElement Roleri = driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div[2]/div/nav/ul/li[5]/a/span"));
        Actions akcija = new Actions(driver);
        akcija.moveToElement(Roleri).perform();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/header/div[2]/div[2]/div/nav/ul/li[5]/ul/li/div/div/div[1]/div/div/a[1]")));
        WebElement Zastita = driver.findElement(By.xpath("/html/body/div[3]/header/div[2]/div[2]/div/nav/ul/li[5]/ul/li/div/div/div[1]/div/div/a[1]"));
        Zastita.click();
        WebElement Torba = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[6]/div[2]/div/ol/li[1]/div/a/span/span/img"));
        Torba.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[1]/div[2]/div[2]/form/div[1]/div/div/button/span")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[1]/div[2]/div[2]/form/div[1]/div/div/button/span"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(5000);
        WebElement nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(nastavi));
        nastavi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div/div[4]/ol/li[1]/div[2]/form[1]/fieldset/div/div/input")));
        WebElement Mejl = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[4]/ol/li[1]/div[2]/form[1]/fieldset/div/div/input"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Mejl));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Street = driver.findElement(By.name("street[0]"));
        Street.sendKeys("Bla bla 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Sarajevo");
        WebElement Postanski = driver.findElement(By.name("postcode"));
        Postanski.sendKeys("45845");
        WebElement FOn = driver.findElement(By.name("telephone"));
        FOn.sendKeys("065655552");
        WebElement Sledece = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span"));
        Sledece.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("billing-address-same-as-shipping")));
        WebElement Mojaadr = driver.findElement(By.name("billing-address-same-as-shipping"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Mojaadr));
        Mojaadr.click();
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulca = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Ulca.sendKeys("Hejhej3");
        WebElement Gradic = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Gradic.sendKeys("Mostar");
        WebElement Post = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Post.sendKeys("11409");
        WebElement Fontele = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fontele.sendKeys("069745665");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[4]/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kupi));
        js.executeScript("arguments[0].click();", Kupi);
    }

    public static void SearchH() throws InterruptedException{
        String url = "https://planetbikeba.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://planetbikeba.dev.smartweb.rs/");
        WebElement Pretraga = driver.findElement(By.name("q"));
        Pretraga.sendKeys("kaciga");
        Pretraga.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[5]/div/div[2]")));
        WebElement Result = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[5]/div/div[2]"));
        System.out.println(Result.getText());



    }
}
