package com.romanceabroad.ui;

import org.testng.annotations.Test;

public class PhotosTests extends BaseUI {
    public static final boolean testCase7 = true;
    public static final boolean testCase8 = true;

    @Test(priority= 1, enabled = testCase7, groups ={"regression"})
    public void PhotosPagetestCase7() {
       mainPage.getToPhotosPage();
        photosPage.clickOnDropdownViewsCount();
    }
    @Test(priority= 1, enabled = testCase8, groups ={"regression"})
    public void LinksOnPhotosPagetestCase8(){
        mainPage.checkLinksOnWebPage("//a", "href" );
        mainPage.checkLinksOnWebPage("//img", "src" );
    }
}