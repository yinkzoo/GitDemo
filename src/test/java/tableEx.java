import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableEx {
    public static void main(String[] args) throws InterruptedException {
        int sum=0;
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/29798/stz-vs-gaw-24th-match-caribbean-premier-league-2020");

       WebElement table= driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
       int rowCount=table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
       int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']  div:nth-child(3) ")).size();
       for (int i=0;i<count-2;i++)
       {
           //System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']  div:nth-child(3) ")).get(i).getText());
           String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']  div:nth-child(3) ")).get(i).getText();
           int valueInteger=Integer.parseInt(value);
           sum=sum+valueInteger;
       }

           String Extra= driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
        int extrasvalue=Integer.parseInt(Extra);
        int TotalSumValue=sum+extrasvalue;
        System.out.println(TotalSumValue);

        //System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
        String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
        int actualTotalValue=Integer.parseInt(ActualTotal);
        if (actualTotalValue==TotalSumValue)
        {
            System.out.println("Count Matches");
        }
        else
        {
            System.out.println("Count Fail");
        }
       


    }

}
