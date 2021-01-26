public class BinarySearch {
    public int binarySearch(int arr[], int l, int r, int x) {
        if (r >= 1) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            else
                return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int arr[] = {1,3,6,8,9,23,36,47,59,94};
        int n = arr.length;
        int result = bs.binarySearch(arr, 0, n -1, 36);
        if(result == -1)
            System.out.println("Element doesn't present");
        else
            System.out.println("found at index " + result);
    }
}
