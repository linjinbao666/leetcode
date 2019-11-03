package learn;

import java.math.BigInteger;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

public class BetterVector<E> extends Vector {

    public AtomicLong atomicLong = new AtomicLong();

    public synchronized boolean putIfAbsent(E x) {

        boolean absent = !this.contains(x);
        if (absent) add(x);
        return absent;
    }

    public final Map cache = new ConcurrentHashMap<>();



}
