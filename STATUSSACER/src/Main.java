
import io.appium.java_client.TouchAction;
        import io.appium.java_client.android.AndroidDriver;
        import io.appium.java_client.touch.WaitOptions;
        import io.appium.java_client.touch.offset.PointOption;
        import org.openqa.selenium.By;
        import org.openqa.selenium.Dimension;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.remote.DesiredCapabilities;

        import java.io.IOException;
        import java.net.URL;
        import java.time.Duration;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

        import static io.appium.java_client.touch.offset.ElementOption.element;
        import static org.openqa.selenium.By.xpath;

public class Main{


    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws IOException, Exception {
        // TODO Auto-generated method stub

        //mtd mtdobject=new mtd();

        DesiredCapabilities dc = new DesiredCapabilities();


        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "mate 10");
        dc.setCapability("deviceVersion", "8");
        dc.setCapability("udid", "FFY5T17C23023667");
        dc.setCapability("appPackage", "savestatus.images.videosaver.statusdownloadapp.storysaver");
        dc.setCapability("appActivity", "com.example.whatsappstatussaverpro.MainActivity ");



        //Allow pwermissin automatically
        //dc.setCapability("autoGrantPermissions", "true");

        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
        Thread.sleep(4000);

        // Scroller
        Dimension dim =driver.manage().window().getSize();


