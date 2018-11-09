
package edu.acc.java2.implementing;

import java.util.Iterator;

public class Quux implements Iterator<Main> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Main next() {
        return null;
    }
    
}
