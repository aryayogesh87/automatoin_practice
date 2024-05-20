package com.tests;

import org.testng.annotations.Test;
import com.base.BaseClass;
import com.test.po.Course_Page;

public class CourseNameTest extends BaseClass {
	
	@Test
    public void clickOnCourseList() {
        Course_Page page = new Course_Page(driver); // Initialize the page object
        page.CoursesName();
    }
	
}