        // Click on Start after loading
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/pbStart")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Start");
        Thread.sleep(500);

        // for ad when we online
        try {
            driver.findElement(xpath("/hierardroid.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Ad cross succesfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }


                                                                   // Clicks after ad
        driver.findElement(By.id("com.statusdownloader.videodownloader." +
                "whatsappsaver.saveit.savestatus:id/fashion")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Select option for hot videos");
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit." +
                "savestatus:id/nextBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Go to next permission screen");
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/waBtnIcon")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        // for 10 and 11 and 12 and 13
/*
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/tvOkay")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        System.out.println(">>>> Okay with allow permission  app dialog box");

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.Button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Folder access");

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Allow permission in 10 11 12 13 in folder");
                                                                                   */
        // for 9 and below permission
        driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        System.out.println(">>>> Allow permission");
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver." +
                "saveit.savestatus:id/allowBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/skipbtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Skip the help option ");

        driver.findElement(By.id("com.statusdownloader.videodownloader." +
                "whatsappsaver.saveit.savestatus:id/switchTextRefT")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Options ");
        Thread.sleep(2000);
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/waBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Select whatsapp ");
        driver.findElement(By.id("com.statusdownloader.videodownloader." +
                "whatsappsaver.saveit.savestatus:id/switchTextRefT")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Options ");
        Thread.sleep(2000);

        driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget." +
                "RadioGroup/android.widget.RadioButton[2]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println(">>>> Select Bussiness whatsapp ");
        Thread.sleep(20);
        driver.findElement(By.xpath("//android.widget.LinearLayout" +
                "[@content-desc=\"Images\"]/android.widget.TextView")).click();

        System.out.println(">>>> Image tab in Bussiness whatsapp ");
        Thread.sleep(20);

        driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Videos\"]/android." +
                "widget.TextView")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Video tab in Bussiness whatsapp ");

        Thread.sleep(20);
        driver.navigate().back();
        driver.findElement(By.id("com.statusdownloader.videodownloader." +
                "whatsappsaver.saveit.savestatus:id/switchTextRefT")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Options ");
        Thread.sleep(2000);


        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/waBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Select whatsapp ");

        // WIFI ON OFF
        Thread.sleep(1000);
        driver.toggleWifi();
        System.out.println(">>>> Wifi Off ");
        Thread.sleep(500);
        driver.toggleWifi();
        System.out.println(">>>> Wifi On ");
        Thread.sleep(3000);

/*
        TouchAction action = new TouchAction(driver);
        action.longPress((element("\t\n" +
                "(//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"])[3]"));;
        action.perform();*/

      /*                                                  // minimize app
        Thread.sleep(2000);
        System.out.println(">>>> Minimize app ");

        driver.runAppInBackground(Duration.ofSeconds(1));
        Thread.sleep(1000);
        try {
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Ad cross succesfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        */
        // Refresh screen
        Thread.sleep(2000);
        int startrf_x=(int)(dim.width*0.5);
        int startrf_y=(int)(dim.height*0.3);

        int endrf_x=(int)(dim.width*0.5);
        int endrf_y=(int)(dim.height*0.9);
        @SuppressWarnings("rawtypes")
        TouchAction tsrf=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tsrf.press(PointOption.point(startrf_x,startrf_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endrf_x,endrf_y)).release().perform();
        System.out.println(">>>> Refresh screen 1st time");

        //  Break for 2nd refresh
        Thread.sleep(200);

        int startrf2_x=(int)(dim.width*0.5);
        int startrf2_y=(int)(dim.height*0.3);

        int endrf2_x=(int)(dim.width*0.5);
        int endrf2_y=(int)(dim.height*0.9);
        @SuppressWarnings("rawtypes")
        TouchAction tsrf2=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tsrf2.press(PointOption.point(startrf2_x,startrf2_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endrf2_x,endrf2_y)).release().perform();
        System.out.println(">>>> Refresh screen 2nd time");
        Thread.sleep(5000);

        // Scroll horizentally top videos

        int starthor_x=(int)(dim.width*0.9);
        int starthor_y=(int)(dim.height*0.3);

        int endhor_x=(int)(dim.width*0.2);
        int endhor_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tshor=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tshor.press(PointOption.point(starthor_x,starthor_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endhor_x,endhor_y)).release().perform();
        Thread.sleep(1000);

        // 2nd scroller
        int starthor2_x=(int)(dim.width*0.9);
        int starthor2_y=(int)(dim.height*0.3);
        int endhor2_x=(int)(dim.width*0.2);
        int endhor2_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tshor2=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tshor2.press(PointOption.point(starthor2_x,starthor2_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endhor2_x,endhor2_y)).release().perform();
        Thread.sleep(1500);

        // 3rd scroller
        int starthor3_x=(int)(dim.width*0.2);
        int starthor3_y=(int)(dim.height*0.3);
        int endhor3_x=(int)(dim.width*0.9);
        int endhor3_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tshor3=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tshor3.press(PointOption.point(starthor3_x,starthor3_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endhor3_x,endhor3_y)).release().perform();
        Thread.sleep(3000);

        int starthor4_x=(int)(dim.width*0.2);
        int starthor4_y=(int)(dim.height*0.3);
        int endhor4_x=(int)(dim.width*0.9);
        int endhor4_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tshor4=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tshor4.press(PointOption.point(starthor4_x,starthor4_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endhor4_x,endhor4_y)).release().perform();
        Thread.sleep(3000);

        // Open videos
        try{
            driver.findElement(xpath("(//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"])[4]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Open video for watching or downlading");
            Thread.sleep(1500);
            int startseev_x=(int)(dim.width*0.5);
            int startseev_y=(int)(dim.height*0.9);

            int endseev_x=(int)(dim.width*0.5);
            int endseev_y=(int)(dim.height*0.3);
            @SuppressWarnings("rawtypes")
            TouchAction tsseev=new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            tsseev.press(PointOption.point(startseev_x,startseev_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(endseev_x,endseev_y)).release().perform();
            Thread.sleep(2000);
            System.out.println(">>>> Scroll to video 2");

            int starth_x=(int)(dim.width*0.5);
            int starth_y=(int)(dim.height*0.9);

            int endh_x=(int)(dim.width*0.5);
            int endh_y=(int)(dim.height*0.3);
            @SuppressWarnings("rawtypes")
            TouchAction tsh=new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            tsh.press(PointOption.point(starth_x,starth_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(endh_x,endh_y)).release().perform();
            Thread.sleep(4000);
            System.out.println(">>>> Scroll to video 3");
            driver.navigate().back();

        }
        catch (Exception e){
            System.out.println(">>>>  There is no video due to interet issues  ");
            driver.navigate().back();
            Thread.sleep(3000);
        }
        // Hot videos scroll -->> See More
        int startsee_x=(int)(dim.width*0.5);
        int startsee_y=(int)(dim.height*0.9);

        int endsee_x=(int)(dim.width*0.5);
        int endsee_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tssee=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tssee.press(PointOption.point(startsee_x,startsee_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endsee_x,endsee_y)).release().perform();
        Thread.sleep(4000);

        //Download hot video
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/playTopVideoBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Hot video play from home screen");
       /* for(int i=15; i<=30; i++)
        {
            driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/downloadVideoBtn")).click();
            System.out.println(">>>> 1111Download hot video");
        } */
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/downloadVideoBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Download hot video");
        Thread.sleep(3000);
        try {
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget." +
                    "LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit." +
                    "WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Ad cross succesfully");
        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(3000);

        // For notification bar
        driver.openNotifications();
        Thread.sleep(3000);
        driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android." +
                "widget.ScrollView/android.widget.FrameLayout[4]/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Hot video play from notification bar");

        Thread.sleep(5000);
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/shareTv")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> share Hot video");
        driver.findElement(xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Shre on whatsapp");

        Thread.sleep(2000);
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
            driver.navigate().back();
            driver.navigate().back();
        }
        catch (Exception e) {
            System.out.println(">>>> there is no whatsapp");
            Thread.sleep(3000);
            driver.navigate().back();
            driver.navigate().back();
        }
        Thread.sleep(4000);
        int startsee2_x=(int)(dim.width*0.5);
        int startsee2_y=(int)(dim.height*0.9);

        int endsee2_x=(int)(dim.width*0.5);
        int endsee2_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tssee2=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tssee2.press(PointOption.point(startsee2_x,startsee2_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endsee2_x,endsee2_y)).release().perform();
        Thread.sleep(4000);

        // 2nd scroll in home screen
      /*  int startsee2_x=(int)(dim.width*0.5);
        int startsee2_y=(int)(dim.height*0.9);

        int endsee2_x=(int)(dim.width*0.5);
        int endsee2_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tssee2=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tssee2.press(PointOption.point(startsee2_x,startsee2_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endsee2_x,endsee2_y)).release().perform(); */



        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver." +
                "saveit.savestatus:id/seeMoreHotVideos")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Home screen see more");
        Thread.sleep(1500);
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver." +
                "saveit.savestatus:id/chipSports")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Home screen sports");
        Thread.sleep(1500);
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/chipMusic")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Home screen Music");
        Thread.sleep(1500);
        driver.findElement(By.id("com.statusdownloader.videodownloader." +
                "whatsappsaver.saveit.savestatus:id/chipNature")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Home screen Nature");
        Thread.sleep(1500);
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/chipTravel")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Home screen Travel");

        Thread.sleep(2000);
        // Scroll horizentally see more hot vidoes
        int starth3_x=(int)(dim.width*0.7);
        int starth3_y=(int)(dim.height*0.2);

        int endh3_x=(int)(dim.width*0.2);
        int endh3_y=(int)(dim.height*0.2);
        @SuppressWarnings("rawtypes")
        TouchAction tsh3=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();
        tsh3.press(PointOption.point(starth3_x,starth3_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endh3_x,endh3_y)).release().perform();

        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/chipBollywood")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Home screen Showbiz");
        Thread.sleep(1500);
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/chipFashion")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Home screen Fashion");
        Thread.sleep(1500);
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/chipFitness")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Home screen Fitness");
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(1500);
        int startup1_x=(int)(dim.width*0.5);
        int startup1_y=(int)(dim.height*0.9);

        int endup1_x=(int)(dim.width*0.5);
        int endup1_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tsup1=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();
        tsup1.press(PointOption.point(endup1_x,endup1_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(startup1_x,startup1_y)).release().perform();


        // Premium screen
        driver.findElement(By.id("com.statusdownloader.videodownloader." +
                "whatsappsaver.saveit.savestatus:id/premiumBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Premium screen");

        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/monthlyPlan")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Premium screen monthly");

        Thread.sleep(3000);
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
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/continueWithAds")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Continue with Ad ");

        // DIRECT MESSAGE ACTIVITIES
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/mainFragSendBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Direct Message");
        driver.findElement(xpath(" \t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android." +
                "widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")).click();

       // boolean isKeyboardShown = driver.isKeyboardShown();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        System.out.println(">>>> Country list");
        WebElement code = driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/editText_search"));   // TYPE COUNTRY NAME
        code.sendKeys("PAKISTAN");
        System.out.println(">>>> Enter Country name");
          /*  code.clear();
          System.out.println("Text Field Cleared"); */

        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/textView_countryName")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(">>>> SELECT PAKISTAN");

        WebElement number = driver.findElement(By.id("com.statusdownloader.videodownloader." +
                "whatsappsaver.saveit.savestatus:id/etNumber"));
        number.sendKeys("3082982668");
        System.out.println(">>>> Enter number");
        //  number.clear();
        WebElement msg = driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/messageEt"));
        msg.sendKeys("Hy my name is zarrak afridi how e u >> i am in meeting text u ltr ");
        System.out.println(">>>> Enter text for message.............");
        //  msg.clear();
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/openChatBtn")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(">>>> Open chat");
        Thread.sleep(2000);
        try {  driver.findElement(By.id("com.whatsapp:id/send")).click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            System.out.println(">>>> Send chat");
            Thread.sleep(2000);
            //FOR BACK
            driver.navigate().back();
            Thread.sleep(500);
            driver.navigate().back();
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
        }

        catch (Exception e){
            System.out.println(">>>> there is no whatsapp");
            Thread.sleep(500);
            //FOR BACK
            driver.navigate().back();
            Thread.sleep(1000);
            driver.navigate().back();
        }
        /*
        int startcod_x=(int)(dim.width*0.3);
        int startcod_y=(int)(dim.height*0.9);

        int endcod_x=(int)(dim.width*0.3);
        int endcod_y=(int)(dim.height*0.9);
        @SuppressWarnings("rawtypes")
        TouchAction tscod=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tscod.press(PointOption.point(startcod_x,startcod_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endcod_x,endcod_y)).release().perform();
                                                                                        */
        //Scroll home screen for stickers
        int start_x=(int)(dim.width*0.5);
        int start_y=(int)(dim.height*0.9);

        int end_x=(int)(dim.width*0.5);
        int end_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction ts=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts.press(PointOption.point(start_x,start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x,end_y)).release().perform();

        // Stickers
        Thread.sleep(3000);
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/seeMoreTopStickers")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(">>>> SEE MORE STICKERS");
        Thread.sleep(3000);
        driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println(">>>> 1ST STICKERS");

        try{
            driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/addToWABtn")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            System.out.println(">>>> ADD STICKERS");
            Thread.sleep(3000);
            driver.findElement(By.id("com.whatsapp:id/add_button")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            System.out.println(">>>>  OK BTN FOR STICKERS"); }
        catch (Exception e){
            System.out.println(">>>> Stiker already added ");
        }

        try {
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Ad cross succesfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed or Ad not show");
        }

        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/backStickerPackFrag")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Back from 1ST sticers");
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/chipDownloaded")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Download stickers tab ");
        Thread.sleep(3000);
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/backSearchStickerPacks")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // driver.navigate().back();
        System.out.println(">>>> Back to home screen from sticers");
        Thread.sleep(3000);
        // Scroll up home screen
        int startup_x=(int)(dim.width*0.5);
        int startup_y=(int)(dim.height*0.9);

        int endup_x=(int)(dim.width*0.5);
        int endup_y=(int)(dim.height*0.2);
        @SuppressWarnings("rawtypes")
        TouchAction tsup=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();
        tsup.press(PointOption.point(endup_x,endup_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(startup_x,startup_y)).release().perform();

        // Open watch and download video
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/seeMoreTopVideos")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(">>>> Home screen top more video");
        driver.findElement(xpath("(//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"])[1]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(">>>> Open top video");
        driver.findElement(By.id( "com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/downloadVideoBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Download top video");
        try {
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget." +
                    "LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Ad cross succesfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(3000);                                      // Share on Whatsapp
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/shareVideoBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> share top video");
        driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.FrameLayout/android." +
                "support.v4.view.ViewPager/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Share on whatsapp");

        Thread.sleep(4000);
        try{
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.ImageView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Select contact on whatsapp");
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("//android.widget.ImageButton[@content-desc=\"Send\"]")).click();
            System.out.println(">>>> Send to contact on whatsapp");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("//android.widget.ImageButton[@content-desc=\"Send\"]")).click();
            System.out.println(">>>> Send button");
            Thread.sleep(3000);
            driver.navigate().back();
            driver.navigate().back();
            driver.findElement(By.id( "com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/backShortsFrag")).click();
            driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
            System.out.println(">>>> Back from top screen video"); }
        catch (Exception e) {
            System.out.println(">>>> There is no whatsapp");
            driver.navigate().back();
            driver.navigate().back();
        }

        int starttop_x=(int)(dim.width*0.5);
        int starttop_y=(int)(dim.height*0.9);

        int endtop_x=(int)(dim.width*0.5);
        int endtop_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tstop=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tstop.press(PointOption.point(starttop_x,starttop_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endtop_x,endtop_y)).release().perform();

       /* driver.findElement(By.xpath( "(//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"])[17]")).click();
        driver.manage().timeouts().implicitlyWa
        it(10, TimeUnit.SECONDS);
        System.out.println(">>>>scroll and click on other video from top video"); */

        int starttopup_x=(int)(dim.width*0.5);
        int starttopup_y=(int)(dim.height*0.3);

        int endtopup_x=(int)(dim.width*0.5);
        int endtopup_y=(int)(dim.height*0.4);
        @SuppressWarnings("rawtypes")
        TouchAction tsuptopup=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tsuptopup.press(PointOption.point(endtopup_x,endtopup_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(starttopup_x,starttopup_y)).release().perform();

       /*
        driver.findElement(By.id( "com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/downloadVideoBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>>download 2nd top video");

        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/backShortsFrag")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>>back to top video");
                                                         */
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/backDirectReplyFrag")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Back to home screen from top video");


        // Home Screen image tab

        driver.findElement(xpath("//android.widget.LinearLayout[@content-desc=\"Images\"]/android.widget.TextView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Home screen status image tab");
        Thread.sleep(1000);
        try {
            driver.findElement(xpath("\t\n" +
                    "(//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"])[3]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Open Image from status");

        } catch (Exception e) {
            System.out.println(">>>> There is no image");
        }

        Thread.sleep(500);
        driver.navigate().back();

        driver.findElement(xpath("//android.widget.LinearLayout[@content-desc=\"Videos\"]/android.widget.TextView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Home screen status video tab");
        Thread.sleep(5000);                                // for download video
        try {
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Download Video from status");

        } catch (Exception e) {
            System.out.println(">>>> Already downloaded");
        }
        Thread.sleep(3000);

        //  VIDEO TAB open video
        driver.findElement(xpath("//android.widget.LinearLayout[@content-desc=\"Videos\"]/android.widget.TextView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Open Video from status");
        try {

            driver.findElement(xpath("(//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"])[3]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Open Video from status");
        }
        catch (Exception e) {
            System.out.println(">>>> There is no video in status video tab");
        }
        Thread.sleep(500);
        driver.navigate().back();
        Thread.sleep(2000);

        // Saved Tab
        driver.findElement(xpath("//android.widget.LinearLayout[@content-desc=\"Saved\"]/android.widget.TextView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Home screen saved tab");
        Thread.sleep(3000);



        // Long Press 1 FOR Selection
        WebElement someElement1 =
                driver.findElement(xpath("(//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"])[3]"));

        TouchAction ac1=new TouchAction(driver);
        ac1.longPress(element(someElement1)).perform().release();
        System.out.println(">>>> Long Press for Delete image or video");

        //Select all
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/mainFragSelectAll")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Select all Delete image or video");
        Thread.sleep(1500);
        driver.navigate().back();

        // Long Press 2 FOR Deleting
        WebElement someElement2 =
                driver.findElement(xpath("(//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"])[3]"));

        TouchAction ac2=new TouchAction(driver);
        ac2.longPress(element(someElement2)).perform().release();
        System.out.println(">>>> Long Press for Delete image or video");

        // Delete image or vidoe
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/mainFragDltBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Delete image or video");
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/deleteProjectsBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> ok Delete image or video");

        try {
            driver.findElement(xpath("(//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"])[4]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Open Saved tab video or image 1");

        } catch (Exception e) {
            System.out.println(">>>> There is no Saved image or video");
        }
        Thread.sleep(5000);

        // Share content on whatsapp
        driver.findElement(xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Share saved video or image");

        driver.findElement(xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Share on Whatsapp");

        try {
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.ImageView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Select contact on whatsapp");
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("//android.widget.ImageButton[@content-desc=\"Send\"]")).click();
            System.out.println(">>>> Send to contact on whatsapp");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("//android.widget.ImageButton[@content-desc=\"Send\"]")).click();
            System.out.println(">>>> Send button");
            Thread.sleep(3000);
            driver.navigate().back();
            driver.navigate().back();
            driver.findElement(By.id( "com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/backShortsFrag")).click();
            driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
            System.out.println(">>>> Back from top screen video"); }
        catch (Exception e) {
            System.out.println(">>>> There is no whatsapp");
        }
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        try {
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Ad cross succesfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }


        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/chipHotVideos")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Hot videos tab is saved");
        Thread.sleep(1000);
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/chipImages")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Image tab is saved");
        Thread.sleep(1000);
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/chipVideos")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Videos tab is saved");
        Thread.sleep(1000);

        //SETTING
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/mainFragSettingsBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Setting");
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/statusNotifySwitch")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Open status notification...");

        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/saveStatusSwitch")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Open auto save");

        // permission for auto save
