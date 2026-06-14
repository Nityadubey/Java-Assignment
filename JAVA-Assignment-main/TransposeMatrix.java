public class TransposeMatrix {

    public static int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] result = transpose(matrix);

        System.out.println("Transpose Matrix:");

        for (int[] result1 : result) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result1[j] + " ");
            }
            System.out.println();
        }
    }
}