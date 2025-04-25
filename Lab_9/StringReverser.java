public class StringReverser {
    private String inputString;
    private String reversedString = "";
    
    public void reverse(String inputString) {
        this.inputString = inputString;
        for (int i = this.inputString.length() - 1; i >= 0; i--) {
            this.reversedString += this.inputString.charAt(i);
        }
        System.out.println(this.reversedString);
    }

    public static void main(String[] args) {
        StringReverser reverser = new StringReverser();
        reverser.reverse("hello");
    }
}