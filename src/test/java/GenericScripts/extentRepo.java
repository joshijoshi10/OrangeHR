package GenericScripts;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentRepo {

	public static void main(String[] args) {
		
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        ExtentTest test = extent.createTest("LoginTest", "Sample description");
        test.log(Status.INFO,"starting testcase");
        
        
        
        extent.flush();
	}

}
