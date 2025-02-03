class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int index = 0;
        int number = 1;


        do {
            array[index] = number * number;
            number++;
            index++;
        } while (index < 9);
        array[9] = 0; 

        int sumOdd = 0;
        index = 0;
        while (index < array.length) {
            if (array[index] == 81) {
                break; 
            }
            if (array[index] % 2 != 0) {
                sumOdd += array[index];
            }
            index++;
        }

     
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}
