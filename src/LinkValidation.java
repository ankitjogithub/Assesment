import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkValidation {
	
static WebDriver driver;
static int Cycle = 0;
static int count =0;
static int NoOfCycles =0;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Links();
	}
	
	
	static void Links()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe\\");
		//driver = new ChromeDriver();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter wiki webpage link:");
		String WikiPage = scan.nextLine();
		driver = new ChromeDriver();
		driver.get(WikiPage);
		List<WebElement> Listt = driver.findElements(By.tagName("a"));	
		System.out.println("The number of links in the Webpage is "+Listt.size());
		do
		{
		System.out.print("Enter number of cycles or links to be verified(value should be between 1 and 20):");
		NoOfCycles = scan.nextInt();
		}while(NoOfCycles > 20);
		
		for(WebElement AllLinks : Listt)
		{
			if(count == NoOfCycles)   // will break from loop after verifying specified number of cycles. 
			{
				break;
			}
			String Hypertext_Links = AllLinks.getAttribute("href");
			System.out.println(Hypertext_Links);
			verifyy(Hypertext_Links);	
			count++;
		}
	}
	
    static void verifyy(String links)     //accepts and verify wiki links
		{
			try {
				URL url1 = new URL(links);
				HttpURLConnection httpURLconnect = (HttpURLConnection)url1.openConnection();//to open a connection
				httpURLconnect.setConnectTimeout(3000);
				httpURLconnect.connect();      // produce an http connection
				if(httpURLconnect.getResponseCode() == 200)
				{
					System.out.println(httpURLconnect.getResponseMessage());
				}
				else if(httpURLconnect.getResponseCode() >= 400)   //httpURLconnect.H ) //HTTP_NOT_FOUND
				{
					//System.out.println("in a failure response");
					System.out.println(httpURLconnect.getResponseMessage());
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	

