/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examendiego;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class EXAMENDIEGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // PREGUNTAR INFO DE AGENTE
        String nombreAgente = JOptionPane.showInputDialog("Ingrese el nombre del agente de ventas:");
        int cedulaAgente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula:"));
        int codigoAgente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de agente:"));
        String sucursalAgente = JOptionPane.showInputDialog("Ingrese la sucursal a la que pertenece el agente:");
        String tieneVehiculo = JOptionPane.showInputDialog("¿El agente tiene vehículo propio?");

        //DEFINE NUEVO AGENTE   
        Agente agente = new Agente(nombreAgente, cedulaAgente, codigoAgente, sucursalAgente, tieneVehiculo);

        // PREGUNTAR INFO FACTURA
        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        int cedulaCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del cliente:"));
        int codigoFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la factura:"));
        double montoFactura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura:"));

    }

}
