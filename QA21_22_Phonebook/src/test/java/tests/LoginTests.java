package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @Test
    public void test(){
      app.getHelperUser().openLoginRegistrationForm();
      app.getHelperUser().fillLoginRegistrationForm("a@2.com","Mm@2756808");
      app.getHelperUser().submitLogin();
        Assert.assertTrue(app.getHelperUser().isLogged());
    }
}
