package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ReproMarketDEVHelper extends BaseHelper {

    public static void RegHelper() throws InterruptedException{
        String url = "https://repromarket.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://repromarket.dev.smartweb.rs/");
        WebElement Reg = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"));
        Reg.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
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
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button"));
        Aj.click();
    }

    public static void LoginH() throws InterruptedException{
        String url = "https://repromarket.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://repromarket.dev.smartweb.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[1]/a"));
        Nalog.click();
        WebElement Mejl = driver.findElement(By.name("login[username]"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement upad = driver.findElement(By.id("send2"));
        upad.click();
    }

    public static void ShopH() throws InterruptedException{
        String url = "https://repromarket.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://repromarket.dev.smartweb.rs/");
        WebElement Proizvodi = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[3]/div/div[2]/nav/div/ul/li[1]/a/span"));
        Proizvodi.click();
        WebElement kablovi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div/div/div[2]/ul/li[1]/div/div[1]/a/img"));
        kablovi.click();
        WebElement Adapter = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[4]/div[2]/ol/li[4]/div/div/div[3]/div/div[1]/form/button"));
        Adapter.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement MiniK = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        MiniK.click();
        Thread.sleep(5000);
        WebElement NastaviDalje = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/ul/li/button/span"));
        //wdWait.until(ExpectedConditions.elementToBeClickable(NastaviDalje));
        NastaviDalje.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Nja nja 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Postanski = driver.findElement(By.name("postcode"));
        Postanski.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("0651254555");
        Thread.sleep(8000);
        WebElement MojaADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();", MojaADR);

        //wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nidza");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Hejehej 23");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Post2.sendKeys("10109");
        WebElement Fontele = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fontele.sendKeys("06642556565");
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[3]/div[4]/div/div/button/span"));
        js.executeScript("arguments[0].click();", Kupi);
    }

    public static void SearchH() throws InterruptedException{
        String url = "https://repromarket.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://repromarket.dev.smartweb.rs/");
        WebElement Lupa = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[5]/div[2]/form/div/label/span"));
        Lupa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement Pretraga = driver.findElement(By.name("q"));
        Pretraga.sendKeys("Slusalice");
        Pretraga.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div/div[3]/ol")));
        WebElement R = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[4]/div/div[3]/ol"));
        System.out.println(R.getText());
    }
}
