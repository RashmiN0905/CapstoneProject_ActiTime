package pomRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import genericLibrary.UtilityMethods;
/**
 * 
 * @author RashmiN
 *
 */
public class Time_TrackPage {

	public Time_TrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// **************************************************************************************
	// WebElements
	@FindBy(id = "addTaskButtonId")
	private WebElement newButton;

	@FindBy(xpath = "//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']//div[@class='dropdownButton']")
	private WebElement customerDropdown;

	@FindBy(xpath = "//div[text()='Big Bang Company']")
	private WebElement bigBangComapany;

	@FindBy(xpath = "(//div[@class='dropdownButton'])[6]")
	private WebElement projectDropdown;

	@FindBy(xpath = "//div[text()='Spaceship testing']")
	private WebElement spaceShipTesting;

	@FindBy(xpath = "//input[@placeholder='Enter task name']")
	private WebElement taskName;

	@FindBy(xpath = "//div[text()='Create Tasks']")
	private WebElement createButton;
	
	@FindBy(xpath = "//div[text()='- New Customer -']")
	private WebElement newCustomer;                                                                                                                        

	// **************************************************************************************
	// Getter Methods
	public WebElement getNewButton() {
		return newButton;
	}

	public WebElement getCustomerDropdown() {
		return customerDropdown;
	}

	public WebElement getBigBangComapany() {
		return bigBangComapany;
	}

	public WebElement getRecruitingAndHR() {
		return projectDropdown;
	}

	public WebElement getProjectDropdown() {
		return spaceShipTesting;
	}

	public WebElement getTaskName() {
		return taskName;
	}

	public WebElement getCreateButton() {
		return createButton;
	}

	public WebElement getSpaceShipTesting() {
		return spaceShipTesting;
	}

	public WebElement getNewCustomer() {
		return newCustomer;
	}

	// **************************************************************************************
	// Action Methods
	public void createNewTask(WebDriver driver, String nameOfTask)  {
		newButton.click();

		WebDriverWait explicitWait = new WebDriverWait(driver, 20);
		explicitWait.until(ExpectedConditions.elementToBeClickable(createButton));

		customerDropdown.click();
		
		explicitWait.until(ExpectedConditions.visibilityOf(newCustomer));
		newCustomer.click();
		customerDropdown.click();
		explicitWait.until(ExpectedConditions.visibilityOf(bigBangComapany));
		bigBangComapany.click();
		

		explicitWait.until(ExpectedConditions.visibilityOf(projectDropdown));

		projectDropdown.click();
		explicitWait.until(ExpectedConditions.visibilityOf(spaceShipTesting));

		spaceShipTesting.click();
		explicitWait.until(ExpectedConditions.visibilityOf(taskName));
		taskName.click();
		
		taskName.sendKeys(nameOfTask);
		explicitWait.until(ExpectedConditions.visibilityOf(createButton));

		createButton.click();

	}
	
	//----------------------------TC_Time_Track----------------------------------------------------
	
	@FindBy(xpath = "//span[text()='Add Tasks from the List']")
	WebElement addNewTaskFromListLink;
	
	@FindBy(xpath ="//div[@class='customerProjectSelector activeProjects']//td[@class='dropdownButton']")
	WebElement customerProjectDropDown;
	
	@FindBy(xpath = "//td[text()='Big Bang Company']")
	WebElement bigBangCompany;
	
	
	@FindBy(xpath="//span[text()='Black hole protection']")
	WebElement blackHoleProtection;
	
	@FindBy(xpath ="//button[text()='Add Selected']")
	WebElement addSelectedButton;

	// Getter Methods
	public WebElement getAddNewTaskFromListLink() {
		return addNewTaskFromListLink;
	}
	public WebElement getbigBangCompany() {
		return bigBangCompany;
	}

	public WebElement getCustomerProjectDropDown() {
		return customerProjectDropDown;
	}

	public WebElement getBlackHoleProtection() {
		return blackHoleProtection;
	}

	public WebElement getAddSelectedButton() {
		return addSelectedButton;
	}
//----->ActionMethods
	
