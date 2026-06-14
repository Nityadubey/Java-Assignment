public class ClassMain05 {
    public static void main(String[] args) {
        String myStr = "Hello %s! One Kilogram is %d bytes";
        String result = String.format(myStr, "world",1024);
        System.out.println(result);
    }}