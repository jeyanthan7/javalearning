package basic;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class excelSheet {

    // dependency apache poi , poiooxml needed
    public static void main(String[] args) throws IOException {
        String path = "./check.xlsx";
        XSSFWorkbook workbook = new XSSFWorkbook(path);
        XSSFSheet sheet = workbook.getSheet("Sheet7");
        XSSFRow row = sheet.getRow(2);
        XSSFCell cell = row.getCell(0);
        String uname = cell.getStringCellValue();
        System.out.println(uname);
        cell = row.getCell(1);
        System.out.println("password is " + cell.getStringCellValue());

    }
}
