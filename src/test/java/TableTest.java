import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TableTest {
    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

    }
    @Test
    public void tableTestCss(){
        WebElement canada = wd.findElement(By.cssSelector("#customers tr:nth-child(8) td:last-child"));
        String  text = canada.getText();

        System.out.println(text);
        Assert.assertEquals(text,"Canada");
        Assert.assertTrue(text.contains("Canada"));

    }
    @Test
    public void tableHomework(){
        WebElement row4 = wd.findElement(By.cssSelector("#customers tr:nth-child(4)"));
        String tx = row4.getText();

        System.out.println(tx);

        WebElement fr = wd.findElement(By.cssSelector("#customers tr:nth-child(4) td:nth-child(2)"));
        String ch = fr.getText();

        Assert.assertEquals(ch,"Francisco Chang");
        Assert.assertTrue(ch.contains("Francisco Chang"));
        System.out.println(ch);
        //Francisco Chang?
        //Assert
    }

    @Test
    public void tableHW2(){
       
      //print numbers of rows
      //print numbers of columns
      //print row 3
      //print lastColumns
      //print Maria Anders
        
    }



    @AfterMethod
    public void tearDown(){

        wd.quit();
    }
}
