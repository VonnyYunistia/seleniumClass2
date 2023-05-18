package HWClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(2000);

        WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
firstName.sendKeys("Ciwit");

WebElement lastName= driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Permadi");

        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("CPermadi@gmail.com");

        WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        pass.sendKeys("Cumming123");

        Select dropMonth = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
        dropMonth.selectByVisibleText("July");

        Select dropDay = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
        dropDay.selectByVisibleText("22");

        Select dropYear = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
        dropYear.selectByValue("2000");

        driver.findElement(By.xpath("//label[text()='Female']")).click();

        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();

        Thread.sleep(5000);

        driver.close();





    }
}
