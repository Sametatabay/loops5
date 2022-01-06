import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int n,r;
    Scanner inp=new Scanner(System.in);

    System.out.print("Enter the number to get the exponent :");
    n=inp.nextInt();
    System.out.print("Enter the number to be the exponent :");
    r=inp.nextInt();


    int total=1;
    for (int i=1;i<=r;i++){
        total *=n;
    }
    System.out.println("Reply : "+total);
    }
}
