package action;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class Login {

	static String  username="test_ly3@chacuo.net";
	static String  password="111111";

  public static void loginWithPara(){

      $(By.id("username")).val(username);
      $(By.id("password")).val(password);
      $(byText("µÇÂ¼")).click();
      sleep(20000);
  }

}
