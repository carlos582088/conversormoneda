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
import javax.swing.*;
import java.awt.*;



public class conversor_monedas {
	
	

 public static void main(String[] args) {
	 
	 
	 boolean continuar = true; //se crea el boOlean para darle un ciclo al boton si se sigue dentro del programa, se cnecal
	 
	 
        while (continuar) {
                                                                                                                                              // creamos Ruta de la imagen para ventana inicial 
            
        Object[] opciones = {"Conversor de Monedas", "Conversor de Temperatura"};
         
        String opcionvalida = (String) estilo.mostrarInputDialog("Seleccione una opción", "Sistema de conversión", opciones, opciones[0]);

           
            if (opcionvalida.equals("Conversor de Monedas")) {
                String valor = estilo.mostrarInputDialog("Ingresa el valor a convertir", "Selecciona una opción",null, null);

                if (valor != null) {   
                	//este identidficador nos ayuda a verficiar si no es igual a  
                	boolean numeral = false;
                	
                    //con la rutina while try aseguro que el usuario escriba solo valor numeral si escribe letras se va a catch y le envia una alerta de error.                  
                    while (!numeral) {
                        
                    	try {
                            double cantidad = Double.parseDouble(valor);
                            numeral = true;

                            String[] tipodecambio = {"Pesos a Dólares", "Pesos a Euros", "Pesos a Libras Esterlinas", "Pesos a Yen Japonés", "Pesos a Won Surcoreano", "Dolares a Pesos", "Euros a Pesos", "Libras a Pesos", "Yen Japones a Pesos", "Won surcoreano a pesos"};
                            String conversiones = (String) estilo.mostrarInputDialog( "Selecciona el tipo de moneda", "Sistema de conversión",  tipodecambio, tipodecambio[0]);

                            
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
                            	
                     String error = (String) estilo.mostrarInputDialog( "Opcion no valida", "Alerta",null,null);
      
                            }
          
                            
           //creamos las condiciones de uso de los botones por eso crea el boolean para asegurar si es verdadero o falso                  
                           
                          int adicional = estilo.mostrarConfirmDialog(null,"¿Desea continuar en el programa?", "información", JOptionPane.YES_NO_CANCEL_OPTION);
                            
                            if (adicional == JOptionPane.YES_OPTION) {
                                continuar = true;
                                
                            } else if (adicional == JOptionPane.CANCEL_OPTION) {
                            	continuar=false;                        	
                            	estilo.MostrarMensajeDialog(null, "<html><div style='text-align:center;'><font size='5'>Gracias por utilizar nuestro sistema</font><br/><b><font size='6'>¡Función Cancelada!</font></b></div></html>", "Información");
                            }                                                       
                            else {                            
                           estilo.MostrarMensajeDialog(null, "<html><div style='text-align:center;'><font size='5'>Gracias por utilizar nuestro sistema</font><br/><b><font size='6'>¡HASTA PRONTO!</font></b></div></html>", "Información");
                           continuar = false;                                                                                           
                            }

                        } catch (NumberFormatException e) {
                        	
                            estilo.MostrarMensajeDialog(null, "<HTML><div style= 'text-align:center;'><font size='6'>¡No puedes agregar letras o simbolos a la conversión!</div></font></HTML>", "Alerta Crítica");
                            valor = estilo.mostrarInputDialog( "Ingresa el valor a convertir", "Selecciona una opción",null,null);
                        }
                    }
                
            }   else {
          continuar=false;
           }
            
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                   
  //////////////////////////////////////////////////////////////////////////////////7CONVERSION DE TEMPRATURA //////////////////////////////////////////////////////////////////////////////////////////////////////          
          
            } else if (opcionvalida.equals("Conversor de Temperatura")) {

                String valor = estilo.mostrarInputDialog("Ingresa el valor de la temperatura", "Selecciona una opción",null,null);

                if (valor != null) {
                    boolean numeros = false;

                    while (!numeros) {
                        try {
                            double cantidad = Double.parseDouble(valor);
                            numeros = true;

                            String[] grados = {"Grados Centigrados a Fahrenheit","Grados Celsius a Kelvin","Grados Fahrenheit a centigrados","Grados kelvin a centigrados"};
                            String conversiones = (String) estilo.mostrarInputDialog( "Elija un tipo de conversion", "Sistema de conversion",grados, grados[0]);

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
                              
                            
                            int adicional = estilo.mostrarConfirmDialog(null, "¿Desea continuar en el programa?", "información", JOptionPane.YES_NO_CANCEL_OPTION);

                            if (adicional == JOptionPane.YES_OPTION) {
                                continuar = true;
                            } else if (adicional == JOptionPane.CANCEL_OPTION) {
                                continuar = false;
                                
                            	estilo.MostrarMensajeDialog(null, "<html><div style='text-align:center;'><font size='5'>Gracias por utilizar nuestro sistema</font><br/><b><font size='6'>¡Función Cancelada!</font></b></div></html>", "Información");                        
                            }
                            else {
                            	
                                estilo.MostrarMensajeDialog(null, "<html><div style='text-align:center;'><font size='5'>Gracias por utilizar nuestro sistema</font><br/><b><font size='6'>¡HASTA PRONTO!</font></b></div></html>", "Información");
                                continuar = false;
                            }

                        } catch (NumberFormatException e) {
                        	
                            estilo.MostrarMensajeDialog(null, "<HTML><div style= 'text-align:center;'><font size='6'>¡No puedes agregar letras o simbolos a la conversión!</div></font></HTML>", "Alerta Crítica");
                            valor = estilo.mostrarInputDialog( "Ingresa el valor de la temperatura", "Selecciona una opción",null,null);

                        }
                    }
                
                }
            }
 }     }
     
 
 
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 //////////////// SE CREAN CONDICIONES DE FORMA PRIVDA PARA MANDARLAS A LLAMAR DESDE LA MISMA CLASE///////////////////////////////////////////////////////////
    
    private static void convertirDolaresAPesos(double cantidad) {
    BigDecimal dolar = new BigDecimal(Double.toString(cantidad)).multiply(new BigDecimal("17.02")).setScale(2, RoundingMode.HALF_UP);
     String dolarresultado = dolar.toString();
     estilo.MostrarMensajeDialog(null, "<HTML><b>La conversión de dólares a pesos</b><br><div align=\"center\"> Es de : " + dolarresultado +"</div></HTML>", "Sistema de conversión");
    	}

    private static void convertirEurosAPesos(double cantidad) {
    BigDecimal euro= new BigDecimal(Double.toString(cantidad)).multiply(new BigDecimal("18.47")).setScale(2, RoundingMode.HALF_UP);
        String eurores= euro.toString();
        estilo.MostrarMensajeDialog(null, "<HTML><b>La conversión de Euros a pesos</b><br><div align=\"center\"> Es de : " + eurores +"</div></HTML>", "Sistema de conversión");
    }

    private static void convertirLibrasAPesos(double cantidad) {
        BigDecimal libras= new BigDecimal(Double.toString(cantidad)).multiply(new BigDecimal("21.61")).setScale(2, RoundingMode.HALF_UP);
        String librares= libras.toString();
        estilo.MostrarMensajeDialog(null, "<HTML><b>La conversión de Libras a pesos</b><br><div align=\"center\"> Es de : " + librares +"</div></HTML>", "Sistema de conversión");
    }

    private static void convertirYenJaponesAPesos(double cantidad) {
        BigDecimal yen= new BigDecimal(Double.toString(cantidad)).multiply(new BigDecimal("0.120")).setScale(2, RoundingMode.HALF_UP);
        String yenres= yen.toString();
        
        estilo.MostrarMensajeDialog(null, "<HTML><b>La conversión de Yenes a pesos</b><br><div align=\"center\"> Es de : " + yenres +"</div></HTML>", "Sistema de conversión");
    }

    private static void convertirWonSurcoreanoAPesos(double cantidad) {
    	
        BigDecimal won= new BigDecimal(Double.toString(cantidad)).multiply(new BigDecimal("0.013")).setScale(2, RoundingMode.HALF_UP);
        String wonres= won.toString();
        
        estilo.MostrarMensajeDialog(null, "<HTML><b>La conversión de Won a pesos</b><br><div align=\"center\"> Es de : " + wonres +"</div></HTML>", "Sistema de conversión");
    }
}
