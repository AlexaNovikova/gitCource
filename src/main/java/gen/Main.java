package gen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {

    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
    public static void main(String[] args) {
//        System.out.println(ArrayAlg.getMiddle(1.8, 2.9, 3, 0));
//        System.out.println(ArrayAlg.countElements(1,3,4,5,6,7));
//        System.out.println(ArrayAlg.getMin(111,33,4,5,6,7));
//
//        List<String> strings = new ArrayList<>();
//        Collections.addAll(strings, "123", "12", "1");
//        printList(strings);

        DateInterval interval = new DateInterval();
        Pair<Date> pair = new Pair<>();
        System.out.println(pair.getClass());
        System.out.println(pair.getClass().getMethods()[2].getParameterTypes()[0]);
        pair = interval;
        System.out.println(pair.getClass());
        try {
            pair.setFirst(simpleDateFormat.parse("01.01.2023"));
            pair.setSecond(simpleDateFormat.parse("12.12.2023"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        interval.method(1);
        interval.method(Integer.valueOf(1));


        //
        Pair<Date>[] mass = (Pair<Date>[]) new Pair<?>[5];
        Object[] objects = mass;
        mass[0] = interval;
        objects[1]= new Pair<Integer>(Integer.valueOf(1), Integer.valueOf(2));
        System.out.println(objects[1].getClass());
        System.out.println(mass[0].getFirst());
        DateInterval[] table = array(pair, pair);
        Object[]objArray = table;
        objArray[0] = new Pair<String>("12", "17");
        System.out.println(objArray[0].getClass());
        System.out.println(table[0].getSecond());
        Pair<String> newStringPair = Pair.makePair(String.class);
    }

    public static void printList(List<?>list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static DateInterval [] array(Pair<Date>  ... array){
       DateInterval [] dateIntervals = new DateInterval[array.length];
        for (int i = 0; i < array.length; i++) {
            dateIntervals[i] = new DateInterval(array[i]);
        }
        return dateIntervals;
    }
}
