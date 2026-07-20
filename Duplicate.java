import java.util.Arrays;
public class Duplicate {
    public static void main(String[] args) {
        // Your Code goes here!
        int a[]={1,1,2,2,2,3,3,4};
        int ind=0;

        for(int i=1;i<a.length;i++){
            if(a[i]!=ind){
                a[ind]=a[i];
                ind++;
            }
        }
        System.out.print(Arrays.toString(a));
    }
}