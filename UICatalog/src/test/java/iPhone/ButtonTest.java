package iPhone;

import ButtonsPage.Buttons;
import common.Base;
import navigate.NavigateUi;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static common.Base.ad;

/**
 * Created by mrahman on 9/5/15.
 */
public class ButtonTest extends Base {

    Buttons buttons;
    //@Test
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getButtonPage();
        buttons = PageFactory.initElements(ad, Buttons.class);
    }

    @Test
    public void clickOnImageButton(){
       buttons.backgroundImageClick();
    }
}
