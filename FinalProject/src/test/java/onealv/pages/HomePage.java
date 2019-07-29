package onealv.pages;

import onealv.helpers.Common;
import org.openqa.selenium.By;

public class HomePage extends Common {

    private By bannerFrame = By.xpath("//iframe[contains(@id,'mt-')]");
    private By secondBannerClose = By.xpath("//div[@id='cookie-btns']/a[@class='c-button-inverse']");

    public void closeBanner(){
        checkPageIsReady();

        if (driver.findElements(bannerFrame).size()!=0) {
            driver.switchTo().frame(driver.findElement(bannerFrame));
            driver.findElement(By.xpath("//*[name() = 'use']")).click();
        }

        if (driver.findElements(secondBannerClose).size() != 0) {
            driver.findElement(secondBannerClose).click();
        }

    }
}
