package test1.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App  
{
    public static void main( String[] args )
    {
//    	 WebDriverManager.firefoxdriver().setup();
//         WebDriver driver=new FirefoxDriver();
//    	
//    	WebDriverManager.chromedriver().setup();
//		ChromeOptions co=new ChromeOptions(); 
//		co.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(co);
//         driver.get("https://demoqa.com/droppable/");
//         driver.findElement(By.xpath("//*[@id=\\\"draggable\\\"]"));
//         driver.findElement(By.xpath("//*[@id=\\\"droppable\\\"]"));
//         
//         Actions act=new Actions(driver);
//         act.dragAndDrop(null, null);
    	
    	  WebDriverManager.edgedriver().setup();
          WebDriver driver = new EdgeDriver();
          driver.get("https://demoqa.com/droppable/");
          WebElement drag= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div[1]"));
          WebElement drop = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div[2]"));
          Actions ac = new Actions(driver);        
                 v
          ac.dragAndDrop(drag,drop);
          ac.build().perform();
    }
}