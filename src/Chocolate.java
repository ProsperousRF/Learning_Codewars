/**
 * Your task is to split the chocolate bar of given dimension n x m into small squares. Each square
 * is of size 1x1 and unbreakable. Implement a function that will return minimum number of breaks
 * needed.
 *
 * <p>For example if you are given a chocolate bar of size 2 x 1 you can split it to single squares
 * in just one break, but for size 3 x 1 you must do two breaks.
 *
 * <p>If input data is invalid you should return 0 (as in no breaks are needed if we do not have any
 * chocolate to split). Input will always be a non-negative integer.
 *
 * @author Stanislav Rakitov
 */
public class Chocolate {
  public static int breakChocolate(int n, int m) {
    if (n <= 1 && m <= 1 ) return 0;
    int res =(n * m - 1);
    return Math.max(res, 0);

    // And the shorter version
    // return Math.max(m * n -1, 0);
  }
}