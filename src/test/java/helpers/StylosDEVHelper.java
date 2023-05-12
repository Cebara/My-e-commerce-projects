package helpers;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StylosDEVHelper extends BaseHelper{

    public static void RegHelper() throws InterruptedException{
        String url = "https://stylos.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://stylos.dev.smartweb.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a"));
        Nalog.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span")));
        WebElement Reg1 = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span"));
        Reg1.click();
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
        WebElement Regg = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Regg));
        Regg.click();
    }

    public static void LoginH() throws InterruptedException{
        String url = "https://stylos.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://stylos.dev.smartweb.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a"));
        Nalog.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("login[username]")));
        WebElement Mejl = driver.findElement(By.name("login[username]"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }

    public static void ShoppingH() throws InterruptedException{
        String url = "https://stylos.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://stylos.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[2]/div/div[1]/div/ol/div/div/div[1]/div/li/div/a/span/span/img")));
        WebElement Pribor = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[2]/div/div[1]/div/ol/div/div/div[1]/div/li/div/a/span/span/img"));
        Pribor.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        Thread.sleep(4000);
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Mejl));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("askdjaldj 2");
        WebElement Region = driver.findElement(By.name("region"));
        Region.sendKeys("Beograd");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065788566");
        //Thread.sleep(4000);
        WebElement Sledece = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span"));
        js.executeScript("arguments[0].click();", Sledece);
        Thread.sleep(3000);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        MOJAADR.click();
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Ulica2.sendKeys("adafjlaf 3");
        WebElement REgion2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        REgion2.sendKeys("Bocevci");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("KASdla ");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Post2.sendKeys("11055");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("0054522222");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(6000);
        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[4]/div/button/span"));
        KUPI.click();
    }

    public static void SearchH() throws InterruptedException{
        String url = "https://stylos.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://stylos.dev.smartweb.rs/");
        WebElement Pretraga = driver.findElement(By.name("q"));
        Pretraga.sendKeys("Kofer");
        Pretraga.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("amasty-shopby-product-list")));
        WebElement R = driver.findElement(By.id("amasty-shopby-product-list"));
        System.out.println(R.getText());
    }

    public static void KontaktH() throws InterruptedException{
        String url = "https://stylos.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://stylos.dev.smartweb.rs/");
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div[1]/div/div[2]/ul/li[4]/a")));
        WebElement Kontakt = driver.findElement(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div[1]/div/div[2]/ul/li[4]/a"));
        Kontakt.click();





    }
}
