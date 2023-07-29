import java.math.BigInteger;

public class binary_score {
  public static BigInteger score (BigInteger n) {
    int highestBitSet = n.bitLength() - 1;
    BigInteger score = BigInteger.ZERO;

    for (int i = 0; i <= highestBitSet; i++) {
      score = score.setBit(i);
    }
    
    return score;
  }
}
