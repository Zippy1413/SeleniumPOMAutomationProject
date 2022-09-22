package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TC_1 {

	public static void main(String[] args) throws InterruptedException{
		
		String driverPath = "C:\\firefoxdriver\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
        WebDriver driver = new FirefoxDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.imdb.com/");
		//sorting, searching and open movie
		driver.findElement(By.id("iconContext-arrow-drop-down")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"navbar-search-category-select-contents\"]/ul/li[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("suggestion-search")).sendKeys("black panther");
		Thread.sleep(2000);
		driver.findElement(By.id("suggestion-search-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[ contains (text(), \"Black Panther: Wakanda Forever\" ) ]")).click();
		Thread.sleep(5000);
		//open menu
		driver.findElement(By.id("imdbHeader-navDrawerOpen--desktop")).click();
		Thread.sleep(1000);
		//close menu list
		driver.findElement(By.xpath("//*[@id=\"imdbHeader\"]/div[2]/aside/div/div[1]/label")).click();
		Thread.sleep(2000);
		// Open All topics list
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[1]/div/div[2]/button[1]")).click();
		Thread.sleep(2000);
		// Close All topics list
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/button")).click();
		Thread.sleep(2000);
		// popularity
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[2]/div[2]/div/div/a/div/div")).click();
		Thread.sleep(2000);
		// go to home page
		driver.findElement(By.xpath("//*[@id=\"home_img_holder\"]")).click();
		Thread.sleep(2000);
		// slider images changed
		for (int i = 0; i < 6; i++) {
			driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[3]/div[1]/div/div/div[1]/div/div[3]/div")).click();
			}
		Thread.sleep(2000);
		driver.close();
		
	}

}
