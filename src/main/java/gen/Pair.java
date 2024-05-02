package gen;

import java.lang.reflect.InvocationTargetException;

public class Pair <T>{
    private T first;
    private T second;


    public Pair(){
        first = null;
        second = null;
    }

    public static <T> Pair<T> makePair(Class<T> cl){
        try {
            return new Pair<>(cl.getDeclaredConstructor().newInstance(), cl.getDeclaredConstructor().newInstance());
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            return null;
        }
    }


    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        System.out.println("Pair method");
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        System.out.println("Вызван метод у класса Pair");
        this.second = second;
    }
}
