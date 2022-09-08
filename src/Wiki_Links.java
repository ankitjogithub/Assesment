import java.net.URL;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */

/**
 * @author ankit
 *
 */
public class Wiki_Links {

	/**
	 * @param args
	 */
	
	static WebDriver driver;
	static int Cycle = 0;
	static int count =0;
	static int NoOfCycles =0;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	static void InitialSetup() throws Exception
	{
		/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe\\");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of cycles or links to be verified(value should be between 1 and 20):");
		NoOfCycles = scan.nextInt();
		do
		{
		System.out.print("Enter wiki webpage link:");
		String WikiPage = scan.nextLine();
		driver = new ChromeDriver();
		driver.get(WikiPage);
		List<WebElement> Listt = driver.findElements(By.tagName("a"));	
		System.out.println("The number of links in the Webpage is "+Listt.size());
		NoOfCycles--;
		}while(NoOfCycles != 0);*/
		  URL aURL = new URL("");
	}
	
	

}
