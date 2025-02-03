import java.util.Scanner;

class const_arr {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Plz enter any Alphabet: ");
        char user_input = inp.next().charAt(0);

        char consonants[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};

        boolean isConsonant = false;
        for (int i = 0; i < consonants.length; i++) {
            if (user_input == consonants[i]) {
                isConsonant = true;
                break;
            }
        }

        if (isConsonant) {
            System.out.println("Yes, it's a consonant.");
        } else {
            System.out.println("No, it's not a consonant.");
        }
    }
}
