package gen;

public abstract class Block {
    public abstract void body() throws Exception;

    public Thread toThread() {
        return new Thread(() -> {
            try {
                body();
            } catch (Throwable e) {
                Block.throwAs(e);
            }
        });
    }

    public static <T extends Throwable> void throwAs(Throwable e) throws T {
        throw (T) e;
    }
}
