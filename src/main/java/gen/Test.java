package gen;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        new Block(){
            @Override
            public void body() throws Exception {
                Scanner in = new Scanner(new File("asas"));
                while (in.hasNext()){
                    System.out.println(in.next());
                }
            }
        }.toThread().start();
    }
}
