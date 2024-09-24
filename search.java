public class search {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 35, 5 };

        System.out.println("Original array is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i = 0; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.println("Sorted array is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
