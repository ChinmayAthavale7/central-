package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	//fffcc
    	String baseUrl = "http://demo.guru99.com/test/facebook.html";					
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("Abc@fb.com");
        driver.findElement(By.name("pass")).sendKeys("abcde");
     	driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div/form/table/tbody/tr[2]/td[3]/label/input")).submit();
        //driver.close();
	}  
}
