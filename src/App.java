import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        MetodosOrdenamientos metodosOrdenamientos = new MetodosOrdenamientos();
        int[] sizes = {10, 20, 100, 1000, 5000, 10000, 30000};

        System.out.println("Método Burbuja con Ajustes");
        for (int size : sizes) {
            int[] array = generateRandomArray(size);
            int[] arrayCopy = Arrays.copyOf(array, array.length);
            long startTime = System.nanoTime();
            MetodosOrdenamientos.bubbleSort(arrayCopy);
            long endTime = System.nanoTime();
            System.out.printf("Con %d valores el tiempo es de %.3f ms.%n", size, (endTime - startTime) / 1e6);
        }

        System.out.println("\nMétodo Selección");
        for (int size : sizes) {
            int[] array = generateRandomArray(size);
            long startTime = System.nanoTime();
            MetodosOrdenamientos.selectionSort(array.clone());
            long endTime = System.nanoTime();
            System.out.printf("Con %d valores el tiempo es de %.3f ms.%n", size, (endTime - startTime) / 1e6);
        }

        System.out.println("\nMétodo Inserción");
        for (int size : sizes) {
            int[] array = generateRandomArray(size);
            long startTime = System.nanoTime();
            MetodosOrdenamientos.insertionSort(array.clone());
            long endTime = System.nanoTime();
            System.out.printf("Con %d valores el tiempo es de %.3f ms.%n", size, (endTime - startTime) / 1e6);
        }

        System.out.println("\nMétodo Búsqueda Binaria");
        for (int size : sizes) {
            int[] array = generateRandomArray(size);
            MetodosOrdenamientos.bubbleSort(array); // Ordenar antes de la búsqueda binaria
            int objetivo = array[new Random().nextInt(size)];
            long startTime = System.nanoTime();
            int index = MetodosOrdenamientos.busquedaBinaria(array, objetivo);
            long endTime = System.nanoTime();
            System.out.printf("Con %d valores, objetivo %d, el tiempo es de %.3f ms (índice: %d).%n", 
                              size, objetivo, (endTime - startTime) / 1e6, index);
        }
    }

    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(1000);
        }
        return array;
    }
}
