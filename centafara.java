package conversor_de_monedas;

import java.text.DecimalFormat;   //libreria para darle formato a los decimales
import java.math.BigDecimal;      //libreria para hacer los decimales mas exactos 
import java.math.RoundingMode;
import javax.swing.JOptionPane;



public class centafara extends conversion_herencia {
	
	
	
	public centafara (BigDecimal valor) {
        super(valor, new BigDecimal(32.00));
    }

    @Override    
    public void realizaconversion() {

    	//    	   	Fórmula	
       //  	( °C x 9/5) + 32 =  °F
      //    SUBTRATC restar el valor ingresado  
    	
    	BigDecimal resultado = valor.multiply(new BigDecimal("9").divide(new BigDecimal("5"), 2, RoundingMode.HALF_UP)).add(new BigDecimal("32"));
        String resultadoFormateado = formatearResultado(resultado);
        JOptionPane.showMessageDialog(null, "La conversión a Grados Fahrenheit  de: " + resultadoFormateado, "Sistema de conversión", JOptionPane.PLAIN_MESSAGE);

    }
}
