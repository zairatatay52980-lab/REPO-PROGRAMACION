package Metodos;

public class Cliente extends Persona {

        private int telefono;


    public Cliente(int edad, String nombre, int telefono) {
        super(edad, nombre);
        this.telefono = telefono;
    }


    public int getTelefono() {
            return telefono;
        }

    public void setTelefono(int telefono) {
            this.telefono = telefono;
        }


    public String mostrar() {
        return super.mostrar()+ " " +  this.telefono;
    }
}

