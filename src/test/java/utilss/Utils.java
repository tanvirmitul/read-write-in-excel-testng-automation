package utilss;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Utils {
  public static String[] readData() throws IOException {
    String src = "./src/test/resources/read&write.xlsx";
    int day=getDay();
    FileInputStream fis = new FileInputStream(src);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    XSSFSheet sheet = workbook.getSheetAt(day-1);

    String [] str=new String[11];

    for(int i=1;i<str.length;i++){
      str[i]=sheet.getRow(i).getCell(1).getStringCellValue();
    }
    return str;

  }
  public static void writeData(int rownum,int cellnum,String name) throws IOException {
    String src = "./src/test/resources/read&write.xlsx";
    int day=getDay();
    FileInputStream fis = new FileInputStream(src);
    XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
    XSSFSheet sheet = xssfWorkbook.getSheetAt(day-1);
    sheet.getRow(rownum).getCell(cellnum).setCellValue(name);
    FileOutputStream fos=new FileOutputStream(src);
    xssfWorkbook.write(fos);
    xssfWorkbook.close();
  }
  public static int getDay(){
    Calendar calendar=Calendar.getInstance();
    //System.out.println(calendar.getTime().toString());
    int day=calendar.get(Calendar.DAY_OF_WEEK);
    //System.out.println(day);
    return day;
  }
  
}

