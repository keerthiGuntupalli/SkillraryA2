package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {
    //Declaration
	
	@FindBy(xpath = "//h1[normalize-space(text())='Category']")
	private WebElement pageHeader;

	@FindBy(xpath = "//a[text()=' New']")
	private WebElement newButton;
	
	private String deletePath = "//td[text()='%S']/ancestor::tr/descendant::button[text()=' Delete']";
	
	@FindBy(name="delete")
	private WebElement deleteButton;
	
	@FindBy(xpath="//h4[text()=' Success']")
	private WebElement successMessage;
	
	//Initialization
	public CategoryPage(webDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//Utilization
	
	public String getPageHeader()
	{
		return PageHeader.getText();
	}
	
	public void clickNewButton() {
		newButton.click();
		
	}
	public void deleteCourse(WebDriverUtility web, String categoryName)
	{
		web.convertPathToWebElement(deletePath, categoryName).click();
		deleteButton.click();
	}
	public String getSuccessMessage() {
		return successMessage.getText();
	}

}