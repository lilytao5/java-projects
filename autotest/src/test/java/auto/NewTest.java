package auto.TestCase;


import auto.Action.login;
import auto.Action.zongLan;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static auto.publicmethod.*;


public class NewTest {


  @Test
  public static void f() {
	  	  WebDriver wd=newdriver();
	      //setWebDriver(wd);
	      login.loginWithPara();
	      zongLan.creatChart();
  }

    public static void main(String[] args){
        f();
        System.out.println("hello");

    }

}
