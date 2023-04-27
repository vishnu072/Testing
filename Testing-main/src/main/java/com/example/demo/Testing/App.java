package com.example.demo.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	 WebDriverManager.edgedriver().setup();
         WebDriver driver=new EdgeDriver();
         driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
         //maximize the window screen
         driver.manage().window().maximize();
         //Navigating down
         JavascriptExecutor js =  (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,800)", args);
         //find the first name
         driver.findElement(By.xpath("/html/body/main/div[2]/div/div/form/fieldset[1]/div[2]/div/input")).sendKeys("vishnu");
         driver.findElement(By.xpath("/html/body/main/div[2]/div/div/form/fieldset[1]/div[3]/div/input")).sendKeys("vishnu.k");
         driver.findElement(By.xpath("/html/body/main/div[2]/div/div/form/fieldset[1]/div[4]/div/input")).sendKeys("727721euai060@gmail.com");
         driver.findElement(By.xpath("/html/body/main/div[2]/div/div/form/fieldset[2]/div/div/input")).sendKeys("vishnu");
        
         driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div/div[1]/label")).click();
         Thread.sleep(5000);
         driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
         driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
         Thread.sleep(5000);
    
     
 
    }
}
