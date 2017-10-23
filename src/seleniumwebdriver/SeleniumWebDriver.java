/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumwebdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author diego
 */
public class SeleniumWebDriver {

    /**
     * @param args the command line arguments
     */
    
   
    private static String ul = "http:\\newtours.demoaut.com"; 
    
    public static void main(String[] args) {
        // TODO code application logic here
      // System.setProperty("webdriver.gecko.driver", "C:\\Users\\diego\\Desktop\\TP7-IngSw\\Windows\\geckodriver.exe"); //as we set the path for IE driver 

        
       
        System.setProperty("webdriver.chrome.driver","C:\\Users\\diego\\Documents\\chromedriver.exe");
        
        WebDriver driver = new FirefoxDriver();
        //driver.get(ul);
        
         driver.get(ul + "/mercurywelcome.php");
    
        
        driver.findElement(By.name("userName")).clear();
driver.findElement(By.name("userName")).sendKeys("ingsoftware");
driver.findElement(By.name("password")).clear();
driver.findElement(By.name("password")).sendKeys("ingsoftware");
driver.findElement(By.name("login")).click();
new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("London");
new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("Paris");
// ERROR: Caught exception [Error: Dom locators are not implemented yet!]
driver.findElement(By.name("findFlights")).click();
driver.findElement(By.name("reserveFlights")).click();
        driver.findElement(By.name("passFirst0")).clear();
driver.findElement(By.name("passFirst0")).sendKeys("Diego");
driver.findElement(By.name("passLast0")).clear();
driver.findElement(By.name("passLast0")).sendKeys("Calvo");
        
    }
    
}
