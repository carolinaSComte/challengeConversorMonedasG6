package Principal;

import ConversorMonedas.OpcionesConversion;

import javax.swing.*;

public class Principal {

    public class Principal {

        public static void main(String[] args) {

            OpcionesConversion conversion = new OpcionesConversion();

            while(true) {
                String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null,
                        new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();


                switch(opciones) {
                    case "Conversor de Monedas":
                        String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
                        double valorRecibido = Double.parseDouble(input);
                        conversion.ConvertirMonedas(valorRecibido);


                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
                        if(JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("Entra");
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa finalizado");
                        }
                        break;



                }

        }

    }
}
