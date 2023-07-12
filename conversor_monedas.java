package conversor_de_monedas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;   //libreria para darle formato a los decimales
import java.math.BigDecimal;      //libreria para hacer los decimales mas exactos 
import java.math.RoundingMode;    //libreria que nos ayuda redonndear los valores.
import conversor_de_monedas.Pesoadolar;
import conversor_de_monedas.Pesosaeuros;
import conversor_de_monedas.pesosalibras;
import conversor_de_monedas.pesosayenes;
import conversor_de_monedas.estilo;
import java.awt.Image;


public class conversor_monedas {
	
private static final int DECIMALS=2;	//Nos ayuda a mentener el formato de solo dos decimales

 public static void main(String[] args) {
	 
	 
      	 
	 boolean continuar = true; //se crea el bollean para darle un ciclo al boton si se sigue dentro del programa, se cnecal
	 
	 
        while (continuar) {
                            
                                                                                                                             // creamos Ruta de la imagen
            String rutaImagen = "C:\\Users\\Carlos\\Documents\\alura\\java\\conversor_de_monedas\\cambio.png";
            int ancho= 200;
            int alto = 200;
                                                                                                                             //  Crear un objeto ImageIcon con la imagen
            ImageIcon icon = new ImageIcon("C:\\Users\\Carlos\\Documents\\alura\\java\\conversor_de_monedas\\cambio.png");            
            Image image = icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT);
            icon = new ImageIcon(image);
            Object[] opciones = {"Conversor de Monedas", "Conversor de Temperatura"};
         
            //String opcionvalida = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Sistema de conversión", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
            String opcionvalida = (String) estilo.mostrarInputDialog("Seleccione una opción", "Sistema de conversión", opciones, opciones[0],icon);

            
            
            if (opcionvalida.equals("Conversor de Monedas")) {
                String valor = JOptionPane.showInputDialog(null, "Ingresa el valor a convertir", "Selecciona una opción", JOptionPane.PLAIN_MESSAGE);

                if (valor != null) {     //esta condiciona nos ayuda a verificar que el usuario ingrese informacion en el cuadro de texto 
                	boolean numeral = false;


                    //con la rutina while try aseguro que el usuario escriba solo valor numeral si escribe letras se va a catch y le envia una alerta de error.                  
                    while (!numeral) {
                        try {
                            double cantidad = Double.parseDouble(valor);
                            numeral = true;

                            String[] tipodecambio = {"Pesos a Dólares", "Pesos a Euros", "Pesos a Libras Esterlinas", "Pesos a Yen Japonés", "Pesos a Won Surcoreano", "Dolares a Pesos", "Euros a Pesos", "Libras a Pesos", "Yen Japones a Pesos", "Won surcoreano a pesos"};
                            String conversiones = (String) JOptionPane.showInputDialog(null, "Sistema de conversión", "Selecciona el tipo de moneda a convertir", JOptionPane.INFORMATION_MESSAGE, null, tipodecambio, tipodecambio[0]);

                            
  //Primer codigo hace referncia a las herencias con colases indepnedientes abstractas que tienen elementos en comun                                                       
                            
                            if (conversiones.equals("Pesos a Dólares")) {
                            	 Pesoadolar pesodolar = new Pesoadolar(new BigDecimal(valor));
                            	 pesodolar.realizaconversion();                            	                                                                                        
                                
                            } else if (conversiones.equals("Pesos a Euros")) {
                                Pesosaeuros pesoaeuros= new Pesosaeuros (new BigDecimal(valor));
                                pesoaeuros.realizaconversion();                                                                                                                   
                                
                            } else if (conversiones.equals("Pesos a Libras Esterlinas")) {
                            	pesosalibras pesoalibras= new pesosalibras (new BigDecimal(valor));
                                pesoalibras.realizaconversion(); 
                                                                                                                                                             
                            } else if (conversiones.equals("Pesos a Yen Japonés")) {
                            	pesosayenes pesoayenes= new pesosayenes (new BigDecimal(valor));
                                pesoayenes.realizaconversion(); 
                                                               
                            } else if (conversiones.equals("Pesos a Won Surcoreano")) {
                            	pesosawon pesoawon= new pesosawon (new BigDecimal(valor));
                                pesoawon.realizaconversion(); 
                                
//codigo que hace las conversiones a partir de un encapsulamiento usando private                                
                                                               
                            } else if (conversiones.equals("Dolares a Pesos")) {
                                convertirDolaresAPesos(cantidad);
                            } else if (conversiones.equals("Euros a Pesos")) {
                                convertirEurosAPesos(cantidad);
                            } else if (conversiones.equals("Libras a Pesos")) {
                                convertirLibrasAPesos(cantidad);
                            } else if (conversiones.equals("Yen Japones a Pesos")) {
                                convertirYenJaponesAPesos(cantidad);
                            } else if (conversiones.equals("Won surcoreano a pesos")) {
                                convertirWonSurcoreanoAPesos(cantidad);
                            } else {
                                JOptionPane.showMessageDialog(null, "Opción no válida", "Alerta", JOptionPane.WARNING_MESSAGE);
                            }
          
                            
           //creamos las condiciones de uso de los botones por eso crea el boolean para asegurar si es verdadero o falso                  
                            int adicional = JOptionPane.showInternalConfirmDialog(null, "¿Desea continuar en el programa?", "información", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

                            if (adicional == JOptionPane.YES_OPTION) {
                                continuar = true;
                                
                            } else if (adicional == JOptionPane.CANCEL_OPTION) {
                            	continuar=false;
                            JOptionPane.showMessageDialog( null, "Oeracion cancelada ", "informacion", JOptionPane.INFORMATION_MESSAGE);	
                           continuar=false;
                            }
                                                        
                            else {
                            
                           JOptionPane.showInternalMessageDialog( null, "Gracias por utilizar nuestro sistema", "informacion", JOptionPane.INFORMATION_MESSAGE);	
                            	
                         //  continuar = false;
                                
                                
                                
                            }

                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "No puedes agregar letras a la conversión", "Alerta Crítica", JOptionPane.ERROR_MESSAGE);
                            valor = JOptionPane.showInputDialog(null, "Ingresa el valor a convertir", "Selecciona una opción", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                
            }   else {
            	
            	continuar=false;
            	 JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro sistema", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
            
                     
  //////////////////////////7CONVERSION DE TEMPRATURA //////////////////////////////////////////////////////////          
          
            } else if (opcionvalida.equals("Conversor de Temperatura")) {

                String valor = JOptionPane.showInputDialog(null, "Ingresa el valor de la temperatura", "Selecciona una opción", JOptionPane.PLAIN_MESSAGE);

                if (valor != null) {
                    boolean numeros = false;

                    while (!numeros) {
                        try {
                            double cantidad = Double.parseDouble(valor);
                            numeros = true;

                            String[] grados = {"Grados Centigrados a Fahrenheit","Grados Celsius a Kelvin","Grados Fahrenheit a centigrados","Grados kelvin a centigrados"};
                            String conversiones = (String) JOptionPane.showInputDialog(null, "Sistema de conversión", "Selecciona el tipo de moneda a convertir", JOptionPane.INFORMATION_MESSAGE, null, grados, grados[0]);

                            if (conversiones.equals ("Grados Centigrados a Fahrenheit")) {
                                centafara centi = new centafara(new BigDecimal(valor));
                                centi.realizaconversion();
                                
                            }else if(conversiones.equals ("Grados Celsius a Kelvin")) {
                            	celsiusakevin kev= new celsiusakevin(new BigDecimal(valor));
                            	kev.realizaconversion(); 
                            	
                            }else if (conversiones.equals ("Grados Fahrenheit a centigrados")) {
                            	faracel far=new faracel (new BigDecimal(valor));
                            	far.realizaconversion();    	
                            
                            }else if(conversiones.equals ("Grados kelvin a centigrados")) {
                            	
                                kelcel kel= new kelcel(new BigDecimal(valor));
                                kel.realizaconversion();                            	
                            }
                              
                            
                            int adicional = JOptionPane.showInternalConfirmDialog(null, "¿Desea continuar en el programa?", "información", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

                            if (adicional == JOptionPane.YES_OPTION) {
                                continuar = true;
                            } else if (adicional == JOptionPane.CANCEL_OPTION) {
                                continuar = false;
                                JOptionPane.showInternalMessageDialog(null, "Operación cancelada ", "información", JOptionPane.INFORMATION_MESSAGE);
                            }
                            else {
                                JOptionPane.showInternalMessageDialog(null, "Gracias por utilizar nuestro sistema", "información", JOptionPane.INFORMATION_MESSAGE);
                                continuar = false;
                            }

                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "No puedes agregar letras a la conversión", "Alerta Crítica", JOptionPane.ERROR_MESSAGE);
                            valor = JOptionPane.showInputDialog(null, "Ingresa el valor de la temperatura", "Selecciona una opción", JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                
                }
            }
 }     }
                         	                        	            	                                
 // se crean condiciones de forma privada para mandarlas llamar desde la misma clase moendas
    
    private static void convertirDolaresAPesos(double cantidad) {
    BigDecimal dolar = new BigDecimal(Double.toString(cantidad)).multiply(new BigDecimal("17.02")).setScale(2, RoundingMode.HALF_UP);
     String dolarresultado = dolar.toString();
     JOptionPane.showMessageDialog(null, "La conversión de dólares a pesos es de : " + dolarresultado, "Sistema de conversión", JOptionPane.PLAIN_MESSAGE);
    	}

    private static void convertirEurosAPesos(double cantidad) {
    BigDecimal euro= new BigDecimal(Double.toString(cantidad)).multiply(new BigDecimal("18.47")).setScale(2, RoundingMode.HALF_UP);
        String eurores= euro.toString();
        JOptionPane.showMessageDialog(null, "La conversión de Euros a pesos es de : " + eurores, "Sistema de conversión", JOptionPane.PLAIN_MESSAGE);
    }

    private static void convertirLibrasAPesos(double cantidad) {
        BigDecimal libras= new BigDecimal(Double.toString(cantidad)).multiply(new BigDecimal("21.61")).setScale(2, RoundingMode.HALF_UP);
        String librares= libras.toString();
        JOptionPane.showMessageDialog(null, "La conversión de libras a pesos es de : " + librares, "Sistema de conversión", JOptionPane.PLAIN_MESSAGE);
    }

    private static void convertirYenJaponesAPesos(double cantidad) {
        BigDecimal yen= new BigDecimal(Double.toString(cantidad)).multiply(new BigDecimal("0.120")).setScale(2, RoundingMode.HALF_UP);
        String yenres= yen.toString();
        
        JOptionPane.showMessageDialog(null, "La conversión de yenes a pesos es de : " + yenres, "Sistema de conversión", JOptionPane.PLAIN_MESSAGE);
    }

    private static void convertirWonSurcoreanoAPesos(double cantidad) {
    	
        BigDecimal won= new BigDecimal(Double.toString(cantidad)).multiply(new BigDecimal("0.013")).setScale(2, RoundingMode.HALF_UP);
        String wonres= won.toString();
        
        JOptionPane.showMessageDialog(null, "La conversión de Won Surcoreano a pesos es de : " + wonres, "Sistema de conversión", JOptionPane.PLAIN_MESSAGE);
    }
}
