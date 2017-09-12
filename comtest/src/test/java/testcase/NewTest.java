package testcase;


import action.Login;
import action.OverView;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static tools.PublicMethod.newDriver;

public class NewTest {


  @Test
  public static void f() {
	  	  WebDriver wd= newDriver();
	      //setWebDriver(wd);
	      Login.loginWithPara();
	      OverView.creatChart();
  }




}
