import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
    @Test
    public void googleSearch() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();

        browser.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://www.google.com?hl%3Dpt-PT&dsh=S-1660725463:1701250085509465&ec=GAlA8wE&flowEntry=SignUp&flowName=GlifWebSignIn&hl=pt-PT&theme=glif&TL=AHNYTIRI8LAyo_xzo95x2daGTUxlNGfioVrC4KJVKcz-ufr_hYQ9YgDEkR52stAd");
        browser.findElement(By.xpath("//*[@id=\"firstName\"]")).click();
        String nickname = "João Vitor";
        browser.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(nickname);
        browser.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span")).click();
    }

}
