public class Main {
    public static void main(String[] args) {
        // Membuat objek mahasiswa dengan nilai tugas, uts, dan uas
        Student student = new Student("Andi", 80, 85, 90);
        double nilaiAkhir = student.hitungNilaiAkhir();

        // Menggunakan ReportPrinter untuk cetak laporan
        ReportPrinter printer = new ReportPrinter();
        printer.cetakLaporan(student.getName(), nilaiAkhir);

        // Menggunakan StudentRepository untuk simpan ke database
        StudentRepository repository = new StudentRepository();
        repository.simpanDatabase(student.getName(), nilaiAkhir);
    }
}