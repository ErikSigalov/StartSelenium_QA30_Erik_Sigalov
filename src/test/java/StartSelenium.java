import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSelenium {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        wd=new ChromeDriver();
        wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.navigate().forward();
        //open site
    }

    @Test
    public void testName(){
        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println("a : = " + elements.size());

        wd.findElement(By.tagName("div"));
        List<WebElement> d = wd.findElements(By.tagName("div"));
        System.out.println("div : = " + d.size());

        wd.findElement(By.tagName("h1"));
        List<WebElement> h = wd.findElements(By.tagName("h1"));
        System.out.println("h1 : = " + h.size());

        wd.findElement(By.tagName("input"));
        List<WebElement> i = wd.findElements(By.tagName("input"));
        System.out.println("input : = " + i.size());

        wd.findElement(By.tagName("br"));
        List<WebElement> b = wd.findElements(By.tagName("br"));
        System.out.println("br : = " + b.size());

        wd.findElement(By.tagName("button"));
        List<WebElement> but = wd.findElements(By.tagName("button"));
        System.out.println("button : = " + but.size());

        wd.findElement(By.tagName("script"));
        List<WebElement> s = wd.findElements(By.tagName("script"));
        System.out.println("script : = " + s.size());

        System.out.println("//////////////////////////////////////////////");

        wd.findElement(By.id("root"));
        List<WebElement> r = wd.findElements(By.id("root"));
        System.out.println("root : = " + r.size());

        System.out.println("*************************************************");

        wd.findElement(By.className("container"));
        List<WebElement> c = wd.findElements(By.className("container"));
        System.out.println("container : = " + c.size());

        wd.findElement(By.className("navbar-component_nav__1X_4m"));
        List<WebElement> n  = wd.findElements(By.className("navbar-component_nav__1X_4m"));
        System.out.println("navbar-component_nav__1X_4m : = " + n.size());

        wd.findElement(By.className("active"));
        List<WebElement> ac  = wd.findElements(By.className("active"));
        System.out.println("active : = " + ac.size());

        wd.findElement(By.className("login_login__3EHKB"));
        List<WebElement> lo  = wd.findElements(By.className("login_login__3EHKB"));
        System.out.println("login_login__3EHKB : = " + lo.size());

        System.out.println("----------------------------------------------");

        wd.findElement(By.linkText("HOME"));
        List<WebElement> H  = wd.findElements(By.linkText("HOME"));
        System.out.println("HOME : = " + H.size());

        wd.findElement(By.linkText("ABOUT"));
        List<WebElement> ab  = wd.findElements(By.linkText("ABOUT"));
        System.out.println("ABOUT : = " + ab.size());

        wd.findElement(By.linkText("LOGIN"));
        List<WebElement> log  = wd.findElements(By.linkText("LOGIN"));
        System.out.println("LOGIN : = " + log.size());

        System.out.println("################################################");

        wd.findElement(By.partialLinkText("HO"));
        List<WebElement> pr  = wd.findElements(By.partialLinkText("HO"));
        System.out.println("HO : = " + pr.size());

        wd.findElement(By.partialLinkText("ME"));
        List<WebElement> prd  = wd.findElements(By.partialLinkText("ME"));
        System.out.println("ME : = " + prd.size());

        wd.findElement(By.partialLinkText("GIN"));
        List<WebElement> prs  = wd.findElements(By.partialLinkText("GIN"));
        System.out.println("GIN : = " + prs.size());






    }
    @Test
    public void testName2(){

    }

    @AfterMethod
    public void postCondition()
    {
    wd.close();
    wd.quit();
    }

}
