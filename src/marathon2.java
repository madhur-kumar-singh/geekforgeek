import java.util.Scanner;

public class marathon2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            inputData();
        }
    }
    public static void inputData(){
        int arr[]=new int[4];
        int count=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        int first=arr[0];
        for(int num:arr){
            if(first<num)
                count++;
        }
    }
}
