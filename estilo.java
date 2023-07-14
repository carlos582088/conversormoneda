package conversor_de_monedas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class estilo {
	
 private static ImageIcon icon = new ImageIcon ("C:\\Users\\Carlos\\Documents\\alura\\java\\conversor_de_monedas\\cambio.png");

    

    
    public static String mostrarInputDialog( Object message, String title, Object[] options, Object initialValue) {
        
    	
    	// Establecer la dimensión personalizada para el cuadro de diálogo
    	
        UIManager.put("OptionPane.minimumSize", new Dimension(500, 400));
     
        // Modifica el tipo de letra para el cuadro de diálogo
        
        Font font = new Font("Arial", Font.PLAIN, 23);
        UIManager.put("OptionPane.messageFont", font);
        
        // Modificar el color del recuadro
        UIManager.put("OptionPane.background", new Color(0,0,139)); // Cambiamos el color de fondo a amarillo
        UIManager.put("Panel.background", new Color(0, 0, 139));     // Cambiamos  el color de fondo del panel interno a amarillo
        UIManager.put("OptionPane.messageForeground",Color.yellow); // Cambiamos el color del texto del mensaje a verde
     
    
        // Redimensionar la imagen al tamaño especificado
        Image imagenmaster = icon.getImage();
        int width = 50; // Ancho deseado para la imagen
        int height = 50; // Alto deseado para la imagen
        Image resizedImage = imagenmaster.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);


     
       // Crear el panel con la imagen centrada
       JPanel panel = new JPanel(new BorderLayout());
       JLabel label = new JLabel(resizedIcon);
       JLabel labela = new JLabel(icon);
       panel.add(label, BorderLayout.CENTER);

       
       //para  mostrar imagen en el modulo pricipal 
       JLabel mensajeinicial = new JLabel(message.toString());
       mensajeinicial.setFont(font);
       panel.add(mensajeinicial, BorderLayout.PAGE_END);
       mensajeinicial.setHorizontalAlignment(SwingConstants.CENTER);
       mensajeinicial.setForeground(Color.WHITE);
        
        // Mostrar el cuadro de diálogo personalizado
        return (String) JOptionPane.showInputDialog(null,panel,title, JOptionPane.PLAIN_MESSAGE, null, options, initialValue);
    }


         


}
