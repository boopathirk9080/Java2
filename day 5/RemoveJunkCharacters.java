public class RemoveWhiteSpaces{
    public static void main(String[] args) {
        String str= "The Recived Signals Are Converted into Digital Signals By Using A/D Converter And Stored In Memory ";
         System.out.println(str);
       str=str.replaceAll("\\s","");
        System.out.println(str);