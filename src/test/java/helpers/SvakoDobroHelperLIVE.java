package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SvakoDobroHelperLIVE extends BaseHelper{

    public static void RegH() throws InterruptedException{
        String url = "https://svakodobro.rs/";
        driver.navigate().to(url);
        driver.get("https://svakodobro.rs/");
        WebElement Reeeg = driver.findElement(By.xpath("/html/body/div[6]/header/div[2]/div[1]/ul/li[2]/a"));
        Reeeg.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span")));
        WebElement Reg2 = driver.findElement(By.xpath("/html/body/div[6]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span"));
        Reg2.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("password"));
        Pass.sendKeys("Cebic123");
        WebElement potvrda = driver.findElement(By.name("password_confirmation"));
        potvrda.sendKeys("Cebic123");
        WebElement aj = driver.findElement(By.xpath("/html/body/div[6]/main/div[3]/div/form/div/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(aj));
        aj.click();
    }

    public static void LoginH() throws InterruptedException{
        String url = "https://svakodobro.rs/";
        driver.navigate().to(url);
        driver.get("https://svakodobro.rs/");
        WebElement Reeeg = driver.findElement(By.xpath("/html/body/div[6]/header/div[2]/div[1]/ul/li[2]/a"));
        Reeeg.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("login[username]")));
        WebElement Email = driver.findElement(By.name("login[username]"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        Aj.click();
    }

    public static void PouzeceH() throws InterruptedException{
        String url = "https://svakodobro.rs/";
        driver.navigate().to(url);
        driver.get("https://svakodobro.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-3")));
        WebElement Vitamini = driver.findElement(By.id("ui-id-3"));
        Vitamini.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/main/div[4]/div/div[3]/div[2]/ol/li[5]/div/div[2]/div[3]/div/div[1]/form/button")));
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[6]/main/div[4]/div/div[3]/div[2]/ol/li[5]/div/div[2]/div[3]/div/div[1]/form/button"));
        js.executeScript("arguments[0].click();" , Kupi);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/main/div[2]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[6]/main/div[2]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[6]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();
        Thread.sleep(2000);
        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("adasd 2");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("0654444422");
        Thread.sleep(3000);

        WebElement POUZECE = driver.findElement(By.id("checkmo"));
        POUZECE.click();
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();", MOJAADR);
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[7]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[7]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[7]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("sadas 2");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[7]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[7]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("11080");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[7]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("06775555");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[7]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]"));
        js.executeScript("arguments[0].click();", Azuriraj);
        Thread.sleep(3000);


        WebElement Prihvacam = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", Prihvacam);
        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[7]/main/div[2]/div/div[2]/div[5]/div[2]/div[3]/div[4]/div/div/button/span"));
        js.executeScript("arguments[0].click();", KUPI);
    }

    public static void KarticaH() throws InterruptedException{
        String url = "https://svakodobro.rs/";
        driver.navigate().to(url);
        driver.get("https://svakodobro.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-3")));
        WebElement Vitamini = driver.findElement(By.id("ui-id-3"));
        Vitamini.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/main/div[4]/div/div[3]/div[2]/ol/li[5]/div/div[2]/div[3]/div/div[1]/form/button")));
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[6]/main/div[4]/div/div[3]/div[2]/ol/li[5]/div/div[2]/div[3]/div/div[1]/form/button"));
        js.executeScript("arguments[0].click();" , Kupi);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/main/div[2]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[6]/main/div[2]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[6]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();
        Thread.sleep(2000);
        WebElement Email = driver.findElement(By.id("customer-email"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("adasd 2");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("0654444422");
        Thread.sleep(3000);

        WebElement KARTICA = driver.findElement(By.id("intesa_payment"));
        KARTICA.click();
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-intesa_payment"));
        js.executeScript("arguments[0].click();", MOJAADR);
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[7]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[7]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[7]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("asdadfl 3");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[7]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[7]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[7]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Fon2.sendKeys("06588525");
        WebElement Az = driver.findElement(By.xpath("/html/body/div[7]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Az);
        Thread.sleep(3000);


        WebElement Prihvacam = driver.findElement(By.id("agreement__1"));
        js.executeScript("arguments[0].click();", Prihvacam);
        WebElement KUPI = driver.findElement(By.xpath("/html/body/div[7]/main/div[2]/div/div[2]/div[5]/div[2]/div[3]/div[4]/div/div/button/span"));
        js.executeScript("arguments[0].click();", KUPI);






    }

    public static void SearchH() throws InterruptedException{
        String url = "https://svakodobro.rs/";
        driver.navigate().to(url);
        driver.get("https://svakodobro.rs/");
        WebElement Kucaj = driver.findElement(By.name("q"));
        Kucaj.sendKeys("Vitamin");
        Kucaj.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("maincontent")));
        WebElement R = driver.findElement(By.id("maincontent"));
        System.out.println(R.getText());
    }

    public static void KontaktH() throws InterruptedException{
        String url = "https://svakodobro.rs/";
        driver.navigate().to(url);
        driver.get("https://svakodobro.rs/");
        WebElement K = driver.findElement(By.xpath("/html/body/div[6]/header/div[1]/div/div/a[3]"));
        K.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
        WebElement Ime = driver.findElement(By.name("name"));
        Ime.sendKeys("Nikola test");
        WebElement mejl = driver.findElement(By.name("email"));
        mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement kom = driver.findElement(By.name("comment"));
        kom.sendKeys("test");
        WebElement send = driver.findElement(By.xpath("/html/body/div[6]/main/div[3]/div/form/div/div/button"));
        js.executeScript("arguments[0].click();" , send);
    }
}
