public class Maximumwealth {
    public static int maximumWealth(int[][] accounts) {

        int max = 0;

        for (int[] customer : accounts) {
            int sum = 0;

            for (int money : customer) {
                sum += money;
            }

            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] acc = {
                {1,2,3},
                {3,2,1}
        };

        System.out.println(maximumWealth(acc));
    }
}