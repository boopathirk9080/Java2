

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {10,27,35,38,15};
        int Search_element=35;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(Search_element==arr[i]){
                System.out.println("Element Found at :"+i);
                flag=true;
                break;
                
            }
        }
        if(flag==false){
         System.out.println("Element not Found");
        }
        }
    }