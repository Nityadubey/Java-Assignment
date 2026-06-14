class TrimExample01 {
    public static void main(String[] args) {

        String name = "   Rahul Shrivastava   ";

        name = name.trim().replace(" ", "");

        System.out.println(name);
    }
}