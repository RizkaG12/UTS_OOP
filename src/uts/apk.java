
package uts;

import java.util.*;


public class apk {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        apk app = new apk();
        while(true) {
            app.printMenu();
            int pilihan = sc.nextInt();
            switch(pilihan) {
                case 1:
                    System.out.println("Form Tambah Data");
                    app.addData();
                    break;
                case 2:
                    System.out.println("Form Ubah Data");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("Form Hapus Data");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("Data");
                    app.listData();
                    break;
                case 5:
                    return;
            }
        }
    }

    public void hapusData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukkan no data yang akan dihapus: "); int idx = Integer.parseInt(sc.nextLine());
        // hapus data
        run.removeData(idx-1);
    }

    public void ubahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Masukkan no data yang akan diubah: "); int idx = Integer.parseInt(sc.nextLine());
        System.out.println("*********************************");
        System.out.print("Nama : "); String nama= sc.nextLine();
        System.out.print("Nim : "); String nim = sc.nextLine();
        System.out.print("Kelas : "); String kelas = sc.nextLine();
        System.out.print("Alamat : "); String alamat = sc.nextLine();
        // proses ubah data
        run.editData(new Data(nama, nim, kelas, alamat), idx-1);
    }

    public void listData() {
        // proses tampilkan data
        List<Data> result = run.getListData();
        for(int i=0; i<result.size(); i++) {
            System.out.println();
            System.out.println("Data ke-" + (i+1));
            System.out.println("  Nama : " + result.get(i).getNama());
            System.out.println("  Nim : " + result.get(i).getNim());
            System.out.println("  Kelas : " + result.get(i).getKelas());
            System.out.println("  Alamat : " + result.get(i).getAlamat());
        }
    }

    public void addData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Nama : "); String Nama= sc.nextLine();
        System.out.print("Nim : "); String Nim = sc.nextLine();
        System.out.print("Kelas : "); String Kelas = sc.nextLine();
        System.out.print("Alamat : "); String Alamat = sc.nextLine();
        // proses tambah data
        run.addData(new Data(Nama, Nim, Kelas, Alamat));
    }

    public void printMenu() {
        System.out.println("*********************************");
        System.out.println("Aplikasi Perekaman Data Mahasiswa");
        System.out.println("*********************************");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Lihat Data");
        System.out.println("5. Keluar");
        System.out.print("Pilihan: ");
    }

}
    

