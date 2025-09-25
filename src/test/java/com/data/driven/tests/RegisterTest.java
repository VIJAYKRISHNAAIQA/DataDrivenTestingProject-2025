package com.data.driven.tests;

import com.data.driven.base.BaseTest;
import com.data.driven.pages.RegisterPage;
import com.data.driven.utils.ExcelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @DataProvider(name = "getRegisterData")
    public Object[][] getRegisterData() {
        String path = System.getProperty("user.dir") + "/src/test/resources/RegisterData.xlsx";
        return ExcelReader.readExcelData(path, "Sheet1");
    }

    @Test(dataProvider = "getRegisterData")
    public void testRegisteringUserDetails(String firstName, String lastName, String email,
                                           String telephone, String password, String confirmPassword) {
        RegisterPage registerPage = new RegisterPage(driver); // driver comes from BaseTest

        registerPage.enterFirstName(firstName);
        registerPage.enterLastName(lastName);
        registerPage.enterEmail(email);
        registerPage.enterTelephone(telephone);
        registerPage.enterPassword(password);
        registerPage.confirmPassword(confirmPassword);
        registerPage.selectNewsletterNo();
        registerPage.clickContinue();

        // Optionally: Add assertions here to validate success
    }
}
