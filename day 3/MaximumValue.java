public class MaximumValue {
    public static void main(String[] args){
        int a[]={15,54,32,16,12,30};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum value is :"+max);
    }
}