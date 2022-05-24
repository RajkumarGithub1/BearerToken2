package facebook.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LinkedIn.genericLib.BaseTest;

public class LoginPage 
{
	@FindBy(id="email") private WebElement untb;
	@FindBy(id="pass") private WebElement pwtb;
	@FindBy(name="login") private WebElement loginBtn;
	
	
	
	public LoginPage()			//Constructor to initialize init Elements
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void login(String un, String pw)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pw);
		loginBtn.click();
	}

	public WebElement getUntb() {
		return untb;
	}

	public void setUntb(WebElement untb) {
		this.untb = untb;
	}

	public WebElement getPwtb() {
		return pwtb;
	}

	public void setPwtb(WebElement pwtb) {
		this.pwtb = pwtb;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}
	
	
	
	
}
