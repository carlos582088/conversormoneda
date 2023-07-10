package conversor_de_monedas;


import javax.swing.JOptionPane; //se usa para activar librerias tipo swing 
import java.text.DecimalFormat; //se usa la libreria para la funcion decimal
import java.math.BigDecimal;    // se usa la funcion para hacer mas exactos los decimales
import java.math.RoundingMode;  //se usa la libreria para redondear 


public abstract class conversion_herencia { //use la clase abstracta como conjunto de los metodos en comun para todos 
	
	protected BigDecimal valor;
    protected BigDecimal conversion;
	

    public conversion_herencia (BigDecimal valor, BigDecimal conversion) {  //constructor va asignar los valores a los atributos
    	
    	this.valor=valor;
    	this.conversion=conversion;    	
    }
    
    protected String formatearResultado(BigDecimal resultado) {      //aqui el resultado tendra un formato para deciles de dos dijitos le estoy diciendo que sea exacto y nos realice el redondeo. 
        DecimalFormat formato = new DecimalFormat("#.##");
        return formato.format(resultado.setScale(2, RoundingMode.HALF_UP));
    }
    
    
    
    
    
    public  abstract void realizaconversion();  

}
