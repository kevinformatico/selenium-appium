package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	/* Objetos */

	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc = 'email_textbox']/android.widget.EditText")
	private WebElement setUser;

	@FindBy(xpath = "//android.widget.LinearLayout[@content-desc = 'password_textbox']/android.widget.EditText")
	private WebElement setPass;

	@FindBy(id = "com.flipkart.android:id/user_password")
	public WebElement pressClick;

	@FindBy(id = "com.flipkart.android:id/mainMenu")
	public WebElement aBrirMenu;

	@FindBy(id = "android:id/title")
	public WebElement setLogin;

	/*****************************************************/

	public WebDriver driver;
	/* Constructor */

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*****************************************************/

	
	
	public WebElement getSetUser() {
		return setUser;
	}

	public WebElement getaBrirMenu() {
		return aBrirMenu;
	}

	public void setaBrirMenu(WebElement aBrirMenu) {
		this.aBrirMenu = aBrirMenu;
	}

	public WebElement getSetLogin() {
		return setLogin;
	}

	public void setSetLogin(WebElement setLogin) {
		this.setLogin = setLogin;
	}

	public void setSetUser(WebElement setUser) {
		this.setUser = setUser;
	}

	public WebElement getSetPass() {
		return setPass;
	}

	public void setSetPass(WebElement setPass) {
		this.setPass = setPass;
	}

	public WebElement getPressClick() {
		return pressClick;
	}

	public void setPressClick(WebElement pressClick) {
		this.pressClick = pressClick;
	}

	/*****************************************************/

//	/* Metodos */


	public void ingresarRUT(String Rut) throws InterruptedException {

		setUser.clear();
		setUser.sendKeys(Rut);
		// driver.navigate().back();

	}

	public void ingresarPass(String Pass) {
		setPass.clear();
		setPass.sendKeys(Pass);

	}

	public void clickLogin() {
		pressClick.click();

	}

	public void abrirMenu() {
		aBrirMenu.click();
		
	}
	
	public void selecOpMenu() {
		setLogin.click();
	}
}