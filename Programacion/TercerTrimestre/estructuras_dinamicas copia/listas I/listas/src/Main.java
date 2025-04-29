//Main




import app.empleados;


import java.time.LocalDate;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {






        empleados a = new empleados(LocalDate.of(2000,1,1));
        empleados b = new empleados(LocalDate.of(2000,1,1));


        empleados c = new empleados("pablo","pacheco");
        empleados d = new empleados("pablo","penis");




        LinkedList<empleados> personas = new LinkedList<>();
        LinkedList<empleados> l = new LinkedList<>();


        l.add(new empleados(LocalDate.of(2000,1,1)));
        l.add(new empleados(LocalDate.of(2020,1,1)));
        l.add(new empleados(LocalDate.of(2010,1,1)));


        personas.add(c);
        personas.add(d);
        personas.add(new empleados("Juan","perez"));
        personas.add(new empleados("Pedro","perez"));






        System.out.println(personas);


        Iterator<empleados> it = personas.iterator();


        while(it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase("Pablo")) {
                it.remove();
            }
        }


        System.out.println(personas);


        personas.sort(Collections.reverseOrder());


        System.out.println();




    }
}
