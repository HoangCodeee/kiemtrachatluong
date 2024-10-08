public class App {
    public static void main(String[] args) {
        QLNL qlnl = new QLNL();

        NhanVien nhanVien = new NhanVien();
        nhanVien.setInfo("Alice", 30, "Female");
        nhanVien.setJob("Developer");
        qlnl.addPerson(nhanVien);

        KiSu kiSu = new KiSu();
        kiSu.setInfo("Bob", 28, "Male");
        kiSu.setField("Software Engineering");
        qlnl.addPerson(kiSu);

        CongNhan congNhan = new CongNhan();
        congNhan.setInfo("Charlie", 35, "Male");
        congNhan.setLevel(2);
        qlnl.addPerson(congNhan);

        System.out.println("Personnel List:");
        qlnl.displayAllPersonnel();

        String searchName = "Alice";
        Person foundPerson = qlnl.searchByName(searchName);
        if (foundPerson != null) {
            System.out.println("Found: " + foundPerson.displayInfo());
        } else {
            System.out.println("Person not found: " + searchName);
        }
    }
}