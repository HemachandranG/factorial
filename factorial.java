import java.util.*;
public class Main
{
    static int fact(int num){
        if (num==1){
            return num;
        }
        return num*fact(num-1);
    }
    public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		System.out.println(fact(num));
	}
}
