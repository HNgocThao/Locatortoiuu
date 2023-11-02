import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TH1 {
    public static void main(String[] args) {
        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang https://demoqa.com/text-box
        driver.get("https://demoqa.com/text-box");

        //Nhập name và email
        String input_Name = "//input[@placeholder='%s']";
        String xpath = String.format(input_Name, "Full Name");
        String xpath1 = String.format(input_Name, "name@example.com");
        driver.findElement(By.xpath(xpath)).sendKeys("Thao");
        driver.findElement(By.xpath(xpath1)).sendKeys("thao@gmail.com");

        //Nhập textarea
        String input_TextArea = "//textarea[@id='%s']";
        String xpath2 = String.format(input_TextArea, "currentAddress");
        System.out.println("Xpath of Current Address is " + xpath2);
        String xpath3 = String.format(input_TextArea, "permanentAddress");
        driver.findElement(By.xpath(xpath2)).sendKeys("Thao");
        driver.findElement(By.xpath(xpath3)).sendKeys("thao@gmail.com");

        driver.findElement(By.xpath("//button[@id='submit']")).click();
    }
}
