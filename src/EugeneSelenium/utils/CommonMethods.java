package EugeneSelenium.utils;

import com.syntax.textbase.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CommonMethods extends BaseClass {

    /**
     *
     * this method will clear textbox and send text
     *
     * @param element
     * @param text
     */

    public static void sendText(WebElement element,String text){
        element.clear();
        element.sendKeys(text);
    }


}
