public class RemoveSpecificWord {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence. Remove 'sample' from this.";
        String wordToRemove = "sample";
        String updatedSentence = removeWord(sentence, wordToRemove);
        System.out.println("Original sentence: " + sentence);
        System.out.println("Sentence after removing '" + wordToRemove + "': " + updatedSentence);
    }
    public static String removeWord(String sentence, String wordToRemove) {
        return sentence.replaceAll( wordToRemove , "");
    }
}

