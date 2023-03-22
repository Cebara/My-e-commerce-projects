package tests;

import helpers.BaseHelper;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseTest extends BaseHelper
{
    @Before
    public void testInit()
    {
        driver.manage().window().maximize();
    }

    @After
    public void testTearDown() {
        driver.close();
        driver.quit();
    }

}