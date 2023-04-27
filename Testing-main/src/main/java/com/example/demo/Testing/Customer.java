package com.example.demo.Testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Customer {
	public static void main(String[] args)throws InterruptedException {
		WebDriverManager.edgedriver().setup();
	 	   WebDriver driver=new EdgeDriver();
	 	   driver.get("https://demo.guru99.com/test/delete_customer.php");
	 	   driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("401");
	 	   driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	 	   Alert alert=driver.switchTo().alert();
	 	   alert.dismiss();
	 	   Thread.sleep(5000);
	 	   driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).clear();
	 	   Thread.sleep(5000);
	 	   driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("402",Keys.ENTER);
	 	   alert.accept();
	 	   Thread.sleep(5000);
	 	   String msg =alert.getText();
	 	   Thread.sleep(2000);
	 	   alert.accept();
	 	   System.out.println(msg);
}
}
