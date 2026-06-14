public class ClassMain06 {
    public static void main(String[] args) {
        String template = "Student: %s | Percentage: %.2f%% | Passed: %b";
        String result = String.format(template, "Dodo", 89.456, true);
        System.out.println(result);
    }
}