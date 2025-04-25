public class Graduate extends Student {
    private String researchTopic;

    public Graduate(String name, int age, String studentID, String researchTopic) {
        super(name, age, studentID);
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
    }
}