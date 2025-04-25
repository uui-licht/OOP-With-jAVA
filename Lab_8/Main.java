public class Main {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        HDFC hdfc = new HDFC();
        
        System.out.println("SBI Interest Rate: " + sbi.getInterestRate());
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate());
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate());
    }
}