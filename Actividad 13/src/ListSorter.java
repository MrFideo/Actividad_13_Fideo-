import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        // Agregar cadenas
        strings.add("Hola");
        strings.add("Mundo");
        strings.add("Java");
        strings.add("VS Code");
        strings.add("Ordenamiento");
        strings.add("Listas");
        strings.add("Ejemplo");
        strings.add("Programación");
        strings.add("Computadora");
        strings.add("Estudio");

        // Ordenar por longitud usando clase anónima
        strings.sort(new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        System.out.println("Ordenado por longitud (clase anónima): " + strings);

        // Ordenar por longitud usando expresión lambda
        strings.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("Ordenado por longitud (lambda): " + strings);

        // Ordenar por longitud usando método de referencia
        strings.sort(Comparator.comparingInt(String::length));
        System.out.println("Ordenado por longitud (método de referencia): " + strings);

        // Ordenar alfabéticamente usando clase anónima
        strings.sort(new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println("Ordenado alfabéticamente (clase anónima): " + strings);

        // Ordenar alfabéticamente usando expresión lambda
        strings.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Ordenado alfabéticamente (lambda): " + strings);

        // Ordenar alfabéticamente usando método de referencia
        strings.sort(String::compareTo);
        System.out.println("Ordenado alfabéticamente (método de referencia): " + strings);
    }
}
