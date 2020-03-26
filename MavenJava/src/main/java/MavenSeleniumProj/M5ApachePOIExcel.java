package MavenSeleniumProj;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class M5ApachePOIExcel {
	// need to setup dependencies in pom.xml -> get from mvnrepository website
		// you can create maven project from eclipse as well
		// need poi-ooxml and poi dependencies
	// XSSFWorkbook will allow sheet from excel
	
	public static void main(String[] args) throws IOException {
		ArrayList<String> data = getData("Sheet1", "Testcases", "Purchase");
		printList(data);
		
	}
	
	public static <T> void printList(List<T> list) {
		for (T item: list) {
			System.out.println(item.toString());
		}
	}
	
	public static ArrayList<String> getData(String sheetName, String colName, String rowName) throws IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\nsun\\Desktop\\demo.xlsx");
		
		// Ararylist to store the cells in a row
		ArrayList<String> data = new ArrayList<String>();
		
		// takes fileinputstream object
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		
		int count = wb.getNumberOfSheets();
		for (int i = 0; i < count; i++) {
			if (wb.getSheetName(i).equalsIgnoreCase(sheetName)) {
				//XSSFSsheet is where the majority of tests is run on
				XSSFSheet sheet = wb.getSheetAt(i);
				
				// check first row for "Testcases" col, then scan "Testcases" col for "Purchases" row				
				// once you find purchase row then pull the row data into test
				Iterator<Row> rows = sheet.iterator();
				Row row = rows.next();
				Iterator<Cell> cells = row.cellIterator();
				
				int colNum = -1;
				
				while (cells.hasNext()) {
					Cell c = cells.next();
//					System.out.println(c.getStringCellValue());
					if (c.getStringCellValue().equals(colName)) {
						colNum = c.getColumnIndex();
						break;
					}
				}
				
				while(rows.hasNext()) {
					row = rows.next();
					if (row.getCell(colNum).getStringCellValue().equals(rowName)) {
						break;
					}
				}
				
				// now row is the Purchase row
				cells = row.cellIterator();
				while (cells.hasNext()) {
					// add cell to data arraylist
					// what if we don't know if value is numeric or string?
					
					Cell c = cells.next();
					if (c.getCellType() == CellType.NUMERIC) {
//						data.add((int) c.getNumericCellValue() + "");
						data.add(NumberToTextConverter.toText(c.getNumericCellValue()));
					}
					else {
						data.add(c.getStringCellValue());
					}
					
				}
			}
			
		}
		wb.close();
		return data;
	}
}
