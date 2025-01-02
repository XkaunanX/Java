import javax.swing.*;

public class VentanaSwing {
    public static void main(String[] args) {
        // Crear una ventana
        JFrame ventana = new JFrame("Ventana Swing");

        // Establecer tamaño y comportamiento de cierre
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un botón y agregarlo a la ventana
        JButton boton = new JButton("Haz clic aquí");
        boton.addActionListener(e -> JOptionPane.showMessageDialog(ventana, "¡Botón presionado!"));

        // Agregar el botón a la ventana
        ventana.getContentPane().add(boton);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
