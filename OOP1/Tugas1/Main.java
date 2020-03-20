public class Main {
    public static void main(String[] args) {
        //membuat objek
        Mahasiswa mhs = new Mahasiswa();

        //memberi nilai atau value
        mhs.nama = "Rohmat Setiaji";
        mhs.kelas = "4B";
        mhs.nim = "18090119";

        //memanggil data
        System.out.println("Nama: "+mhs.nama);
        System.out.println("Kelas: "+mhs.kelas);
        System.out.println("NIM: "+mhs.nim);
        
        
        
    }
}