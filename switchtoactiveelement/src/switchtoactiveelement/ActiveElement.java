package switchtoactiveelement;

import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Guru Nanak College \n");
		Thread.sleep(2000);
		driver.close();
		
	}

}
