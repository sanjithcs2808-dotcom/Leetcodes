import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        // Your Code goes here!
        int a[]={5,1,0,4,13};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                
                }
            }
        }
        System.out.print(Arrays.toString(a));
    }
}