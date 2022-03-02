package users;

import org.apache.tools.ant.types.Assertions;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.Time_TrackPage;

public class TC_Time_Track_01Test extends Base_Class {

	@Test
	public void createNewTask()  {
		ExcelUtil excelLib= new ExcelUtil();
		String task = excelLib.readStringDataFromExcel("TimeTrack", 0, 1);
		Time_TrackPage timeTracking = new Time_TrackPage(driver);
		timeTracking.createNewTask(driver, task);
		
		

	}
}
