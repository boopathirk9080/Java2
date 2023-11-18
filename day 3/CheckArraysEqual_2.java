public class MissingNumberInArray {
    public static void main(String[] args){
        int a1[]={1,2,4,5,6,7};
        int sum1=0;
        for(int i=0;i<a1.length;i++){
            sum1=sum1+a1[i];
        }
        int sum2=0;
        int lastvalue=a1.length+2;
        for(int i=1;i<lastvalue;i++){
            sum2=sum2+i;
        }
        int missed_value=sum2-sum1;
        System.out.println("Missed value is :"+missed_value);
    }
}