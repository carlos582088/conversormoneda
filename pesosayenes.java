package conversor_de_monedas;


import javax.swing.JOptionPane;
import conversor_de_monedas.conversion_herencia;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;




public class pesosayenes extends conversion_herencia {
	
	
	  public pesosayenes (BigDecimal valor) {
		  
	        super(valor, new BigDecimal(0.054));
	    }

	    @Override    
	    public void realizaconversion() {
	    	
	    	BigDecimal resultado = valor.multiply(conversion);
	        String resultadoFormateado = formatearResultado(resultado);
	        estilo.MostrarMensajeDialog(null, "<HTML><b>La conversión de Pesos a Yenes</b><br><div align=\"center\"> Es de : " + resultadoFormateado +"</div></HTML>", "Sistema de conversión");
	    }
	
	

}
	

