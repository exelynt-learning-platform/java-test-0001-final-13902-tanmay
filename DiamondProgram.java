class Main {
   

    public static void main(String[] args) {
        int n = 5;

        for (int i = -n + 1; i < n; i++) {
            int s = Math.abs(i);

            for (int j = 0; j < s; j++)
                System.out.print(" ");

            System.out.print("*");

            if (s != n - 1) {
                for (int j = 0; j < 2 * (n - s) - 3; j++)
                    System.out.print(" ");
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
