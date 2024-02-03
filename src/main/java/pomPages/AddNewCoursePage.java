package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.WebDriverUtility;

public class AddNewCoursePage {
	
	//Declaration
	  @FindBy(xpath = "//b[text() ='Add New Course']")
	  private WebElement PageHeader;
	  
	  @FindBy(id = "name")
	  private WebElement nameTF;
	  
	  @FindBy(xpath = "//select[id = 'category' and @required]")
	  private WebElement categoryDropdown;
	  
	  @FindBy(id = "price")
	  private WebElement priceTF;
	  
	  @FindBy(xpath = "(//input[@id='photo')[2]")
	  private WebElement uploadPhotoButton;
	  
	  @FindBy(xpath = "//html/body/p")
	  private WebElement descriptionTextArea;
	  
	  @FindBy(xpath = "//iframe[@title='Rich Text Editor, editor1']")
	  private WebElement descriptionFrame;
	  
	  @FindBy(xpath = "//button[text()='save' and @name='add']")
	  private WebElement saveButton;
	  
	  //Initialization
	  public AddNewCoursePage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  //Utilization
	  
	  public String getPageHeader() {
		  return PageHeader.getText();
	  }
	  
	  public void setName(String courseName) {
		  nameTF.sendKeys(courseName);
		  
	}
	  
	  public void selectCategory(WebDriverUtility web, String text)
	  {
		  web.selectFromDropdown(text, categoryDropdown);
	  }
	   public void setPrice(String price)
	   {
		   priceTF.sendKeys(price);
		   
	   }
	   
	   public void setDescription(String description,WebDriverUtility web)
	   {
		   web.switchToFrame(descriptionFrame);
		   descriptionTextArea.sendKeys(description);
		   web.switchBackFromFrame();
	   }
}





