package onealv.pages;

import onealv.helpers.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchPage extends Common {

    private By bannerFrame = By.xpath("//iframe[contains(@id,'mt-')]");
    private By searchField = By.id("search_products_text_field");
    private By searchButton = By.xpath("//input[@value='search']");
    private By titleName = By.xpath("//div[@data-attribute-id='2100']");

    private By productCategory = By.xpath("//a[@data-cat-id = '155']");

    private By searchBrand = By.xpath("//input[@name = 'items-search']");
    private By foundBrand = By.xpath("//div[@style='display: block;']/label/div");

    private By ratio = By.xpath("//div[@class='select-sort-products select-product-sort-list selectArea']");
    private By ratioSelectList = By.xpath("//select[@id='product_sort_list_top']");

    private By addToCart = By.xpath("//div/div/a[@class='button btn-cart']");

    private WebElement ratioList;

    public void closeBanner(){
        if (driver.findElements(bannerFrame).size()!=0) {
            driver.switchTo().frame(driver.findElement(bannerFrame));
            driver.findElement(By.xpath("//*[name() = 'use']")).click();
        }
    }
    public void SearchProduct (String searchedProduct) {
        checkPageIsReady();
        if (driver.findElements(bannerFrame).size()!=0) {
            driver.switchTo().frame(driver.findElement(bannerFrame));
            driver.findElement(By.xpath("//*[name() = 'use']")).click();
        }
        driver.findElement(searchField).sendKeys(searchedProduct);
        driver.findElement(searchButton).click();
    }

    public void setRatio(){
        driver.findElement(ratio).click();
        ratioList = driver.findElement(ratioSelectList);
        ratioList.sendKeys(Keys.DOWN);
        driver.findElement(ratio).click();
        ratioList.sendKeys(Keys.DOWN);
    }

    public void SearchBrand(String productBrand){
        checkPageIsReady();

        if (driver.findElements(By.xpath("//a[@data-cat-id = '155']")).size() != 0 ) {
            driver.findElement(productCategory).click();
        }
        jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(titleName));
        driver.findElement(titleName).click();

        driver.findElement(searchBrand).sendKeys(productBrand);
        driver.findElement(foundBrand).click();
    }

    public void selectProduct(){
        driver.findElement(addToCart).click();
    }




}