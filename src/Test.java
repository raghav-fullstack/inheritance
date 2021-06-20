public class Test extends Child{
    public static void main(String[] args) {
        //Test test = new Test(1,"child through all arg constuscutor");

        Child test = new Child(1,"String for parent throgh child constructor.",40,"This is for child String through all args constructor.");
        test.setChildInt(20);
        test.childString="This is child string.";

       // test.setParentInt(40);
        //test.setParentString("This is Parent String.");

        test.f1();

        test.f1();

        System.out.println(test);
    }
}
