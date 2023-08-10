
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.text.html.Option;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static org.openqa.selenium.By.xpath;
import static org.testng.AssertJUnit.assertTrue;

public class TESTng {

    AndroidDriver driver;
    Dimension dim;
    String arabic ="حالات وقصص";
    String bengali = " স্থিতি ও গল্প";
    String chinese ="状态与故事";
    String english = "Statuses & Stories";
    String french = "Statuts et histoires";
    String hindi = "स्थितियाँ और कहानियाँ";
    String russian="Статусы и истории";
    String udru="حالات اور کہانیاں";

    // App pick method
    @BeforeClass()
    void StartApp() throws InterruptedException, MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("platformName", "Android");
        dc.setCapability("ignoreHiddenApiPolicyError" , true);
        dc.setCapability("deviceVersion", "10");
        dc.setCapability("udid", "53a9a367");
        dc.setCapability("appPackage", "savestatus.images.videosaver.statusdownloadapp.storysaver");
        dc.setCapability("appActivity", "com.example.whatsappstatussaverpro.MainActivity");


        //Allow pwermissin automatically
        //dc.setCapability("autoGrantPermissions", "true");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
        Thread.sleep(4000);

        // Scroller
        dim = driver.manage().window().getSize();
        Thread.sleep(2000);

        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/tvLetsStart")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Start");
        Thread.sleep(500);

        // for ad when we online
        try {
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Ad cross succesfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }


        // Clicks after ad

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RadioGroup/android.widget.CheckBox[1]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Select option for hot videos");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.TextView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Go to next permission screen");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> select whatsapp");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        System.out.println(">>>> Allow permission");

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.Button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Done");
        driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[3]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Skip the help option ");

    }


    // Test Cases 1
    //*********************************************************************************************************************************************************************
    @Test(priority = 1)
    void HomeScreenTest() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        String Expecteddialg = "Statuses & Stories";
        String Actualdialog = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")).getText();
        Assert.assertEquals(Actualdialog, Expecteddialg);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog, Expecteddialg);

        System.out.println(">>>> **We successfully navigate to home screen as we expect** ");
    }

//*********************************************************************************************************************************************************************


    // TALAL get text test case

    @Test(priority = 2)
    void WhatasppOPtionBussin() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        String Expecteddialg = "Whatsapp";
        String Actualdialog = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")).getText();
        Assert.assertEquals(Actualdialog, Expecteddialg);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog, Expecteddialg);

        System.out.println(">>>> whatsapp optionnnnn ");
    }


    // SelectOption WHATSAPP OR BUSSINESS Method
  //  @Test(priority = 3)
   // void SelectOption() throws InterruptedException, MalformedURLException {
   //     Thread.sleep(2000);
       /* driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/switchTextRefT")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Options ");*/
      //  driver.findElement(By.xpath("\t\n" +
      //          "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")).click();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  System.out.println(">>>> Options ");
     //   Thread.sleep(2000);


     //   driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RadioGroup/android.widget.RadioButton[1]")).click();
     //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  System.out.println(">>>> Select whatsapp ");

 //   }


                    //talal

    @Test(priority = 4)

    void SelectBussinessWhatsaap() throws InterruptedException, MalformedURLException {
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/switchTextRefT")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Options ");
        Thread.sleep(4000);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RadioGroup/android.widget.RadioButton[2]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Select Bussiness whatsapp ");
        Thread.sleep(2000);
        driver.findElement(By.xpath("\t\n" +
                "//android.widget.LinearLayout[@content-desc=\"Images\"]/android.widget.TextView")).click();
        System.out.println(">>>> Image tab in Bussiness whatsapp ");
        Thread.sleep(400);


        driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
        System.out.println(">>>> INSTALL BUSSINESS WHATSAPP ");
        Thread.sleep(400);

        Thread.sleep(3000);
        String Expecteddial1g = "WhatsApp Business";
        String Actualdial1g = driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[1]/android.widget.TextView[1]")).getText();
        Assert.assertEquals(Actualdial1g, Expecteddial1g);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdial1g, Expecteddial1g);

        System.out.println(">>>> ** There is no bussiness whatsapp therefore we navigate to play store** ");

        driver.navigate().back();
        Thread.sleep(200);
        driver.navigate().back();

        driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Videos\"]/android." +
                "widget.TextView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Video tab in Bussiness whatsapp ");

        Thread.sleep(200);
        driver.navigate().back();
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/switchTextRefT")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Options ");
        Thread.sleep(2000);

        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/waBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Select whatsapp ");
        Thread.sleep(2000);

    }




    //Refresh and WIFI ON OFF method
    @Test(priority = 5)
    void WifiRefresh() throws InterruptedException, MalformedURLException {
        //
        Thread.sleep(1000);
        driver.toggleWifi();
        System.out.println(">>>> Wifi Off ");
        Thread.sleep(500);
        driver.toggleWifi();
        System.out.println(">>>> Wifi On ");
        Thread.sleep(3000);

    }

    @Test(priority = 6)
    void RefreshByScroll1() throws InterruptedException, MalformedURLException {
        //

        Thread.sleep(2000);
        int startrf_x = (int) (dim.width * 0.5);
        int startrf_y = (int) (dim.height * 0.3);

        int endrf_x = (int) (dim.width * 0.5);
        int endrf_y = (int) (dim.height * 0.9);
        @SuppressWarnings("rawtypes")
        TouchAction tsrf = new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tsrf.press(PointOption.point(startrf_x, startrf_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endrf_x, endrf_y)).release().perform();
        System.out.println(">>>> Refresh screen 1st time");

        //  Break for 2nd refresh
        Thread.sleep(200);

        int startrf2_x = (int) (dim.width * 0.5);
        int startrf2_y = (int) (dim.height * 0.3);

        int endrf2_x = (int) (dim.width * 0.5);
        int endrf2_y = (int) (dim.height * 0.9);
        @SuppressWarnings("rawtypes")
        TouchAction tsrf2 = new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tsrf2.press(PointOption.point(startrf2_x, startrf2_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endrf2_x, endrf2_y)).release().perform();
        System.out.println(">>>> Refresh screen 2nd time");
        Thread.sleep(4000);
    }

    // Test Cases 2
    //*********************************************************************************************************************************************************************
    @Test(priority = 7)
    void TopFreatureTest() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        String Expecteddialg = "Top Features";
        String Actualdialog = driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")).getText();
        Assert.assertEquals(Actualdialog, Expecteddialg);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog, Expecteddialg);

        System.out.println(">>>> ** Top Feature Available here** ");
    }

