/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examendiego;

/**
 *
 * @author Diego
 */
public class Agente {
    //ATRIB
    
    private String Nombre;
    private int Cedula;
    private int Codigo;
    private String Sucursal;
    private String TieneVehiculo;

    //METODOS, GETTERS AND SETTERS
    
    public Agente(String Nombre, int Cedula, int Codigo, String Sucursal, String TieneVehiculo) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Codigo = Codigo;
        this.Sucursal = Sucursal;
        this.TieneVehiculo = TieneVehiculo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getSucursal() {
        return Sucursal;
    }

    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }

    public String getTieneVehiculo() {
        return TieneVehiculo;
    }

    public void setTieneVehiculo(String TieneVehiculo) {
        this.TieneVehiculo = TieneVehiculo;
    }
    
}
