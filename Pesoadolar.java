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
        JOptionPane.showMessageDialog(null, "La conversión a dolares es de: " + resultadoFormateado, "Sistema de conversión", JOptionPane.PLAIN_MESSAGE);

    }
}
