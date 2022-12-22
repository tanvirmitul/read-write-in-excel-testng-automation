package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilss.Utils;
import java.io.IOException;
public class ReadWriteExclPage {
    @FindBy(name = "q")
    public WebElement textSearch;
    String longtString;
    String shortString;
    public ReadWriteExclPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    public  void goTOBrowser(String name){
        textSearch.sendKeys(name);
    }

    public void readWriteData(int index,int longindex,int shortindex) throws IOException, InterruptedException {
        String[] str2 = Utils.readData();
        String name = str2[index];
        textSearch.sendKeys(name);
        Thread.sleep(2000);
        int i;
        for (i = 1; i <= 10; i++) {
            textSearch.sendKeys(Keys.ARROW_DOWN);
            if (i == longindex) {
                longtString = textSearch.getAttribute("value");
            }
            if (i == shortindex) {
                shortString = textSearch.getAttribute("value");
            }
        }
        System.out.println(longtString);
        System.out.println(shortString);
        Utils.writeData(index, 2, longtString);
        Utils.writeData(index, 3, shortString);
        Thread.sleep(3000);
    }
}