	public void addingTaskFromList(WebDriver driver) {	
		addNewTaskFromListLink.click();
		
		WebDriverWait explicitWait = new WebDriverWait(driver, 20);
		explicitWait.until(ExpectedConditions.elementToBeClickable(customerProjectDropDown));
		customerProjectDropDown.click();
		bigBangCompany.click();
//		explicitWait.until(ExpectedConditions.visibilityOf(nasaNegotiationscheckbox));
		blackHoleProtection.click();		
		addSelectedButton.click();
	}
	
	//*********************************************************************************************************
	@FindBy(xpath="//div[contains(text(),'testingSpaceship')]")
	WebElement bigbangSpaceShipTesting;
	
	@FindBy(xpath ="(\"//div[text()='Capacity planning: Q2']\")")
	WebElement statusButton;
	
	@FindBy(xpath = "(//div[text()='Planning'])[6]")
	WebElement InProgressOption;

	
	@FindBy(xpath = "//span[text()='Set up deadline']")
	WebElement deadLine;
	
	@FindBy(xpath="//a[@id='ext-gen46']")
	WebElement nextButton;
	
	
	@FindBy(xpath="//button[@id='ext-gen58']")
	WebElement downArrow;
	
	@FindBy(xpath="//a[text()='Apr']")
	WebElement month;
	
	
	@FindBy(xpath="//a[text()='2022']")
	WebElement year;
	
	
	@FindBy(xpath="//span[text()='9']")
	WebElement date;
	
	@FindBy(xpath="//button[@class='x-date-mp-ok']")
	WebElement okButton;

	
	@FindBy(xpath = "//span[text()='9']/../../../../../../../../..//button[text()='April 2022']")
	WebElement deadLineDate;
	
	@FindBy(xpath = "//div[@title='Billable: engineering']")
	WebElement billableEngineeringDropdown;
	
	@FindBy(xpath = "//div[text()='management']")
	WebElement managementOption;
	
	@FindBy(xpath = "//div[text()='Enter hours']")
	WebElement estimatedHour;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter task description...']")
	WebElement description;
	
	@FindBy(xpath = "//div[@class='bottomLineText']")
	WebElement commentLine;
	
	@FindBy(xpath = "//div[@class='hideButton_panelContainer']")
	WebElement hiddenButton;
	
	//--------->getterMethods

	public WebElement getBigbangSpaceShipTesting() {
		return bigbangSpaceShipTesting;
	}

	public WebElement getStatusButton() {
		return statusButton;
	}
	public WebElement getInProgressOption() {
		return InProgressOption;
	}

	public WebElement getDeadLine() {
		return deadLine;
	}
	
	public WebElement getNextButton() {
		return nextButton;
	}
	
	public WebElement getDownArrow() {
		return downArrow;
	}
	
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	
	public WebElement getDate() {
		return date;
	} 
	
	public WebElement getOkButton() {
		return okButton;
	} 
	
	public WebElement getDeadLineDate() {
		return deadLineDate;
	}

	public WebElement getBillableEngineeringDropdown() {
		return billableEngineeringDropdown;
	}

	public WebElement getManagementOption() {
		return managementOption;
	}

	public WebElement getEstimatedHour() {
		return estimatedHour;
	}

	public WebElement getDescription() {
		return description;
	}

	

	public WebElement getCommentLine() {
		return commentLine;
	}

	public WebElement getHiddenButton() {
		return hiddenButton;
	}

	public void modifyingTask(WebDriver driver, String descriptionLine, String commentLineText) throws Throwable {
		Thread.sleep(2000);
		bigbangSpaceShipTesting.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Status']/..//div[@class=\"taskStatusButton editable\"]")).click();
		Thread.sleep(2000);
		
		billableEngineeringDropdown.click();
		Thread.sleep(2000);
		managementOption.click();
		Thread.sleep(2000);
		
		
		deadLine.click();
		Thread.sleep(2000);

		downArrow.click();Thread.sleep(2000);
		month.click();Thread.sleep(2000);
		year.click();Thread.sleep(2000);
		okButton.click();Thread.sleep(2000);
		date.click();Thread.sleep(2000);
	
		hiddenButton.click();Thread.sleep(2000);
		
	}
}
