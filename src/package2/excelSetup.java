package package2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.examples.html.XSSFHtmlHelper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelSetup {

	public String getexcel(int row,int col) {
		String text = null;
		try {
		String xlpath="E:\\selenium\\Book1.xlsx";
		System.out.println("1");
		File excelfile=new File(xlpath);
		System.out.println("11");
		FileInputStream fis=new FileInputStream(excelfile);
		System.out.println("2");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
	//	XSSFWorkbook wb=new XSSFWorkbook();
		System.out.println("3");
		XSSFSheet sh=wb.getSheetAt(0);
		System.out.println("4");
		XSSFCell cl=sh.getRow(row).getCell(col);
		System.out.println("5");
		text=cl.getStringCellValue();
		System.out.println("6");
	
		
	}
		catch(Exception e){
		e.printStackTrace();
		}
		return text;
	}
	public void putexcel(int row,int col,String val) throws IOException {
		
		String xlpath="D:\\java_softwares\\workspaces java\\Sba1\\demo.xlsx";
		FileInputStream fis=new FileInputStream(xlpath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("sheet1");
		Row r=sh.createRow(row);
		Cell c=r.createCell(col);
		c.setCellValue("");
		FileOutputStream fos=new FileOutputStream("xlpath");
		wb.write(fos);
		
		
	}
}
