public class CongNhan extends Person {
    private int level;

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Level: " + level;
    }
}
