import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.navigate().to("http://google.com");		
		driver.close();
		

	}

}
