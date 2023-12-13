package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperUser extends HelperBase{
    public HelperUser(WebDriver wd) {
        super(wd);
    }
    public void openLoginRegistrationForm(){
        WebElement loginTab =wd.findElement(By.cssSelector("a[href='/login']"));
        loginTab.click();
    }
    public void fillLoginRegistrationForm(String email, String password){
//        WebElement emailinput = wd.findElement(By.name("email"));
//        emailinput.click();
//        emailinput.clear();
//        emailinput.sendKeys(email);
//
//        WebElement passwordinput= wd.findElement(By.xpath("//input[last()]"));
        type(By.name("email"),email);
        type(By.xpath("//input[last()]"),password);

    }
    public void submitLogin(){
        click(By.name("login"));
    }
    public boolean isLogged(){
        return isElementPresent(By.xpath("//button[text()='Sign Out']"));
    }
}
