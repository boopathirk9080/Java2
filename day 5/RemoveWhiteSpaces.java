public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String s = "mistakes makes man perfect";
        s = s.replaceAll("\\s", "");
        System.out.println(s);
    }
}

