import java.util.Arrays;
public class CheckArraysEqual_2{
    public static void main(String[] args) {
        int a1[]={5,4,3,2,1};
        int a2[]={5,4,3,2,1};
        boolean status=true;
        if(a1.length==a2.length){
            for(int i=0;i<a1.length;i++){
                if(a1[i]!=a2[i]){
                    status=false;
                }
            }

        }
        else{
            status=false;
        }

        if(status==true){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }


       

    }
}