package Metodos;

public class Empleado extends Persona {

    private double sueldoBruto;


    public Empleado(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public Empleado(int edad, String nombre, double sueldoBruto) {
        super(edad, nombre);
        this.sueldoBruto = sueldoBruto;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }


    @Override
    public String mostrar() {
        return this.getNombre() + " "  + this.getEdad() + " " + this.sueldoBruto;

    }


    public double calcularSalario() {
        return sueldoBruto * 0.9;
}

}

