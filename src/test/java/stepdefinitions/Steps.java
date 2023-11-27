
package stepdefinitions;

	import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;
	import java.util.concurrent.TimeUnit;

	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.Assert;

	import io.cucumber.java.After;
	import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import pageObjects.Homepage;
	import pageObjects.LoginPage;
	import pageObjects.Myaccountpage;
import utilities.DataReader;

	public class Steps {
		
		public Logger logger; //for logging
	     public ResourceBundle rb; // for reading properties file
	     public String br; //to store browser name
	     
	     
		 WebDriver driver;
		LoginPage lp;
		Myaccountpage map;
		Homepage hp;
		List<HashMap<String, String>> datamap; //Data driven
		
		
		@Before
		public void setup() {
			logger = LogManager.getLogger(this.getClass());
			rb= ResourceBundle.getBundle("config");
			br=rb.getString("browser");
		}


		
			@After
		public void teardown(Scenario scenario) {
			System.out.println("scenario status is "+scenario.getStatus());
			if(scenario.isFailed()) {
				
				TakesScreenshot ts= (TakesScreenshot)driver;
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", scenario.getName());
			}
			driver.quit();


		}
		@Given("I want to open chrome browser")
		public void i_want_to_open_chrome_browser() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\salad\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			System.setProperty("webdriver.edge.driver", "C:\\Users\\salad\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			if(br.equals("chrome")) {
				driver = new ChromeDriver();
			}
				else if(br.equals("edge")) {
					driver = new EdgeDriver();
				}
			
		    //throw new io.cucumber.java.PendingException();
		}
		
		@Given("open Demo webshop applicaion with url {string}")
		public void open_demo_webshop_applicaion_with_url(String url) {
		    driver.get(url);
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		   
		}
		@Given("click on Login link")
		public void click_on_login_link() {
			
			logger.info("User Login process started");
			lp=new LoginPage(driver);
		    lp.loginlinkclick();
		   
		}
		@When("enter username as {string} And enter password as {string}")
		public void enter_username_as_and_enter_password_as(String username, String password) {
		    lp.credentials(username, password);
		   
		}
		@When("click on Login button")
		public void click_on_login_button() {
		    lp.loginsubmit();
		   
		}
		@When("click on username {string}")
		public void click_on_username(String string) {
			map=new Myaccountpage(driver);
		    map.myaccountclick();
		    logger.info("user clciked on username");
		   
		}
		@Then("we should able to see {string} text on screen")
		public void we_should_able_to_see_text_on_screen(String loginmsg) {
			map=new Myaccountpage(driver);
			boolean targetpage=map.myaccountdetailsdisplayed();
		  if(targetpage) {
			 
			  logger.info("Login Pass");
			  Assert.assertTrue(true);
		  }
		  else {
			  logger.info("Login Fail");
			  Assert.assertTrue(false);
		  }
		   
		}
		@Then("user should also be able to see {string} option on right side of the page")
		public void user_should_also_be_able_to_see_option_on_right_side_of_the_page(String logout) {
		    lp.logout();
		    logger.info("Logged out successfully");  
		}
	

	
	
	//***DataDriven Testing with Excel***//
	/*
		@Then("check user able to login by passing uname and passwd with excel row {string}")
		public void check_user_able_to_login_by_passing_uname_and_passwd_with_excel_row(String rows) {
	     datamap=DataReader.data(System.getProperty("user.dir")+".\\test-data\\DataDriven.xlsx", "LoginData");
	  
		int index=Integer.parseInt(rows)-1;
	        String uname= datamap.get(index).get("username");
	        String passwd= datamap.get(index).get("password");
	        String exp_res= datamap.get(index).get("res");
	        
	        lp=new LoginPage(driver);
		    lp.loginlinkclick();
		    lp.credentials(uname, passwd);
		    lp.loginsubmit();
		    map=new Myaccountpage(driver);
		    map.myaccountclick();
		    try {
				boolean targetpage=map.myaccountdetailsdisplayed();
				if(exp_res.equals("Valid"))
				{
				    if(targetpage==true)
				    {
				    	
				        map.logout();
				        Assert.assertTrue(true);
				    }
				    else
				    {
				        Assert.assertTrue(false);
				    }
				}

				if(exp_res.equals("Invalid"))
				{
				    if(targetpage==true)
				    {
				        map.logout();
				        Assert.assertTrue(false);
				    }
				    else
				    {
				        Assert.assertTrue(true);
				    }
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    driver.close();
	}*/

	
		
       
	}
	
	



