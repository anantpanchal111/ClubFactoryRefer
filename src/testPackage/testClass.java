package testPackage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class testClass {


    public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
	//	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
	//	WebDriver chromedriver;
		ChromeOptions options = new ChromeOptions();
		String[] capability=new String[1];
		capability[0]="--incognito";
		options.addArguments(capability);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("C:\\chromedriver.exe"))
                .usingAnyFreePort()
                .build();
		options.merge(capabilities); 
        String baseUrl = "https://cfshare1.fromfactory.club/theme/collect_like/dispatch?product_id=443067&schedule=267&starter=53424456";
        String expectedTitle = "Google";
        String actualTitle = "";
        
        
		
    	
        // launch Fire fox and direct it to the Base URL
		String appenndd="qwelkja";
		for(int i=0;i<6;i++) {
			WebDriver driver = new ChromeDriver(service, options);
	        driver.get(baseUrl);
	
	        driver.findElement(By.className("like_btn")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("/html//div[@id='login-container']/div[6]/div[2]/input[@value='Sign up']")).click();
	        WebElement mailId= driver.findElement(By.name("old_email"));
	        mailId.sendKeys(appenndd+i+"@"+appenndd+".com");
	        WebElement passWord= driver.findElement(By.xpath("/html//div[@id='login-container']//input[@class='pwd showPwd']"));
	        passWord.sendKeys("sdgfsdg@22");
	        
	        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/input[2]")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.className("like_btn")).click();
	        driver.close();
		}
    }
}