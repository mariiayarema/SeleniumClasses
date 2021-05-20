package EugeneSelenium.test;

import EugeneSelenium.pages.LoginPage;
import EugeneSelenium.testbase.BaseClass;
import EugeneSelenium.utils.CommonMethods;

public class LoginTest {

    public static void main(String[] args) {
        BaseClass.setUpWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/viewPimModule");
        LoginPage loginPage=new LoginPage();
        loginPage.userNameField.sendKeys("Admin");
        loginPage.passwordField.sendKeys("Hum@nhrm123");
        loginPage.loginButton.click();

        BaseClass.tearDown();


    }
}
