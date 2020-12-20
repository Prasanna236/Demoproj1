package package1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import package2.driverSetup;
import package2.excelSetup;

import org.testng.annotations.*;
public class Test1 {


WebDriver driver=null;

@BeforeTest
@Parameters("browser")
 
public void beforetest(String browser) {
	driverSetup ds=new driverSetup();
	driver=ds.setup(browser);
}

@Test
public void testing() throws IOException {
	System.out.println("at test");
	excelSetup ex=new excelSetup();
	String s=ex.getexcel(1, 1);
	System.out.println(s);
	
}









}

