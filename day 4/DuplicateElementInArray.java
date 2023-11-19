
import java.util.HashSet;

public class DuplicateElementInArray_Useing_HashSet {
    public static void main(String[] args) {
        String arr[] = {"EEG", "ECG", "EMG", "EOG", "ECG"};

        HashSet <String> machine=new (HashSet);
        for(String Mn :arr)
        {
            System.out.println(machine.add(Mn));
        }
    }
}
