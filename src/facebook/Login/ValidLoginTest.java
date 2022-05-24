package facebook.Login;

import org.testng.annotations.Test;

import com.LinkedIn.genericLib.BaseTest;
import com.LinkedIn.genericLib.FileLib;


public class ValidLoginTest extends BaseTest
{
	@Test
	public void loginToApp() throws Throwable
	{
		LoginPage lp= new LoginPage();
		FileLib flib=new FileLib();
		lp.login(flib.readPropertyData(PROP_PATH, "fbun"), flib.readPropertyData(PROP_PATH, "fbpw"));
		
		
		
		
	}
}
