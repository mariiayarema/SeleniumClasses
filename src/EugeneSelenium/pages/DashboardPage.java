package EugeneSelenium.pages;

import EugeneSelenium.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends CommonMethods {

    @FindBy(id="welcome")
    public WebElement welcomeAdmin;

    public DashboardPage(){
        PageFactory.initElements(driver,this);
    }

}
