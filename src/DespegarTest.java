import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DespegarTest {
  @Test
  public void reservarViaje() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "./src/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.despegar.com.ar/hoteles/");
		WebElement cerrarVentanafb = driver.findElement(By.xpath("/html/body/nav/div[4]/div[1]/i"));
		cerrarVentanafb.click();
		Thread.sleep(2000);
		WebElement cerrarVentanaCookie = driver.findElement(By.xpath("//*[@id=\"lgpd-banner\"]/div/a[2]/em"));
		cerrarVentanaCookie.click();
		Thread.sleep(2000);
		WebElement clickDestino = driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div/div/div[3]/div[1]/div/div"));
		clickDestino.click();
		Thread.sleep(2000);
		//Buscar Destino. Ej: Cordoba 
		WebElement buscarDestino = driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div/div/div[3]/div[1]/div/div/div/input"));
		buscarDestino.sendKeys("Cordoba");
		Thread.sleep(2000);
		buscarDestino.sendKeys(Keys.CONTROL);
		buscarDestino.click();
		WebElement inputCiudad = driver.findElement(By.xpath("//div[7]/div/div[1]/ul/li[1]/span"));
		Thread.sleep(2000);
		inputCiudad.click();
		//inputCiudad.sendKeys(Keys.ENTER);
		Thread.sleep(2000);		
		WebElement inputEntrada = driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div/div/div[3]/div[2]/div/div[1]/div/div/div/div/input"));
		inputEntrada.click();
		Thread.sleep(2000);	
		WebElement selectIda = driver.findElement(By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[1]/div[3]/div[10]/div"));
		selectIda.click();
		WebElement selectVuelta = driver.findElement(By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[1]/div[3]/div[24]/div"));
		selectVuelta.click();
		Thread.sleep(2000);	
		WebElement botonAplicar = driver.findElement(By.xpath("//*[@id=\"component-modals\"]/div[1]/div[2]/div[1]/button/em"));
		botonAplicar.click();
		Thread.sleep(2000);	
		WebElement habitaciones = driver.findElement(By.xpath("//*[@id=\"svg-bed-378XaOe\"]"));
		habitaciones.click();
		Thread.sleep(2000);	
		WebElement seleccionarAdulto = driver.findElement(By.xpath("//*[@id=\"component-modals\"]/div[2]/div/div/div[1]/div[2]/div[1]/div[2]/div/button[2]"));
		seleccionarAdulto.click();
		Thread.sleep(2000);
		WebElement seleccionarMenor = driver.findElement(By.xpath("//*[@id=\"component-modals\"]/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div/button[2]"));
		seleccionarMenor.click();
		Thread.sleep(2000);
		WebElement seleccionarEdadMenor = driver.findElement(By.xpath("//*[@id=\"component-modals\"]/div[2]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/select"));
		seleccionarEdadMenor.click();
		Thread.sleep(2000);
		WebElement clickEdadMenor = driver.findElement(By.xpath("//*[@id=\"component-modals\"]/div[2]/div/div/div[1]/div[2]/div[3]/div[2]/div/div/select/option[4]"));
		clickEdadMenor.click();
		Thread.sleep(2000);
		WebElement aplicarBusqueda = driver.findElement(By.xpath("//*[@id=\"component-modals\"]/div[2]/div/div/div[2]/a[1]/em"));
		aplicarBusqueda.click();
		Thread.sleep(2000);
		WebElement aplicarBuscar = driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-box-hotels\"]/div/div/div/div/div[3]/button"));
		aplicarBuscar.click();
		Thread.sleep(2000);
		WebElement tituloResultado = driver.findElement(By.xpath("//aloha-app-root/aloha-results/div/div/div/div[2]/div[2]/aloha-list-view-container/div[3]/div[1]/aloha-cluster-container/div/div/div[1]/div/div[2]/div[1]/aloha-cluster-accommodation-info-container/div[1]/span"));
		System.out.println("Texto encontrado "+ tituloResultado.getText());
		Assert.assertTrue(tituloResultado.isDisplayed());
		driver.close();
		
		
  }
}
