public class Student {
    private String name;
    private double tugas;
    private double uts;
    private double uas;

    public Student(String name, double tugas, double uts, double uas) {
        this.name = name;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    public String getName() {
        return name;
    }

    public double hitungNilaiAkhir() {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }
}