import javax.swing.JOptionPane;
import Excepciones.*;

public class Main {

    // Globales --- No parámetros, no return.
    private static final String[] arrayProductos={"10","23","30","47","55","65","135","256","526","663"};
    private static int[] arrayUnidades= new int[10];

    public static void main(String[] args) {
        try
        {
            char continuar;

            // Entrada de datos
            do
            {
                int posicion = solicitarCodigo();
                int unidades = solicitarUnidades();

                // Guardar los datos
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
        // https://www.discoduroderoer.es/formas-de-ordenar-un-array-en-java/
        // https://www.youtube.com/watch?v=IiqbrAxzo0A
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

                    auxiliarCodigo = arrayProductos[x];
                    arrayProductos[x] = arrayProductos[y];
                    arrayProductos[y] = auxiliarCodigo;
                }
            }
        }


        // Arrays.sort(miArray);
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
                for (String arrayProducto : arrayProductos)
                    texto.append(arrayProducto).append(" ");
                JOptionPane.showMessageDialog(null, texto.toString());
                posicion=arrayProductos.length; // para volver a entrar en la repetitiva
            }
        }
        while (posicion == arrayProductos.length);
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

        for(x=0; x<arrayProductos.length && !arrayProductos[x].equals(codigo); x++){}
        if(x==arrayProductos.length)
        {
            throw new CodigoNoValido(); // relanzo
        }

        return x;
        // (El de los códigos está ordenado -- return Arrays.binarySearch(arrayProductos, codigo);
        // Arrays.asList().contains(codigo) Devuelve boolean
        // Arrays.asList().indexOf(codigo) Devuelve posición o -1
        //  boolean encontrado =  Arrays.stream(arrayProductos).anyMatch(e -> e.equals(codigo));

    }

    private static char controlContinuar() throws Exception
    {
        // try
        char continuar=' ';
        while (continuar!='s' && continuar!='n')
        {
            continuar = JOptionPane.showInputDialog("Desea continuar <s/n> ").toLowerCase().charAt(0);
        }
        return continuar;
        // showConfirmDialog
    }

    private static void salidaDatos()
    {
        int totalCantidad=0;
        StringBuilder texto= new StringBuilder("Producto   Unidades vendidas" + ("\n--------   -----------------"));
        for (int x = 0; x < arrayProductos.length; x++)
        {
            // if (arrayUnidades[x] != 0)
            texto.append("\n").append(arrayProductos[x]).append("             ").append(arrayUnidades[x]);
            totalCantidad = totalCantidad + arrayUnidades[x];
        }
        texto.append("\n El número total de unidades vendidas asciende a:").append(totalCantidad);
        JOptionPane.showMessageDialog(null, texto.toString());

        /*
        int index = 0;
        for (String producto : arrayProductos) {
            texto.append("\n").append(producto)
            .append("             ").append(arrayUnidades[index]);
            totalCantidad += arrayUnidades[index];
            index++;
        }
         */

        /*

         */
    }
}
