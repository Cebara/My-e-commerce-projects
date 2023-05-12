package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class MishelHelper extends BaseHelper {

    public static void RegHelper() throws InterruptedException {
        String url = "https://mishel.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://mishel.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div[1]/p/a")));
        WebElement Registracija1 = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/p/a"));
        Registracija1.click();
        WebElement Reg2 = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span"));
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
        WebElement PassP = driver.findElement(By.name("password_confirmation"));
        PassP.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/form/div/div[1]/button/span"));
        Aj.click();
    }

    public static void LoginHelper() throws InterruptedException{
        String url = "https://mishel.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://mishel.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/header/div[2]/div[1]/p/a")));
        WebElement Registracija1 = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/p/a"));
        Registracija1.click();
        WebElement Mejl = driver.findElement(By.name("login[username]"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Pass = driver.findElement(By.name("login[password]"));
        Pass.sendKeys("Cebic123");
        WebElement Prijava = driver.findElement(By.id("send2"));
        Prijava.click();

    }

    public static void Shopping() throws InterruptedException{
        LoginHelper();
        WebElement Muskarci = driver.findElement(By.xpath("/html/body/div[1]/header/div[4]/div/ul/li[2]/a"));
        Muskarci.click();
        WebElement Aksesoari = driver.findElement(By.xpath("/html/body/div/main/div[2]/div/div/div/div/a[3]/div/img"));
        Aksesoari.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div[2]/div[3]/ol/li[10]/div/a/span/span/img")));
        WebElement Kacket = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]/div[2]/div[3]/ol/li[10]/div/a/span/span/img"));
        Kacket.click();
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Dodaj));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/main/div[1]/div[2]/div/div/div/a")));
        WebElement MalaKorpa = driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[2]/div/div/div/a"));
        MalaKorpa.click();
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("street[0]")));
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Bla bla 23");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        Select Zemlja = new Select(driver.findElement(By.name("country_id")));
        Zemlja.selectByVisibleText("Srbija");
        WebElement Postanski1 = driver.findElement(By.name("postcode"));
        Postanski1.sendKeys("11090");
        WebElement Broj = driver.findElement(By.name("telephone"));
        Broj.sendKeys("064877895");
        WebElement Mojaadr = driver.findElement(By.name("billing-address-same-as-shipping"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Mojaadr));
        Mojaadr.click();
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Trtetete 22");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Subotica");
        Select Zemlja2 = new Select(driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/select")));
        Zemlja2.selectByVisibleText("Srbija");
        WebElement Postanski2 = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Postanski2.sendKeys("11090");
        WebElement Fontele = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Fontele.sendKeys("0674885452");
        WebElement Azuiriraj = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[5]/div[2]/div[1]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Azuiriraj));
        Azuiriraj.click();
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[5]/div[2]/div[2]/div[4]/div/div/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kupi));
        Kupi.click();

    }

    public static void SearchH() throws InterruptedException{
        String url = "https://mishel.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://mishel.dev.smartweb.rs/");
        WebElement Lupa = driver.findElement(By.className("pretragatoggle"));
        Lupa.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        WebElement Kucanje = driver.findElement(By.name("q"));
        Kucanje.sendKeys("cipele");
        Kucanje.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/main/div[3]/div[1]")));
        WebElement Result = driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div[1]"));
        System.out.println(Result.getText());
    }
}
