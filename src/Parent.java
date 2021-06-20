
public class Parent {

    int parentInt;
    String parentString;

    public Parent(){
        System.out.println("This is Parent NoArgConstructor");
    }

    public Parent(int parentInt, String parentString) {
        this.parentInt = parentInt;
        this.parentString = parentString;
        System.out.println("This is Parent AllArgConstructor");
    }

    public int getParentInt() {
        return parentInt;
    }

    public void setParentInt(int parentInt) {
        this.parentInt = parentInt;
    }

    public String getParentString() {
        return parentString;
    }

    public void setParentString(String parentString) {
        this.parentString = parentString;
    }

    void f1(){
        System.out.println("\n This is parent method. ");
    }
}
