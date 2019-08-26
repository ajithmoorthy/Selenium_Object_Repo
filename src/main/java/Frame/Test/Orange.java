package Frame.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orange {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver webdriver = new ChromeDriver();
		webdriver.manage().window().maximize();
		webdriver.get("https://www.orangehrm.com/");
		WebElement feature = webdriver.findElement(By.linkText("Features"));
		feature.click();
		WebElement services = webdriver.findElement(By.className("link"));
		services.click();
		WebElement success = webdriver.findElement(By.linkText("Success Stories"));
		success.click();
		WebElement partners = webdriver.findElement(By.xpath("//div[@id=\"header-navbar\"]/ul[1]/li[4]/a"));
		partners.click();
		WebElement blog = webdriver.findElement(By.linkText("Blog"));
		blog.click();

		WebElement allcatagories = webdriver
				.findElement(By.xpath("//select[@class=\"cat-chooser\" and @id=\"cat-chooser\"]"));
		Select w = new Select(allcatagories);
		w.selectByIndex(7);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement acceptcookies = webdriver
				.findElement(By.xpath("//a[@class=\"optanon-allow-all accept-cookies-button\"]"));
		acceptcookies.click();
		WebElement days30freetrail = webdriver
				.findElement(By.xpath("//a[contains(@class,'btn-orange trial-btn pulse')]"));
		days30freetrail.click();
		WebElement url = webdriver.findElement(By.id("Form_submitForm_subdomain"));
		url.sendKeys("www.ajith.in");
		WebElement firstname1 = webdriver.findElement(By.name("FirstName"));
		firstname1.sendKeys("moorthy");
		WebElement lastname1 = webdriver.findElement(By.id("Form_submitForm_LastName"));
		lastname1.sendKeys("periyasamy");
		WebElement email1 = webdriver.findElement(By.id("Form_submitForm_Email"));
		email1.sendKeys("trainee@gmail.com");
		WebElement job1 = webdriver.findElement(By.id("Form_submitForm_JobTitle"));
		job1.sendKeys("trainee");
		WebElement noOfemp1 = webdriver.findElement(By.name("NoOfEmployees"));
		Select select2 = new Select(noOfemp1);
		select2.selectByIndex(4);
		WebElement company1 = webdriver.findElement(By.id("Form_submitForm_CompanyName"));
		company1.sendKeys("atmecs");
		WebElement industry = webdriver.findElement(By.id("Form_submitForm_Industry"));
		Select set = new Select(industry);
		set.selectByIndex(3);
		WebElement phone1 = webdriver.findElement(By.id("Form_submitForm_Contact"));
		phone1.sendKeys("1356427576");
		WebElement country1 = webdriver.findElement(By.id("Form_submitForm_Country"));
		Select select3 = new Select(country1);
		select3.selectByIndex(3);
		webdriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement element = webdriver.findElement(By.xpath("//a[contains(@class,'btn-orange contact-ohrm')]"));
		element.click();
		webdriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement firstname = webdriver.findElement(By.name("firstname"));
		firstname.sendKeys("ajith");
		WebElement lastname = webdriver.findElement(By.name("lastname"));
		lastname.sendKeys("periyasamy");
		WebElement company = webdriver.findElement(By.name("company"));
		company.sendKeys("atmecs");
		WebElement noOfemp = webdriver.findElement(By.name("numemployees"));
		Select select = new Select(noOfemp);
		select.selectByIndex(6);
		WebElement phone = webdriver.findElement(By.name("phone"));
		phone.sendKeys("1356427576");
		WebElement job = webdriver.findElement(By.name("jobtitle"));
		job.sendKeys("trainee");
		WebElement email = webdriver.findElement(By.name("email"));
		email.sendKeys("trainee@gmail.com");
		WebElement country = webdriver.findElement(By.name("country"));
		Select select1 = new Select(country);
		select1.selectByIndex(3);
		WebElement comment = webdriver.findElement(By.name("message"));
		comment.sendKeys("tirupur");
		webdriver.quit();
	}
}
