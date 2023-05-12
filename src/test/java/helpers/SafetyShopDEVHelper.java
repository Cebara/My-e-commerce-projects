package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SafetyShopDEVHelper extends BaseHelper {

    public static void Regh() throws InterruptedException{
        String url = "https://safetyshop.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://safetyshop.dev.smartweb.rs/");
        WebElement Reg = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/ul/li[2]/a"));
        Reg.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a")));
        WebElement Regi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a"));
        Regi.click();
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
        WebElement R = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/form/div/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(R));
        System.out.println(R.getText());

    }

    public static void LoginH() throws InterruptedException{
        String url = "https://safetyshop.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://safetyshop.dev.smartweb.rs/");
        WebElement Reg = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/ul/li[2]/a"));
        Reg.click();
        WebElement Email = driver.findElement(By.name("login[username]"));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Aj));
        Aj.click();
    }
    public static void ShoppingH() throws InterruptedException{
        String url = "https://safetyshop.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://safetyshop.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-10")));
        WebElement oprema = driver.findElement(By.id("ui-id-10"));
        oprema.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_4")));
        WebElement Rukavice = driver.findElement(By.id("product-item-info_4"));
        Rukavice.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(3000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Mejl = driver.findElement(By.id("customer-email"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("adasdasdsa 2");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post1 = driver.findElement(By.name("postcode"));
        Post1.sendKeys("11090");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("065486555");
        Thread.sleep(3000);
        WebElement Sledece = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Sledece));
        Sledece.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("billing-address-same-as-shipping-checkmo")));
        WebElement MOJAADR = driver.findElement(By.id("billing-address-same-as-shipping-checkmo"));
        js.executeScript("arguments[0].click();", MOJAADR);
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Ulica2.sendKeys("afjiofsj 2");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fon2.sendKeys("068785414");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        Thread.sleep(4000);
        WebElement KUPi = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div/div[4]/ol/li[3]/div/form/fieldset/div[2]/div/div/div[2]/div[2]/div[4]/div/button/span"));
        js.executeScript("arguments[0].click();", KUPi);
    }

    public static void SearchH() throws InterruptedException{
        String url = "https://safetyshop.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://safetyshop.dev.smartweb.rs/");
        WebElement Lupa = driver.findElement(By.className("searchToggle"));
        Lupa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement Polje = driver.findElement(By.name("q"));
        Polje.sendKeys("Rukavice");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("maincontent")));
        WebElement R = driver.findElement(By.id("maincontent"));
        System.out.println(R.getText());
    }
}
