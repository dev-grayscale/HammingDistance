/**
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 *
 * Given two integers x and y, return the Hamming distance between them.
 *
 * Example:
 *
 * Input: x = 1, y = 4
 * Output: 2
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 * The above arrows point to positions where the corresponding bits are different.
 *
 * https://leetcode.com/problems/hamming-distance/
 */
public class Main {
  /**
   * The solution could be divided in the following steps:
   *
   * 1. Perform xOR on both operands to produce result with 1s at the positions
   * where bits are different.
   * 2. Count the 1s to produce the Hamming distance.
   *
   * Both solutions from <link>MinBitFlipsConversion</link> could solve the problem, although
   * MinBitFlipsConversion#minBitFlipsV2 is entirely identical to this current one.
   */
  public static int hammingDistance(int x, int y) {
    int distance = 0;
    int bits = x ^ y;

    while (bits != 0) {
      bits = (bits & (bits - 1));
      distance++;
    }

    return distance;
  }
}
