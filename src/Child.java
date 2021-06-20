public class Child extends Parent{
    int childInt;
    String childString;

    public Child(){
        System.out.println("This is child NoArgConstructor");

    }

    public Child(int childInt, String childString) {
        this.childInt = childInt;
        this.childString = childString;
        System.out.println("This is child AllArgConstructor");
    }

    public Child(int a, String b, int c, String d) {
        super();
        this.childInt = childInt;
        this.childString = childString;
        System.out.println("This is child AllArgConstructor");
    }

    public int getChildInt() {
        return childInt;
    }

    public void setChildInt(int childInt) {
        this.childInt = childInt;
    }

    public String getChildString() {
        return childString;
    }

    public void setChildString(String childString) {
        this.childString = childString;
    }

    @Override
    public String toString() {
        return "Child{" +
                "childInt=" + childInt +
                ", childString='" + childString + '\'' +
                ", parentInt=" + parentInt +
                ", parentString='" + parentString + '\'' +
                '}';
    }

    void f2(){
        System.out.println("\n This is child method. ");
    }
}
