package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args)  {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.netflix.com/in/login");
        driver.manage().window().maximize();
        

        
        
       //river.findElement(By.id("identifierId")).sendKeys("");




       
       //river.findElement(By.id("password")).click();
        

        

    
        //iver.quit();
    }
}
