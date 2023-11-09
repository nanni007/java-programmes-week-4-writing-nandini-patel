package programme_26_encapsulation;


public class Encapsulate {
    //private variables declared
    //these can only be accessed by public methods of class
    private String name;
    private int rollNo;

    private int age;
    //set method for name to access private variable


    public void setName(String name) {
        this.name = name;
    }
    //get method for name to access private variable

    public String getName() {
        return name;
    }
    //set method for rollNo to access private variable

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
//get method for rollNo to access private variable
    public int getRollNo() {
        return rollNo;
    }
    //set method for age to access private variable

    public void setAge(int age) {
        this.age = age;
    }
    //get method for age to access private variable

    public int getAge() {
        return age;
    }
}
