package pertemuan5new;

/**
 *
 * Nama : Tiara Aulia Maharani
 * NIM  : 23215039
 * TEKNIK INFORMATIKA
 */

    import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class latihan26 {
    public static void main(String[] args) {
        // Mendapatkan waktu saat ini
        Date sekarang = new Date();
        
        // Format hari dan tanggal
        SimpleDateFormat formatWaktu = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", new Locale("id", "ID"));
        
        // Menampilkan hasil
        System.out.println("Hari ini adalah hari : " + formatWaktu.format(sekarang));
    }
}

