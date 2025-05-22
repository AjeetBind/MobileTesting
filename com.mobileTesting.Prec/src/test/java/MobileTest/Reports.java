package MobileTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	ExtentReports extReport;
	ExtentSparkReporter extSpark;

	public void reports() {
		extReport = new ExtentReports();
		extSpark = new ExtentSparkReporter("c:/users/demo/remort/demo.html");
		extReport.attachReporter(extSpark);
		// ExtentTest extTest = extReport.createTest("");

	}

	public void tearDown() {
		extReport.flush();
	}

}