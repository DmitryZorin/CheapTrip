package com;

import org.testng.annotations.Test;

public class HamburgerMenuTests extends TestBase {

    @Test
    public void MainMenuOpensTest() {
        app.getMainmenu().clickOnHamburgerMenu();
        //   app.wd.findElement(By.tagName("ion-menu-button")).click();

    }
}
