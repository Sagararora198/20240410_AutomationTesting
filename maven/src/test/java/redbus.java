import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class redbus {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.com/");
        String originalWindowHandle = driver.getWindowHandle();
        WebElement Help = driver.findElement(By.xpath("//A[@href='/info/redcare'][text()='Help']"));
        Actions action = new Actions(driver);
        action.click(Help).perform();
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String windowHandle : allWindowHandles) {
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break; // Assuming only one additional window is opened
            }
        }
        WebElement cross = driver.findElement(By.xpath("//I[@class='icon-close']"));
        action.click(cross).perform();

    }
}
