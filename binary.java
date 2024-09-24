public class binary {
    public static void main(String[] args) {
        int[] arr = { 25, 453, 345, 5 };
        int num = 5;
        System.out.println("Original array is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        int l = 0;
        int r = arr.length;
        while(l < r){
            int mid = l + (r - l)/2;
            if(arr[mid] == num){
                System.out.println("Number found at: " + mid);
                break;
            } else if(arr[mid] < num){
                r = mid - 1;
            } else if(arr[mid] > num){
                l = mid + 1;
            }
        }
    }
}