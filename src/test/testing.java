package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class testing {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		
		Select multiselectbox = new Select(driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/form[2]/table/tbody/tr/td[1]/select")));
		
		multiselectbox.selectByVisibleText("Russia");
		
		multiselectbox.selectByValue("Mexico");
		
		multiselectbox.selectByIndex(5);
		
		Thread.sleep(3000);
		
		multiselectbox.deselectByIndex(1);
		multiselectbox.deselectByVisibleText("Mexico");
		multiselectbox.deselectByValue("Germany");
		
		Thread.sleep(3000);
		
		multiselectbox.selectByVisibleText("Russia");
		
		multiselectbox.selectByValue("Mexico");
		
		multiselectbox.selectByIndex(5);
		
		Thread.sleep(3000);
		
		multiselectbox.deselectAll();
		
		
		// this is just added
		
		//can this be pushed
		
		
		
		
		
		
		

	}

}
