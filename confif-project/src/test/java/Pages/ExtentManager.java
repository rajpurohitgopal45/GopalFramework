package Pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	private static ExtentReports extent;

	public static ExtentReports createInstance(String filename) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(filename);

		// htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
		// htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setDocumentTitle(filename);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName(filename);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Automation Tester", "Gopal Rajpurohit");
		extent.setSystemInfo("Organization", "ICICI Lombard");
		extent.setSystemInfo("Build no", "1");
		return extent;
	}

	public static String screenshotPath;
	public static String screenshotName;

	public static void captureScreenshot() {
		File scrFile = ((TakesScreenshot) MultiThread.getDriver()).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		try {
			FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\reports\\" + screenshotName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
