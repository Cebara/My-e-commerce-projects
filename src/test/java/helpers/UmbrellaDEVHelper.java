package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class UmbrellaDEVHelper extends BaseHelper {

    public static void Reghelper() throws InterruptedException {
        String url = "https://umbrellashop.dev.smartweb.rs/default/";
        driver.navigate().to(url);
        driver.get("https://umbrellashop.dev.smartweb.rs/default/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/div/header/div[1]/div/ul/li/a"));
        Nalog.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span")));
        WebElement Kreiraj = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span"));
        Kreiraj.click();
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
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }

    public static void LoginH() throws InterruptedException{
        String url = "https://umbrellashop.dev.smartweb.rs/default/";
        driver.navigate().to(url);
        driver.get("https://umbrellashop.dev.smartweb.rs/default/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[2]/div/header/div[1]/div/ul/li/a"));
        Nalog.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("login[username]")));
        WebElement Email = driver.findElement(By.name("login[username]"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }

    public static void Shopping() throws InterruptedException{
        LoginH();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-38")));
        WebElement ETecnosti = driver.findElement(By.id("ui-id-38"));
        ETecnosti.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[1]/div/div/div/div/a[3]/div/img")));
        WebElement OLE = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[1]/div/div/div/div/a[3]/div/img"));
        OLE.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[3]/div[2]/ol/li[2]/div/a/span/span/img")));
        WebElement Ole_Cola_Lime = driver.findElement(By.xpath("/html/body/div[2]/main/div[4]/div[1]/div[3]/div[2]/ol/li[2]/div/a/span/span/img"));
        Ole_Cola_Lime.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("attribute168")));
        Select OPCIJA = new Select(driver.findElement(By.id("attribute168")));
        OPCIJA.selectByVisibleText("6mg");
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        js.executeScript("arguments[0].click();", Dodaj);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement Zavrsi = driver.findElement(By.id("top-cart-btn-checkout"));
        Zavrsi.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("street[0]")));
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("asdasdas 2");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("06548563");
        WebElement SLEDECE = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(SLEDECE));
        SLEDECE.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-checkmo")));
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        MOJAADR.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input")));
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Ulica2.sendKeys("sdada 3");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("0055451111");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        WebElement Naruci = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[4]/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Naruci));
        js.executeScript("arguments[0].click();", Naruci);
    }

    public static void SearchH() throws InterruptedException{
        String url = "https://umbrellashop.dev.smartweb.rs/default/";
        driver.navigate().to(url);
        driver.get("https://umbrellashop.dev.smartweb.rs/default/");
        WebElement Lupa = driver.findElement(By.xpath("/html/body/div[2]/div/header/div[2]/section/div/section[1]/button[2]"));
        js.executeScript("arguments[0].click();", Lupa);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement Kucanje = driver.findElement(By.name("q"));
        Kucanje.sendKeys("Vape");
        Kucanje.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("amasty-shopby-product-list")));
        WebElement R = driver.findElement(By.id("amasty-shopby-product-list"));
        System.out.println(R.getText());
    }
}
