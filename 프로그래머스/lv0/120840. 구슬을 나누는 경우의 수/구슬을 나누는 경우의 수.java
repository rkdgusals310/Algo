import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger n = fact(balls);
        BigInteger r = fact(share);
        BigInteger nr = fact(balls - share);

        BigInteger ans = n.divide(r.multiply(nr));
        return ans.intValueExact();
    }

    private BigInteger fact(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
