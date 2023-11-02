import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TH2 {
    public static void main(String[] args) {
        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang https://demoqa.com/automation-practice-form
        driver.get("https://demoqa.com/automation-practice-form");

        //Nhập input
        String input_Name = "//input[@id='%s']";
        String xpath = String.format(input_Name, "firstName");
        String xpath1 = String.format(input_Name, "lastName");
        String xpath2 = String.format(input_Name, "userEmail");
        String xpath3 = String.format(input_Name, "userNumber");
        String xpath4 = String.format(input_Name, "dateOfBirthInput");
        String xpath5 = String.format(input_Name, "subjectsInput");
        String xpath8 = String.format(input_Name, "react-select-3-input");
        String xpath9 = String.format(input_Name, "react-select-4-input");

        driver.findElement(By.xpath(xpath)).sendKeys("Thao");
        driver.findElement(By.xpath(xpath1)).sendKeys("Huynh");
        driver.findElement(By.xpath(xpath2)).sendKeys("thao@gmail.com");
        driver.findElement(By.xpath(xpath3)).sendKeys("0123 456 789");


        driver.findElement(By.xpath(xpath4)).sendKeys(Keys.CONTROL, "a");
        driver.findElement(By.xpath(xpath4)).sendKeys("15 Jul 1994");
        driver.findElement(By.xpath(xpath4)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(xpath5)).sendKeys("Maths");
        driver.findElement(By.xpath(xpath5)).click();
        driver.findElement(By.xpath(xpath5)).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(xpath8)).sendKeys("Haryana");
        driver.findElement(By.xpath(xpath8)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(xpath9)).sendKeys("Panipat");
        driver.findElement(By.xpath(xpath9)).sendKeys(Keys.ENTER);

        //Nhập radio
        String input_Radio = "//label[@for='%s']";
        String xpath6 = String.format(input_Radio, "gender-radio-3");
        String xpath7 = String.format(input_Radio, "hobbies-checkbox-2");
        driver.findElement(By.xpath(xpath6)).click();
        driver.findElement(By.xpath(xpath7)).click();

        driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("ha ha ha ha....");

        //Handle Upload file
        //driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\Users\OS\IdeaProjects2\Locatortoiuu\src\resource\ten.jpg");
        driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys(System.getProperty("user.dir") + "\\src\\resource\\ten.jpg");

//        WebElement but = driver.findElement(By.xpath("//button[@id='submit']"));
//        but.click();
        driver.findElement(By.xpath("//button[@id='submit' and @type='submit']")).click();
    }
}
