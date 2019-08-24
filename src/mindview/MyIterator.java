package mindview;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
