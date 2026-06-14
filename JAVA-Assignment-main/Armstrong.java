class Armstrong {
    void checkArmstrong(int num) {
        int original = num, sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit * digit * digit;
            num = num / 10;
        }

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }

    public static void main(String[] args) {
        Armstrong obj = new Armstrong();
        obj.checkArmstrong(153);
    }
}