//*****************************************************************************************************************************************************************************

    @Test(priority = 8)
 void TopFreature() throws InterruptedException, MalformedURLException {

         driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         System.out.println(">>>> Flip Text");
        Thread.sleep(200);
        WebElement code = driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));   // TYPE COUNTRY NAME
        code.sendKeys("technologies");
        System.out.println(">>>> Enter text for flip");
        driver.hideKeyboard();
        Thread.sleep(200);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Generate flip txt");
   Thread.sleep(5000);
        driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"])[1]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Refresh text");
        Thread.sleep(200);
         driver.navigate().back();

//*********************************************

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Stylish text");

        WebElement codeS = driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));   // TYPE COUNTRY NAME
        codeS.sendKeys("technologies");
        System.out.println(">>>> Enter text for style");

        Thread.sleep(200);

        driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.TextView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Style 3");
        Thread.sleep(5000);
        driver.navigate().back();
        driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"])[1]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Refresh text");
        Thread.sleep(200);
        driver.navigate().back();
//********************************************


        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Text to emoji");

        Thread.sleep(200);
        WebElement codeE = driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));   // TYPE COUNTRY NAME
        codeE.sendKeys("tech");
        System.out.println(">>>> Enter text for Emoji");
        Thread.sleep(200);

        WebElement codev = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.EditText"));   // TYPE COUNTRY NAME
        codev.sendKeys("hy");
        System.out.println(">>>> Enter text for Emoji");
        Thread.sleep(200);
        driver.hideKeyboard();

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Generate flip txt");
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"])[1]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Refresh text");
        Thread.sleep(200);
        driver.navigate().back();
//*********************************************

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[4]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Repeat text");
        WebElement codeR = driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText"));   // TYPE COUNTRY NAME
      Thread.sleep(1000);
        codeR.sendKeys("tech");
        System.out.println(">>>> Enter text for repeat");

        Thread.sleep(200);
        driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.EditText")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Count txt");

        WebElement codeRr = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.EditText"));   // TYPE COUNTRY NAME
        codeRr.sendKeys("24");
        System.out.println(">>>> Enter text for repeat");
        Thread.sleep(200);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.Switch")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> On the option for text in line");
        driver.hideKeyboard();
        Thread.sleep(200);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Generate flip txt");
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"])[1]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Refresh text");
        Thread.sleep(200);
        driver.navigate().back();
