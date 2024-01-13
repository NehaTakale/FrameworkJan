package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	public static FileInputStream fis;
	public static Properties prop;

	public BaseClass() {
		File f = new File(System.getProperty("user.dir")+"\\src/main/java\\ConfigurationLayer\\config.properties");
		try{	
		 fis = new FileInputStream(f);
		 prop = new Properties();
			prop.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
					
					
	}

	public static WebDriver driver;

	public static void initialization(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browsername.equalsIgnoreCase("Incognito")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--Incognito");
			driver = new ChromeDriver(opt);
		} else if (browsername.equalsIgnoreCase("headless")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--headless");
			driver = new ChromeDriver(opt);
		} else {
			System.err.println("Please enter valid browsername");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
	}
}
