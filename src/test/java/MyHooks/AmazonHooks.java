package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	
	@Before("@Smoke" )
	public void setUp_browser(Scenario sc) {
		System.out.println("launch chrome browser");
		System.out.println(sc.getName());
		
	}
	
//	@Before(order = 2 )
//	public void setUp_url(Scenario sc) {
//		System.out.println("launch url");
//		System.out.println(sc.getName());
//	}
//	@After(order = 2)
//	public void tearDown_close(Scenario sc) {
//		System.out.println(" close the browser");
//		System.out.println(sc.getName());
//	}
	
	@After("@Smoke")
	public void tearDown_logout(Scenario sc) {
		System.out.println("logout from application");
		System.out.println(sc.getName());
	}

	@BeforeStep
	public void takescreenshot() {
		System.out.println("take the screenshot");
	}
	@AfterStep
	public void refreshPage() {
		System.out.println("refresh the page");
	}
}
