package ConversorMonedas;

import javax.swing.*;

public class OpcionesConversion {

}
        public void ConvertirMonedas(double valor) {

            String opcion = (JOptionPane.showInputDialog(null,
                    "Elije la moneda que deseas convertir tu dinero ",  "Monedas",
                    JOptionPane.PLAIN_MESSAGE, null, new Object[]
                            {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japonés", "De Pesos a Won sub-coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos", "De Won sub-coreano a Pesos"},
                    "Seleccion")).toString();

            switch (opcion) {
                case "De Pesos a Dólar":
                    monedas.ConvertirPesosChilenosDolares(valor);
                    break;

                case "De Pesos a Euro":
                    monedas.ConvertirPesosChilenosEuros(valor);
                    break;

                case "De Pesos a Libras Esterlinas":
                    monedas.ConvertirPesosChilenosLibra(valor);
                    break;

                case "De Pesos a Yen Japonés":
                    monedas.ConvertirPesosChilenosYen(valor);
                    break;

                case "De Pesos a Won sub-coreano":
                    monedas.ConvertirPesosChilenosWon(valor);
                    break;

                case "De Dólar a Pesos":
                    monedas.ConvertirDolaresPesosChilenos(valor);
                    break;

                case "De Euro a Pesos":
                    monedas.ConvertirEurosPesosChilenos(valor);
                    break;

                case "De Libras Esterlinas a Pesos":
                    monedas.ConvertirLibraPesosChilenos(valor);
                    break;

                case "De Yen Japonés a Pesos":
                    monedas.ConvertirYenPesosChilenos(valor);
                    break;

                case "De Won sub-coreano a Pesos":
                    monedas.ConvertirWonPesosArgentino(valor);
                    break;
            }
        }

    }
}
