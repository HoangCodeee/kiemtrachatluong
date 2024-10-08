public class NhanVien extends Person {
    private String job;

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Job: " + job;
    }

    public void setInfo(String string, int i, String string2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setInfo'");
    }
}
