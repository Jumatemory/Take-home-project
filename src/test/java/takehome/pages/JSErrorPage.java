package takehome.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import takehome.utilities.Driver;

public class JSErrorPage {

    public JSErrorPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(linkText = "JavaScript onload event error")
    private WebElement jSErrorLink;


public void clickOnJSErrorLink  (){
    jSErrorLink.click();
}


}



