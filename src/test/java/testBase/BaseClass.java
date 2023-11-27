package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;





public class BaseClass {
	
	public static WebDriver driver;
	public Logger logger;
	public ResourceBundle rb;
	String timestamp;
	
	@BeforeClass (groups= {"Regression","Smoke"})
	@Parameters("browser")
	public void setup(String br) {
		
		rb=ResourceBundle.getBundle("config");
		
		logger = LogManager.getLogger(this.getClass());
		
		/*ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		options.setExperimentalOption("excludeSwitches", new String[]{"disable-popup-blocking"});*/
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\salad\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\salad\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		//WebDriverManager.chromedriver().setup();
		if(br.equals("chrome")) {
			driver = new ChromeDriver();
		}
			else if(br.equals("edge")) {
				driver = new EdgeDriver();
			}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(rb.getString("url"));
		driver.manage().window().maximize();
		
		
	}
    
	@AfterClass(groups= {"Regression","Smoke"})
	public void teardown() {
		
		driver.quit();
			
	}
	
	public String randomString() {

		String generatedString=RandomStringUtils.randomAlphabetic(5);
				return (generatedString);
			}

			public String randomNumber() {

			String generatednum=RandomStringUtils.randomNumeric(10);
				return (generatednum);
			}
			
			public String randomAlphaNumeric() {
				String st = RandomStringUtils.randomAlphabetic(4);
				String num = RandomStringUtils.randomNumeric(3);
				
				return (st+""+num);
			}
			
	public String CaptureScreenshot(String testname) {
		
		//SimpleDateFormat df  = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		//Date d = new Date();
		//String timestamp = df.format(d);

		// we can combine all the 3 statements into single statement
		
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()) ;
		
		TakesScreenshot ts = (TakesScreenshot)driver; 
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"//screenshots//" + testname + "_" +timestamp+ "/image.png";
		
				try {
					FileUtils.copyFile(srcfile, new File(destination));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.getMessage();
				}
		
		return destination; 
		
		
	}

}
