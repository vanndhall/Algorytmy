package JavaPoz15;

public class Test2 {
    private String testString;
    String user;

    public Test2(String testString, String user){
        this.testString = testString;
        this.user = user;
    }

    public String toString() {
        return testString+ " "+ user;
    }
}
