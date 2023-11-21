public class CountCharacterOccurrence {
    public static void main(String[] args) {
        String s = "A device which is capable of generating artificial pacing impulses and delivering them to heart is known as pacemaker";
        int totalCount = s.length();
        int totalCountAfterRemove = s.replace("a", "").length();
        int count = totalCount - totalCountAfterRemove;
        System.out.println("Number of Occurrences of 'a' is: " + count);
    }
}
