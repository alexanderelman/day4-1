package edu.acc.java2.implementing;

import java.util.Iterator;

public class Baz implements Iterable<Main> {

    @Override
    public Iterator<Main> iterator() {
        return new Quux();
    }
    
}
