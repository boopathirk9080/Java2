public class CountNumDigits{
    public static void main(String[] args) {
   int num=8746863;
   int count=0;
   while(num>0){
    num=num/10;
    count++;
   }
   System.out.println(count);
    }
    }