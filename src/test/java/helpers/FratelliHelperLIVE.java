package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FratelliHelperLIVE extends BaseHelper{

    public static void RegH() throws InterruptedException{
        String url = "https://fratelli.rs/";
        driver.navigate().to(url);
        driver.get("https://fratelli.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div[2]/ul/li[3]"));
        Nalog.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span")));
        WebElement Reg = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span"));
        Reg.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement mejl = driver.findElement(By.name("email"));
        mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("Cebic123");
        WebElement potvrda = driver.findElement(By.name("password_confirmation"));
        potvrda.sendKeys("Cebic123");
        WebElement R = driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/form/div/div[1]/button"));
        wdWait.until(ExpectedConditions.elementToBeClickable(R));
        R.click();
    }

    public static void LoginH() throws InterruptedException{
        String url = "https://fratelli.rs/";
        driver.navigate().to(url);
        driver.get("https://fratelli.rs/");
        WebElement Nalog = driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div[2]/ul/li[3]"));
        Nalog.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.name("login[username]")));
        WebElement Mejl = driver.findElement(By.name("login[username]"));
        Mejl.sendKeys("nikola.cebic@smartweb.rs");
        WebElement pass = driver.findElement(By.name("login[password]"));
        pass.sendKeys("Cebic123");
        WebElement Aj = driver.findElement(By.id("send2"));
        Aj.click();
    }

    public static void Preuzimanje() throws InterruptedException{
        String url = "https://fratelli.rs/";
        driver.navigate().to(url);
        driver.get("https://fratelli.rs/");
        WebElement Aksesori = driver.findElement(By.xpath("//*[text()='Accessories']"));
        Aksesori.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_16724")));
        WebElement Novcanik = driver.findElement(By.id("product-item-info_16724"));
        Novcanik.click();
        Thread.sleep(3000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        Thread.sleep(3000);
        WebElement Korpa = driver.findElement(By.className("counter-label"));
        js.executeScript("arguments[0].click();", Korpa);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement Nastavi = driver.findElement(By.id("top-cart-btn-checkout"));
        Nastavi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Email = driver.findElement(By.id("customer-email"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Email));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("SAdsakd");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("06578556");
        Thread.sleep(3000);

        WebElement PreuzimanjeButton = driver.findElement(By.id("checkmo"));
        js.executeScript("arguments[0].scrollIntoView();", PreuzimanjeButton);
        js.executeScript("arguments[0].click();", PreuzimanjeButton);
        Thread.sleep(3000);

        WebElement Prihvatam = driver.findElement(By.name("custom-terms"));
        Prihvatam.click();
        Thread.sleep(2000);
        WebElement Kupi = driver.findElement(By.xpath("//*[text()=' Poruči']"));
        Kupi.click();
    }

    public static void PlatnaH() throws InterruptedException{
        String url = "https://fratelli.rs/";
        driver.navigate().to(url);
        driver.get("https://fratelli.rs/");
        WebElement Aksesori = driver.findElement(By.xpath("//*[text()='Accessories']"));
        Aksesori.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-item-info_16724")));
        WebElement Novcanik = driver.findElement(By.id("product-item-info_16724"));
        Novcanik.click();
        Thread.sleep(3000);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("product-addtocart-button")));
        WebElement Dodaj = driver.findElement(By.id("product-addtocart-button"));
        Dodaj.click();
        Thread.sleep(3000);
        WebElement Korpa = driver.findElement(By.className("counter-label"));
        js.executeScript("arguments[0].click();", Korpa);
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("top-cart-btn-checkout")));
        WebElement Nastavi = driver.findElement(By.id("top-cart-btn-checkout"));
        Nastavi.click();
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer-email")));
        WebElement Email = driver.findElement(By.id("customer-email"));
        wdWait.until(ExpectedConditions.elementToBeClickable(Email));
        Email.sendKeys("nikola.cebic@smartweb.rs");
        WebElement Ime = driver.findElement(By.name("firstname"));
        Ime.sendKeys("Nikola");
        WebElement Prezime = driver.findElement(By.name("lastname"));
        Prezime.sendKeys("Cebic");
        WebElement Ulica = driver.findElement(By.name("street[0]"));
        Ulica.sendKeys("SAdsakd");
        WebElement Grad = driver.findElement(By.name("city"));
        Grad.sendKeys("Beograd");
        WebElement Post = driver.findElement(By.name("postcode"));
        Post.sendKeys("11090");
        WebElement Fon = driver.findElement(By.name("telephone"));
        Fon.sendKeys("06578556");
        Thread.sleep(3000);
        WebElement PLATNA = driver.findElement(By.id("sample_gateway"));
        js.executeScript("arguments[0].scrollIntoView();",PLATNA);
        js.executeScript("arguments[0].click();", PLATNA);
        Thread.sleep(3000);

        WebElement Prihvatam = driver.findElement(By.name("custom-terms"));
        Prihvatam.click();
        Thread.sleep(2000);
        WebElement Kupi = driver.findElement(By.xpath("//*[text()=' Poruči']"));
        Kupi.click();
    }
}
