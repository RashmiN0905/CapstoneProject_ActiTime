package users;

import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.Time_TrackPage;

public class TC_Time_Track_03Test extends Base_Class {

	@Test
	public void modifyingCreatedTask() throws Throwable {
		ExcelUtil excelLib = new ExcelUtil();
		double estimatedHours = excelLib.readNumberDataFromExcel("TimeTrack", 1, 1);
		String description = excelLib.readStringDataFromExcel("TimeTrack", 2, 1);
		String comment = excelLib.readStringDataFromExcel("TimeTrack", 3, 1);

		Time_TrackPage timeTracking = new Time_TrackPage(driver);
		timeTracking.modifyingTask(driver, description, comment);
	}
}