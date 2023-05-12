package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class KeraMetalHelperLIVE extends BaseHelper{

    public static void RegH() throws InterruptedException{
        String url = "https://www.kerametal.rs/";
        driver.navigate().to(url);
        driver.get("https://www.kerametal.rs/");
        WebElement Reg = driver.findElement(By.xpath("/html/body/div[6]/header/div[1]/div[2]/ul/li[2]/a"));
        Reg.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/main/div[3]/div/div[2]/div/div[2]/p/a")));
        WebElement Reg2 = driver.findElement(By.xpath("/html/body/div[6]/main/div[3]/div/div[2]/div/div[2]/p/a"));
        Reg2.click();
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
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[6]/main/div[3]/div/form/div[2]/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        js.executeScript("arguments[0].click();", Aj);

    }

    public static void LoignH() throws InterruptedException{
        String url = "https://www.kerametal.rs/";
        driver.navigate().to(url);
        driver.get("https://www.kerametal.rs/");
        WebElement Reg = driver.findElement(By.xpath("/html/body/div[6]/header/div[1]/div[2]/ul/li[2]/a"));
        Reg.click();
       // wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("login[username]")));
        WebElement Mejl = driver.findElement(By.name("login[username]"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Mejl));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }

    public static void IsporukaiPouzeceH() throws InterruptedException{
        String url = "https://www.kerametal.rs/";
        driver.navigate().to(url);
        driver.get("https://www.kerametal.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/main/div[2]/div/div[2]/div[1]/div/div[12]/div/a/img")));
        WebElement TusRucice = driver.findElement(By.xpath("/html/body/div[6]/main/div[2]/div/div[2]/div[1]/div/div[12]/div/a/img"));
        TusRucice.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/main/div[2]/div[1]/div[4]/div[2]/ol/li[6]/div/div/div[3]/div/div[1]/form/button/span")));
        WebElement Dodaj = driver.findElement(By.xpath("/html/body/div[6]/main/div[2]/div[1]/div[4]/div[2]/ol/li[6]/div/div/div[3]/div/div[1]/form/button/span"));
        js.executeScript("arguments[0].click();", Dodaj);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[6]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[6]/main/div[3]/div/div[2]/div/ul/li/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        //Thread.sleep(5000);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("s_method_postcodeship_postcodeship")));
        WebElement ISPORUKA = driver.findElement(By.id("s_method_postcodeship_postcodeship"));
        ISPORUKA.click();

        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Hjejej 3");
        Thread.sleep(2000);
        Select Region = new Select(driver.findElement(By.name("region")));
        Region.selectByVisibleText("Srbija");
        Thread.sleep(3000);
        Select Grad = new Select(driver.findElement(By.name("city")));
        Grad.selectByVisibleText("BEOGRAD-RAKOVICA");
        Thread.sleep(5000);
        Select Post = new Select(driver.findElement(By.name("postcode")));
        Post.selectByVisibleText("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("06547963");
        Thread.sleep(6000);

        WebElement POUZECE = driver.findElement(By.id("cashondelivery"));
        js.executeScript("arguments[0].click();", POUZECE);
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-cashondelivery"));
        js.executeScript("arguments[0].click();", MOJAADR);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[7]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[7]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        //wdWait.until(ExpectedConditions.elementToBeClickable(Ime2));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[7]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[7]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Trte Mrte 2");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[7]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[7]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[7]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("065785335");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[7]/main/div/div/div[2]/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]"));
        js.executeScript("arguments[0].click();", Azuriraj);

        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[7]/main/div/div/div[2]/div[6]/div[2]/div[2]/div[4]/div/div/button/span"));
        js.executeScript("arguments[0].click();", Kupi);
    }
}
