package tests;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JasminLIVE extends BaseTest {

    @Test
    public void Jasmintest() throws InterruptedException {
        String url = "https://www.jasmin.rs/";
        driver.get(url);

        WebElement Sminka = driver.findElement((By.xpath("/html/body/div[2]/div/nav/ul[1]/li[1]/a")));
        Sminka.click();

        WebElement Lice = driver.findElement((By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[1]/div[1]/ul/li[1]/span")));
        Lice.click();
        Thread.sleep(1000);
        WebElement Korektori = driver.findElement((By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[1]/div[1]/ul/li[1]/ul/li[3]/a")));
        Korektori.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(5,document.body.scrollHeight)");
        WebElement Artdeco = driver.findElement(By.id("product-item-info_29564"));
        Artdeco.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("option-label-imp_makeup-165-item-39711")));
        WebElement Boja = driver.findElement(By.id("option-label-imp_makeup-165-item-39711"));
        Boja.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Korpa = driver.findElement(By.id("product-addtocart-button"));
        Korpa.click();
        Thread.sleep(3000);

        WebElement miniKorpa = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/div/a/span[2]/span[1]"));
        miniKorpa.click();

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement NastaviDalje = driver.findElement(By.id("top-cart-btn-checkout"));
        NastaviDalje.click();
        Thread.sleep(6000);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("s_method_bexexpress_bexexpress")));
        WebElement Bex = driver.findElement(By.id("s_method_bexexpress_bexexpress"));
        Bex.click();
        Thread.sleep(2000);

        WebElement EmailPolje = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[6]/div[1]/div[2]/li/div/div/form[1]/fieldset/div/div/input"));
        EmailPolje.sendKeys("nikola.cebic9@gmail.com");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("lastname")));
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("street[0]")));
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("Sretena Mladenovica Mike 5");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("city")));
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("BEOGRAD-RAKOVICA");
        Thread.sleep(5000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/main/div/div/div/div[6]/div[1]/div[2]/li/div/div/form[2]/div/div[4]/div/div")));
        WebElement jediniizbor = driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[6]/div[1]/div[2]/li/div/div/form[2]/div/div[4]/div/div"));
        jediniizbor.click();
        Thread.sleep(2000);



        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("telephone")));
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("062227362");
        Thread.sleep(2000);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, -250);");
        Thread.sleep(3000);

        WebElement dugme1 = driver.findElement(By.name("payment[method]"));
        dugme1.click();
        Thread.sleep(2000);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("billing-address-same-as-shipping")));
        WebElement Azuriranje = driver.findElement(By.name("billing-address-same-as-shipping"));
        Azuriranje.click();
        Thread.sleep(2000);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input")));
        WebElement ime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[1]/div/input"));
        ime2.sendKeys("Nikola");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input")));
        WebElement prezime2 = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[2]/div/input"));
        prezime2.sendKeys("Cebic");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input")));
        WebElement ulicica = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/input"));
        ulicica.sendKeys("PILOTA MIHAILA PETROVIĆA");
        Thread.sleep(5000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/div/ul/li[1]")));
        WebElement rakovica = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/fieldset/div/div[1]/div/div/ul/li[1]"));
        rakovica.click();



        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input")));
        WebElement fontele = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[2]/div/form/fieldset/div[6]/div/input"));
        fontele.sendKeys("062227362");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]")));
        WebElement azuriraj = driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[6]/div[2]/div[1]/li/div/form/fieldset/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/div/fieldset/div[3]/div/button[1]"));
        azuriraj.click();
        Thread.sleep(4000);

        JavascriptExecutor jsb = (JavascriptExecutor) driver;
        jsb.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("agreement[1]")));
        WebElement slazemse = driver.findElement(By.name("agreement[1]"));
        slazemse.click();
        Thread.sleep(4000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#checkout > div.opc-wrapper.am-opc-wrapper.layout-2columns.am-submit-summary > div:nth-child(2) > div.checkout-block.-summary > div.checkout-payment-method.submit > div > div > button")));
        WebElement Naruci = driver.findElement(By.cssSelector("#checkout > div.opc-wrapper.am-opc-wrapper.layout-2columns.am-submit-summary > div:nth-child(2) > div.checkout-block.-summary > div.checkout-payment-method.submit > div > div > button"));
        Naruci.click();
        Thread.sleep(8000);
    }

}
