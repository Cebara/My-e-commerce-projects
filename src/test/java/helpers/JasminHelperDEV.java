package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class JasminHelperDEV extends BaseHelper {

    public static void LicnoiGotovinaH() throws InterruptedException{
        String url = "https://jasmin.dev.smartweb.rs/";
        driver.navigate().to(url);
        driver.get("https://jasmin.dev.smartweb.rs/");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/nav/ul[1]/li[6]/a/span")));
        WebElement Aksesoari = driver.findElement(By.xpath("/html/body/div[2]/div/nav/ul[1]/li[6]/a/span"));
        Aksesoari.click();
        WebElement baner1 = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[2]/div[1]/a/img[2]"));
        wdWait.until(ExpectedConditions.elementToBeClickable(baner1));
        baner1.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_6143")));
        WebElement Set = driver.findElement(By.id("product-item-info_6143"));
        Set.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a")));
        WebElement korpica = driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a"));
        korpica.click();
        Thread.sleep(4000);
        WebElement Nastavi = driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/ul/li[1]/button/span"));
        Nastavi.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("s_method_amstorepickup_amstorepickup")));
        WebElement LICNO = driver.findElement(By.id("s_method_amstorepickup_amstorepickup"));
        js.executeScript("arguments[0].click();", LICNO);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("am_pickup_store")));
        Select Prodza = new Select(driver.findElement(By.name("am_pickup_store")));
        Prodza.selectByVisibleText("Beograd, Rajićeva Shopping Center");

        WebElement EMAIL = driver.findElement(By.id("customer-email"));
        EMAIL.sendKeys("nikola.cebic@smartweb.rs");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        WebElement Ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        Ime2.sendKeys("Nikola");
        WebElement Prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        Prezime2.sendKeys("Cebic");
        WebElement Ulica2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        Ulica2.sendKeys("sdasdas 2");
        WebElement Grad2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[4]/div/input"));
        Grad2.sendKeys("Beograd");
        WebElement Post2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[5]/div/input"));
        Post2.sendKeys("11090");
        WebElement Fon2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        Fon2.sendKeys("065479536");
        WebElement Azurriaj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div/div[2]/div[2]/div/fieldset/div[3]/div/button[1]/span"));
        js.executeScript("arguments[0].click();", Azurriaj);







    }
}
