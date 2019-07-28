package onealv.pages;

import onealv.helpers.Common;
import org.openqa.selenium.By;


public class CartPage extends Common {

    private By buttonForward = By.xpath("//a[@class = 'ait-button ait-button-primary order-form-forward-button']");
    private By buttonForwardWithoutReg = By.xpath("//a[@class = 'button btn-v2']");

    private By productPriceInCart = By.className("ait-cart-price");
    private By productNameInCart = By.xpath("//div[@class='ait-cart-item-info']/h4/a");

    private By GoToCart = By.xpath("//div/div/a[@class='button btn-cart product-is-in-cart']");

    public String firstProductPrice;
    public String firstProductName;


    public void NavigateToCart(){
        driver.findElement(GoToCart).click();
        if (driver.findElements(productPriceInCart).size()==0)
        {
            driver.findElement(GoToCart).click();
        }
        firstProductPrice = driver.findElement(productPriceInCart).getText();
        firstProductName = driver.findElement(productNameInCart).getText();

        driver.findElement(buttonForward).click();
        driver.findElement(buttonForwardWithoutReg).click();
    }



}
