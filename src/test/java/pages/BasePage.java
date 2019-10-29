package pages;

import com.cucumber.listener.Reporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.Calendar;

public class BasePage {

	/**
	 * 
	 * Tomar Screenshoot
	 * 
	 * @param driver WebDriver
	 * @param nombre String
	 * 
	 **/

	public static void screenshot(WebDriver driver, String nombre) {
		try {
			// Sacar screenshot
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File path = new File(System.getProperty("user.dir") + "/reportes/screenshots/" + nombre + "_"
					+ now() + "_" + System.currentTimeMillis() + ".jpg");
			FileUtils.copyFile(screenshot, path);
			// Agrega screenshot al reporte
			Reporter.addScreenCaptureFromPath(path.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Fecha actual
	 */

	public static String now() {
		Calendar ahora = Calendar.getInstance();
		Integer n = new Integer((ahora.get(Calendar.YEAR) * 10000) + ((ahora.get(Calendar.MONTH) + 1) * 100)
				+ (ahora.get(Calendar.DAY_OF_MONTH)));
		return n.toString();
	}

	/**
	 * 
	 * Esperar por objeto clickeable
	 * 
	 * @param driver  WebDriver
	 * @param element WebElement
	 * 
	 **/
	public static void esperaClickeable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
