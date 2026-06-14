public class ClassMain01 {
    public static void main(String[] args) {
        char[] myStr1 ={'h','e','l','l','o'};
        String myStr2 = "";

        myStr2 = myStr2.copyValueOf(myStr1,0,5);
        System.out.println("Returned String:"+myStr2);
    }
}