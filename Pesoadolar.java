package conversor_de_monedas;


import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pesoadolar extends conversion_herencia {
    
    public Pesoadolar(BigDecimal valor) {
        super(valor, new BigDecimal(0.059));
    }

    @Override    
    public void realizaconversion() {
    	
    	BigDecimal resultado = valor.multiply(conversion);
        String resultadoFormateado = formatearResultado(resultado);
        estilo.MostrarMensajeDialog(null, "<HTML><b>La conversión de Pesos a Dolares</b><br><div align=\"center\"> Es de : " + resultadoFormateado +"</div></HTML>", "Sistema de conversión");

    }
}
