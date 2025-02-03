class Task5 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 0, 0, 1},
            {1, 0, 1, 0, 1},
            {1, 0, 0, 1, 1},
            {1, 0, 0, 0, 1}
        };
        boolean containsN = true;
        int rows = matrix.length, cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] != 1 || matrix[i][cols - 1] != 1) {
                containsN = false;
                break;
            }
        }
        if (containsN) {
            System.out.println("The matrix contains the letter 'N'.");
        } else {
            System.out.println("The matrix does not contain the letter 'N'.");
        }
    }
}
