package _15_Iterator;

public class Cinema implements Agregate{
    String [] cinemas = { "Lviv Cinema", "Chernivtsi Cinema", "Vinnytsya Cinema", "Kiev Cinema" };


    @Override
    public Iterator getIterator() {
        return new CinemasIterator();
    }

    private class CinemasIterator implements Iterator{

        int index = 0;

        @Override
        public boolean hasNext() {
            if(index < cinemas.length) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            return cinemas[index++];
        }
    }
}
