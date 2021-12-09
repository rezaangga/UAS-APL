import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        // implementasi Strategy pattern
        System.out.println("Pilih Hewan Yang Akan Dijinakkan : \n1. Harimau\n2. Singa\n3. Gajah");
        System.out.println("\n Pilih");
        scanner = new Scanner(System.in);
        int pilih = scanner.nextInt();

        StrategyPattern p = new StrategyPattern();
        switch (pilih) {
            case 1:
                p.setAnimalLiar(new Harimau());
                break;
            case 2:
                p.setAnimalLiar(new Singa());
                break;
            case 3:
                p.setAnimalLiar(new Gajah());
                break;

            default:
                System.out.println("Pilihan Tidak Ditemukan");
                break;
        }
        System.out.println("Pilih Hewan Yang Akan Dijinakkan adalah " + p.getAnimalLiar() + "\n");

        // implementasi Adapter Pattern
        AnimalJinak pilihan = new BinatangPilihan();
        System.out.print("Hewan " + p.getAnimalLiar() + " Merupakan Spesies ");
        p.hewanLiar();

        AnimalLiar tesAdapter = new Adapter(pilihan);
        System.out.print("Hewan " + p.getAnimalLiar() + " Berhasil menjadi ");
        tesAdapter.hewanLiar();
    }
}