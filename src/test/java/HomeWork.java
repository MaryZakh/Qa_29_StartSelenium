import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssSelectors() {
        //by tag name
        WebElement body = wd.findElement(By.tagName("body"));
        WebElement body1 = wd.findElement(By.cssSelector("body"));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1_1 = wd.findElement(By.cssSelector("h1"));

        //by class
        WebElement element = wd.findElement(By.className("container"));
        WebElement element1 = wd.findElement(By.cssSelector(".container"));

        WebElement element2 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement element3 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        //by id
        WebElement element4 = wd.findElement(By.id("root"));
        WebElement element5 = wd.findElement(By.cssSelector("#root"));

        //by attribute

        WebElement element6 = wd.findElement(By.cssSelector("[href = '/home']"));
        WebElement element7 = wd.findElement(By.cssSelector("[placeholder = 'Email']"));

        WebElement element8 = wd.findElement(By.cssSelector("[name = 'password']"));
        WebElement element9 = wd.findElement(By.name("password"));


    }

}
