package uk.harrow.gov.testsuite;

import org.testng.annotations.Test;
import uk.harrow.gov.pages.HomePage;
import uk.harrow.gov.testbase.TestBase;

/**
 * Created by Ankita
 */
public class HomeTestCovid19 extends TestBase {

    HomePage homePage = new HomePage();

    @Test(groups = {"smoke", "sanity"})
    public void verifyUserShouldNavigateToCovid19Feature(){
        homePage.clickOnCovid19Link();

    }
}
