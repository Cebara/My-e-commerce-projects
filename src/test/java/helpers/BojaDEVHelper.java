package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BojaDEVHelper extends BaseHelper {

    public static void LoginH() throws InterruptedException{
        String url = "https://boja.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://boja.dev.smartweb.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div[3]/ul/li[2]/a"));
        Nalog.click();
        WebElement Mejl = driver.findElement(By.name("login[username]"));
        Mejl.sendKeys("nikola.cebic9@gmail.com");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic1234");
        WebElement Prijava = driver.findElement(By.id("send2"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Prijava));
        Prijava.click();
    }

    public static void ShoppingH() throws InterruptedException{
        LoginH();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/header/div[2]/div[1]/ul/li[3]/a")));
        WebElement ProizvodniProgram = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/ul/li[3]/a"));
        ProizvodniProgram.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div/div[1]/div/div/div[1]/div/div/a/span")));
        WebElement ZnakoviOpasnosti = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div/div[1]/div/div/div[1]/div/div/a/span"));
        ZnakoviOpasnosti.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[5]/div[1]/div[3]/ol/li[1]/div/div/a")));
        WebElement ZnakOpasnostiI1 = driver.findElement(By.xpath("/html/body/div[2]/main/div[5]/div[1]/div[3]/ol/li[1]/div/div/a"));
        ZnakOpasnostiI1.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("option-label-sw_dimenzija-137-item-46")));
        WebElement Dimenzija1 = driver.findElement(By.id("option-label-sw_dimenzija-137-item-46"));
        Dimenzija1.click();
        WebElement Klasa1 = driver.findElement(By.id("option-label-sw_folija-139-item-462"));
        Klasa1.click();
        WebElement AntiFolija = driver.findElement(By.id("option-label-sw_tip_folije-148-item-465"));
        AntiFolija.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(4000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();

        Thread.sleep(4000);
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Trete ada 23");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("065896666");
        Thread.sleep(3000);
        WebElement Sledece = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span"));
        Sledece.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-banktransfer")));
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-banktransfer"));
        js.executeScript("arguments[0].click();", MOJAADR);
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Ulica2.sendKeys("jskgskgskg 12");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("afadfdsgs 2");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Post2.sendKeys("105888");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("0354598656");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[4]/div/button/span")));
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[4]/div/button/span"));
        js.executeScript("arguments[0].click();", Kupi);







    }

    public static void SearchH() throws InterruptedException{
        String url = "https://boja.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://boja.dev.smartweb.rs/");
        WebElement Lupa = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div[2]/ul/li[1]/a/i[1]"));
        Lupa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement Pretraga = driver.findElement(By.name("q"));
        Pretraga.sendKeys("Nosac");
        Pretraga.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[2]/div[2]/ol")));
        WebElement R = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[2]/div[2]/ol"));
        System.out.println(R.getText());

    }
}
