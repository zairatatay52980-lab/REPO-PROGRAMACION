package Modelo;

public class Persona {
    private String nombre;
    private String dNacimiento;
    private String mNacimiento;
    private String direccion;
    private String codigoPostal;
    private String ciudad;


    public Persona() {
    }

    public Persona(String nombre, String ciudad, String codigoPostal, String direccion, String mNacimiento, String dNacimiento) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.direccion = direccion;
        this.mNacimiento = mNacimiento;
        this.dNacimiento = dNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getmNacimiento() {
        return mNacimiento;
    }

    public void setmNacimiento(String mNacimiento) {
        this.mNacimiento = mNacimiento;
    }

    public String getdNacimiento() {
        return dNacimiento;
    }

    public void setdNacimiento(String dNacimiento) {
        this.dNacimiento = dNacimiento;
    }
}
