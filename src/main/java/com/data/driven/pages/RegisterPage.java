package com.data.driven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Object class for Register Page
 */
public class RegisterPage {

    private WebDriver driver;

    // Constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='input-telephone']")
    private WebElement telephone;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='input-confirm']")
    private WebElement passwordConfirm;

    // Changed from label to input radio button for reliability
    @FindBy(xpath = "//input[@name='newsletter' and @value='0']")
    private WebElement newsletterNo;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;

    // Action Methods

    public void enterFirstName(String fName) {
        firstName.clear();
        firstName.sendKeys(fName);
    }

    public void enterLastName(String lName) {
        lastName.clear();
        lastName.sendKeys(lName);
    }

    public void enterEmail(String userEmail) {
        email.clear();
        email.sendKeys(userEmail);
    }

    public void enterTelephone(String phone) {
        telephone.clear();
        telephone.sendKeys(phone);
    }

    public void enterPassword(String pass) {
        password.clear();
        password.sendKeys(pass);
    }

    public void confirmPassword(String confirmPass) {
        passwordConfirm.clear();
        passwordConfirm.sendKeys(confirmPass);
    }

    public void selectNewsletterNo() {
        if (!newsletterNo.isSelected()) {
            newsletterNo.click();
        }
    }

    public void clickContinue() {
        continueButton.click();
    }
}
