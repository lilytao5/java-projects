package action;

import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.isOpera;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OverView {

    static String url = "https://app.shujuguan.cn/home/feapp#overview/category/default_1455_10957";

    public OverView(){
      getWebDriver().get(url);
//      $(byText("总览")).click();
//      $(".nav-category-item-wrapper:first-child .category-item-name").click();
    }

    public static void newChart() {

      SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

      //创建图表
      $$(".cate-add-chart-text").get(0).click();
      $$(".item-title:first-child").first().click();
      $$(".dashboard-title").get(0).sendKeys("test"+df.format(new Date()));

      //选择添加横轴字段
      $$("#prism-leftview .ew-content-host .ew-panel").get(0).$(".ew-pact-thumb").click();
      Selenide.sleep(1000);
      $(byText("出勤月份")).click();

      //选择添加纵轴字段
      $$("#prism-leftview .ew-content-host .ew-panel").get(1).$(".ew-pact-thumb").click();
      Selenide.sleep(1000);
      $(byText("当月天数")).click();
      Selenide.sleep(1000);

      //点击完成
      Selenide.sleep(2000);
      $$(".history-text").get(0).click();
      Selenide.sleep(2000);


      
  }

    public static void newDashboard(){
      SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

      //创建图集
      $(".cate-add-dashboard").click();
      Selenide.sleep(3000);
      $$(".dashboard-title").get(1).sendKeys("test"+df.format(new Date()));

      //点击添加图表
      $("#add_workcell .btn-text").click();
      $$(".item-title:first-child").first().click();
      $$(".btn-add-chart").first().click();
      $(".close").click();

      //点击完成
      $$(".history-text").get(1).click();
      Selenide.sleep(1000);
    }

}
