package edu.acc.java2.implementing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

/*
    Write a Java application that implements the Runnable,
    ActionListener, and Iterable interfaces.
*/

public class Main implements Runnable, ActionListener, Iterable<Main>, Iterator<Main> {

    public static void main(String[] args) {
        // Named instances of named classes implementing interfaces
        Foo f = new Foo();
        f.run();
        Bar b = new Bar();
        b.actionPerformed(null);
        Baz z = new Baz();
        Quux q = (Quux)z.iterator();
        while (q.hasNext())
            System.out.println(q.next());
         
        Main main = new Main();
        main.run();
        main.actionPerformed(null);
        Iterator<Main> it = main.iterator();
        while (it.hasNext())
            System.out.println(it.next());
        
        ActionListener al2 = new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              System.out.println("Action!");
          }
        };
        al2.actionPerformed(null);
        
        // Named instances of anonymous classes implementing interfaces
        Runnable r = () -> System.out.println("Running");
        r.run();
        ActionListener al = e -> System.out.println(e);
        al.actionPerformed(null);
        Iterator<Main> it2 = new Quux();
        while (it2.hasNext())
            System.out.println(it2.next());
        
    }
    
    @Override
    public void run() {
        System.out.println("Running");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action!");
    }
    
    @Override
    public Iterator<Main> iterator() {
        return this;
    }
    
    @Override
    public boolean hasNext() { return false; }
    
    @Override
    public Main next() { return null; }
}
