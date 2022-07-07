package Cross_Browsers.Cross_Browsers;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;

import org.testng.annotations.Test;

public class AutomationDemo {
	WebDriver driver;

	@Test()
	public void testOnChromeWithBrowserStackUrl() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ali.mahmoud\\eclipse-workspace\\Cross-Browsers\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS );
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		System.out
				.println("this is the test related to chrome Selenium homepage" + " " + Thread.currentThread().getId());

	}

	@Test()
	public void testOnChromeWithBrowserStackSignUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ali.mahmoud\\eclipse-workspace\\Cross-Browsers\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();

		System.out
				.println("this is the test related to chrome Selenium homepage" + " " + Thread.currentThread().getId());

	}

	@AfterClass
	public void close() {
		driver.quit();
	}

	/*
	 * @BeforeTest public void initialiseBrowser(String browserName) { switch
	 * (browserName) { case "chrome": WebDriverManager.chromedriver().setup();
	 * driver = new ChromeDriver(); break; case "edge":
	 * WebDriverManager.edgedriver().setup(); driver = new EdgeDriver(); break; case
	 * "firefox": WebDriverManager.firefoxdriver().setup(); driver = new
	 * ChromeDriver(); break; default: System.err.println("browsername is invalid");
	 * break;
	 * 
	 * } driver.manage().window().maximize(); }
	 * 
	 * @AfterClass public void close( ) { driver.quit(); }
	 * 
	 * @Test public void LaunchApp(String url) { driver.get(url); }
	 */

	/*
	 * WebDriver driver = null; public static String status = "passed"; String
	 * username = "user_name"; String access_key = "access_key";
	 * 
	 * String testURL = "https://todomvc.com/examples/react/#/"; String testURLTitle
	 * = "React • TodoMVC";
	 * 
	 * @BeforeTest
	 * 
	 * @Parameters(value = { "browser", "version", "platform", "resolution" })
	 * public void testSetUp(String browser, String version, String platform, String
	 * resolution) throws Exception // public void testSetUp() throws Exception {
	 * DesiredCapabilities capabilities = new DesiredCapabilities();
	 * capabilities.setCapability("build",
	 * "[LambdaTest] Demonstration of Selenium Automation Testing");
	 * capabilities.setCapability("name",
	 * "[LambdaTest] Demonstration of Selenium Automation Testing");
	 * capabilities.setCapability("platform", platform);
	 * capabilities.setCapability("browserName", browser);
	 * capabilities.setCapability("version", version);
	 * capabilities.setCapability("resolution", resolution);
	 * capabilities.setCapability("tunnel", false);
	 * capabilities.setCapability("network", true);
	 * capabilities.setCapability("console", true);
	 * capabilities.setCapability("visual", true);
	 * 
	 * try { driver = new RemoteWebDriver( new URL("https://" + username + ":" +
	 * access_key + "@hub.lambdatest.com/wd/hub"), capabilities); } catch
	 * (MalformedURLException e) { System.out.println("Invalid grid URL"); }
	 * System.out.println("Started session"); }
	 * 
	 * @Test(description = "To Do App on React App") public void
	 * test_element_addition() throws InterruptedException { driver.get(testURL);
	 * Thread.sleep(5000);
	 * 
	 * Selenium Java 3.141.59
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 5); WebDriverWait wait = new
	 * WebDriverWait(driver, Duration.ofSeconds(10));
	 * 
	 * Click on the Link By elem_new_item_locator =
	 * By.xpath("//input[@class='new-todo']"); WebElement elem_new_item =
	 * driver.findElement(elem_new_item_locator);
	 * 
	 * Add 5 items in the list Integer item_count = 5;
	 * 
	 * for (int count = 1; count <= item_count; count++) { Enter the text box for
	 * entering the new item elem_new_item.click();
	 * elem_new_item.sendKeys("Adding a new item " + count + Keys.ENTER);
	 * Thread.sleep(2000); }
	 * 
	 * WebElement temp_element;
	 * 
	 * Now that the items are added, we mark the top three items as completed for
	 * (int count = 1; count <= item_count; count++) { Integer fixed_cta_count = 1;
	 * 
	 * Enter the text box for entering the new item Create a varying string to
	 * create a new XPath String xpath_str = "//ul[@class='todo-list']/li[" +
	 * fixed_cta_count + "]" + "//input[@class='toggle']"; temp_element =
	 * driver.findElement(By.xpath(xpath_str));
	 * 
	 * temp_element.click(); Thread.sleep(2000); Toggle button to destroy
	 * driver.findElement(By.xpath(
	 * "//li[@class='completed']//button[@class='destroy']")).click();
	 * Thread.sleep(1000); }
	 * 
	 * Once you are outside this code, the list would be empty }
	 * 
	 * @AfterTest public void tearDown() { if (driver != null) {
	 * ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
	 * driver.quit(); } }
	 */
}
