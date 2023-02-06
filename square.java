public class square {    
    public static boolean isSquare(int n) {        
        long s = Math.round(Math.sqrt(n));
        return s * s == n;
    }
}
