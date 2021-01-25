package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainMenuHelper extends HelperBase{


    public MainMenuHelper(WebDriver wd) {
        super(wd);
    }
    public boolean isHamburgerMenuButtonPresent(){
        //  return isElementPresent(By.tagName("ion-menu-button"));
        return isElementPresent(By.cssSelector(".md.button.in-toolbar.in-toolbar-color.ion-activatable.ion-focusable.hydrated"));
    }

    public void clickOnHamburgerMenu() {
        //  click(By.cssSelector(".buttons-first-slot.sc-ion-buttons-md-h.sc-ion-buttons-md-s.md.hydrated"));
        wd.findElement(By.tagName("ion-menu-button")).click();
    }

    public void clickOnMainMenuItemContacts() throws InterruptedException {
        clickOnHamburgerMenu();
        pause(2000);
        click(By.name("call"));
    }

    public void clickOnMainMenuItemHome() throws InterruptedException {
        clickOnHamburgerMenu();
        pause(2000);
        click(By.name("home"));
    }
}
