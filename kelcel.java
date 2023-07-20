package conversor_de_monedas;

import java.text.DecimalFormat;   //libreria para darle formato a los decimales
import java.math.BigDecimal;      //libreria para hacer los decimales mas exactos 
import java.math.RoundingMode;
import javax.swing.JOptionPane;



public class kelcel extends conversion_herencia {
	
	
	
	public kelcel (BigDecimal valor) {
        super(valor, new BigDecimal(273.15));
    }

    @Override    
    public void realizaconversion() {
    	   	
    	//FORMULA PARA REALIZAR CONVERSION DE GRADOS kelvin a celsius
    	
    	// °C -  273.15   VALOR ADD ES PARA SUMAR   
    	
    	///////////////////////////////////////metodo para hacer la suma a un numero ingresado usando set para mostrar solo 2 decimales
    	BigDecimal resultado = valor.subtract(new BigDecimal ("273.15")).setScale(2, RoundingMode.HALF_UP);

        String resultadoFormateado = formatearResultado(resultado);
        estilo.MostrarMensajeDialog(null, "<HTML><b>La conversión a Grados Centigrados</b><br><div align=\"center\"> Es de : " + resultadoFormateado +"</div></HTML>", "Sistema de conversión");  
        

    }
}