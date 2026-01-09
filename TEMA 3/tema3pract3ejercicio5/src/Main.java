
import javax.swing.*;
import java.time.LocalDate;
import java.util.*;

public class Main {
private static Map<String, Double> gastosMensuales = new HashMap<>();
private static final List<String> MESES = Arrays.asList(
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
                );

    public static void main(String[] args) {
        try {
            solicitarDatos();
            mostrarResultados();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error crítico: " + e.getMessage());
        }
    }

    public static void solicitarDatos() {
        String datos;
        do {
            datos = JOptionPane.showInputDialog("Teclea: día, mes, cantidad\n"
                    + "(o escribe 'fin' para terminar) ");

            if (datos != null && !datos.equalsIgnoreCase("fin")) {
                procesarDatos(datos);
            }

        } while (datos != null && !datos.equalsIgnoreCase("fin"));

        JOptionPane.showMessageDialog(null, "Saliendo...");
    }

    public static void procesarDatos(String datos) {
        try {
            String[] partes = datos.split(",");

            if (partes.length != 3) {
                throw new Exception("Formato incorrecto");
            }

            int dia = Integer.parseInt(partes[0].trim());
            String mes = partes[1].trim();
            // Capitalizar el mes para que coincida con la lista (ej: "enero" -> "Enero")
            mes = mes.substring(0, 1).toUpperCase() + mes.substring(1).toLowerCase();
            double cantidad = Double.parseDouble(partes[2].trim());

            // 1. Validar si el mes existe
            if (!MESES.contains(mes)) {
                throw new Exception("El mes '" + mes + "' no es válido.");
            }

            // 2. Validar fecha real (ej. evitar 31 de Abril) usando LocalDate
            int numMes = MESES.indexOf(mes) + 1;
            LocalDate.of(LocalDate.now().getYear(), numMes, dia);

            // 3. Acumular gasto en el Map
            // getOrDefault devuelve el valor actual o 0.0 si es la primera vez
            gastosMensuales.put(mes, gastosMensuales.getOrDefault(mes, 0.0) + cantidad);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Día o cantidad deben ser números.");
        } catch (java.time.DateTimeException e) {
            JOptionPane.showMessageDialog(null, "Error: El día no corresponde al mes.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void mostrarResultados() {
        if (gastosMensuales.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay datos para mostrar.");
            return;
        }

        // Convertir el Map a una lista para ordenar
        List<Map.Entry<String, Double>> listaOrdenada = new ArrayList<>(gastosMensuales.entrySet());

        // Ordenar de menor a mayor cantidad
        listaOrdenada.sort(Map.Entry.comparingByValue());

        // Construir el mensaje de salida
        StringBuilder sb = new StringBuilder("Gastos totales ordenados por cantidad:\n");
        for (Map.Entry<String, Double> entrada : listaOrdenada) {
            sb.append(String.format("- %s: %.2f€\n", entrada.getKey(), entrada.getValue()));
        }

        JOptionPane.showMessageDialog(null, sb.toString());
        System.out.println(sb.toString()); // También por consola
    }
}