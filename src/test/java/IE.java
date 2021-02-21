import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {
    public static void main(String[] args) {
        // write your code here
        System.setProperty("webdriver.ie.driver","C:\\Program Files (x86)\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
    }
}
