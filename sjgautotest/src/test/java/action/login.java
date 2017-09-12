package action;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class Login {

	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		login.username = username;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		login.password = password;
	}
	static String  username="liyan@gbase.cn";
	static String  password="111111";
  public static void loginWithPara(){
      /*open("https://shujuguan.shujuguan.cn");                         
      $(By.id("username")).val("liyan@gbase.cn");
      $(By.id("password")).val("111111");     
      $(byText("µÇÂ¼")).click();*/
                             
      $(By.id("username")).val(username);
      $(By.id("password")).val(password);     
      $(byText("µÇÂ¼")).click();
  }

}
