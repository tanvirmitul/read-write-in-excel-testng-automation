package testRunner;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ReadWriteExclPage;
import setup.Setup;
import java.io.IOException;

public class ReadWriteExclTestRunner extends Setup {
    ReadWriteExclPage readWriteExclPage;
    @Test
    public void getBrowser(){
        driver.get("https://www.google.com/");
    }
    @Test(priority = 1)
    public void readWriteData1() throws IOException, InterruptedException {
        readWriteExclPage = new ReadWriteExclPage(driver);
        readWriteExclPage.readWriteData(1,4,2);
    }
    @Test(priority = 2)
    public void readWriteData2() throws InterruptedException, IOException {
        readWriteExclPage = new ReadWriteExclPage(driver);
        readWriteExclPage.textSearch.clear();
        Thread.sleep(2000);
        readWriteExclPage.readWriteData(2,2,1);
    }
    @Test(priority = 3)
    public void readWriteData3() throws InterruptedException, IOException {
        readWriteExclPage = new ReadWriteExclPage(driver);
        readWriteExclPage.textSearch.clear();
        Thread.sleep(2000);
        readWriteExclPage.readWriteData(3,10,2);
    }
    @Test(priority = 4)
    public void readWriteData4() throws InterruptedException, IOException {
        readWriteExclPage = new ReadWriteExclPage(driver);
        readWriteExclPage.textSearch.clear();
        Thread.sleep(2000);
        readWriteExclPage.readWriteData(4,3,1);
    }
    @Test(priority = 5)
    public void readWriteData5() throws InterruptedException, IOException {
        readWriteExclPage = new ReadWriteExclPage(driver);
        readWriteExclPage.textSearch.clear();
        Thread.sleep(2000);
        readWriteExclPage.readWriteData(5,8,3);
    }
    @Test(priority = 6)
    public void readWriteData6() throws InterruptedException, IOException {
        readWriteExclPage = new ReadWriteExclPage(driver);
        readWriteExclPage.textSearch.clear();
        Thread.sleep(2000);
        readWriteExclPage.readWriteData(6,7,3);
    }
    @Test(priority = 7)
    public void readWriteData7() throws InterruptedException, IOException {
        readWriteExclPage = new ReadWriteExclPage(driver);
        readWriteExclPage.textSearch.clear();
        Thread.sleep(2000);
        readWriteExclPage.readWriteData(7,2,9);
    }
    @Test(priority = 8)
    public void readWriteData8() throws InterruptedException, IOException {
        readWriteExclPage = new ReadWriteExclPage(driver);
        readWriteExclPage.textSearch.clear();
        readWriteExclPage.readWriteData(8,9,1);
    }
    @Test(priority = 9)
    public void readWriteData9() throws InterruptedException, IOException {
        readWriteExclPage = new ReadWriteExclPage(driver);
        readWriteExclPage.textSearch.clear();
        Thread.sleep(2000);
        readWriteExclPage.readWriteData(9,4,1);
    }
    @Test(priority = 10)
    public void readWriteData10() throws InterruptedException, IOException {
        readWriteExclPage = new ReadWriteExclPage(driver);
        readWriteExclPage.textSearch.clear();
        Thread.sleep(2000);
        readWriteExclPage.readWriteData(10,6,10);
    }
    @AfterTest
    public  void browserClose(){
        driver.quit();
    }

}
