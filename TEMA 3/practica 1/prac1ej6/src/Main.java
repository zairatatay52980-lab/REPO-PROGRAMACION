import javax.swing.JOptionPane;
import Excepciones.*;

public class Main {

    private static final String[] ARRAYPRODUCTOS={"10","23","30","47","55","65","135","256","526","663"};
    private static int[] arrayUnidades= new int[10];

    public static void main(String[] args) {
        try
        {
            char continuar;

            do
            {
                int posicion = solicitarCodigo();
                int unidades = solicitarUnidades();

                arrayUnidades[posicion] = arrayUnidades[posicion] + unidades;

                continuar=controlContinuar();
            }
            while (continuar == 's');

            ordenarDatos();

            salidaDatos();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getClass());
        }

    }


    private static void ordenarDatos() throws Exception
    {
        String auxiliarCodigo;
        int auxiliarUnidades;

        for (int x = 0; x < arrayUnidades.length - 1; x++)
        {
            for (int y = x+1 ;y <arrayUnidades.length; y++)
            {
                if (arrayUnidades[x] > arrayUnidades[y])
                {
                    auxiliarUnidades = arrayUnidades[x];
                    arrayUnidades[x] = arrayUnidades[y];
                    arrayUnidades[y] = auxiliarUnidades;

                    auxiliarCodigo = ARRAYPRODUCTOS[x];
                    ARRAYPRODUCTOS[x] = ARRAYPRODUCTOS[y];
                    ARRAYPRODUCTOS[y] = auxiliarCodigo;
                }
            }
        }


    }

    private static int solicitarCodigo() throws Exception
    {
        int posicion;
        do
        {
            try
            {
                String codigo = JOptionPane.showInputDialog("Teclea el codigo del producto");
                posicion=busquedaCodigo(codigo);
            }
            catch(CodigoNoValido e)
            {
                StringBuilder texto= new StringBuilder("Los codigos permitidos son: \n");
                for (String arrayProducto : ARRAYPRODUCTOS)
                    texto.append(arrayProducto).append(" ");
                JOptionPane.showMessageDialog(null, texto.toString());
                posicion=ARRAYPRODUCTOS.length; // para volver a entrar en la repetitiva
            }
        }
        while (posicion ==ARRAYPRODUCTOS.length);
        return posicion;
    }

    public static int solicitarUnidades() throws Exception
    {
        int unidades=0;
        boolean error = true;
        do
        {
            try
            {
                unidades = Integer.parseInt(JOptionPane.showInputDialog("Teclea las unidades vendidas: "));
                if (unidades <= 0)
                    throw new UnidadesNoValidas();
                error = false;
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Las unidades han de ser numéricas");
            }
            catch(UnidadesNoValidas e){
                JOptionPane.showMessageDialog(null,"Las unidades han de ser mayores que cero");
            }
        }
        while (error);

        return unidades;

    }

    private static int busquedaCodigo(String codigo) throws Exception
    {
        int x;

        for(x=0; x<ARRAYPRODUCTOS.length && !ARRAYPRODUCTOS[x].equals(codigo); x++){}
        if(x==ARRAYPRODUCTOS.length)
        {
            throw new CodigoNoValido();
        }

        return x;
    }

    private static char controlContinuar() throws Exception
    {
        char continuar=' ';
        while (continuar!='s' && continuar!='n')
        {
            continuar = JOptionPane.showInputDialog("Desea continuar <s/n> ").toLowerCase().charAt(0);
        }
        return continuar;
    }

    private static void salidaDatos()
    {
        int totalCantidad=0;
        StringBuilder texto= new StringBuilder("Producto   Unidades vendidas" + ("\n--------   -----------------"));
        for (int x = 0; x < ARRAYPRODUCTOS.length; x++)
        {
            texto.append("\n").append(ARRAYPRODUCTOS[x]).append("             ").append(arrayUnidades[x]);
            totalCantidad = totalCantidad + arrayUnidades[x];
        }
        texto.append("\n El número total de unidades vendidas asciende a:").append(totalCantidad);
        JOptionPane.showMessageDialog(null, texto.toString());

    }
}
