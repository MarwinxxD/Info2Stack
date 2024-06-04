package achtzehn;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class LuggageContainer implements Iterable<Luggage> {
    LinkedList<Luggage> luggages = new LinkedList<>();

    void addLuggage(Luggage l) {
        luggages.add(l);
    }

    void removeLuggage(Luggage l) {
        luggages.remove(l);
    }

    Stream<Luggage> stream() {
        return luggages.stream();
    }

    @Override
    public void forEach(Consumer<? super Luggage> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Iterator<Luggage> iterator() {
        return luggages.iterator();
    }
}
