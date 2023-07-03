package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class LoginTest extends Utility {
    String baseUrl ="https://www.saucedemo.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
        @Test

    public void userShouldLoginSuccessfullyWithValid() {
        //enter username
      sendTextToElement(By.id("user-name"),"standard_user");
        //enter password
        sendTextToElement(By.id("password"),"secret_sauce");
        //click login
        clickOnElement(By.xpath("//input[@id = 'login-button']"));
        //verify product text
        String expectedText = "Products";
        String actualText = driver.findElement(By.xpath("//span[@class = 'title']")).getText();
        System.out.println(expectedText);
    }
@Test

    public void verifyThatSixProductsAreDisplayedOnPage(){
        //enter username
    sendTextToElement(By.id("user-name"),"standard_user");
        //enter password
    sendTextToElement(By.id("password"),"secret_sauce");
        //click on the login button
        clickOnElement(By.xpath("//input[@id = 'login-button']"));
        List<WebElement> elementlist = driver.findElements(By.className("inventory_item"));
        System.out.println("Total Product are " + elementlist.size());

    }
    @After
    public void tearDown(){
        closeBrowser();
    }

}
