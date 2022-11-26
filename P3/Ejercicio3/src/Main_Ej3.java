import java.util.EnumSet;

public class Main_Ej3 {


    public static void main(String[] args) {

        Pieza Pieza1 = new Pieza();
        Pieza Pieza2 = new Pieza();
        Pieza Pieza3 = new Pieza();


		Bandeja Bandeja1 = new Bandeja(3);

        System.out.println(Bandeja1.getEstado());

        Bandeja1.put(Pieza1);
        System.out.println(Bandeja1.getEstado());

        Bandeja1.put(Pieza2);
        Bandeja1.put(Pieza3);
        System.out.println(Bandeja1.getEstado());





        

	}
}