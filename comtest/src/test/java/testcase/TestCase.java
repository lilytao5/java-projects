package testcase;


import action.Login;
import action.OverView;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static tools.PublicMethod.newDriver;

public class TestCase {


  @Test
  public static void testLogin() {
      WebDriver wd= newDriver();
      //setWebDriver(wd);
      Login.loginWithPara();

  }

  @Test
  public static void testOverView() {
      WebDriver wd = newDriver();
      Login.loginWithPara();
      OverView testOverView = new OverView();
      testOverView.newChart();
      testOverView.newDashboard();
  }


}
