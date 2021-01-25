package com;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HamburgerMenuTests extends TestBase {

    @Test
    public void MainMenuOpensTest() {
        app.getMainmenu().clickOnHamburgerMenu();
        
    }
}
