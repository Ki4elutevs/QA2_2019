package onealv.helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class Common {

    public static WebDriver driver;
    public static JavascriptExecutor jse;

    public void startBrowser(){

        String driverPath="C:\\Users\\SvetlanaKovaljonoka\\IdeaProjects\\ForumCinema\\src\\main\\resources/";
        System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.1a.lv");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        jse = (JavascriptExecutor)driver;
    }

    public void stopBrowser(){
        waitSomeSeconds();
        driver.quit();
    }

    public void checkPageIsReady() {

        //Initially bellow given if condition will check ready state of page.
        if (jse.executeScript("return document.readyState").toString().equals("complete")){
            System.out.println("Page Is loaded.");
            return; }
    }

    public void waitSomeSeconds(){
        try{
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
