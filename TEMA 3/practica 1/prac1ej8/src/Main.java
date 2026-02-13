import javax.swing.*;

public class Main {


    static double[][]notas;
    static String[] nombreAsignaturas;

    public static void main(String[] args) {
    boolean error;
    do{
        error = false;

        try{

            pedirDatos();
            solicitarNotas();
            mediaAlumno();

        }catch(Exception e){
            error = true;
            JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }


    }while(error);

    }

    public static void pedirDatos() throws Exception{
        int numeroAlumnos = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de alumnos"));
        int numeroAsignaturas = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de asignaturas"));

        notas = new double[numeroAlumnos][numeroAsignaturas];


    }

    public static void solicitarNotas() throws Exception{

        for(int i=0;i<notas.length;i++){
            for(int j=0;j<notas[i].length;j++){
                notas[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Teclea la nota "+ (j+1) + " del alumno "+(i+1) +": "+notas[i][j]));
            }
        }

    }

    public static void mediaAlumno() throws Exception{

        StringBuilder enseñarMedia = new StringBuilder();

        
        }



    }



}