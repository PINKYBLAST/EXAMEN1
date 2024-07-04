/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examendiego;

/**
 *
 * @author Diego
 */
public class Factura {
    
    //ATRIB
    
    private String NombreCliente;
    private int CedulaCliente;
    private int CodigoFactura;
    private double MontoFactura;
    private int NumeroMes;
    private int ProductosElec;
    private int ProductosAuto;
    private int ProductosCons;
    
    //METOD, GETTERS AND SETTERS
    public Factura(String NombreCliente, int CedulaCliente, int CodigoFactura, double MontoFactura, int NumeroMes, int ProductosElec, int ProductosAuto, int ProductosCons) {
        this.NombreCliente = NombreCliente;
        this.CedulaCliente = CedulaCliente;
        this.CodigoFactura = CodigoFactura;
        this.MontoFactura = MontoFactura;
        this.NumeroMes = NumeroMes;
        this.ProductosElec = ProductosElec;
        this.ProductosAuto = ProductosAuto;
        this.ProductosCons = ProductosCons;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public int getCedulaCliente() {
        return CedulaCliente;
    }

    public void setCedulaCliente(int CedulaCliente) {
        this.CedulaCliente = CedulaCliente;
    }

    public int getCodigoFactura() {
        return CodigoFactura;
    }

    public void setCodigoFactura(int CodigoFactura) {
        this.CodigoFactura = CodigoFactura;
    }

    public double getMontoFactura() {
        return MontoFactura;
    }

    public void setMontoFactura(double MontoFactura) {
        this.MontoFactura = MontoFactura;
    }

    public int getNumeroMes() {
        return NumeroMes;
    }

    public void setNumeroMes(int NumeroMes) {
        this.NumeroMes = NumeroMes;
    }

    public int getProductosElec() {
        return ProductosElec;
    }

    public void setProductosElec(int ProductosElec) {
        this.ProductosElec = ProductosElec;
    }

    public int getProductosAuto() {
        return ProductosAuto;
    }

    public void setProductosAuto(int ProductosAuto) {
        this.ProductosAuto = ProductosAuto;
    }

    public int getProductosCons() {
        return ProductosCons;
    }

    public void setProductosCons(int ProductosCons) {
        this.ProductosCons = ProductosCons;
    }
    
    //INFO PARA INPUT 
    
    public String getFacturaInfo() {
        return "Nombre del Cliente: " + NombreCliente + "  " + "Cedula del Cliente: " + CedulaCliente + "\n" + "Codigo de Factura: " + CodigoFactura + "  " + "Monto de Factura: " + MontoFactura + "\n" +"Numero de Mes: " + NumeroMes + " " + "Productos Electricos: " + ProductosElec + "\n" + "Productos Automotrices: " + ProductosAuto + "  " + "Productos de Construccion: " + ProductosCons;           
    }
}
