/**
 * Bu Math class hissoblanadi
 *
 * @author mirodilfayzullayev
 * @version 1
 * @since 2026.02.17
 */

public class Math {

    /**
     * bu method yig'adie
     *
     * @param args array of numbers
     * @return int
     * @see String#valueOf(int)
     * @see <a href="https://example.com">External Reference</a>
     *
     */
    public int sum(int... args) {
        int sum = 0;

        for (int arg : args) {
            sum += arg;
        }

        return sum;
    }
}


