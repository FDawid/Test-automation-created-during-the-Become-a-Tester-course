import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSetup  {

    String projectLocation = System.getProperty("user.dir");
    String ultimateQAURL = "https://ultimateqa.com/simple-html-elements-for-automation/";
    WebDriver driver;

    @BeforeEach
    public void setup(){

        //biblioteka WebdriverManager - io.github.boniegarcia
        System.setProperty("webdriver.chrome.driver", projectLocation + "/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ultimateQAURL);

    }

    @AfterEach
    public void teardown(){
        //różnica między driver.close() a driver.quit()
        driver.close();
    }

    // słowo kluczowe void - zwracane z funkcji
    // słowo kluczowe static {
}
