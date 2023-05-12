package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SvakoDobroDEVHelper extends BaseHelper{

    public static void RegHelper() throws InterruptedException{
        String url = "https://razvojsvakodobro.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://razvojsvakodobro.smartweb.rs/");
        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/ul/li[2]/a"));
        Prijava.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span")));
        WebElement Reg = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span"));
        Reg.click();
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
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }

    public static void LoginH() throws InterruptedException{
        String url = "https://razvojsvakodobro.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://razvojsvakodobro.smartweb.rs/");
        WebElement Prijava = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/ul/li[2]/a"));
        Prijava.click();
        WebElement Email = driver.findElement(By.name("login[username]"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        Aj.click();
    }

    public static void PouzeceH() throws InterruptedException{
        String url = "https://razvojsvakodobro.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://razvojsvakodobro.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-4")));
        WebElement StomacneTegove = driver.findElement(By.id("ui-id-4"));
        StomacneTegove.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_117")));
        WebElement Probiotic = driver.findElement(By.id("product-item-info_117"));
        Probiotic.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();
        Thread.sleep(3000);
        WebElement Email = driver.findElement(By.id("customer-email"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Email));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Paja Patak 2");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("064725266");
        Thread.sleep(4000);
        WebElement POUZECE = driver.findElement(By.id("checkmo"));
        js.executeScript("arguments[0].click();", POUZECE);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-checkmo")));
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();", MOJAADR);
        Thread.sleep(4000);
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Trte Mrte 3");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("0654878953");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();

        WebElement SlazemSe = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", SlazemSe);

        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[3]/div[4]/div/div/button/span"));
        js.executeScript("arguments[0].click();", KUPI);
    }

    public static void IntesaH() throws InterruptedException{
        String url = "https://razvojsvakodobro.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://razvojsvakodobro.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-4")));
        WebElement StomacneTegove = driver.findElement(By.id("ui-id-4"));
        StomacneTegove.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_117")));
        WebElement Probiotic = driver.findElement(By.id("product-item-info_117"));
        Probiotic.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();
        Thread.sleep(3000);
        WebElement Email = driver.findElement(By.id("customer-email"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Email));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Paja Patak 2");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("064725266");
        Thread.sleep(4000);

        WebElement INTEZA = driver.findElement(By.id("intesa_payment"));
        js.executeScript("arguments[0].click();", INTEZA);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-intesa_payment")));
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-intesa_payment"));
        js.executeScript("arguments[0].click();", MOJAADR);
        Thread.sleep(4000);
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Hehj hejj 3");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("065789221");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();

        WebElement SlazemSe = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", SlazemSe);

        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[2]/div[3]/div[4]/div/div/button/span"));
        js.executeScript("arguments[0].click();", KUPI);
    }

    public static void SearchH() throws InterruptedException{
        String url = "https://razvojsvakodobro.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://razvojsvakodobro.smartweb.rs/");
        WebElement Pretraga = driver.findElement(By.name("q"));
        Pretraga.sendKeys("Vitamin");
        Pretraga.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("maincontent")));
        WebElement R = driver.findElement(By.id("maincontent"));
        System.out.println(R.getText());
    }

    public static void KontaktH() throws InterruptedException{
        String url = "https://razvojsvakodobro.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://razvojsvakodobro.smartweb.rs/");
        WebElement Kon = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/div/a[3]"));
        Kon.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
        WebElement Ime = driver.findElement(By.name("name"));
        Ime.sendKeys("Nikola");
        WebElement Mejl = driver.findElement(By.name("email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Poruka = driver.findElement(By.name("comment"));
        Poruka.sendKeys("Test");
        WebElement Salji = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div/button/span"));
        Salji.click();
    }
}
