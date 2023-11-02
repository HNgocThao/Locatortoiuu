import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BT1 {
    public static void main(String[] args) {
        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        John.Smith
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("John.Smith");
//        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin321");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//span[text()='My Info']")).click();


        //Nhập input
        String input_Name = "//div[@data-v-957b4417]/following::input[@placeholder='%s']";
        String xpath1 = String.format(input_Name, "First Name");
        String xpath2 = String.format(input_Name, "Middle Name");
        String xpath3 = String.format(input_Name, "Last Name");


        driver.findElement(By.xpath(xpath1)).click();
        driver.findElement(By.xpath(xpath1)).sendKeys(Keys.CONTROL, "a");
        driver.findElement(By.xpath(xpath1)).sendKeys("Thao");
        driver.findElement(By.xpath(xpath2)).click();
        driver.findElement(By.xpath(xpath2)).sendKeys(Keys.CONTROL, "a");
        driver.findElement(By.xpath(xpath2)).sendKeys("Ngoc");
        driver.findElement(By.xpath(xpath3)).click();
        driver.findElement(By.xpath(xpath3)).sendKeys(Keys.CONTROL, "a");
        driver.findElement(By.xpath(xpath3)).sendKeys("Huynh");

        String input_label = "//label[text()='%s']/following::input[@class='oxd-input oxd-input--active']";
        String label1 = String.format(input_label, "Nickname");
        String label2 = String.format(input_label, "Employee Id");
        String label3 = String.format(input_label, "Other Id");
//        String label4 = String.format(input_label, "Driver's License Number");
        String label5 = String.format(input_label, "SSN Number");
        String label6 = String.format(input_label, "SIN Number");
        String label7 = String.format(input_label, "License Expiry Date");
        String label8 = String.format(input_label, "Date of Birth");
        String label9 = String.format(input_label, "Military Service");


        driver.findElement(By.xpath(label1)).click();
        driver.findElement(By.xpath(label1)).sendKeys(Keys.CONTROL, "a");
//        driver.findElement(By.xpath(label1)).sendKeys(Keys.DELETE);
        driver.findElement(By.xpath(label1)).sendKeys("Bí bí");
        driver.findElement(By.xpath(label2)).click();
        driver.findElement(By.xpath(label2)).sendKeys(Keys.CONTROL, "a");
//        driver.findElement(By.xpath(label2)).sendKeys(Keys.DELETE);
        driver.findElement(By.xpath(label2)).sendKeys("001");
        driver.findElement(By.xpath(label3)).click();
        driver.findElement(By.xpath(label3)).sendKeys(Keys.CONTROL, "a");
        driver.findElement(By.xpath(label3)).sendKeys("007");
//        driver.findElement(By.xpath(label4)).sendKeys("0123456");

        driver.findElement(By.xpath(label5)).click();
        driver.findElement(By.xpath(label5)).sendKeys(Keys.CONTROL, "a");
        driver.findElement(By.xpath(label5)).sendKeys("1234");
        driver.findElement(By.xpath(label6)).click();
        driver.findElement(By.xpath(label6)).sendKeys(Keys.CONTROL, "a");
        driver.findElement(By.xpath(label6)).sendKeys("4321");
        driver.findElement(By.xpath(label7)).click();
        driver.findElement(By.xpath(label7)).sendKeys(Keys.CONTROL, "a");
        driver.findElement(By.xpath(label7)).sendKeys("2024-12-24");
        driver.findElement(By.xpath("//div[@class='oxd-date-input-link --close']")).click();
        driver.findElement(By.xpath(label8)).click();
        driver.findElement(By.xpath(label8)).sendKeys("1994-07-15");
        driver.findElement(By.xpath("//div[@class='oxd-date-input-link --close']")).click();
//        driver.findElement(By.xpath(label9)).click();
//        driver.findElement(By.xpath(label9)).sendKeys(Keys.CONTROL, "a");
//        driver.findElement(By.xpath(label9)).sendKeys("Captian");

        String input_droppdown = "//label[text()='%s']/following::div[@class='oxd-select-text-input']";
        String drop1 = String.format(input_droppdown, "Nationality");
        String drop2 = String.format(input_droppdown, "Employee Id");
        String drop3 = String.format(input_droppdown, "Blood Type");

        driver.findElement(By.xpath(drop1)).click();
        driver.findElement(By.xpath(drop1)).sendKeys(Keys.chord("v"));
        driver.findElement(By.xpath(drop1)).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(drop2)).click();
        driver.findElement(By.xpath(drop2)).sendKeys(Keys.chord("m"));
        driver.findElement(By.xpath(drop2)).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(drop3)).click();
        driver.findElement(By.xpath(drop3)).sendKeys(Keys.chord("O"));
        driver.findElement(By.xpath(drop3)).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//input[@type='radio' and @value='1']/following-sibling::span")).click();

        driver.findElement(By.xpath("//button[text()=' Add ']")).click();

        driver.findElement(By.xpath("//div[text()='Browse']")).sendKeys(System.getProperty("user.dir") + "\\src\\resource\\ten.jpg");

        driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']")).sendKeys("ha ha ha...");
        driver.findElement(By.xpath("//button[text()=' Cancel ']/following-sibling::button")).click();

        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-form-hint']/following-sibling::button")).click();


    }
}
