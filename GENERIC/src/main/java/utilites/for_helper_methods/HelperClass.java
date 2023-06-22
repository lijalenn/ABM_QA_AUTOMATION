package utilites.for_helper_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilites.for_misl.ExcelReader;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class HelperClass {
    private static HelperClass helperClass;
    private static WebDriver driver;
    //    private static WebDriverWait wait;
    public final static int TIMEOUT = 20;
    public final static int PAGELOADTIME = 30;
    public String browser = "chrome";

    private HelperClass() {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        options.addArguments("start-maximized");
//                options.addArguments("--window-size=1400,900");

            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

            options.addArguments("--remote-allow-origins=*");

            Proxy proxy = new Proxy();
            proxy.setHttpProxy("<HOST:PORT>");
            options.setCapability("proxy", proxy);

            driver = new ChromeDriver(options);

        }
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGELOADTIME));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {
        if (helperClass == null) {
            helperClass = new HelperClass();
        }
    }

    public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }

        helperClass = null;
    }

    public static WebDriver.Timeouts waitExplicit() {
        return getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
    }

    public static void sleepFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void click(WebElement element) {
        new WebDriverWait(getDriver(), Duration.ofSeconds(TIMEOUT)).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public static void clickUsingJS(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", element);
    }

    /**
     * This method will use to identify a web element and click on it
     * It will identify the web element By- xpath, css, id, class name
     * @param locator
     */
    public static void identifyAndClickOnLocator(String locator) {
        try {
            getDriver().findElement(By.xpath(locator)).click();
        } catch (Exception e1) {
            System.out.println("xpath failed" + e1);
            try {
                getDriver().findElement(By.cssSelector(locator)).click();
            } catch (Exception e2) {
                System.out.println("css failed" + e2);
                try {
                    getDriver().findElement(By.id(locator)).click();
                } catch (Exception e3) {
                    System.out.println("id failed" + e3);
                    try {
                        getDriver().findElement(By.className(locator)).click();
                    }catch (Exception e4){
                        System.out.println("class Name filed "+ e4);
                    }
                }
            }
        }

    }

    public static void sendKeysUsingJS(WebElement element, String keyVal) {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", element);
        element.sendKeys(keyVal);
    }

    public static void scrollToAnElement(WebElement element) {
        JavascriptExecutor scroll = (JavascriptExecutor) getDriver();
        scroll.executeScript("arguments[0].scrollIntoView();", element);
    }

    /**
     * This method will leverage explicit wait time to enter a text in a text field
     *
     * @param element
     * @param keyVal  Author Alelign(Alen)
     */
    public static void sendKey(WebElement element, String keyVal) {
        new WebDriverWait(getDriver(), Duration.ofSeconds(TIMEOUT)).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(keyVal);
    }

    /**
     * This method will leverage explicit wait time to enter a text in a text field and press the enter key
     *
     * @param element
     * @param keyVal
     */
    public static void sendKeyWithEnterKey(WebElement element, String keyVal) {
        new WebDriverWait(getDriver(), Duration.ofSeconds(TIMEOUT)).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(keyVal + Keys.ENTER);
    }

    public static void moveToElementAndClick(WebElement element) {
        Actions act = new Actions(driver);
        act.moveToElement(element).click().build().perform();
    }

    public static void moveToElement(WebElement element) {
        Actions act = new Actions(driver);
        act.moveToElement(element).build().perform();
    }


    public static String getPageTitle(WebElement element) {
        return getDriver().getTitle();
    }

    public static String getCurrentURL(WebElement element) {
        return getDriver().getCurrentUrl();
    }

    public static String getText(WebElement element) {
        return element.getText();
    }

    public static void acceptAlert() {
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }

    public static void dismissAlert() {
        Alert alert = getDriver().switchTo().alert();
        alert.dismiss();
    }

    public static void selectByVisibleText(WebElement element, String visibleText) {
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    public static void selectByValue(WebElement element, String textValue) {
        Select select = new Select(element);
        select.selectByVisibleText(textValue);
    }

    public static String excleHelper(String filePath, String sheetName, String columName, int index) {
        ExcelReader read = new ExcelReader();
        List<Map<String, String>> celVal = read.getData(filePath, sheetName);
        return celVal.get(index).get(columName);
    }


}
