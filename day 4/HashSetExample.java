import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> machine = new HashSet<>();
        System.out.println(machine.add("EEG"));
        System.out.println(machine.add("EMG"));
        System.out.println(machine.add("EEG"));
    }
}
