package gen;

import java.util.Date;

public class DateInterval extends Pair<Date> {

    public DateInterval(){
        super();
    }

    public DateInterval(Pair<Date> d) {
        super(d.getFirst(), d.getSecond());

    }

    @Override
    public void setSecond(Date second) {
        System.out.println("Вызван метод у класса DateInterval");
        if(second.compareTo(getFirst())>=0){
            super.setSecond(second);
        }
    }

    @Override
    public Date getSecond() {
        return super.getSecond();
    }


    public void method(int t){
        System.out.println(t);
    }

    public void method(Integer t){
        System.out.println(t);
    }
}
