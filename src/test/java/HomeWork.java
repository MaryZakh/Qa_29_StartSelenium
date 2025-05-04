import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void classwork(){
        WebElement element = wd.findElement(By.cssSelector("[name = 'login']"));
        String text = element.getText();
        System.out.println(text);

        WebElement form = wd.findElement(By.xpath("//form"));
        String textForm = form.getText();
        System.out.println("**********************");
        System.out.println(textForm);

        WebElement html = wd.findElement(By.tagName("html"));
        String textAll = html.getText();
        System.out.println("**********************");
        System.out.println(textAll);

        WebElement br = wd.findElement(By.tagName("br"));
        System.out.println("**********************");
        System.out.println("text br --->" + br.getText());

    }



    @Test
    public void cssSelectors() {
        //by tag name
        WebElement body = wd.findElement(By.tagName("body"));
        WebElement body1 = wd.findElement(By.cssSelector("body"));
        WebElement body2  = wd.findElement(By.xpath("//body"));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1_1 = wd.findElement(By.cssSelector("h1"));
        WebElement h1_2 = wd.findElement(By.xpath("//h1"));

        //by class
        WebElement element = wd.findElement(By.className("container"));
        WebElement element1 = wd.findElement(By.cssSelector(".container"));
        WebElement element10 = wd.findElement(By.xpath("//*[@class = 'container']"));

        WebElement element2 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement element3 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement element11 = wd.findElement(By.xpath("//*[@class = 'navbar-component_nav__1X_4m']"));

        //by id
        WebElement element4 = wd.findElement(By.id("root"));
        WebElement element5 = wd.findElement(By.cssSelector("#root"));
        WebElement element12 = wd.findElement(By.xpath("//*[@id='root']"));

        //by attribute

        WebElement element6 = wd.findElement(By.cssSelector("[href = '/home']"));
        WebElement element13 = wd.findElement(By.xpath("//*[@href='/home']"));

        WebElement element7 = wd.findElement(By.cssSelector("[placeholder = 'Email']"));
        WebElement element14 = wd.findElement(By.xpath("//*[@placeholder = 'Email']"));

        WebElement element16 = wd.findElement(By.cssSelector("[placeholder ^= 'Em']"));
        WebElement element17 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Em')]"));

        WebElement element18 = wd.findElement(By.cssSelector("[placeholder$='il']"));
        WebElement element19 = wd.findElement(By.xpath("//input[contains(@placeholder,'il')]"));

        WebElement element20 = wd.findElement(By.cssSelector("[placeholder*='ma']"));
        WebElement element21 = wd.findElement(By.xpath("//input[contains(@placeholder,'ma')]"));

        WebElement element8 = wd.findElement(By.cssSelector("[name = 'password']"));
        WebElement element9 = wd.findElement(By.name("password"));
        WebElement element15 = wd.findElement(By.xpath("//*[@name = 'password']"));


        WebElement passwordInp = wd.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement passwordInp1 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Pas')]"));
        WebElement passwordInp2 = wd.findElement(By.xpath("//input[contains(@placeholder,'rd')]"));

        //parent
        WebElement el2 = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el3 = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el4 = wd.findElement(By.xpath("//h1/.."));

        //ancestor
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::*"));//all
        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor::div"));//two options
        WebElement el7 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));//one options

        //ancestor-or-self
        List<WebElement> list3 = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        List<WebElement> list4 = wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling
        List<WebElement>list5 = wd.findElements(By.xpath("//a[last()]/preceding-sibling::*"));
        WebElement h1_3 = wd.findElement(By.xpath("//a[3]/preceding-sibling::h1"));

    }

}