//*********************************************

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[5]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Blank text");
        driver.navigate().back();
        Thread.sleep(200);

    }

    @Test(priority = 7)
    void ScreennTestSCROL() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);
        try {
            int startrfful1_x = (int) (dim.width * 0.5);
            int startrfful1_y = (int) (dim.height * 0.9);

            int endrfful1_x = (int) (dim.width * 0.5);
            int endrfful1_y = (int) (dim.height * 0.3);
            @SuppressWarnings("rawtypes")
            TouchAction tsrfful1 = new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            tsrfful1.press(PointOption.point(startrfful1_x, startrfful1_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(endrfful1_x, endrfful1_y)).release().perform();

            System.out.println(">>>> Scroll complete screen ");
            Thread.sleep(300);
        } catch (Exception e) {
            System.out.println(">>>> There is no content due to slow network ");
        }

 //***************************************
        try {
            int startrfful11_x = (int) (dim.width * 0.5);
            int startrfful11_y = (int) (dim.height * 0.9);

            int endrfful11_x = (int) (dim.width * 0.5);
            int endrfful11_y = (int) (dim.height * 0.3);
            @SuppressWarnings("rawtypes")
            TouchAction tsrfful11 = new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            tsrfful11.press(PointOption.point(startrfful11_x, startrfful11_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(endrfful11_x, endrfful11_y)).release().perform();

            Thread.sleep(300);
        } catch (Exception e) {
            System.out.println(">>>> There is no content due to slow network ");

        }
//*****************************************
        try {
            int startrfful12_x = (int) (dim.width * 0.5);
            int startrfful12_y = (int) (dim.height * 0.9);

            int endrfful12_x = (int) (dim.width * 0.5);
            int endrfful12_y = (int) (dim.height * 0.3);
            @SuppressWarnings("rawtypes")
            TouchAction tsrfful12 = new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            tsrfful12.press(PointOption.point(startrfful12_x, startrfful12_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(endrfful12_x, endrfful12_y)).release().perform();


            Thread.sleep(300);
        } catch (Exception e) {
            System.out.println(">>>> There is no content due to slow network ");

        }
//*****************************************
        try {
            int startrff1_x = (int) (dim.width * 0.5);
            int startrff1_y = (int) (dim.height * 0.3);

            int endrff1_x = (int) (dim.width * 0.5);
            int endrff1_y = (int) (dim.height * 0.9);
            @SuppressWarnings("rawtypes")
            TouchAction tsrff1 = new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            tsrff1.press(PointOption.point(startrff1_x, startrff1_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(endrff1_x, endrff1_y)).release().perform();


            Thread.sleep(300);
        } catch (Exception e) {
            System.out.println(">>>> There is no content due to slow network ");

        }
//****************************************
        try {
            int startrff12_x = (int) (dim.width * 0.5);
            int startrff12_y = (int) (dim.height * 0.3);

            int endrff12_x = (int) (dim.width * 0.5);
            int endrff12_y = (int) (dim.height * 0.9);
            @SuppressWarnings("rawtypes")
            TouchAction tsrff12 = new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            tsrff12.press(PointOption.point(startrff12_x, startrff12_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(endrff12_x, endrff12_y)).release().perform();


            Thread.sleep(300);
        } catch (Exception e) {
            System.out.println(">>>> There is no content due to slow network ");

        }
 //**************************************
        try {
            int startrff13_x = (int) (dim.width * 0.5);
            int startrff13_y = (int) (dim.height * 0.3);

            int endrff13_x = (int) (dim.width * 0.5);
            int endrff13_y = (int) (dim.height * 0.9);
            @SuppressWarnings("rawtypes")
            TouchAction tsrff13 = new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            tsrff13.press(PointOption.point(startrff13_x, startrff13_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(endrff13_x, endrff13_y)).release().perform();


            Thread.sleep(300);
        } catch (Exception e) {
            System.out.println(">>>> There is no content due to slow network ");

        }
    }


    /*  @Test(priority = 4)
      void LOCKScreen() throws InterruptedException, MalformedURLException {
          driver.lockDevice();
          System.out.println(">>>> LOCK SCREEN ");
          Thread.sleep(3000);
          driver.unlockDevice();
          System.out.println(">>>> UNLOCK SCREEN ");

      }
  */
    // Horizental scroll top videos
    @Test(priority = 8)
    void ScrollTopHorizentally() throws InterruptedException, MalformedURLException {
Thread.sleep(3000);
        int starthor_x = (int) (dim.width * 0.9);
        int starthor_y = (int) (dim.height * 0.5);

        int endhor_x = (int) (dim.width * 0.2);
        int endhor_y = (int) (dim.height * 0.5);
        @SuppressWarnings("rawtypes")
        TouchAction tshor = new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

       /* tshor.press(PointOption.point(starthor_x, starthor_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endhor_x, endhor_y)).release().perform();
        Thread.sleep(1000);*/
        tshor.press(PointOption.point(starthor_x, starthor_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endhor_x, endhor_y)).release().perform();
        System.out.println(">>>> Scroll Top videos hori 1 ");
        Thread.sleep(1000);
        // 2nd scroller
        int starthor2_x = (int) (dim.width * 0.9);
        int starthor2_y = (int) (dim.height * 0.5);
        int endhor2_x = (int) (dim.width * 0.2);
        int endhor2_y = (int) (dim.height * 0.5);
        @SuppressWarnings("rawtypes")
        TouchAction tshor2 = new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tshor2.press(PointOption.point(starthor2_x, starthor2_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endhor2_x, endhor2_y)).release().perform();
        System.out.println(">>>> Scroll Top videos hori 2 ");
        Thread.sleep(1500);

        // 3rd scroller
        int starthor3_x = (int) (dim.width * 0.2);
        int starthor3_y = (int) (dim.height * 0.5);
        int endhor3_x = (int) (dim.width * 0.9);
        int endhor3_y = (int) (dim.height * 0.5);
        @SuppressWarnings("rawtypes")
        TouchAction tshor3 = new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tshor3.press(PointOption.point(starthor3_x, starthor3_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endhor3_x, endhor3_y)).release().perform();
        System.out.println(">>>> Scroll Top videos hori 3 ");
        Thread.sleep(3000);

        int starthor4_x = (int) (dim.width * 0.2);
        int starthor4_y = (int) (dim.height * 0.5);
        int endhor4_x = (int) (dim.width * 0.9);
        int endhor4_y = (int) (dim.height * 0.5);
        @SuppressWarnings("rawtypes")
        TouchAction tshor4 = new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tshor4.press(PointOption.point(starthor4_x, starthor4_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endhor4_x, endhor4_y)).release().perform();
        Thread.sleep(4000);
        System.out.println(">>>> Scroll Top videos horizetally ");
    }

    // OpenScrollTop
    @Test(priority = 9)
    void OpenScrollTop() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);

        try {
            driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"])[4]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Open video for watching or downlading");
            Thread.sleep(1500);
            int startseev_x = (int) (dim.width * 0.5);
            int startseev_y = (int) (dim.height * 0.9);

            int endseev_x = (int) (dim.width * 0.5);
            int endseev_y = (int) (dim.height * 0.3);
            @SuppressWarnings("rawtypes")
            TouchAction tsseev = new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            tsseev.press(PointOption.point(startseev_x, startseev_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(endseev_x, endseev_y)).release().perform();
            Thread.sleep(2000);
            System.out.println(">>>> Scroll to video 2");

            int starth_x = (int) (dim.width * 0.5);
            int starth_y = (int) (dim.height * 0.9);

            int endh_x = (int) (dim.width * 0.5);
            int endh_y = (int) (dim.height * 0.3);
            @SuppressWarnings("rawtypes")

            TouchAction tsh = new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            tsh.press(PointOption.point(starth_x, starth_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(endh_x, endh_y)).release().perform();
            Thread.sleep(4000);
            System.out.println(">>>> Scroll to video 3");
            driver.navigate().back();

        } catch (Exception e) {
            System.out.println(">>>>  There is no video due to interet issues  ");
            driver.navigate().back();
            Thread.sleep(3000);
        }
    }


    // Open HOT VIDEO
    @Test(priority = 10)
    void OpenHotVideo() throws InterruptedException, MalformedURLException {

        try {
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Ad cross succesfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }



        Thread.sleep(2000);
        int startsee_x = (int) (dim.width * 0.5);
        int startsee_y = (int) (dim.height * 0.10);

        int endsee_x = (int) (dim.width * 0.5);
        int endsee_y = (int) (dim.height * 0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tssee = new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tssee.press(PointOption.point(startsee_x, startsee_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endsee_x, endsee_y)).release().perform();
        Thread.sleep(4000);

        //Download hot video
      /*  driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/playTopVideoBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Hot video play from home screen");*/
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/playTopVideoBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Hot video play from home screen");
    }

    /*
    *********************************************************************************************************************************************************************
    @Test(priority = 1)
    void DownloadOPtionHot()  throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        String Expecteddialg = "Download Ption";
        String Actualdialog = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[2]")).getText();
        Assert.assertEquals(Actualdialog, Expecteddialg);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog, Expecteddialg);

        System.out.println(">>>> ** Top videos Available here** ");
    }
//*****************************************************************************************************************************************************************************
*/

    @Test(priority = 11)
    void DownloadHotvideo() throws InterruptedException, MalformedURLException {

        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/downloadVideoBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Download hot video");
        Thread.sleep(1000);

        try {
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget." +
                    "LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit." +
                    "WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Ad cross succesfully");
        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2000);
    }

    //Open video fro notification bar
    @Test(priority = 12)
    void OpenFromNotification() throws InterruptedException, MalformedURLException {
        Thread.sleep(800);
        driver.openNotifications();
        Thread.sleep(3000);
        driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout[5]/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Hot video play from notification bar");
        Thread.sleep(2000);
        //    driver.runAppInBackground(Duration.ofSeconds(4));
    }

    //  Share hot video o whatspp
    @Test(priority = 13)
    void SharWhatsappOption() throws InterruptedException, MalformedURLException {

        Thread.sleep(1000);
      /*  driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/shareTv")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> share Hot video");*/
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> share Hot video");

        try {
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget." +
                    "LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit." +
                    "WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Ad cross succesfully");
        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }


        driver.findElement(xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Shre on whatsapp");

        Thread.sleep(1000);
    }


    //*********************************************************************************************************************************************************************
    @Test(priority = 14)
    void WHATSAPPOptionTst() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        try {
            Thread.sleep(3000);
            String Expecteddialg = "Send to…";
            String Actualdialog = driver.findElement(By.xpath("\t\n" +
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")).getText();
            Assert.assertEquals(Actualdialog, Expecteddialg);
            Thread.sleep(2000);
            //Assert.assertEquals(Actualdialog, Expecteddialg);

            System.out.println(">>>> ** We navigate to whatsapp ** ");
        } catch (Exception e) {
            Thread.sleep(3000);
            String Expected = "Welcome to WhatsApp";
            String Actual = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")).getText();
            Assert.assertEquals(Actual, Expected);
            Thread.sleep(2000);
            //Assert.assertEquals(Actualdialog, Expecteddialg);
            System.out.println(">>>> ** We navigate to the Whatsapp but There is no whatsapp ** ");
        }
    }
//*****************************************************************************************************************************************************************************

    @Test(priority = 15)
    void SharWhatsappVid() throws InterruptedException, MalformedURLException {
        Thread.sleep(4000);
        try {
            driver.findElement(xpath("\t\n" +
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.ImageView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Select contact on whatsapp");

            driver.findElement(By.id("com.whatsapp:id/send")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Send to contact on whatsapp");
            Thread.sleep(4000);
            driver.findElement(xpath("//android.widget.ImageButton[@content-desc=\"Send\"]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Send tap");
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(500);
            driver.navigate().back();
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(">>>> there is no whatsapp");
            Thread.sleep(3000);
            driver.navigate().back();
            driver.navigate().back();
            Thread.sleep(3000);
        }

        try {
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Ad cross succesfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }


    }

    @Test(priority = 16)
    void ToHomeScreen() throws InterruptedException, MalformedURLException {

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);

        /*int startseex_x = (int) (dim.width * 0.5);
        int startseex_y = (int) (dim.height * 0.9);

        int endseex_x = (int) (dim.width * 0.5);
        int endseex_y = (int) (dim.height * 0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tsseex = new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tsseex.press(PointOption.point(startseex_x, startseex_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endseex_x, endseex_y)).release().perform();
        Thread.sleep(4000);
*/

        Thread.sleep(2000);
        String Expecteddialg = "Statuses & Stories";
        String Actualdialog = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")).getText();
        Assert.assertEquals(Actualdialog, Expecteddialg);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog, Expecteddialg);

        System.out.println(">>>> **We successfully navigate to home screen as we expect** ");


        int startsee6_x = (int) (dim.width * 0.5);
        int startsee6_y = (int) (dim.height * 0.9);

        int endsee6_x = (int) (dim.width * 0.5);
        int endsee6_y = (int) (dim.height * 0.4);
        @SuppressWarnings("rawtypes")
        TouchAction tssee6 = new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tssee6.press(PointOption.point(startsee6_x, startsee6_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endsee6_x, endsee6_y)).release().perform();
        Thread.sleep(4000);

        int startsee6c_x = (int) (dim.width * 0.5);
        int startsee6c_y = (int) (dim.height * 0.6);

        int endsee6c_x = (int) (dim.width * 0.5);
        int endsee6c_y = (int) (dim.height * 0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tssee6c = new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tssee6c.press(PointOption.point(startsee6c_x, startsee6c_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endsee6c_x, endsee6c_y)).release().perform();
        Thread.sleep(4000);

    }

    // Seemore Hot videos
    @Test(priority = 17)
    void SeeMoreHot() throws InterruptedException, MalformedURLException {

        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/seeMoreHotVideos")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Home screen see more HOT");
        Thread.sleep(2000);
    }

  /*  @Test(priority = 18)
    void sEEmORTST() throws InterruptedException, MalformedURLException {
       Thread.sleep(2000);
        String Expecteddialg = "Hot Videos";
        String Actualdialog = driver.findElement(By.xpath("\t\n" +
                "/dget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")).getText();
        Assert.assertEquals(Actualdialog, Expecteddialg);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog, Expecteddialg);

        System.out.println(">>>> ** We navigate SEE MORE ** ");

        Thread.sleep(1500);

    }*/


    @Test(priority = 18)
    void SEEMoreSPORTS() throws InterruptedException, MalformedURLException {

        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/chipSports")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Home screen sports");
        Thread.sleep(1500);
    }

    @Test(priority = 19)
    void SEEMoreMUSIC() throws InterruptedException, MalformedURLException {
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/chipMusic")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Home screen Music");
        Thread.sleep(1500);
    }

    @Test(priority = 20)
    void SEEMorNATURE() throws InterruptedException, MalformedURLException {

        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/chipNature")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Home screen Nature");
        Thread.sleep(1500);
    }

    @Test(priority = 21)
    void SEEMoTRAVEL() throws InterruptedException, MalformedURLException {
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/chipTravel")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Home screen Travel");
    }

    @Test(priority = 22)
    void SEEMoTSHOWBIZ() throws InterruptedException, MalformedURLException {
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/chipBollywood")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Home screen Showbiz");
        Thread.sleep(1500);
    }

    @Test(priority = 23)
    void SEEMoFASHION() throws InterruptedException, MalformedURLException {
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/chipFashion")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Home screen Fashion");
        Thread.sleep(1500);
        driver.navigate().back();
    }



                          // Premium
    @Test(priority = 24)
    void PremiumScreen() throws InterruptedException, MalformedURLException {
        int startup1_x = (int) (dim.width * 0.5);
        int startup1_y = (int) (dim.height * 0.9);

        int endup1_x = (int) (dim.width * 0.5);
        int endup1_y = (int) (dim.height * 0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tsup1 = new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();
        tsup1.press(PointOption.point(endup1_x, endup1_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(startup1_x, startup1_y)).release().perform();


        // Premium screen
     /*   driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/premiumBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Premium screen");*/
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/premiumBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Premium screen");
    }

    //*********************************************************************************************************************************************************************
    @Test(priority = 25)
    void PremiumNavig()  throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        String Expecteddialg = "Get Premium Version";
        String Actualdialog = driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")).getText();
        Assert.assertEquals(Actualdialog, Expecteddialg);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog, Expecteddialg);

        System.out.println(">>>> ** Navigate to Premium screen  ** ");
    }
    //*****************************************************************************************************************************************************************************

       /* driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/checkMonthly")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Premium screen yearly plan");*/
       @Test(priority = 26)
       void Premiumclick()  throws InterruptedException, MalformedURLException {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
        driver.manage().timeouts().
                implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Get Premium");
        Thread.sleep(1000);


           driver.findElement(By.xpath("\t\n" +
                   "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[6]")).click();
           driver.manage().timeouts().
                   implicitlyWait(10, TimeUnit.SECONDS);
           System.out.println(">>>> Yearly Plan");
           Thread.sleep(3000);
        //driver.navigate().back();

        // scroll premium screen
        /* int startpr_x=(int)(dim.width*0.5);
        int startpr_y=(int)(dim.height*0.9);

        int endpr_x=(int)(dim.width*0.5);
        int endpr_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tspr=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tspr.press(PointOption.point(startpr_x,startpr_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endpr_x,endpr_y)).release().perform();

                                  */
        //driver.navigate().back();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[2]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Continue with Ad ");
           try {
               driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")).click();
               driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
               System.out.println(">>>> Ad cross succesfully");

           } catch (Exception e) {
               System.out.println(">>>> Ad cross failed");
           }

       }

    //DirectMessaage
    @Test(priority = 27)
    void DiretMessge() throws InterruptedException, MalformedURLException {
       /* driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/mainFragSendBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Direct Message");*/
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/mainFragSendBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Direct Message");

    }
    //*********************************************************************************************************************************************************************
    @Test(priority = 28)
    void Dirctmsg()  throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        String Expecteddialg = "Open Direct Chat";
        String Actualdialog = driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")).getText();
        Assert.assertEquals(Actualdialog, Expecteddialg);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog, Expecteddialg);


          Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog, Expecteddialg);

        System.out.println(">>>> ** Toggle for notification is on** ");

                                             // 2nd toggle

        Thread.sleep(3000);
        String ExpecteddialSg = "ON";
        String ActualdialoSg = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.Switch")).getText();
        Assert.assertEquals(ActualdialoSg, ExpecteddialSg);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog, Expecteddialg);

        System.out.println(">>>> ** Toggle for Auto save is on** ");

    }
    // Setting languages
    @Test(priority = 57)
    void SettingLanguages() throws InterruptedException, MalformedURLException {
        /*driver.findElement(xpath("(//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"])[5]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Language screen");*/
        driver.findElement(xpath("(//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"])[5]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Language screen");
        Thread.sleep(3000);
        int startlan_x = (int) (dim.width * 0.5);
        int startlan_y = (int) (dim.height * 0.9);


        int endlan_x = (int) (dim.width * 0.5);
        int endlan_y = (int) (dim.height * 0.3);

        @SuppressWarnings("rawtypes")
        TouchAction tslan = new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tslan.press(PointOption.point(startlan_x, startlan_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endlan_x, endlan_y)).release().perform();

        WebElement lan = driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/search_src_text"));
        lan.sendKeys("urdu");
        System.out.println(">>>>  Enter name of language");
        Thread.sleep(2000);

        driver.findElement(By.xpath(" \t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.RadioButton")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Select language");


        //   driver.runAppInBackground(Duration.ofSeconds(4));


        try {
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Ad cross succesfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
    }

        //*********************************************************************************************************************************************************************
        @Test(priority = 58)
        void langTstUrd() throws InterruptedException, MalformedURLException {
            Thread.sleep(3000);
            String Expecteddialg = "حالات اور کہانیاں";
            String Actualdialog = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")).getText();
            Assert.assertEquals(Actualdialog, Expecteddialg);
            Thread.sleep(2000);
            //Assert.assertEquals(Actualdialog, Expecteddialg);

            System.out.println(">>>> **We successfully change language of home screen into urdu ** ");
        }

      //*********************************************************************************************************************************************************************
      


    /*
      @Test(priority = 17)
      void AppLanguageVerification() {
          try {
              Thread.sleep(20000);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
          WebElement element = (WebElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]"));
          String elText = element.getText();


          String indonesia;
          if(arabic.equals(elText))
          {
              System.out.println("\nUser selected arabic language\n");
          }
          else if (bengali.equals(elText)) {
              System.out.println("\nUser selected bengali language\n");

          }
          else if (chinese.equals(elText))
          {
              System.out.println("\nUser selected chinese language\n");
          }
       
          else if (english.equals(elText))
          {
              System.out.println("\nUser selected english language\n");
          }
          else if (french.equals(elText))
          {
              System.out.println("\nUser selected french language\n");
          }
        
          else if (hindi.equals(elText))
          {
              System.out.println("\nUser selected hindi language\n");
          }
          else if (udru.equals(elText))
          {
              System.out.println("\nUser selected urdu language\n");
          }
          else if (russian.equals(elText))
          {
              System.out.println("\nUser selected eussian language\n");
          }

          else{
              System.out.println("\nNo language is match with the dictionary\nAs a result test failed: ");
              WebElement Menu = driver.findElement(By.id("com.pdfviewer.pdfreader.eagle.apps:id/tvShare"));
              Menu.click();

          }
          System.out.println("\nthis is the text : "+elText);

      }
                                           */

    @Test(priority = 59)
    void urdSett() throws InterruptedException, MalformedURLException {

        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/mainFragSettingsBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Seting in urdu");

        Thread.sleep(2000);
        int startl_x = (int) (dim.width * 0.5);
        int startl_y = (int) (dim.height * 0.9);

        int endl_x = (int) (dim.width * 0.5);
        int endl_y = (int) (dim.height * 0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tsl = new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tsl.press(PointOption.point(startl_x, startl_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endl_x, endl_y)).release().perform();
        Thread.sleep(2000);
        int startl1_x = (int) (dim.width * 0.5);
        int startl1_y = (int) (dim.height * 0.9);

        int endl1_x = (int) (dim.width * 0.5);
        int endl1_y = (int) (dim.height * 0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tsl1 = new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tsl1.press(PointOption.point(endl1_x, endl1_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(startl1_x, startl1_y)).release().perform();

    }
    //*********************************************************************************************************************************************************************
    @Test(priority = 60)
    void langTstSeting() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        String Expecteddialg = "ترتیبات";
        String Actualdialog = driver.findElement(By.xpath("\t\n" +
                "\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")).getText();
        Assert.assertEquals(Actualdialog, Expecteddialg);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog, Expecteddialg);

        System.out.println(">>>> **We successfully change language of setting into urdu ** ");
    }

//*********************************************************************************************************************************************************************

    @Test(priority = 61)
    void slctENGAgain() throws InterruptedException, MalformedURLException {

        driver.findElement(By.xpath("\t\n" +
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[4]/android.widget.TextView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> urdu languages");
            Thread.sleep(2000);
            WebElement lan1 = driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/search_src_text"));
            lan1.sendKeys("Englis");
            System.out.println(">>>>  Enter name of language");

            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.RadioButton")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Select english");


            try {
                driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")).click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                System.out.println(">>>> Ad cross succesfully");

            } catch (Exception e) {
                System.out.println(">>>> Ad cross failed");
            }
            driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/mainFragSettingsBtn")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Setting");
        }


    //  Reoverd message
    @Test(priority = 62)
    void SettingRecover() throws InterruptedException, MalformedURLException {

        /*driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/recoveredMsgsImgRef")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Recoverd message tab open");*/
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/recoveredMsgsImgRef")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Recoverd message tab open");

        Thread.sleep(3000);
        String Expecteddialg = "Recovered Messages";
        String Actualdialog = driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]")).getText();
        Assert.assertEquals(Actualdialog, Expecteddialg);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog, Expecteddialg);

        System.out.println(">>>> ** We successfully navigate to recover messg screen as we expect ** ");


        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/recoverMessagesSwitch")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Recoverd message toggle open");

    }

    @Test(priority = 63)
    void  Recovrperm() throws InterruptedException, MalformedURLException {
        try {
            driver.findElement(By.xpath("\t\n" +
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[2]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> permission 1st time Recoverd message toggle open");
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[9]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Switch")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Recoverd device permission");

            driver.findElement(By.xpath("\t\n" +
                    "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.Button[2]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Allow Recoverd device permission");
            driver.navigate().back();
            driver.navigate().back();
        }
        catch (Exception e) {
            System.out.println(">>>> Permission already taken ");
            driver.navigate().back();
        }
    Thread.sleep(1000);
    }


    // Auto reply
    @Test(priority = 63)
    void SettingAutoReply() throws InterruptedException, MalformedURLException {
        /*driver.findElement(By.xpath("(//android.widget.ImageView[@content-" +
                "desc=\"WhatsApp Status Saver Pro\"])[11]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Open auto reply");*/
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[7]/android.widget.TextView[1]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Open auto reply");


        Thread.sleep(3000);
        String Expecteddialg = "Auto Replies";
        String Actualdialog = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]")).getText();
        Assert.assertEquals(Actualdialog, Expecteddialg);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog, Expecteddialg);

        System.out.println(">>>> ** We successfully navigate to Auto Reply screen as we expect ** ");

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RadioGroup/android.widget.RadioButton[2]\n")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> My contact list auto reply");

    }

    @Test(priority =64)
    void AUTOREPLYtoggltst() throws InterruptedException, MalformedURLException {
        Thread.sleep(1000);
        // 1rt toggle

        String ExpecteddialTg = "ON";
        String ActualdialoTg = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Switch")).getText();
        Assert.assertEquals(ActualdialoTg, ExpecteddialTg);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog, Expecteddialg);

        System.out.println(">>>> ** Toggle for AUTO REPLY is on** ");


    }


    /*
    //*********************************************************************************************************************************************************************
    @Test(priority = 64)
    void AutorepTest() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        String Expecteddialg = "Auto Replies";
        String Actualdialog = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]")).getText();
        Assert.assertEquals(Actualdialog, Expecteddialg);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog, Expecteddialg);

        System.out.println(">>>> ** We successfully navigate to Auto Reply screen as we expect ** ");
    }

//*********************************************************************************************************************************************************************
*/
    @Test(priority = 64)
    void AutoContctPermission() throws InterruptedException, MalformedURLException {
        Thread.sleep(2000);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Switch")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Open toggle");

        Thread.sleep(2000);

        driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Add to contact");
        Thread.sleep(2000);
        driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[2]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Allow permission fr contact for app dailog");
        Thread.sleep(500);
        driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Allow permission for contact for device permission");
        Thread.sleep(500);
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/backContactsFrag")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Back to Auto reply tab");

        // permission for android 10 11 etc
      /*
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Allow permission for contact for device permission");
        // permision for android 09 etc
        /*
        driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Allow permission for contact for device permission");
                                                                                      */
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/messageEt")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Auto reply message edit tab");
    }




    // Auto custom reply
    @Test(priority = 65)
    void SettingAutocustomReply() throws InterruptedException, MalformedURLException {

        /*driver.findElement(xpath("//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Custome reply");*/
        driver.findElement(xpath("//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Custome reply");
    }
    //*********************************************************************************************************************************************************************
    @Test(priority = 66)
    void AutorepCustomTest() throws InterruptedException, MalformedURLException {
        Thread.sleep(3000);
        String Expecteddialg = "Custom Reply";
        String Actualdialog = driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]")).getText();
        Assert.assertEquals(Actualdialog, Expecteddialg);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog, Expecteddialg);

        System.out.println(">>>> ** We successfully navigate to Auto Reply Custom reply screen as we expect ** ");


        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/customReplySwitch")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> On custom reply toggle");

        // Add Custom Reply
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/replyOtherSwitch")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> On custom reply other message toggle");
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/addCustomReplyBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> click on ADD custom reply");
        Thread.sleep(500);
    }
    //*********************************************************************************************************************************************************************
    @Test(priority = 66)
    void SettingADDmsg() throws InterruptedException, MalformedURLException {
        //  Add incoming message
        WebElement cstm = driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/incomingMsgEt"));   // TYPE COUNTRY NAME
        cstm.sendKeys("Hy");
        System.out.println(">>>> Enter incoming");
        Thread.sleep(1500);
        //  Add outoing message
        WebElement cstm2 = driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/outgoingMsgEt"));   // TYPE COUNTRY NAME
        cstm2.sendKeys("Hello");
        System.out.println(">>>> Enter outgoing");
        Thread.sleep(1500);
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/addReplyBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Add ");

        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/backCustomReply")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Back to auto reply");

        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/busyTv")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Edit new message");
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/backCustomReply")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Back to auto relpy main tab");

        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/backAutoReplyFrag")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(">>>> Back to setting");

    }

    //*********************************************************************************************************************************************************************
    // Rateus
    @Test(priority = 67)
    void SettingRateus() throws InterruptedException, MalformedURLException {
      /*
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/rateUsBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Rate us");*/

        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/rateUsBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Rate us");



            Thread.sleep(3000);
            String Expecteddialg = "Rate your experience with us";
            String Actualdialog = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]")).getText();
            Assert.assertEquals(Actualdialog, Expecteddialg);
            Thread.sleep(2000);
            //Assert.assertEquals(Actualdialog, Expecteddialg);

            System.out.println(">>>> ** We successfully navigate to Rate us dialog box as we expect ** ");


        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/star3")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Rate us 3 starts");
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/submitBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Submit Rate us ");
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/back")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> After navigation to feedback back to setting ");

    }
    //*********************************************************************************************************************************************************************
    //SARE app
    @Test(priority = 68)
    void SettingSahreAPP() throws InterruptedException, MalformedURLException {

        /*driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/shareAppBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Share app");*/

        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/shareAppBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Share app");
        driver.findElement(By.id("com.huawei.android.internal.app:id/button_cancel")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Cancel dialog");

        Thread.sleep(3000);
    }

    // feedback
    @Test(priority = 69)
    void SettingFeedback() throws InterruptedException, MalformedURLException {
        int startset_x = (int) (dim.width * 0.5);
        int startset_y = (int) (dim.height * 0.9);

        int endset_x = (int) (dim.width * 0.5);
        int endset_y = (int) (dim.height * 0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tsset = new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tsset.press(PointOption.point(startset_x, startset_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endset_x, endset_y)).release().perform();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      /*  driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/feedbackBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Feedback");*/

        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver" +
                ":id/feedbackBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Feedback");



        Thread.sleep(3000);
        String Expecteddialg = "Feedback";
        String Actualdialog = driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")).getText();
        Assert.assertEquals(Actualdialog, Expecteddialg);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog, Expecteddialg);

        System.out.println(">>>> ** We successfully navigate Feedback screen as we expect ** ");
    }

    @Test(priority = 70)
    void SettingFeedbacktYP() throws InterruptedException, MalformedURLException {
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/anr")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Select problem type");
    }

    @Test(priority = 71)
    void FeeBBAKTXT() throws InterruptedException, MalformedURLException {

        WebElement detl = driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/enterDetailsTv"));
        detl.sendKeys("Hy my name is zarrak i have some peroblems");
        System.out.println(">>>>Enter peroblem's detail");
        //  msg.clear();

    }
    @Test(priority = 72)
    void FeedbackslctIMG() throws InterruptedException, MalformedURLException {
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/uploadFilesTv")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Click on plus for selecting image");
        Thread.sleep(2000);
        driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7." +
                "widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.ImageView[1]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Select image from gallery");
        driver.navigate().back();
        Thread.sleep(3000);
        int startfd_x = (int) (dim.width * 0.5);
        int startfd_y = (int) (dim.height * 0.9);

        int endfd_x = (int) (dim.width * 0.5);
        int endfd_y = (int) (dim.height * 0.3);

        @SuppressWarnings("rawtypes")
        TouchAction tsfd = new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tsfd.press(PointOption.point(startfd_x, startfd_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endfd_x, endfd_y)).release().perform();
    }

    @Test(priority = 73)
    void FeedbackSUBMIT() throws InterruptedException, MalformedURLException {
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/sendBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Submit Feedback");


        Thread.sleep(3000);
        String Expecteddialg = "Compose";
        String Actualdialog = driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")).getText();
        Assert.assertEquals(Actualdialog, Expecteddialg);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog, Expecteddialg);

        System.out.println(">>>> ** We successfully navigate to email as we expect ** ");


        driver.navigate().back();
        driver.navigate().back();
        System.out.println(">>>> Back from submit");
        Thread.sleep(2000);
        driver.navigate().back();
        //driver.navigate().back();
        Thread.sleep(1500);
        int startgt_x=(int)(dim.width*0.5);
        int startgt_y=(int)(dim.height*0.9);

        int endgt_x=(int)(dim.width*0.5);
        int endgt_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tsgt=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tsgt.press(PointOption.point(startgt_x,startgt_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endgt_x,endgt_y)).release().perform();
        //  savestatus.images.videosaver.statusdownloadapp.storysaver:id/back   for back from feeback

    }

    // privacypolicy
    @Test(priority = 74)
    void SettingPrivcypolicy() throws InterruptedException, MalformedURLException {
        //Privacy Policy
       /* driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/privacyPolicyBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Privacy plicy");*/
        //Privacy Policy
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/privacyPolicyBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Privacy plicy");

      /*  Thread.sleep(3000);
        String Expecteddialg = "Privacy Policy";
        String Actualdialog = driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView[2]")).getText();
        Assert.assertEquals(Actualdialog, Expecteddialg);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog, Expecteddialg);

        System.out.println(">>>> ** We successfully navigate to privacy policy as we expect ** ");*/

        //driver.navigate().back();
        Thread.sleep(2000);
        int startprv_x=(int)(dim.width*0.5);
        int startprv_y=(int)(dim.height*0.9);

        int endprv_x=(int)(dim.width*0.5);
        int endrv_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tsprv=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tsprv.press(PointOption.point(startprv_x,startprv_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endprv_x,endrv_y)).release().perform();
        Thread.sleep(3000);
        int startprvc_x=(int)(dim.width*0.5);
        int startprvc_y=(int)(dim.height*0.9);

        int endprvc_x=(int)(dim.width*0.5);
        int endprvc_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tsprvc=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tsprvc.press(PointOption.point(endprvc_x,endprvc_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(startprvc_x,startprvc_y)).release().perform();
        Thread.sleep(2000);
        driver.navigate().back();
    }

    // Get help
    @Test(priority = 75)
    void SettingetHelp() throws InterruptedException, MalformedURLException {
      /*  driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:" +
                "id/getHelpBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Get help");*/

        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:" +
                "id/getHelpBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Get help");
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/nextBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Get help NEXT1");
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/nextBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Get help NEXT2");
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/nextBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Get help NEXT3");
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/skipbtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Get help skip");

    }


    // Back to ome Screen
    @Test(priority = 76)
    void SettingBackHome() throws InterruptedException, MalformedURLException {

       /* driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/backSettings")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Back to home screen");*/
        driver.findElement(By.id("savestatus.images.videosaver.statusdownloadapp.storysaver:id/backSettings")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Back to home screen");
        driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>>   HOME SCREEN");
        Thread.sleep(3000);
    }

    @Test(priority = 77)

    void STATUSCheck() throws InterruptedException, MalformedURLException {
        driver.openNotifications();
        Thread.sleep(3000);

        try{
            driver.findElement(By.xpath("(//android.widget.Button[@content-desc=\"Expand\"])[2]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>>   Expand notification");

            driver.findElement(By.xpath("\t\n" +
                    "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>>   Open notification");

            driver.navigate().back();
            Thread.sleep(3000);
            String Expecteddialg1 = " My Image Statuses";
            String Actualdialog1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")).getText();
            Assert.assertEquals(Actualdialog1, Expecteddialg1);
            Thread.sleep(2000);
            //Assert.assertEquals(Actualdialog, Expecteddialg);

            System.out.println(">>>> ** Navigate to image status** ");

        }catch (Exception e){
            System.out.println(">>>>  There is no status o notification bar");
        }
    }
        @Test(priority = 78)
        void Close() throws InterruptedException, MalformedURLException {
            driver.quit();

        System.out.println("**********************    Activities performed succssfully    *************************");

    }
}
