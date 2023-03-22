package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ETehnikaHelper extends BaseHelper{

    private static void Registracija(String Ime, String Prezime, String Email, String Lozinka, String PotvrdaLozinke ) throws InterruptedException{
        String url = "https://eurotehnika.dev.smartweb.rs/";
        driver.get("https://eurotehnika.dev.smartweb.rs/");
        WebElement RegistracijaDugme = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/div[1]/ul/li[4]/a"));
        RegistracijaDugme.click();
        WebElement ImeField = driver.findElement(By.id("firstname"));
        ImeField.sendKeys(Ime);
        WebElement PrezimeField = driver.findElement(By.id("lastname"));
        PrezimeField.sendKeys(Prezime);
        WebElement EmailField = driver.findElement(By.id("email_address"));
        EmailField.sendKeys(Email);
        WebElement LozinkaField = driver.findElement(By.id("password"));
        LozinkaField.sendKeys(Lozinka);
        WebElement PotvrdaLozinkeField = driver.findElement(By.id("password-confirmation"));
        PotvrdaLozinkeField.sendKeys(PotvrdaLozinke);
        WebElement RegDugme = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/form/div/div[1]/button/span"));
        wdWait.until(ExpectedConditions.elementToBeClickable(RegDugme));
        RegDugme.click();
        Thread.sleep(3000);

    }
    public static void DefRegistracija() throws InterruptedException {
    Registracija("Nikola", "Cebic", "nikola.cebic@smartweb.rs", "Cebic123", "Cebic123");
}
    public static void DefLogin() throws InterruptedException {
    String url = "https://eurotehnika.dev.smartweb.rs/";
    driver.navigate().to(url);
    driver.get("https://eurotehnika.dev.smartweb.rs/");
    WebElement PrijaviseDugme = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/div[1]/ul/li[3]/a"));
    PrijaviseDugme.click();
    WebElement Email1 = driver.findElement(By.name("login[username]"));
    Email1.sendKeys("nikola.cebic@smartweb.rs");
    WebElement Lozinka1 = driver.findElement(By.name("login[password]"));
    Lozinka1.sendKeys("Cebic123");
    wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("send2")));
    WebElement PrijaviseDef = driver.findElement(By.id("send2"));
    PrijaviseDef.click();

}

    public  static void PlacanjeKarticom() throws InterruptedException {
     DefLogin();
     wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[9]/div[2]/div/ol/div/div/div[1]/div/li/div[6]/a/span")));
     WebElement Frizider = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[9]/div[2]/div/ol/div/div/div[1]/div/li/div[6]/a/span"));
     Frizider.click();
     wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
     WebElement DodajUKorpu = driver.findElement(By.id("product-addtocart-button"));
     DodajUKorpu.click();

     WebElement Minikorpica = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/div[2]"));
     wdWait.until(ExpectedConditions.elementToBeClickable(Minikorpica));
     Minikorpica.click();
     wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
     WebElement NastaviKaPlacanju = driver.findElement(By.id("top-cart-btn-checkout"));
     NastaviKaPlacanju.click();
     wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("street[0]")));
     WebElement Ulica1 = driver.findElement(By.name("street[0]"));
     Ulica1.sendKeys("Sretena Mladenovica Mike 3");
     WebElement Grad1 = driver.findElement(By.name("city"));
     Grad1.sendKeys("Beograd");
     WebElement PostanskiKod1 = driver.findElement(By.name("postcode"));
     PostanskiKod1.sendKeys("11090");
     WebElement Fon1 = driver.findElement(By.name("telephone"));
     Fon1.sendKeys("062227362");

     wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[1]")));
     WebElement PlacanjeKarticomButton = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[1]"));
     wdWait.until(ExpectedConditions.elementToBeClickable(PlacanjeKarticomButton));
     PlacanjeKarticomButton.click();
     wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/label")));
     WebElement MojadrzanapidostISTA = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/label"));
     MojadrzanapidostISTA.click();
     wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input")));
     WebElement NovaUlica = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
     NovaUlica.sendKeys("Lazar Mitkovski 3");
     WebElement Dgra = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[7]/div/input"));
     Dgra.sendKeys("Novi Sad");
     WebElement Postanski2 = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
     Postanski2.sendKeys("11080");
     wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]")));
     WebElement Azuriraj = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]"));
     Azuriraj.click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, -250);");
     wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("agreement__1")));
     WebElement SlazemSe2 = driver.findElement(By.id("agreement__1"));
     wdWait.until(ExpectedConditions.elementToBeClickable(SlazemSe2));
     SlazemSe2.click();
     wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[2]/div/div[4]/div/div/button")));
     WebElement NastaviKaPlacanju2 = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[2]/div/div[4]/div/div/button"));
     NastaviKaPlacanju2.click();

     Thread.sleep(3000);
   }

    public static void PlacanjePouzecem() throws  InterruptedException{
        DefLogin();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[9]/div[2]/div/ol/div/div/div[1]/div/li/div[6]/a/span")));
        WebElement Frizider = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[9]/div[2]/div/ol/div/div/div[1]/div/li/div[6]/a/span"));
        Frizider.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement DodajUKorpu = driver.findElement(By.id("product-addtocart-button"));
        DodajUKorpu.click();
        WebElement Minikorpica = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div/div[2]"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Minikorpica));
        Minikorpica.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement NastaviKaPlacanju = driver.findElement(By.id("top-cart-btn-checkout"));
        NastaviKaPlacanju.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("street[0]")));
        WebElement Ulica1 = driver.findElement(By.name("street[0]"));
        Ulica1.sendKeys("Sretena Mladenovica Mike 3");
        WebElement Grad1 = driver.findElement(By.name("city"));
        Grad1.sendKeys("Beograd");
        WebElement PostanskiKod1 = driver.findElement(By.name("postcode"));
        PostanskiKod1.sendKeys("11090");
        WebElement Fon1 = driver.findElement(By.name("telephone"));
        Fon1.sendKeys("062227362");
        //zavrsi ovo govno nece da nadje dugme za placanjepouzecem
        js.executeScript("window.scrollBy(0,400)");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]")));
        WebElement PlacanjePouz = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]"));
        wdWait.until(ExpectedConditions.visibilityOf(PlacanjePouz));
        PlacanjePouz.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/input")));
        WebElement MojaAdrzaNapiDosISTA = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div[1]/input"));
        MojaAdrzaNapiDosISTA.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input")));
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Ulica2.sendKeys("Serdar Janka 12");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input")));
        WebElement NovPostanski = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[8]/div/input"));
        NovPostanski.sendKeys("11090");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span")));
        WebElement AzurirajOpet = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[5]/div[1]/div[3]/li/div/form/fieldset/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        AzurirajOpet.click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,-250)");
        WebElement SlazemSe2 = driver.findElement(By.id("agreement__1"));
        wdWait.until(ExpectedConditions.elementToBeClickable(SlazemSe2));
        SlazemSe2.click();


    }

    public static void SearchBar() throws  InterruptedException {
        String url = "https://eurotehnika.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://eurotehnika.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("search")));
        WebElement SearchPolje = driver.findElement(By.id("search"));
        SearchPolje.sendKeys("Klime");
        SearchPolje.sendKeys(Keys.ENTER);

        Thread.sleep(3000);
    }
    }
