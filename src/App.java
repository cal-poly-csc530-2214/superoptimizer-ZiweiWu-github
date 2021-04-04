
/**
 * Author: Ziwei Wu
 * This is used to test how fast x+60 is compared to what was given by Aha.
 */
public class App {
    public static void main(String[] args) throws Exception {
        final int num_runs = 50000;

        System.out.printf("10 plus 60 is %d%n", plus_sixty_natural(10));
        System.out.printf("10 plus 60 is %d%n", plus_sixty_opt(10));
        long startTime = System.nanoTime();
        for(int i =0; i<num_runs; i++){
            plus_sixty_natural(10);
        }
        long endTime = System.nanoTime();
        System.out.printf("Time for %d natural plus sixty's: %d ns%n", num_runs, endTime-startTime);

        startTime = System.nanoTime();
        for(int i =0; i<num_runs; i++){
            plus_sixty_opt(10);
        }
        endTime = System.nanoTime();
        System.out.printf("Time for %d optimized plus sixty's: %d ns%n", num_runs, endTime-startTime);
    }

    /**
     * This function contains the expression outputted by the Aha superoptimizer
     * @param x Any 32-bit integer
     * @return The input integer plus 60
     */
    public static int plus_sixty_opt(int x){
        return (((x - ((x + -2) + -2)) << (x - ((x + -2) + -2))) + ((x + -2) + -2));
    }

    /**
     * Regular x+60 in Java
     * @param x Any 32-bit integer
     * @return The input integer with 60 added
     */
    public static int plus_sixty_natural(int x){
        return x+60;
    }
}