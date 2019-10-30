package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.DriverFactory;
import pages.LoginPage;

import java.net.MalformedURLException;

public class LoginDef extends DriverFactory {

	public static LoginPage page;
	
	public LoginDef() throws MalformedURLException {

	}
	
	@Given("^existen los campos$")
	public void existen_los_campos() throws Throwable {

	     page = new LoginPage(driver);
	     /*
		 page.abrirMenu();
		 page.clickLogin();

         */
	}

    @When("^ingreso usuario \"([^\"]*)\" y contraseña \"([^\"]*)\"$")
    public void ingreso_usuario_y_contraseña(String usuario, String pass) throws Throwable {
        /*
		page.screenshot(driver, "@Login");
        page.ingresarRUT(usuario);
        page.ingresarPass(pass);

         */
    }

	@Then("^hago click en boton ingresar$")
	public void hago_click_en_boton_ingresar() throws Throwable {
	    //page.clickLogin();
	}

}
