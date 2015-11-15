import testobj.Computer;
/**
 * Created:
 * Sergey
 * 15.Ноябрь.2015г.
 * 2:50
 **/

public class Alitest {
    public static void main(String[] args) {
        Computer comp = new Computer("IBM", 2048, 250, 2.300);
        comp.on();
        comp.off();
        comp.setName("IBM Core");
        comp.setram(4048);
        comp.sethdd(500);
        comp.setweight(3.7);
        comp.on();

    }

}
