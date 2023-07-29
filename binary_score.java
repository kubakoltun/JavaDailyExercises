import java.math.BigInteger;

public class binary_score {
  public static BigInteger score (BigInteger n) {
    BigInteger sore = BigInteger.ZERO;
    
    for (BigInteger i = BigInteger.ZERO;  i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
      sore = sore.or(i);
    }
    
	  return sore;
  }
}
