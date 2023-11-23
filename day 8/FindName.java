public class NameSearch {
    public static void main(String[] args) {
        String[] names = {"Aravind", "Boopathi", "ajmal", "hari", "george", "jega","arun"};
        String nameToSearch = "Boopathi";
        boolean found = searchName(names, nameToSearch);
        if (found) {
            System.out.println("The name '" + nameToSearch + "' was found.");
        } else {
            System.out.println("The name '" + nameToSearch + "' was not found.");
        }
    }
    public static boolean searchName(String[] names, String nameToSearch) {
        for (String name : names) {
            if (name.equals(nameToSearch)) {
                return true; 
            }
        }
        return false;
    }
}

