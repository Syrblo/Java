public class JavaDoublePrecision {
  /* Print Java double to 2 decimals of precision. */
  public static void main(String[] args) {
    double big   = 1234.12345;
    float  small = 1234.12345f;
    System.out.printf("%,.2f :: %,.3f", big, small);
    /* Example prints: 1,234.12 :: 1234.123 */
  }
}