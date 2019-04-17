package _15_Iterator;

public class Main {
    public static void main(String[] args) {

        Cinema cinema = new Cinema();
        Iterator iterator = cinema.getIterator();

        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }
    }
}
