package script;

import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Utility;
import page.HomePage;
import page.LoginPage;


public class DemoA extends BaseTest{
	@Test
	public void testA(){
		String un=Utility.getXLData(DATA_PATH,"DemoA",1,0);
		String pw=Utility.getXLData(DATA_PATH,"DemoA",1,1);
		
		LoginPage l=new LoginPage(driver);
		//l.Click();
		l.setUserName(un);
		l.setPassword(pw);
		l.clickLogin();
		
		/*DashboardPage d=new DashboardPage(driver);
		d.clickWelcome();
		d.clickLogout();*/
	}
}
























































