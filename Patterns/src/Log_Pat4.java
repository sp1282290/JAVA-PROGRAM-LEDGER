class Log_Pat4 {
    public static void main(String[] args) {
        // Use nested for loops to print the given pattern
        for(int i=1 ; i <= 5 ; i++) {
            for(int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}