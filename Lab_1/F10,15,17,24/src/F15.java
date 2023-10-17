public class F15 {
    public static int[] odwroctab(int[] array) {
        int[] reversed = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }

        return reversed;
    }
    public static void main(String[] args) {
        int[] ogArray = {1, 2, 3, 4, 5};
        int[] revArray = odwroctab(ogArray);

        System.out.println("Tablica przed odwróceniem:");
        for (int num : ogArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nTablica po porcesie:");
        for (int num : revArray) {
            System.out.print(num + " ");
        }
    }


}

