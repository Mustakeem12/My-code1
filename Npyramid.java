public class Npyramid {
    public static void number_pyramid(int n) {
        // outer loop for number of rows
        for (int i = 1; i <= n; i++) {
            // inner loop for number of spaces
            for(int j=1; j<=n-i+1; public class Npyramid {
    public static void numberPyramid(int n) {
        // outer loop for number of rows
        for (int i = 1; i <= n; i++) {
            // inner loop for number of spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // movej++){
                System.out.print(j+" ");
            }
            }
            // move to the next line after printing each row
            System.out.println();
        }
        public static void main(String[] args) {
            number_pyramid(5);
        }
    }

