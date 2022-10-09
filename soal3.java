import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class soal3 {
    public static void main(String[] args) {
        // Membuat collection
        ArrayList<String> mobil = new ArrayList<String>();
        mobil.add("Volvo");
        mobil.add("BMW");
        mobil.add("Ford");
        mobil.add("Mazda");

        Iterator iterator;
        ListIterator listIterator = mobil.listIterator();

        while (listIterator.hasNext()) {
            Object element = listIterator.next();
            listIterator.set("Mobil " + element);
        }

        System.out.println("Merk Mobil :");
        iterator = mobil.iterator();

        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element);
        }

        System.out.println("Ditampilkan terbalik :");

        while (listIterator.hasPrevious()) {
            Object element = listIterator.previous();
            System.out.println(element);
        }
    }
}