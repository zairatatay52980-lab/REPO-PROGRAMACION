package Metodos;

public class Empleado extends Persona{

    private double sueldoBruto;


    public Empleado(String nombre,int edad,double sueldo)
    {

        super(nombre,edad);

        this.sueldoBruto = sueldo;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public String mostrar(){

        return this.getNombre() + " " + this.getEdad() + " " + this.getSueldoBruto();
    }

    public Double calcularSalarioNeto(){
        return sueldoBruto * 0.9;
    }

}

