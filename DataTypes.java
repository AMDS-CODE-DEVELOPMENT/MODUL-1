import javax.swing.JOptionPane;

public class DataTypes {
    public static void main(String[]args) {

        String namaDepan = "Ahmad";
        String namaTengah = "Aji";
        String namaBelakang = "Setiaji";

        int usia = 20;
        int targetTahunKuliah = 4;
        double ipk = 3.89;
        char nilaiAbjad = 'A';
        boolean tampan = true;

        System.out.println("Nama Depan\t: "+namaDepan);
        System.out.print("Nama Belakang\t: ");
        System.out.println(namaBelakang);

        System.out.println("Nama Lengkap\t: "+namaDepan+" "+namaTengah+" "+namaBelakang);
        System.out.println("Usia\t: "+usia);
        System.out.println("Usia Saat Lulus (String)\t: "+usia+targetTahunKuliah);
        int usiaLulus = usia+targetTahunKuliah;
        System.out.println("Usia Saat Lulus (Variable)\t: "+usiaLulus);
        System.out.println("Usia Saat Lulus (Kurung)\t: "+(usia+targetTahunKuliah));

        JOptionPane.showMessageDialog(null, "Hai, "+namaDepan+" "+namaBelakang);

    }
}