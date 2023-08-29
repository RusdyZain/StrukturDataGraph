import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("==== SELAMAT DATANG ====");
        System.out.println("Pilihlah Kategori Motor dibawah ini: ");
        System.out.print(
                "Manufaktur:\t\tWarna:\t\tMesin\t\t\n" +
                        "1. HONDA\t\t1. HITAM\t\t1. 110 CC\n" +
                        "2. YAMAHA\t\t2. PUTIH\t\t2. 125 CC\n" +
                        "3. SUZUKI\t\t3. MERAH\t\t3. 155 CC\n" +
                        "\t\t\t\t4. BIRU\n"
        );
        for (int i=0;i<25;i++) System.out.print("=");
        System.out.print("\nManufaktur: ");
        int Manufaktur = scan.nextInt();

        for (int i=0;i<25;i++) System.out.print("=");
        System.out.print("\nWarna: ");
        int warna = scan.nextInt();

        for (int i=0;i<25;i++) System.out.print("=");
        System.out.print("\nMesin: ");
        int mesin = scan.nextInt();

        for (int i=0;i<25;i++) System.out.print("=");
        System.out.println("\nBerikut list motor sesuai dengan kategori pilihan anda: ");

        for (int i=0;i<25;i++) System.out.print("=");
        System.out.print("\nApakah anda sudah menemukan motor yang sesuai? (SUDAH/BELUM): ");
        String jawab = scan.next();

        System.out.println();
        if(jawab.equalsIgnoreCase("SUDAH")){
            for (int i=0;i<25;i++) System.out.print("=");
            System.out.print("\nPilih Motor: ");
            String motor = scan.next();
            System.out.println("\nKeterangan Motor: ");
//Disini semua data dari kategori motor yang sudah fix dipilih
            System.out.print("Nama: "+motor+"\nDeskripsi: ");
        }else if(jawab.equalsIgnoreCase("BELUM")){
            for (int i=0;i<25;i++) System.out.print("=");
            System.out.println("\nAgar memudahkan proses pencarian, silahkan tambahkan kategori dibawah ini: ");
            System.out.print(
                    "Transmisi:\t\tKapasitas Bahan Bakar:\t\tUkuran Body:\n"+
                            "1. AUTO\t\t\t1. 4,2 L-5 L\t\t\t\t1. 1,3 M-1,4 M\n"+
                            "2. MANUAL\t\t2. 5 L-8 L\t\t\t\t\t2. 1,5 M-1,6 M\n"+
                            "\t\t\t\t3. 8 L<\t\t\t\t\t\t3. 1,7-1,8\n"
            );
            for (int i=0;i<25;i++) System.out.print("=");
            System.out.print("Input:\n1. Transmisi\n2. Kapasitas Bahan Bakar\n3. Ukuran Body");
            int pilih = scan.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Masukkan pilihan transmisi: ");
                    int pilihTrans = scan.nextInt();
                case 2:
                    System.out.print("Masukkan pilihan Kapasitas Bahan Bakar: ");
                    int pilihKapasitas = scan.nextInt();
                case 3:
                    System.out.print("Masukkan pilihan Ukuran Body: ");
                    int pilihBody = scan.nextInt();
            }
        }
    }
}