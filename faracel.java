package conversor_de_monedas;


import java.text.DecimalFormat;   //libreria para darle formato a los decimales
import java.math.BigDecimal;      //libreria para hacer los decimales mas exactos 
import java.math.RoundingMode;
import javax.swing.JOptionPane;


public class faracel extends conversion_herencia {
	
	public faracel (BigDecimal valor) {
        super(valor, new BigDecimal(273.15));
    }
	

    @Override    
    public void realizaconversion() {
    	

    	//  Fórmula	para convertir grados farehntheit a celsius 
       //  	( °F − 32) × 5/9 =  °C
      //    SUBTRATC restar el valor ingresado      
    	BigDecimal resultado = valor.subtract(new BigDecimal ("32")).multiply(new BigDecimal("5")).divide(new BigDecimal("9"), 2,RoundingMode.HALF_UP);
        String resultadoFormateado = formatearResultado(resultado);
        JOptionPane.showMessageDialog(null, "La conversión a Grados kelvin es de: " + resultadoFormateado, "Sistema de conversión", JOptionPane.PLAIN_MESSAGE);
    }
}


