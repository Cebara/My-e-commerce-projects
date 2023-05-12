package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class KeraMetalHelper extends BaseHelper {

    private static void Registracija(String Ime, String Prezime, String Email, String Lozinka, String PotvrdaLozinke) throws InterruptedException {
        String url = "https://kerametal.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://kerametal.dev.smartweb.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div[2]/ul/li[2]/a"));
        Nalog.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div/div[2]/p/a")));
        WebElement Regse = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div/div[2]/p/a"));
        Regse.click();
        WebElement Ime1 = driver.findElement(By.id("firstname"));
        Ime1.sendKeys(Ime);
        WebElement Prezime2 = driver.findElement(By.id("lastname"));
        Prezime2.sendKeys(Prezime);
        WebElement Mejl = driver.findElement(By.id("email_address"));
        Mejl.sendKeys(Email);
        WebElement Pass = driver.findElement(By.id("password"));
        Pass.sendKeys(Lozinka);
        WebElement PassConf = driver.findElement(By.id("password-confirmation"));
        PassConf.sendKeys(PotvrdaLozinke);
        WebElement RegButton = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/form/div[2]/div[1]/button/span"));
        js.executeScript("arguments[0].click();", RegButton);
    }

    public static void DefRegistracija() throws InterruptedException {
        Registracija("Nikola", "Cebic", "nikola.cebic@smartweb.rs", "Cebic123", "Cebic123");
    }

    public static void Login() throws InterruptedException {
        String url = "https://kerametal.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://kerametal.dev.smartweb.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div[2]/ul/li[2]/a"));
        Nalog.click();
        WebElement PrvoPolje = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div/div[2]/form/fieldset/div[1]/div"));
        PrvoPolje.click();
        WebElement PrvoPolje2 = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div/div[2]/form/fieldset/div[1]/div/input"));
        PrvoPolje2.sendKeys("nikola.cebic@smartweb.rs");
        WebElement DrugoPoljePass = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div/div[2]/form/fieldset/div[2]/div"));
        DrugoPoljePass.click();
        WebElement Passkucanje = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div/div[2]/form/fieldset/div[2]/div/input"));
        Passkucanje.sendKeys("Cebic123");
        WebElement Ajd = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div/div[2]/form/fieldset/div[3]/div[2]/button/span"));
        Ajd.click();
        Thread.sleep(5000);
    }
    public static void UProdavniciIPouzece() throws InterruptedException{
        Login();
        WebElement SearchBar = driver.findElement(By.name("q"));
        SearchBar.sendKeys("Korpa");
        SearchBar.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[4]/div/div[3]/ol/li[5]/div/a")));
        WebElement Korpa = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[4]/div/div[3]/ol/li[5]/div/a"));
        js.executeScript("arguments[0].click();", Korpa);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement MiniK = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        MiniK.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div/ul/li/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div/ul/li/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        //
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("ko_unique_1")));
        WebElement UProdziopcija = driver.findElement(By.name("ko_unique_1"));
        wdWait.until(ExpectedConditions.elementToBeClickable(UProdziopcija));
        UProdziopcija.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("am_pickup_store")));
        Select Prodavnica = new Select(driver.findElement(By.name("am_pickup_store")));
        Prodavnica.selectByVisibleText("Batajnica");
        Thread.sleep(8000);
        WebElement Pouzece = driver.findElement(By.name("payment[method]"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Pouzece));
        Pouzece.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("street[0]")));
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Trte 34");
        Thread.sleep(4000);
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Novi Sad");
        WebElement Postanski = driver.findElement(By.name("postcode"));
        Postanski.sendKeys("11040");
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        Azuriraj.click();
        WebElement Kupi  = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[3]/div[4]/div/div/button"));
        Kupi.click();
        Thread.sleep(5000);
    }

    public static void UProdziIPrekoRacuna() throws InterruptedException{
        Login();
        WebElement SearchBar = driver.findElement(By.name("q"));
        SearchBar.sendKeys("Korpa");
        SearchBar.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[4]/div/div[3]/ol/li[5]/div/a")));
        WebElement Korpa = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[4]/div/div[3]/ol/li[5]/div/a"));
        js.executeScript("arguments[0].click();", Korpa);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement MiniK = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        MiniK.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div/ul/li/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div/ul/li/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
       //
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("ko_unique_1")));
        WebElement UProdziopcija = driver.findElement(By.name("ko_unique_1"));
        UProdziopcija.click();
        Select Prodavnica = new Select(driver.findElement(By.name("am_pickup_store")));
        Prodavnica.selectByVisibleText("Batajnica");
        Thread.sleep(5000);
        WebElement PrekoRacuna = driver.findElement(By.id("banktransfer"));
        PrekoRacuna.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[6]/div[2]/div[3]/div[4]/div/div/button")));
        WebElement Kupi = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div[2]/div[6]/div[2]/div[3]/div[4]/div/div/button"));
        Kupi.click();
        Thread.sleep(5000);
    }

    public static void ProdzaIkartica() throws InterruptedException{
        Login();
        WebElement SearchBar = driver.findElement(By.name("q"));
        SearchBar.sendKeys("Korpa");
        SearchBar.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[4]/div/div[3]/ol/li[5]/div/a")));
        WebElement Korpa = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[4]/div/div[3]/ol/li[5]/div/a"));
        js.executeScript("arguments[0].click();", Korpa);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement MiniK = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        MiniK.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div/ul/li/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div/ul/li/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        //
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("ko_unique_1")));
        WebElement UProdziopcija = driver.findElement(By.name("ko_unique_1"));
        UProdziopcija.click();
        Select Prodavnica = new Select(driver.findElement(By.name("am_pickup_store")));
        Prodavnica.selectByVisibleText("Batajnica");
        WebElement Kartica = driver.findElement(By.id("intesa_payment"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Kartica));
        Kartica.click();
        Thread.sleep(5000);
    }

    public static void KurirIPouzece() throws InterruptedException{
        Login();
        WebElement SearchBar = driver.findElement(By.name("q"));
        SearchBar.sendKeys("Korpa");
        SearchBar.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[4]/div/div[3]/ol/li[5]/div/a")));
        WebElement Korpa = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[4]/div/div[3]/ol/li[5]/div/a"));
        js.executeScript("arguments[0].click();", Korpa);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement MiniK = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        MiniK.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div/ul/li/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div/ul/li/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("cashondelivery")));
        WebElement pouzece = driver.findElement(By.id("cashondelivery"));
        pouzece.click();
        WebElement MojaAdr = driver.findElement(By.name("billing-address-same-as-shipping"));
        MojaAdr.click();
        Select Adresa2 = new Select(driver.findElement(By.name("billing_address_id")));
        Adresa2.selectByVisibleText("Nova adresa");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div/div/input"));
        Ulica2.sendKeys("Blanje 2");
        WebElement Grad = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        Grad.sendKeys("Beograd");
        WebElement Postanski = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[9]/div/input"));
        Postanski.sendKeys("11090");
        WebElement Sacuvaj = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[11]/input"));
        Sacuvaj.click();
        WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div/div/div[2]/div[6]/div[2]/div[2]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azuriraj);

        Thread.sleep(5000);
    }

    public static void KurirIRacun() throws InterruptedException{
        Login();
        WebElement SearchBar = driver.findElement(By.name("q"));
        SearchBar.sendKeys("Korpa");
        SearchBar.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[4]/div/div[3]/ol/li[5]/div/a")));
        WebElement Korpa = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div[1]/div[4]/div/div[3]/ol/li[5]/div/a"));
        js.executeScript("arguments[0].click();", Korpa);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a")));
        WebElement MiniK = driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/div/div/a"));
        MiniK.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div/ul/li/button/span")));
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div/ul/li/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Nastavi));
        Nastavi.click();
        WebElement Racun = driver.findElement(By.id("banktransfer"));
        Racun.click();
    }

    //zavrsiti sve ovo,svi imaju greske kod porucivanja


}
