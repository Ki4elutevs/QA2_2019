package onealv.pages;

import onealv.helpers.Common;
import org.openqa.selenium.By;

public class OrderPage extends Common {

    private By firstName = By.id("order_main_data_name");
    private By lastName = By.id("order_main_data_surname");
    private By email = By.id("order_main_data_email");
    private By phoneNumber = By.id("order_main_data_contact_phone_number");
    private By recieveNewsList = By.xpath("//input[@class = 'ui-state-default ui-autocomplete-input ui-widget ui-widget-content']");
    private By iAgree = By.id("accept_purchase_agreement");

    private By delivery = By.xpath("//article[@data-delivery-type-id='10']");

    private By payCash = By.xpath("//a[@payment_type='CASH_INDIVIDUAL_PERSON']");
    private By buttonForward = By.xpath("//a[@class='ait-button ait-button-primary order-form-forward-button']");

    private By productNameInOrder = By.xpath("//tbody/tr/td/div/h4/a[contains(@href,'/')]");
    private By productPriceInOrder = By.xpath("//span[@class = 'ait-cart-total-count']");

    public String productName;
    public String prodcutPrice;

    public void addCustomerName(String FirstName, String LastName) {
        checkPageIsReady();
        driver.findElement(firstName).sendKeys(FirstName);
        driver.findElement(lastName).sendKeys(LastName);
    }

    public void addCustomerContacts(String Email, String PhoneNumber){
        driver.findElement(email).sendKeys(Email);
        driver.findElement(phoneNumber).sendKeys(PhoneNumber);
    }

    public void addCustomerAddInfo(String ReceiveNews){
        driver.findElement(iAgree).click();
        driver.findElement(recieveNewsList).sendKeys(ReceiveNews);
    }

    public void selectDelivery(){
        driver.findElement(delivery).click();
        driver.findElement(buttonForward).click();
    }

    public void selectPaymentType(){
        checkPageIsReady();
        driver.findElement(payCash).click();
        driver.findElement(buttonForward).click();
    }

    public void getProductData(){
        checkPageIsReady();
        productName = driver.findElement(productNameInOrder).getText();
        prodcutPrice = driver.findElement(productPriceInOrder).getText();
    }

    public void stopBrowser(){
        driver.quit();
    }



}
