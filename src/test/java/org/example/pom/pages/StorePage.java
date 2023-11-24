package org.example.pom.pages;

import org.example.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StorePage extends BasePage {
    private final By search_field = By.xpath("//input[@id='woocommerce-product-search-field-0']");
    private final By search_btn = By.xpath("//button[@value='Search']");
    private final By search_title = By.xpath("//h1[@class='woocommerce-products-header__title page-title']");
    private final By add_to_cart_btn = By.xpath("//a[@aria-label='Add “Blue Shoes” to your cart']");
    private final By view_cart_link = By.xpath("//a[@title='View cart']");



    public StorePage(WebDriver driver) {
        super(driver);
    }

    public StorePage search(String txt){
        driver.findElement(search_field).sendKeys(txt);
        driver.findElement(search_btn).click();

        return this;
    }
//    public StorePage click_search_btn (){
//
//        driver.findElement(search_btn).click();
//        return this;
//    }

    public String getTitle(){
        String element = driver.findElement(search_title).getText();
        return element;
    }

    public void clickAddToCartBtn (){

        driver.findElement(add_to_cart_btn).click();
    }

    public CartPage click_view_cart_link(){
        new WebDriverWait(driver, 10).until(
                ExpectedConditions.elementToBeClickable(view_cart_link)
        ).click();
//        driver.findElement(view_cart_link).click();
        return new CartPage(driver);
    }
}
