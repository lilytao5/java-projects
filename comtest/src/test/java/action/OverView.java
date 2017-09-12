package action;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class OverView {
  public static void creatChart() {
	  
	  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	  $(byText("总览")).click();
      //创建图表
      $(By.id("overviewhomeLayout")).$(By.xpath("//div/div/div/div/div/div[1]/div[2]/div[1]/div[1]/div[2]")).click();
      $(By.id("modals")).$(byText("学员")).click();  
      $(By.id("prism-toolbar")).$(By.xpath("//div/div[1]/div[2]/div/div/input")).sendKeys("wwww"+df.format(new Date()));  
      
      //选择添加横轴字段
      $(By.xpath("//*[@id=\"prism-leftview\"]/div/div/div/div[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]")).click();
      Selenide.sleep(3000);
      $(byText("创建人")).click();
      //选择添加纵轴字段
      $(By.xpath("//*[@id=\"prism-leftview\"]/div/div/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div[2]")).click();
      $(byText("总资产（亿）")).click();

      
  }


}
