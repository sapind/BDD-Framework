package com.qa.amazon.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.amazon.util.AmazonTestBase;

public class ProductSearchPage extends AmazonTestBase {

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement textBox;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement searchBtn;
	@FindBy(xpath="//span[@class='a-color-state a-text-bold']")
	WebElement verifysearchItem;
	@FindBy(xpath="//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_5']//div[@class='s-card-container s-overflow-hidden aok-relative puis-expand-height puis-include-content-margin puis s-latency-cf-section s-card-border']//div[@class='a-section a-spacing-base']//div[@class='a-section a-spacing-small puis-padding-left-small puis-padding-right-small']//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4']//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")
	WebElement selectItem;
	
	public ProductSearchPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterItemName(String itemName)
	{
		textBox.sendKeys(itemName);
		searchBtn.click();
	}
	public String getVerifySearchItem()
	{
	      return verifysearchItem.getText();
	      
	}
public void clickOnSelectItem()
	
	{
		selectItem.click();
	}
	

}
