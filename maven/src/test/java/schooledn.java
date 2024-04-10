import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class schooledn {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://schooledn.py.gov.in/admission/hsc.html");
        WebElement schoolDiv = driver.findElement(By.xpath("//*[@id=\"fh5co-aside\"]/div/div/div/div/div/div/ul/li[4]/a"));

        Actions action = new Actions(driver);

        action.moveToElement(schoolDiv).click().perform();
        WebElement govDiv = driver.findElement(By.xpath("//*[@id=\"fh5co-aside\"]/div/div/div/div/div/div/ul/li[4]/ul/li[1]/a"));
        action.moveToElement(govDiv).perform();
        WebElement privateDiv = driver.findElement(By.xpath("//*[@id=\"fh5co-aside\"]/div/div/div/div/div/div/ul/li[4]/ul/li[2]/a"));

        action.moveToElement(privateDiv).click().perform();

        WebElement govaidedDiv = driver.findElement(By.xpath("//*[@id=\"fh5co-aside\"]/div/div/div/div/div/div/ul/li[4]/ul/li[2]/ul/li[1]/a"));

        action.moveToElement(govaidedDiv).click().perform();


    }
}
