
public class BinarySearch{
    public static void main(String[] args){
        int  a[]={1,2,3,4,5,6,7,8,9,10};
        int key=100;
        boolean flag=false;

        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==key){
                System.out.println("Element Found");
                flag=true;
                break;
            }
            if(a[mid]<key){
                low=mid+1;
            }
            if(a[mid]>key){
                high=mid-1;
            }
        }
        if(flag==false){
            System.out.println("Element Not Found");
        }

    }
}
