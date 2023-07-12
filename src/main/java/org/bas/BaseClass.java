package org.bas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static String pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public static void passText(String txt, WebElement ele) {
		ele.sendKeys(txt);
	}
	
	public static void closeEntireBrowser() {
		driver.quit();
	}
	
	public static void clickBtn(WebElement ele) {
		ele.click();
	}
	
	public static void screenShot (String imgName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("Location.imgName.png");
		FileUtils.copyFile(image, f);	
	}
	
	public static Actions a;
	
	public static void moveTheCursor(WebElement targetWebElement) {
		a = new Actions(driver);
		a.moveToElement(targetWebElement).perform();
	}
	
	public static void dragDrop(WebElement dragWebElement, WebElement dropElement) {
		a = new Actions(driver);
		a.dragAndDrop(dragWebElement, dropElement).perform();
	}
	
	public static JavascriptExecutor js;
	
	public static void scrollThePage(WebElement tarWebEle) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", tarWebEle);
	}
	
	public static void scroll(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public static void excelRead(String sheetName, int rowNum, int cellNum) throws IOException {
		File f = new File("excel location.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fs);
		Sheet sheet = wb.getSheet("Sheet1");
		Row getrow1 = sheet.getRow(rowNum);
		Cell getcell1 = getrow1.getCell(cellNum);
		
		int cellType = getcell1.getCellType();
		
	if (cellType==1) {
		String string = getcell1.getStringCellValue();
		System.out.println(string);
	}
	else if (DateUtil.isCellDateFormatted(getcell1)) {
		Date date = getcell1.getDateCellValue();
		SimpleDateFormat sf = new SimpleDateFormat("dd-MMMM-yy");
		String format1 = sf.format(date);
		System.out.println(format1);
	}
	else {
		double d = getcell1.getNumericCellValue();
		long l = (long)d;
		String value = String.valueOf(l);
		System.out.println(value);
	}
	}
	
	public static void createNewExcelFile(int rowNum, int cellNum, String newData) throws IOException {
		File f = new File("C:\\Users\\User\\eclipse-workspace\\MavenSample\\excel\\new file.xlsx");	
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet("Sheet1");
		Row getRow = sheet.createRow(rowNum);
		Cell getCell = getRow.createCell(cellNum);
		getCell.setCellValue(newData);
		FileOutputStream fs = new FileOutputStream(f);
		wb.write(fs);
	}
	
	public static void createCell(int rowNum, int cellNum, String newData) throws IOException {
		File f = new File("C:\\\\Users\\\\User\\\\eclipse-workspace\\\\MavenSample\\\\excel\\\\new file.xlsx");	
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.getSheet("Sheet1");
		Row r = sheet.getRow(rowNum);
		Cell c = r.createCell(cellNum);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
	public static void createRow(int creRow, int creCell, String newData) throws IOException {
		File f = new File("C:\\\\Users\\\\User\\\\eclipse-workspace\\\\MavenSample\\\\excel\\\\new file.xlsx");	
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.getSheet("Sheet1");
		Row r = sheet.createRow(creRow);
		Cell c = r.createCell(creCell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
	public static void updateDataToParticularCell(int getTheRow, int getTheCell, String existingData, String writeNewData) throws IOException{
		File f = new File("excel location.xlsx");	
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.getSheet("Sheet1");
		Row r = sheet.getRow(getTheRow);
		Cell c = r.getCell(getTheCell);
		String str = c.getStringCellValue();
		if (str.equals(existingData)) {
			c.setCellValue(writeNewData);
		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
	
	
	
	
	
	
	
	
	
}
