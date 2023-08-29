package data;

import data.brick.*;
import data.component.DoubleLinkedListVertex;
import data.component.Graph;
import data.component.Vertex;

public class DataRepository {
    DoubleLinkedListVertex transmisi;
    DoubleLinkedListVertex warna;
    DoubleLinkedListVertex ukuran;
    DoubleLinkedListVertex manufaktur ;
    DoubleLinkedListVertex motors;
    DoubleLinkedListVertex kapasitas;
    DoubleLinkedListVertex mesin ;

    public DataRepository() {
        transmisi = new DoubleLinkedListVertex();
        warna = new DoubleLinkedListVertex();
        ukuran = new DoubleLinkedListVertex();
        manufaktur = new DoubleLinkedListVertex();
        motors = new DoubleLinkedListVertex();
        kapasitas = new DoubleLinkedListVertex();
        mesin = new DoubleLinkedListVertex();
    }

    public static void main(String[] args) {
        DataRepository repo = new DataRepository();
        Vertex temp;
        repo.transmisi.add(new Transmisi(Transmisi.TransmisiEnum.AUTO));
        repo.transmisi.add(new Transmisi(Transmisi.TransmisiEnum.MANUAL));

        repo.kapasitas.add(new Kapasitas(4));
        repo.kapasitas.add(new Kapasitas(5));
        repo.kapasitas.add(new Kapasitas(8));
        repo.kapasitas.add(new Kapasitas(11));

        repo.mesin.add(new Mesin(110));
        repo.mesin.add(new Mesin(115));
        repo.mesin.add(new Mesin(125));
        repo.mesin.add(new Mesin(155));

        repo.warna.add(new Warna(Warna.Color.HITAM));
        repo.warna.add(new Warna(Warna.Color.PUTIH));
        repo.warna.add(new Warna(Warna.Color.MERAH));
        repo.warna.add(new Warna(Warna.Color.BIRU));

        repo.ukuran.add(new Ukuran(Ukuran.Size.KECIL));
        repo.ukuran.add(new Ukuran(Ukuran.Size.SEDANG));
        repo.ukuran.add(new Ukuran(Ukuran.Size.BESAR));
//
        repo.manufaktur.add(new Manufaktur("Yamaha"));
        repo.manufaktur.add(new Manufaktur("Honda"));

        repo.motors.add(new Motor("Scoopy", "motor scoopy"));
        repo.motors.add(new Motor("Genio", "motor Genio"));
        repo.motors.add(new Motor("Aerox", "motor Aerox"));
        repo.motors.add(new Motor("Beat", "motor Beat"));
        repo.motors.add(new Motor("Vario", "motor Vario"));
        repo.motors.add(new Motor("V-IXION R", "motor Ixion"));
        repo.motors.add(new Motor("PCX", "motor PCX"));
        repo.motors.add(new Motor("MX King", "motor MX King"));
        repo.motors.add(new Motor("XSR 155", "motor XSR 155"));
        repo.motors.add(new Motor("Fazzio", "motor Fazzio"));

        // add specs untuk Genio, template buat masukin data
        temp = repo.motors.getVertex("genio");
        temp.connectVertexUnique(repo.kapasitas.getVertex("4"));
        temp.connectVertexUnique(repo.mesin.getVertex("110"));
        temp.connectVertexUnique(repo.warna.getVertex("hitam"));
        temp.connectVertexUnique(repo.warna.getVertex("biru"));
        temp.connectVertexUnique(repo.ukuran.getVertex("sedang"));
        temp.connectVertexUnique(repo.transmisi.getVertex("auto"));
        temp.connectVertexUnique(repo.manufaktur.getVertex("honda"));

        // add specs untuk Aerox, template buat masukin data
        temp = repo.motors.getVertex("aerox");
        temp.connectVertexUnique(repo.kapasitas.getVertex("4"));
        temp.connectVertexUnique(repo.mesin.getVertex("155"));
        temp.connectVertexUnique(repo.warna.getVertex("hitam"));
        temp.connectVertexUnique(repo.warna.getVertex("merah"));
        temp.connectVertexUnique(repo.ukuran.getVertex("besar"));
        temp.connectVertexUnique(repo.transmisi.getVertex("auto"));
        temp.connectVertexUnique(repo.manufaktur.getVertex("yamaha"));

        // add specs untuk Beat, template buat masukin data
        temp = repo.motors.getVertex("beat");
        temp.connectVertexUnique(repo.kapasitas.getVertex("5"));
        temp.connectVertexUnique(repo.mesin.getVertex("110"));
        temp.connectVertexUnique(repo.warna.getVertex("biru"));
        temp.connectVertexUnique(repo.warna.getVertex("merah"));
        temp.connectVertexUnique(repo.warna.getVertex("hitam"));
        temp.connectVertexUnique(repo.warna.getVertex("putih"));
        temp.connectVertexUnique(repo.ukuran.getVertex("kecil"));
        temp.connectVertexUnique(repo.transmisi.getVertex("auto"));
        temp.connectVertexUnique(repo.manufaktur.getVertex("honda"));

        // add specs untuk Vario, template buat masukin data
        temp = repo.motors.getVertex("vario");
        temp.connectVertexUnique(repo.kapasitas.getVertex("5"));
        temp.connectVertexUnique(repo.mesin.getVertex("125"));
        temp.connectVertexUnique(repo.warna.getVertex("hitam"));
        temp.connectVertexUnique(repo.warna.getVertex("merah"));
        temp.connectVertexUnique(repo.warna.getVertex("putih"));
        temp.connectVertexUnique(repo.ukuran.getVertex("sedang"));
        temp.connectVertexUnique(repo.transmisi.getVertex("auto"));
        temp.connectVertexUnique(repo.manufaktur.getVertex("honda"));

        // add specs untuk V-IXION R, template buat masukin data
        temp = repo.motors.getVertex("v-ixion r");
        temp.connectVertexUnique(repo.kapasitas.getVertex("11"));
        temp.connectVertexUnique(repo.mesin.getVertex("155"));
        temp.connectVertexUnique(repo.warna.getVertex("merah"));
        temp.connectVertexUnique(repo.warna.getVertex("hitam"));
        temp.connectVertexUnique(repo.ukuran.getVertex("besar"));
        temp.connectVertexUnique(repo.transmisi.getVertex("manual"));
        temp.connectVertexUnique(repo.manufaktur.getVertex("honda"));

        // add specs untuk Scoopy, template buat masukin data
        temp = repo.motors.getVertex("scoopy");
        temp.connectVertexUnique(repo.mesin.getVertex("110"));
        temp.connectVertexUnique(repo.warna.getVertex("hitam"));
        temp.connectVertexUnique(repo.warna.getVertex("merah"));
        temp.connectVertexUnique(repo.warna.getVertex("putih"));
        temp.connectVertexUnique(repo.ukuran.getVertex("kecil"));
        temp.connectVertexUnique(repo.transmisi.getVertex("auto"));
        temp.connectVertexUnique(repo.manufaktur.getVertex("honda"));

        // add specs untuk PCX, template buat masukin data
        temp = repo.motors.getVertex("pcx");
        temp.connectVertexUnique(repo.kapasitas.getVertex("8"));
        temp.connectVertexUnique(repo.mesin.getVertex("155"));
        temp.connectVertexUnique(repo.warna.getVertex("merah"));
        temp.connectVertexUnique(repo.warna.getVertex("hitam"));
        temp.connectVertexUnique(repo.ukuran.getVertex("besar"));
        temp.connectVertexUnique(repo.transmisi.getVertex("auto"));
        temp.connectVertexUnique(repo.manufaktur.getVertex("honda"));

        // add specs untuk MX King, template buat masukin data
        temp = repo.motors.getVertex("mx king");
        temp.connectVertexUnique(repo.kapasitas.getVertex("4"));
        temp.connectVertexUnique(repo.mesin.getVertex("125"));
        temp.connectVertexUnique(repo.warna.getVertex("hitam"));
        temp.connectVertexUnique(repo.ukuran.getVertex("sedang"));
        temp.connectVertexUnique(repo.transmisi.getVertex("manual"));
        temp.connectVertexUnique(repo.manufaktur.getVertex("yamaha"));

        // add specs untuk XSR 155, template buat masukin data
        temp = repo.motors.getVertex("xsr 155");
        temp.connectVertexUnique(repo.kapasitas.getVertex("11"));
        temp.connectVertexUnique(repo.mesin.getVertex("155"));
        temp.connectVertexUnique(repo.warna.getVertex("hitam"));
        temp.connectVertexUnique(repo.ukuran.getVertex("besar"));
        temp.connectVertexUnique(repo.transmisi.getVertex("manual"));
        temp.connectVertexUnique(repo.manufaktur.getVertex("yamaha"));

        // add specs untuk Fazzio, template buat masukin data
        temp = repo.motors.getVertex("fazzio");
        temp.connectVertexUnique(repo.kapasitas.getVertex("5"));
        temp.connectVertexUnique(repo.mesin.getVertex("125"));
        temp.connectVertexUnique(repo.warna.getVertex("hitam"));
        temp.connectVertexUnique(repo.warna.getVertex("putih"));
        temp.connectVertexUnique(repo.ukuran.getVertex("sedang"));
        temp.connectVertexUnique(repo.transmisi.getVertex("auto"));
        temp.connectVertexUnique(repo.manufaktur.getVertex("yamaha"));

        // <<< ABAIKAN YANG INI, jangan diutak atik
        Graph tes = new Graph(repo.motors.getVertex("scoopy"));

//        tes.printBFS();
        repo.motors.getVertex("scoopy").printSurface();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("==== SELAMAT DATANG ====");
//        System.out.println("Pilihlah Kategori Motor dibawah ini: ");
//        System.out.print(
//                "Manufaktur:\t\tWarna:\t\tMesin\t\t\n" +
//                        "1. HONDA\t\t1. HITAM\t\t1. 110 CC\n" +
//                        "2. YAMAHA\t\t2. PUTIH\t\t2. 125 CC\n" +
//                        "3. SUZUKI\t\t3. MERAH\t\t3. 155 CC\n" +
//                        "\t\t\t\t4. BIRU\n"
//        );
//        for (int i=0;i<25;i++) System.out.print("=");
//        System.out.print("\nManufaktur: ");
//        int Manufaktur = scan.nextInt();
//
//        for (int i=0;i<25;i++) System.out.print("=");
//        System.out.print("\nWarna: ");
//        int warnaMotor = scan.nextInt();
//
//        for (int i=0;i<25;i++) System.out.print("=");
//        System.out.print("\nMesin: ");
//        int mesin = scan.nextInt();
//
//        for (int i=0;i<25;i++) System.out.print("=");
//        System.out.println("\nBerikut list motor sesuai dengan kategori pilihan anda: ");
//
//        for (int i=0;i<25;i++) System.out.print("=");
//        System.out.print("\nApakah anda sudah menemukan motor yang sesuai? (SUDAH/BELUM): ");
//        String jawab = scan.next();
//
//        System.out.println();
//        if(jawab.equalsIgnoreCase("SUDAH")){
//            for (int i=0;i<25;i++) System.out.print("=");
//            System.out.print("\nPilih Motor: ");
//            String motor = scan.next();
//            System.out.println("\nKeterangan Motor: ");
//
////Disini semua data dari kategori motor yang sudah fix dipilih
//            System.out.print("Nama: "+motor+"\nDeskripsi: ");
//        }else if(jawab.equalsIgnoreCase("BELUM")){
//            for (int i=0;i<25;i++) System.out.print("=");
//            System.out.println("\nAgar memudahkan proses pencarian, silahkan tambahkan kategori dibawah ini: ");
//            System.out.print(
//                    "Transmisi:\t\tKapasitas Bahan Bakar:\t\tUkuran Body:\n"+
//                            "1. AUTO\t\t\t1. 4,2 L-5 L\t\t\t\t1. 1,3 M-1,4 M\n"+
//                            "2. MANUAL\t\t2. 5 L-8 L\t\t\t\t\t2. 1,5 M-1,6 M\n"+
//                            "\t\t\t\t3. 8 L<\t\t\t\t\t\t3. 1,7-1,8\n"
//            );
//            for (int i=0;i<25;i++) System.out.print("=");
//            System.out.print("Input:\n1. Transmisi\n2. Kapasitas Bahan Bakar\n3. Ukuran Body");
//            int pilih = scan.nextInt();
//            switch (pilih){
//                case 1:
//                    System.out.print("Masukkan pilihan transmisi: ");
//                    int pilihTrans = scan.nextInt();
//                case 2:
//                    System.out.print("Masukkan pilihan Kapasitas Bahan Bakar: ");
//                    int pilihKapasitas = scan.nextInt();
//                case 3:
//                    System.out.print("Masukkan pilihan Ukuran Body: ");
//                    int pilihBody = scan.nextInt();
//            }
//        }
    }
}
