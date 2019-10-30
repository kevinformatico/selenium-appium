package runnings;


import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", 
				     glue = "definitions",
				     plugin = { "pretty", "json:target/cucumber-report/cucumber.json", "junit:target/cucumber.xml", "html:target/cucumber-report"})

public class Running {
	
	public static SimpleDateFormat sdf;
	/*
    @AfterClass
    public static void setup() {
    	//Carga la config del xml
        System.out.println("CARGA CONFIGURACIÓN DEL XML");
        Reporter.loadXMLConfig(new File("./src/test/java/config/extent-config.xml"));

        // Detalle características     
        Reporter.setSystemInfo("Nombre Proyecto","BCI Automation");
        Reporter.setSystemInfo("Zona Horaria", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Ubicacion Usuario", System.getProperty("user.country"));
        Reporter.setSystemInfo("Nombre SO", System.getProperty("os.name"));
 
    }
    
    @BeforeClass
    public static void setupPath() {
		sdf = new SimpleDateFormat("dd-MM-YYYY_hh-mm-ss");
		
    	ExtentProperties extentProperties = ExtentProperties.INSTANCE;
    	extentProperties.setReportPath(System.getProperty("user.dir") + "/reportes/html" + 
    	"/Reporte_Automatizacion_" + sdf.format(new Date()) + ".html");
    }

	 */

}
