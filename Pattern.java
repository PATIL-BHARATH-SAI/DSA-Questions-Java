public class Pattern {
    
    private static final char[] n = null;
    public static void main(String[] args) {

        Block(5);
        System.out.println(" " );
        pattern(5);
        System.out.println(" " );
        pattern2(5);
    }

// For Block
    // * * * * * 
    // * * * * * 
    // * * * * * 
    // * * * * * 
    // * * * * * 
    static void Block(int n) {
        System.out.println("For Block");
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n; col++) {
                
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern(int n) {
        System.out.println("For RightAngleTriangle");
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
    
    
 
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
}
