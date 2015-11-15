/**
 * Created:
 * Sergey
 * 15.Ноябрь.2015г.
 * 2:50
 **/

package testobj;
public class Computer {


    private String name;
    private int ram;
    private int hdd;
    private double weight;

    public void setName(String Newname) {
        name = Newname;
    }
    public String getName() {
        return name;
    }

    public void setram(int Newram) {
        ram = Newram;
    }
    public int getram() {
        return ram;
    }
    public void sethdd(int Newhdd) {
        hdd = Newhdd;
    }
    public int gethdd() {
        return hdd;
    }
    public void setweight(double Newweight) {
        weight = Newweight;
    }
    public double getweight() {
        return weight;
    }
    public Computer(){}

    public Computer(String name, int ram, int hdd, double  weight) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
    }
    public void on() {
        print(" "+name+": Включаюсь...!\n У меня "+ram+" Мб ОЗУ\n Жесткий диск SATA 1: "+hdd+"Гб");
    }
    public void off() {
        print("Выключаюсь...!");
    }
    public void print(String str){
        System.out.println(str);
    }
}