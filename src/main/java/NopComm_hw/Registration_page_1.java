package NopComm_hw;

import org.openqa.selenium.By;

public class Registration_page_1 extends Utils {

    LoadProperties loadProperties = new LoadProperties();
    private By _register = By.linkText("Register");
    private By _firstName =By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _dobday = By.name("DateofBirthDay");
    private By _dobmonth = By.name("DateofBirthMonth");
    private By _dobyear = By.name("DateofBirthYear");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _register_Btn =By.id("register-button");




    public void registration(){
        //click on register button
        clickElementBy(_register);
        //select the male gender option
        clickElementBy(By.id("gender-male"));
        //enter given firstname
        enterText(_firstName,loadProperties.getProperty("firstName"));
        //enter given lastname
        enterText(_lastName,loadProperties.getProperty("lastName"));
        //enter given date for dob
        selectByValue(_dobday,loadProperties.getProperty("DOBDay"));
        //enter given month for dob
        selectByValue(_dobmonth,loadProperties.getProperty("DOBMonth"));
        //enter given year for dob
        selectByValue(_dobyear,loadProperties.getProperty("DOBYear"));
        //enter given email
        emailWithTimeStamp(_email);
        //enter given password
        enterText(_password,loadProperties.getProperty("password"));
        //enter given confirm password
        enterText(_confirmPassword,loadProperties.getProperty("confirmPassword"));
        //click on register button
        clickElementBy(_register_Btn);

    }
}
