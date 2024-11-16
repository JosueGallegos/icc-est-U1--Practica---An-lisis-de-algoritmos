public class MetodosOrdenamientos {
    public static void bubbleSort(int[] array) {
        boolean swapped;
        int n = array.length;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
    

public static void selectionSort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < array.length; j++) {
            if (array[j] < array[minIndex]) {
                minIndex = j;
            }
        }
        int temp = array[minIndex];
        array[minIndex] = array[i];
        array[i] = temp;
    }
}

public static void insertionSort(int[] array) {
    for (int i = 1; i < array.length; i++) {
        int key = array[i];
        int j = i - 1;
        while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = key;
    }
}
public static int busquedaBinaria(int[] lista, int objetivo) {
    int inicio = 0;
    int fin = lista.length - 1;

    while (inicio <= fin) {
        int medio = (inicio + fin) / 2;

        if (lista[medio] == objetivo) {
            return medio;
        } else if (lista[medio] < objetivo) {
            inicio = medio + 1; 
        } else {
            fin = medio - 1;
        }
    } return -1;
}

}
