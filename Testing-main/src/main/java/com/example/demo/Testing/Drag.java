package com.example.demo.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag {
	public static void main(String[] args)throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
	    driver.get("https://demoqa.com/droppable/");
	    //drag me
	    WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	     
	    //drop here
	    WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	    //Actions 
	    Actions act= new Actions(driver);
	    act.dragAndDrop(drag, drop).build().perform();
}
}