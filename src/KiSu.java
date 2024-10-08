public class KiSu extends Person {
    private String field;

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Field: " + field;
    }
}
