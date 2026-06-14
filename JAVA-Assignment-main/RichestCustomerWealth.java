public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for (int[] account : accounts) {
            int wealth = 0;
            for (int j = 0; j < account.length; j++) {
                wealth += account[j];
            }
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }

        return maxWealth;
    }

    public static void main(String[] args) {

        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };

        System.out.println("Richest Customer Wealth = "
                + maximumWealth(accounts));
    }
}