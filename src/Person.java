public class Person {
    private String name;
    private int age;
    private String gender;

    public void setInfo(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String displayInfo() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender;
    }
}
