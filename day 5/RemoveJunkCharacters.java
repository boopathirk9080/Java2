public class RemoveJunkCharacters {
    public static void main(String[] args) {
        String s = "@$$%%FH}{:>?}EmarajAn3508078";
        s = s.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(s);
    }
}

