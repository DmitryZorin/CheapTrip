package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

    public class ApplicationManager {

        WebDriver wd;
        MainMenuHelper mainmenu;

        public void init() {
            wd = new ChromeDriver();
            wd.manage().window().maximize();
            wd.get("http://test70.lowcoststrip.com");
            wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //    openSite("http://test70.lowcoststrip.com");
            mainmenu = new MainMenuHelper();
        }

//    public void openSite(String url) {
//        wd.navigate().to(url);
//    }

        public void stop() {
            wd.quit();
        }

        public MainMenuHelper getMainmenu() {
            return mainmenu;
        }
    }

