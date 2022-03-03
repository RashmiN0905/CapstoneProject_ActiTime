package users;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.Time_TrackPage;

public class SampleTestCaseTest extends Base_Class{
	
	@Test
	public void sample() throws InterruptedException {
//		homePage.getUsersModuleLink().click();	
		driver.findElement(By.xpath("//div[text()='Capacity planning: Q2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Mar 10, 2022']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Status']/..//div[@class=\"taskStatusButton editable\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"hideButton_panelContainer\"]")).click();
	}

}
