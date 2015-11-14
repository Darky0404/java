/**
 * Сделано
 * Sergey в
 * 13.Ноябрь.2015г.
 * 4:14
 **/
import java.util.Scanner; // импортируем класс

public class inp {

    public String vname;
    public String vadres;
    public int vcoldos;
    public int vnomer;




    public static void inp() {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        String iString = "";
        System.out.print("Введите url: ");

            iString = sc.next(); // считывает строку с потока ввода и сохраняем в переменную
            System.out.println(iString);
              }

}