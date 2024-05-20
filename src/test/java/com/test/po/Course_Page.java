package com.test.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Course_Page extends com.base.BaseClass {
	
	WebDriver driver;

	@FindBy(xpath = "/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[2]/a")
	private WebElement courseName;
	
	public Course_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize the elements
    		}
	
	public void CoursesName() {
		courseName.click();
	}
	
}
