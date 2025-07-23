class Sum {
    public static void main(String args[]) {
        int sum = 0;
        int n = 10; // Total numbers from 1 to 10
        for (int i = 1; i <= n; i++) { // Declare i as int
            sum += i;
        }
        System.out.println("Sum: " + sum);
        float avg = (float) sum / n; // Cast sum to float for accurate division
        System.out.println("Avg: " + avg);
    }
}

