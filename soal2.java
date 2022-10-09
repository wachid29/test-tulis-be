import java.util.ArrayList;

public class soal2 {
    public static void main(String[] args) {
        ArrayList<Object> lingkaran = new ArrayList<Object>();

        lingkaran.add("Jari-Jari");
        lingkaran.add(100);
        lingkaran.add("diameter");
        lingkaran.add(3.14);
        lingkaran.add(true);

        lingkaran.remove("diameter"); // menghapus object diameter

        System.out.println(lingkaran);

        System.out.println("Lingkaran berisi " + lingkaran.size() + " data");
    }
}