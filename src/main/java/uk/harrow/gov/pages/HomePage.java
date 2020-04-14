package uk.harrow.gov.pages;

import org.openqa.selenium.By;
import uk.harrow.gov.utility.Utility;

/**
 * Created by Ankita
 */
public class HomePage extends Utility {

    By covid19Link = By.xpath("//span[contains(text(),'Coronavirus (COVID-19)')]");

    public void clickOnCovid19Link(){
        clickOnElement(covid19Link);
    }


}
