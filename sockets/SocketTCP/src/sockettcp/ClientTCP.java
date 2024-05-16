
package sockettcp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.swing.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClientTCP {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MarcoCliente mimarco = new MarcoCliente();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoCliente extends JFrame {

    public MarcoCliente() {

        setBounds(600, 300, 280, 350);

        LaminaMarcoCliente milamina = new LaminaMarcoCliente();

        add(milamina);

        setVisible(true);
    }

}

class LaminaMarcoCliente extends JPanel {

    public LaminaMarcoCliente() {

        JLabel texto = new JLabel("CLIENTE");

        add(texto);

        campo1 = new JTextField(20);

        add(campo1);

        miboton = new JButton("Enviar");
        
        EnviarTexto et = new EnviarTexto();
        
        miboton.addActionListener(et);

        add(miboton);

    }

    private class EnviarTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            try {
                //System.out.print(campo1.getText());

                Socket miSocket = new Socket("192.168.1.72", 9999);
                
                DataOutputStream flujo_salida = new DataOutputStream(miSocket.getOutputStream());
                
                flujo_salida.writeUTF(campo1.getText());
                
                flujo_salida.close();
                
                
            } catch (IOException ex) {
                //Logger.getLogger(LaminaMarcoCliente.class.getName()).log(Level.SEVERE, null, ex);
                System.out.print(ex.getMessage());
            }
            
            
        }

    }

    private JTextField campo1;

    private JButton miboton;

}