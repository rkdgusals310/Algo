import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        BigInteger n=new BigInteger(s.next());
        BigInteger m=new BigInteger(s.next());
        BigInteger gcdNum=n.gcd(m);
        BigInteger nm=n.multiply(m);
        System.out.println(gcdNum);
        System.out.println(nm.divide(gcdNum));
        
    }
}