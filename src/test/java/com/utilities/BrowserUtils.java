package com.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.List;
import java.util.function.Function;

public class BrowserUtils extends DBUtils {

    public static void wait(int secs) {
        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
        }
    }

    public static void switchToIFrameByWebElement(WebElement element) {
        Driver.getDriver().switchTo().frame(element);
    }

    public static void clickEsc() {
        Screen sc = new Screen();
        sc.type(Key.ESC);
    }

    public static void switchToIFrameByID(String iFrameID) {
        Driver.getDriver().switchTo().frame(iFrameID);
    }

    public static void switchToDefailt() {
        Driver.getDriver().switchTo().parentFrame();
    }

    public static String getTodaysDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        return formatter.format(date);
    }

    public static boolean validateCheckBox(WebElement element) {
        return element.getAttribute("value").equals("Y");
    }

    public static void scrollDown(int num, int num2) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(" + num + "," + num2 + ")", "");
    }

    public static void scrollUp(int num, int num2) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(" + num + "," + num2 + ")", "");
    }

    /**
     * Generates the String path to the screenshot taken.
     * Within the method, the screenshot is taken and is saved into FileUtils.
     * The String return will have a unique name destination of the screenshot itself.
     *
     * @param name Test name passed in as a String
     * @return unique String representation of the file's location / path to file
     */
    public static String getScreenshot(String name) {
        // name the screenshot with current date-time to avoid duplicate naming
        String time = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakeScreenshot -> interface from selenium which takes screenshots
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots" + name + time + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException io) {
        }
        return target;
    }

    /*
     * switches to new window by the exact title
     * returns to original window if windows with given title not found
     */
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    /**
     * return a list of string from a list of elements ignores any element with no
     * text
     *
     * @param list
     * @return
     */

    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }

    public static List<String> getElementsText(By locator) {
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : elems) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }

    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickability(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForClickability(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static Boolean waitForURL(String actualURL, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        return wait.until(ExpectedConditions.urlToBe(actualURL));
    }

    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOutInSeconds);
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeOutInSeconds + " seconds");
        }
    }

    public static WebElement fluentWait(final WebElement webElement, int timeinsec) {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(timeinsec))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
        return element;
    }
    /**
     * Verifies whether the element matching the provided locator is displayed on page
     * fails if the element matching the provided locator is not found or not displayed
     * @param by
     */
//    public static void verifyElementDisplayed(By by) {
//        try {
//            Assert.assertTrue( Driver.getDriver().findElement( by).isDisplayed(), "Element not visible: "+by);
//        } catch (NoSuchElementException e) {
//            fail("Element not found: " + by);
//
//        }
//    }
    /**
     * Verifies whether the element is displayed on page
     * fails if the element is not found or not displayed
     * @param element
     */
//    public static void verifyElementDisplayed(WebElement element) {
//        try {
//            assertTrue(element.isDisplayed(), "Element not visible: "+element);
//        } catch (NoSuchElementException e) {
//            fail("Element not found: " + element);
//
//        }
//    }element

    /**
     * Waits for element to be not stale
     *
     * @param element
     */
    public void waitForStaleElement(WebElement element) {
        int y = 0;
        while (y <= 15) {
            if (y == 1)
                try {
                    element.isDisplayed();
                    break;
                } catch (StaleElementReferenceException st) {
                    y++;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } catch (WebDriverException we) {
                    y++;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }
    }

    /**
     * Selects a random value from a dropdown list and returns the selected Web Element
     *
     * @param select
     * @return
     */
    public static WebElement selectRandomTextFromDropdown(Select select) {
        Random random = new Random();
        List<WebElement> weblist = select.getOptions();
        int optionIndex = 1 + random.nextInt(weblist.size() - 1);
        select.selectByIndex(optionIndex);
        return select.getFirstSelectedOption();
    }

    /**
     * Clicks on an element using JavaScript
     *
     * @param element
     */
    public void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

    /**
     * Scrolls down to an element using JavaScript
     *
     * @param element
     */
    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * Performs double click action on an element
     *
     * @param element
     */
    public void doubleClick(WebElement element) {
        new Actions(Driver.getDriver()).doubleClick(element).build().perform();
    }

    /**
     * Changes the HTML attribute of a Web Element to the given value using JavaScript
     *
     * @param element
     * @param attributeName
     * @param attributeValue
     */
    public void setAttribute(WebElement element, String attributeName, String attributeValue) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", element, attributeName, attributeValue);
    }

    /**
     * @param element
     * @param check
     */
    public void selectCheckBox(WebElement element, boolean check) {
        if (check) {
            if (!element.isSelected()) {
                element.click();
            }
        } else {
            if (element.isSelected()) {
                element.click();
            }
        }
    }

    public String[] fromListToString(List<WebElement> x) {
        String[] trans = new String[x.size()];
        for (WebElement xx : x) {
            int count = 0;
            trans[count] = xx.getText();
            count++;
        }
        Arrays.sort(trans);
        return trans;
    }

    public static void grabHold(WebDriver driver, String parentHandle) {
        /* /NOTE: Be sure to set -> String parentHandle=driver.getWindowHandle(); prior to the action preceding method deployment */
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            if (window != parentHandle)
                driver.switchTo().window(window);
        }
    }

    public static void waitUntilTitleEquals(int timeout, String x) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        wait.until(ExpectedConditions.titleContains(x));
    }

    public static int getRundomNumInRange(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low) + low;
    }

    public void waitForPresenceOfElementByCss(String css) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),
                Long.parseLong(ConfigurationReader.getProperties("timeout")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(css)));
    }

    public void hitEnterUsingRobot() {
        Robot rb;
        try {
            rb = new Robot();
            rb.keyPress(KeyEvent.VK_ENTER);
            rb.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void InitilizaButton() {
        Button createAccountbutton = new Button("createAccount");
        Button validationButton = new Button("validationBtn");
        validationButton.setEnabled(false);
    }

    public boolean verifyAlertPresent() {
        try {
            Driver.getDriver().switchTo().alert();
            return true;
        } catch (NoAlertPresentException Ex) {
            System.out.println("Alert is not presenet");
        }
        return false;
    }

    public boolean isElementVisible(By arg0) {
        boolean elementVisible = false;
        try {
            (new WebDriverWait(Driver.getDriver(), 60)).until(ExpectedConditions.visibilityOfElementLocated(arg0));
            elementVisible = true;

        } catch (TimeoutException ex) {
            elementVisible = false;
        }
        return elementVisible;
    }

    public static void highLightingElement(WebDriver driver, WebElement target) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", target);
    }
}