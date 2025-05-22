package MobileTest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages.googleSearchpage;

public class searchTest extends BaseClass {
	@Test
	public void test1() {
		ExtentTest extTest = extReport.createTest("Test1", "this is demo test case");
		googleSearchpage pg = new googleSearchpage(driver);
		driver.get("https://google.com/");
		String data = "Phone";
		pg.EnterSearchData(data);
		extTest.log(Status.INFO, data + "phone search successfuly");
		pg.PressEnterOnSearchBox();
		extTest.log(Status.INFO, data + "enetr key pressed");
	}

}