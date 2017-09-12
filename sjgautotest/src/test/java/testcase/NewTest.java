package testcase;


import action.login;
import action.OverView;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static tools.PublicMethod.newDriver;

public class NewTest {


  @Test
  public static void f() {
	  	  WebDriver wd= newDriver();
	      //setWebDriver(wd);
	      login.loginWithPara();
	      OverView.creatChart();
  }




}
