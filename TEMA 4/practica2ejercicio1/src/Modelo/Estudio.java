package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Estudio {

    private String nombre;
    private String ciudad;
    private String direccion;
    private String direccionWeb;
    private LocalDate fechaFundacion;
    private String pais;
    private List<String> telefonos;

    public Estudio() {
    }

    public Estudio(String nombre, String ciudad, String direccion, String direccionWeb, LocalDate fechaFundacion, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.direccionWeb = direccionWeb;
        this.fechaFundacion = fechaFundacion;
        this.pais = pais;

    }

    //constructor sin telefonos


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getTelefonos() {
        return telefonos;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getDireccionWeb() {
        return direccionWeb;
    }

    public void setDireccionWeb(String direccionWeb) {
        this.direccionWeb = direccionWeb;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    public void setTelefonos(List<String> telefonos) {
        this.telefonos = telefonos;
    }

    public void setTelefono(String t) {
        if (this.telefonos == null) {
            this.telefonos = new ArrayList<>();


        }
    }
}
