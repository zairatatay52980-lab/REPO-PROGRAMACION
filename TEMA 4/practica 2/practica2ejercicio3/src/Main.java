import Metodos.Directivo;
import Metodos.Empleado;
import Metodos.Empresa;

public class Main {
    public static void main(String[] args) {

                Empresa miEmpresa = new Empresa("Tech Corp");

                // Crear Empleados
                Empleado emp1 = new Empleado();
                Empleado emp2 = new Empleado();

                // Crear Directivos
                Directivo dir1 = new Directivo(45, "Carlos", 5000, "Gerente");
                Directivo dir2 = new Directivo(50, "Elena", 6000, "CEO");


                // Resultado
                System.out.println("El directivo con más subordinados es: " + get.Subordinados();

            }
        }

    }
}
