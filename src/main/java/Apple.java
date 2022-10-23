import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @PackageName: PACKAGE_NAME
 * @ClassName: Apple
 * @Description:
 * @author: sdl
 * @date: 2022/10/22/11:00
 */
public class Apple {


    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("---")

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.baidu.com");


    }


}
