package DataDrivenTest;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) throws IOException {
	
		FileInputStream file=new FileInputStream("F:\\Test.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		XSSFSheet sheet=book.getSheet("sheet1");
		//getting sheet values through name
		
		//XSSFSheet sheet=book.getSheetAt(0);
		//getting sheet values through index
		
		int row=sheet.getLastRowNum(); //returns the number of row
		int col=sheet.getRow(0).getLastCellNum(); //returns the number of column
		
		for(int i=0;i<=row;i++)
		{
			XSSFRow currentrow=sheet.getRow(i);
			
			for(int j=0;j<=col;j++)
			{
			XSSFCell value=currentrow.getCell(j);	 
			System.out.print("  "+ value);
			}
			System.out.println();
		}
		
		
		
		

	}

}
