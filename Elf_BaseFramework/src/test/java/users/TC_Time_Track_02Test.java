package users;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.Time_TrackPage;

public class TC_Time_Track_02Test extends Base_Class {

	@Test
	public void addTaskFromTheList() {
		Time_TrackPage timeTracking = new Time_TrackPage(driver);
		timeTracking.addingTaskFromList(driver);
		
	}
}


