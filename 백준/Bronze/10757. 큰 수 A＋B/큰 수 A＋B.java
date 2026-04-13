import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        BigInteger a=new BigInteger(s.next());
        BigInteger b=new BigInteger(s.next());
        System.out.println(a.add(b));   
        /*
        System.out.println("덧셈(+) :" +bigNumber1.add(bigNumber2));
        System.out.println("뺄셈(-) :" +bigNumber1.subtract(bigNumber2));
        System.out.println("곱셈(*) :" +bigNumber1.multiply(bigNumber2));
        System.out.println("나눗셈(/) :" +bigNumber1.divide(bigNumber2));
        System.out.println("나머지(%) :" +bigNumber1.remainder(bigNumber2));
        
        https://lsmman.tistory.com/47
        */
    }
}