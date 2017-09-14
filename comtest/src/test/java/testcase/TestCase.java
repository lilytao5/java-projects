package testcase;


import action.Login;
import action.OverView;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static tools.PublicMethod.newDriver;

public class TestCase {


  @Test
  public static void Test() {
	  	  WebDriver wd= newDriver();
	      //setWebDriver(wd);
	      Login.loginWithPara();
	      OverView.creatChart();
  }


    @Test
    public static void CreatChart() {
        WebDriver wd= newDriver();
        //setWebDriver(wd);
//        Login.loginWithPara();
        OverView.creatChart();
    }


}