/*
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/btnYes")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> open auto save permision");

        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> open auto save permision by device  dialog");
                                                                                */
        // Languages
        driver.findElement(xpath("(//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"])[5]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Language screen");
        Thread.sleep(3000);
        int startlan_x=(int)(dim.width*0.5);
        int startlan_y=(int)(dim.height*0.9);


        int endlan_x=(int)(dim.width*0.5);
        int endlan_y=(int)(dim.height*0.3);

        @SuppressWarnings("rawtypes")
        TouchAction tslan=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tslan.press(PointOption.point(startlan_x,startlan_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endlan_x,endlan_y)).release().perform();

        WebElement lan = driver.findElement(By.id("com.statusdownloader." +
                "videodownloader.whatsappsaver.saveit.savestatus:id/search_src_text"));
        lan.sendKeys("urdu");
        System.out.println(">>>>  Enter name of language");




        driver.findElement(By.xpath(" \t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.RadioButton")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Select language");

        try {
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Ad cross succesfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }

        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/mainFragSettingsBtn")).click();
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


        driver.findElement(By.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[4]/android.widget.TextView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> urdu languages");
        Thread.sleep(2000);
        WebElement lan1 = driver.findElement(By.id("com.statusdownloader." +
                "videodownloader.whatsappsaver.saveit.savestatus:id/search_src_text"));
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
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/mainFragSettingsBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Setting");


        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/backSearch")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Back from language");

        // Recoverd message
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver" +
                ".saveit.savestatus:id/recoveredMsgsImgRef")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Recoverd message tab open");

        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/recoverMessagesSwitch")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Recoverd message toggle open");

        try {
            driver.findElement(xpath("\t\n" +
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[2]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> permission 1st time Recoverd message toggle open");
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[9]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Switch")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Recoverd device permission");

            driver.findElement(xpath("\t\n" +
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
        // when we give permission
       /*
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/cancelDltProjectsBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> skip permission for recoverd message");
                                                                        */


       /* driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/backRecoverMessages")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Back to setting from recoverd message tab");*/

        driver.findElement(xpath("(//android.widget.ImageView[@content-" +
                "desc=\"WhatsApp Status Saver Pro\"])[11]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Open auto reply");
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/myContactListBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> My contact list auto reply");
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/addContactsBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Add to contact");
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/btnYes")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Allow permission fr contact for app dailog");

        driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Allow permission for contact for device permission");
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/backContactsFrag")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Back to Auto reply tab");

        // permission for android 10 11 etc
      /*
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Allow permission for contact for device permission");
                                                                                      */

        // permision for android 09 etc
        /*
        driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Allow permission for contact for device permission");
                                                                                      */


        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/messageEt")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Auto reply message edit tab");

        driver.findElement(xpath("//android.widget.ImageView[@content-desc=\"WhatsApp Status Saver Pro\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Custome reply");
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/customReplySwitch")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> On custom reply toggle");


        // Add Custom Reply
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/replyOtherSwitch")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> On custom reply other message toggle");
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/addCustomReplyBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> click on ADD custom reply");
        Thread.sleep(500);

        //  Add incoming message
        WebElement cstm = driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/incomingMsgEt"));   // TYPE COUNTRY NAME
        cstm.sendKeys("Hy");
        System.out.println(">>>> Enter incoming");
        Thread.sleep(1500);
        //  Add outoing message
        WebElement cstm2 = driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/outgoingMsgEt"));   // TYPE COUNTRY NAME
        cstm2.sendKeys("Hello");
        System.out.println(">>>> Enter outgoing");
        Thread.sleep(1500);
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/addReplyBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Add ");

        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/backCustomReply")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Back to auto reply");

        driver.findElement(By.id("com.statusdownloader." +
                "videodownloader.whatsappsaver.saveit.savestatus:id/busyTv")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Edit new message");
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/backCustomReply")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Back to auto relpy main tab");

        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/backAutoReplyFrag")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(">>>> Back to setting");



        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/rateUsBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Rate us");
        driver.findElement(By.id("com.statusdownloader.videodownloader." +
                "whatsappsaver.saveit.savestatus:id/star3")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Rate us 3 starts");
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/submitBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Submit Rate us ");
        driver.findElement(By.id("com.statusdownloader.videodownloader." +
                "whatsappsaver.saveit.savestatus:id/back")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> After navigation to feedback back to setting ");


        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/shareAppBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Share app");
        driver.findElement(By.id("com.huawei.android.internal.app:id/button_cancel")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Cancel dialog");

        Thread.sleep(3000);

        int startset_x=(int)(dim.width*0.5);
        int startset_y=(int)(dim.height*0.9);

        int endset_x=(int)(dim.width*0.5);
        int endset_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tsset=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tsset.press(PointOption.point(startset_x,startset_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endset_x,endset_y)).release().perform();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver." +
                "saveit.savestatus:id/feedbackBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Feedback");
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/anr")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Select problem type");

        WebElement detl = driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/enterDetailsTv"));
        detl.sendKeys("Hy my name is zarrak i have some peroblems");
        System.out.println(">>>>Enter peroblem's detail");
        //  msg.clear();


        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/uploadFilesTv")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Click on plus for selecting image");
        Thread.sleep(2000);
        driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7." +
                "widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.ImageView[1]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Select image from gallery");
        driver.navigate().back();
        Thread.sleep(3000);
        int startfd_x=(int)(dim.width*0.5);
        int startfd_y=(int)(dim.height*0.9);

        int endfd_x=(int)(dim.width*0.5);
        int endfd_y=(int)(dim.height*0.3);

        @SuppressWarnings("rawtypes")
        TouchAction tsfd=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tsfd.press(PointOption.point(startfd_x,startfd_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endfd_x,endfd_y)).release().perform();

        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/sendBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Submit Feedback");
        driver.navigate().back();
        driver.navigate().back();
        System.out.println(">>>> Back from submit");
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().back();
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
        //  com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/back   for back from feeback

        //Privacy Policy
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/privacyPolicyBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Privacy plicy");
        Thread.sleep(4000);
        driver.navigate().back();
        /*
        int startprv_x=(int)(dim.width*0.5);
        int startprv_y=(int)(dim.height*0.9);

        int endprv_x=(int)(dim.width*0.5);
        int endrv_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tsprv=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tsprv.press(PointOption.point(startprv_x,startprv_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endprv_x,endrv_y)).release().perform();
        Thread.sleep(5000);
        int startprvc_x=(int)(dim.width*0.5);
        int startprvc_y=(int)(dim.height*0.9);

        int endprvc_x=(int)(dim.width*0.5);
        int endprvc_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction tsprvc=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tsprvc.press(PointOption.point(endprvc_x,endprvc_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(startprvc_x,startprvc_y)).release().perform();
         */
        // Get Help

        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:" +
                "id/getHelpBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Get help");
        driver.findElement(By.id("com.statusdownloader.videodownloader." +
                "whatsappsaver.saveit.savestatus:id/nextBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Get help NEXT1");
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/nextBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Get help NEXT2");
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver." +
                "saveit.savestatus:id/nextBtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Get help NEXT3");
        driver.findElement(By.id("com.statusdownloader.videodownloader.whatsappsaver.saveit.savestatus:id/skipbtn")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Get help skip");


        driver.findElement(By.id("com.statusdownloader." +
                "videodownloader.whatsappsaver.saveit.savestatus:id/backSettings")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>> Back to home screen");

        driver.findElement(xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(">>>>   HOME SCREEN");
        Thread.sleep(3000);
        driver.quit();

        System.out.println("**********************    Activities performed succssfully    *************************");

    }

}
