package conversor_de_monedas;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Component;


public class estilo {
	
 private static ImageIcon icon = new ImageIcon ("C:\\Users\\Carlos\\Documents\\alura\\java\\conversor_de_monedas\\cambio.png");
     
 
 
    public static String mostrarInputDialog( Object message, String title, Object[] options, Object initialValue) {
    	
  
    	
    	// Establecer la dimensión personalizada para el cuadro de diálogo
    	
        UIManager.put("OptionPane.minimumSize", new Dimension(400, 100));
     
        // Modifica el tipo de letra para el cuadro de diálogo
        
        Font font = new Font("Arial", Font.PLAIN, 23);
        
        UIManager.put("OptionPane.messageFont", font);
        
        // Modificar el color del recuadro
        UIManager.put("OptionPane.background", new Color(0,0,139));  // Cambiamos el color de fondo a amarillo
        UIManager.put("Panel.background", new Color(0, 0, 139));     // Cambiamos  el color de fondo del panel interno a amarillo

    
       // Redimensionar la imagen al tamaño especificado
       Image imagenmaster = icon.getImage();
       int width = 200;                        // Ancho deseado para la imagen
       int height = 200;                      // Alto deseado para la imagen
                        
       Image resizedImage = imagenmaster.getScaledInstance(width, height, Image.SCALE_SMOOTH);
       ImageIcon resizedIcon = new ImageIcon(resizedImage);

       // Creamos el panel con la imagen centrada
       JPanel panel = new JPanel(new BorderLayout());
       JLabel label = new JLabel(resizedIcon);
       panel.add(label, BorderLayout.CENTER);
      
          
       //para  mostrar imagen en el modulo pricipal 
       JLabel mensajeinicial = new JLabel(message.toString()); 
       panel.setBorder(new EmptyBorder(50, 0, -20, 0));                      //aqui establecemos el margen de la imagen de lado superior
       mensajeinicial.setFont(font);
       panel.add(mensajeinicial, BorderLayout.PAGE_END);
       mensajeinicial.setHorizontalAlignment(SwingConstants.CENTER);
       mensajeinicial.setForeground(Color.WHITE);
       mensajeinicial.setPreferredSize(new Dimension(0,200));//se modifica la posicion del mensaje inicial (ancho, altura)
       
       
       
         
        // Mostrar el cuadro de diálogo personalizado
       
       return (String) JOptionPane.showInputDialog(null,panel,title,  JOptionPane.PLAIN_MESSAGE, null, options, initialValue);  
 
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    /
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
///////////////////////////////////////CONFIRMACION DE BOTONES SI NO Y CANCELAR////////////////////////////////////////////////////////////////////////////////////////
    
    
    private static ImageIcon ico = new ImageIcon ("C:\\Users\\Carlos\\Documents\\alura\\java\\conversor_de_monedas\\cambio.png");

    
    
    
    
    public static int mostrarConfirmDialog(Component parentComponent, Object message, String title, int optionType) {
 
    	
    	
///////////////////////AQUI DAMOS FORMATO AL COLOR DEL RECUADRO TIPO DE FUENTE//////////////////////////////////////////////////////////    	
    	
    	
        UIManager.put("OptionPane.minimumSize", new Dimension(400, 100));  //tamaño del recuadro de dialogo
        
        Font colorytamaño = new Font("Arial", Font.PLAIN, 20);            //aqui damos las condiciones para el tipo de fuente 
        
        UIManager.put("OptionPane.messageFont", colorytamaño);           //aqui es e donde ponemos las condiciones que se usara en el cuadro de texto
        
        UIManager.put("OptionPane.background", new Color(0, 0, 139));   //aqui le damos color nuevo al fondo del recuadro 
        
        UIManager.put("Panel.background", new Color(0, 0, 139));       //aqui definimos el color del fonod del recuadro del panel       
       

        
///////////////////////AQUI VAMOS A REDIMENSAIOR LA IMAGEN QUE APARECERA EN EL PROGRMA//////////////////////////////////////////////////////
        
   
        Image imagennueva = ico.getImage();      // Se crea la instancia que tiene almacenada ico que tiene la ruta de la imagen
        int width = 200;                        // Ancho deseado para la imagen
        int height = 200;                      // Alto deseado para la imagen
                         
        Image redimensionar= imagennueva.getScaledInstance(width, height, Image.SCALE_SMOOTH);    //redimensionamos la imagen
        ImageIcon nuevaimagen = new ImageIcon(redimensionar);          //preparamos la imagen redimensionada con la clase imageIcon y pueda sr utilizada
  
        
        // Creamos el panel con la imagen centrada
       
        JPanel panel = new JPanel(new BorderLayout());      //aqui sie crea la instancia que contendra el formato sobre el panel la imagen
        JLabel label = new JLabel(nuevaimagen);            // aqui se crea la instancia  que contendra la imagen redimensionada
        panel.add(label, BorderLayout.CENTER);            //aqui agregamos las condiciones al panel la imagen y el formato centrado 
       
           
        //para  mostrar imagen en el modulo pricipal 
        
        JLabel mensajeinicial = new JLabel(message.toString());  //aseguramos que ne label sea una cadena de texto con message.toString    
        panel.setBorder(new EmptyBorder(50, 0, -20, 0));        //aqui establecemos el margen de la imagen de lado superior
        mensajeinicial.setFont(colorytamaño);                   //aqui con sentfont aseugamoros el formato que previamente se ha enviado
        panel.add(mensajeinicial, BorderLayout.PAGE_END);      //aqui indicamos donde se requiere el mensaje
        mensajeinicial.setHorizontalAlignment(SwingConstants.CENTER);   //aqui estamos alineando el texto al centro  
        mensajeinicial.setForeground(Color.WHITE);
        mensajeinicial.setPreferredSize(new Dimension(0,200));          //se modifica la posicion del mensaje inicial (ancho, altura)
       
        
        return JOptionPane.showConfirmDialog(parentComponent, panel, title,optionType,JOptionPane.INFORMATION_MESSAGE);

    
    }
    
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
/////////////////////////////////////////////////////////////////////////////////CUADRO DEDIALOGO DE FIN DE PROGRAMA ///////////////////////////////////////////////////////////////////////////////////////
    
    private static ImageIcon imagen = new ImageIcon ("C:\\Users\\Carlos\\Documents\\alura\\java\\conversor_de_monedas\\cambio.png");

    
    public static int MostrarMensajeDialog(Component ParentComponent, Object message, String title) {
    	
    	
    	
        UIManager.put("OptionPane.minimumSize", new Dimension(400, 100));  //tamaño del recuadro de dialogo
        
        Font colores = new Font("Arial", Font.PLAIN, 19);            //aqui damos las condiciones para el tipo de fuente 
        
        UIManager.put("OptionPane.messageFont", colores);           //aqui es e donde ponemos las condiciones que se usara en el cuadro de texto
        
        UIManager.put("OptionPane.background", new Color(0, 0, 139));   //aqui le damos color nuevo al fondo del recuadro 
        
        UIManager.put("Panel.background", new Color(0, 0, 139));       //aqui definimos el color del fonod del recuadro del panel       
       

        
///////////////////////AQUI VAMOS A REDIMENSAIOR LA IMAGEN QUE APARECERA EN EL PROGRMA//////////////////////////////////////////////////////
        
   
        Image imagennueva = imagen.getImage();      // Se crea la instancia que tiene almacenada ico que tiene la ruta de la imagen
        int width = 200;                        // Ancho deseado para la imagen
        int height = 200;                      // Alto deseado para la imagen
                         
        Image redimensiona= imagennueva.getScaledInstance(width, height, Image.SCALE_SMOOTH);    //redimensionamos la imagen
        ImageIcon nuevaimagen = new ImageIcon(redimensiona);          //preparamos la imagen redimensionada con la clase imageIcon y pueda sr utilizada
  
        
        // Creamos el panel con la imagen centrada
       
        JPanel panel = new JPanel(new BorderLayout());      //aqui sie crea la instancia que contendra el formato sobre el panel la imagen
        JLabel label = new JLabel(nuevaimagen);            // aqui se crea la instancia  que contendra la imagen redimensionada
        panel.add(label, BorderLayout.CENTER);            //aqui agregamos las condiciones al panel la imagen y el formato centrado 
       
           
        //para  mostrar imagen en el modulo pricipal 
        
        JLabel mensaje = new JLabel(message.toString());  //aseguramos que ne label sea una cadena de texto con message.toString    
        panel.setBorder(new EmptyBorder(50, 0, -20, 0));        //aqui establecemos el margen de la imagen de lado superior
        mensaje.setFont(colores);                   //aqui con sentfont aseugamoros el formato que previamente se ha enviado
        panel.add(mensaje, BorderLayout.PAGE_END);      //aqui indicamos donde se requiere el mensaje
        mensaje.setHorizontalAlignment(SwingConstants.CENTER);   //aqui estamos alineando el texto al centro  
        mensaje.setForeground(Color.WHITE);
        mensaje.setPreferredSize(new Dimension(0,200));          //se modifica la posicion del mensaje inicial (ancho, altura)
       
       
        return JOptionPane.showConfirmDialog(ParentComponent, panel, title,JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);

    	
    }
    
    
    

}

