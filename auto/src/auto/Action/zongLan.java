package auto.Action;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class zongLan {
  public static void creatChart() {
	  
	  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
	  $(byText("����")).click();
      //����ͼ��
      $(By.id("overviewhomeLayout")).$(By.xpath("//div/div/div/div/div/div[1]/div[2]/div[1]/div[1]/div[2]")).click();
      $(By.id("modals")).$(byText("ѧԱ")).click();  
      $(By.id("prism-toolbar")).$(By.xpath("//div/div[1]/div[2]/div/div/input")).sendKeys("wwww"+df.format(new Date()));  
      
      //ѡ����Ӻ����ֶ�
      $(By.xpath("//*[@id=\"prism-leftview\"]/div/div/div/div[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]")).click();
      Selenide.sleep(3000);
      $(byText("������")).click();
      //ѡ����������ֶ�
      $(By.xpath("//*[@id=\"prism-leftview\"]/div/div/div/div[1]/div[1]/div/div[2]/div[2]/div[2]/div[2]")).click();
      $(byText("���ʲ����ڣ�")).click();
    
      //
      ///following::*
     
     ///*[name()='svg']/*[name()='g'][8]/*[name()='text'][1]/*[name()='tspan']")
      String a= $(By.xpath("//*[@id=\"highcharts-60\"]/div/div/*[name()='svg']/*[name()='g'][8]/*[name()='text']/*[name()='tspan']")).getText();
      
      
     
      //String a= $(By.id("highcharts-60")).getAttribute("class");

      System.out.println(a);
      //$(byText("���")).click();
      Selenide.sleep(3000);

      
  }


}
