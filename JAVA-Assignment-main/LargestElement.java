class LargestElement {
    int findMax() {
        int arr[] = {10, 75, 22, 78, 99};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        LargestElement obj = new LargestElement();
        int result = obj.findMax();
        System.out.println("Max = " + result);
    }
}