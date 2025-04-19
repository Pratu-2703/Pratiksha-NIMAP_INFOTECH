package nimapInfotech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://testffc.nimapinfotech.com/");
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("pratikshagaikwad2703@gmail.com");
        driver.findElement(By.xpath("//input[@formcontrolname=\"password\"]")).sendKeys("Pratu@2003");
        driver.findElement(By.xpath("//button[text()=\"Sign In\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()=\"My Customers\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()=\" New Customer \"]")).click();
        driver.findElement(By.xpath("//input[@formcontrolname=\"LeadName\"]")).sendKeys("PRATIKSHA");
        driver.findElement(By.xpath("//input[@formcontrolname=\"PersonName\"]")).sendKeys("PRATIKSHA");
        driver.findElement(By.xpath("//input[@formcontrolname=\"MobileNo\"]")).sendKeys("6578995678");
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("Pratiksha123@gmail.com");
        driver.findElement(By.xpath("//span[text()=\" Save \"]")).click();
    }
}
