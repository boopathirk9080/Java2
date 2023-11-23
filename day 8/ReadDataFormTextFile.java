import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadDataFormTextFile {
    public static void maid(String[] args) throws FileNotFoundException {
        FileReader Fr=new FileReader(/home/boopathi/Documents/c/day8/test.txt);
BufferedReader Br=new BufferedReader(Fr);
String Str;
while((Str=Br.readLine)()!=null){
    System.out.println(str);
}
br.close();
    }
}
