package gen;

public class IntegerImpl implements WithInteger, WithPrimitiveInt{

    @Override
    public void m(Integer i) {
        System.out.println(i);
    }

    @Override
    public void m(int i) {
        System.out.println(i);
    }
}
