package package2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshotSetup {

	public void screenshot(WebDriver driver) throws IOException
	   {
			  TakesScreenshot s=(TakesScreenshot) driver;
			  File src=s.getScreenshotAs(OutputType.FILE);
			  File dst=new File("D:\\java_softwares\\workspaces java\\tomorrow\\screenshot\\picture.png");
			  FileUtils.copyFile(src,dst);
			   }

}
