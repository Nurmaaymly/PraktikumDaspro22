import java.util.Scanner;
public class StudiKasus2_22{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String nama, jenis;
        int jumlahDoc;

        System.out.print("Nama Mahasiswa\t: ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        jenis = sc.nextLine().trim().toUpperCase();
        System.out.print("Jumlah dokumen\t: ");
        jumlahDoc = sc.nextInt();

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA") || jenis.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Peringkat juara\t: ");
            int peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3){
                if (jumlahDoc == 4) {
                    System.out.println(" Status : Dokumen lengkap. Selamat! Memperoleh dana penghargaan");
                } else {
                    int kurang = 4 - jumlahDoc;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            }else {
                System.out.println("Status : Dana penghargaan tidak diberikan (hanya untuk Juara 1, 2, atau 3).");
            }
        }
    }
}