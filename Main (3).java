import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
	
	driver.findElement(By.xpath("//a[@href='#']")).click();
	try {
		Thread.sleep(2000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	driver.switchTo().alert().accept();
	
	
	
	driver.findElement(By.xpath("//a[@id='prompt']")).click();
	try {
		Thread.sleep(2000);
	}
	catch(InterruptedException e ) {
		e.printStackTrace();
	}
	driver.switchTo().alert().accept();
	
	
	
	driver.findElement(By.xpath("//a[@id='confirm']")).click();
	try {
		Thread.sleep(2000);
		}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	driver.switchTo().alert().accept();
	
	System.out.println("Program is Successfully");
	
	driver.close();
}
}

