import java.util.Arrays;
public class RunningSum{
    public static void main(String[] args){
        int a[]={1,2,3,4};
        for(int i=1;i<a.length;i++){
            a[i]=a[i]+a[i-1];
        }
        System.out.print(Arrays.toString(a));
            
        
    }
}