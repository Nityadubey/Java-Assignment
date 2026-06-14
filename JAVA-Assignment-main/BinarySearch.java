class BinarySearch {
    int search(int arr[], int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int arr[] = {10, 20, 30, 40, 50};
        int res = obj.search(arr, 30);

        if (res != -1)
            System.out.println("Found at index " + res);
        else
            System.out.println("Not Found");
    }
}