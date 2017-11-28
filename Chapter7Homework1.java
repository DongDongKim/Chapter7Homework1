import java.util.Scanner;
public class Chapter7Homework1{
    public static void main(String[] args){
        int[] array = new int[8];
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter eight number");
        for(int i=0;i<8;i++){
            array[i]=scan.nextInt();
        }
        for(int i=7;i>=0;i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}