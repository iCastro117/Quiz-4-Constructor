
import java.util.Date;


public class Principal {
    public static void main(String[] args) {

        //se crea el objeto isabella
        Date fechaNacIsabella = new Date(2004, 7,17);
        Estudiante isabella= new Estudiante("Isabella", fechaNacIsabella);


        isabella.setNotaMateria1(4.9);

        isabella.setNotaMateria2(3.5);

        isabella.setNotaMateria3(4.5);

        System.out.println(isabella.getNotaMateria1());
        System.out.println(isabella.getNotaMateria2());
        System.out.println(isabella.getNotaMateria3());


        int edadIsabella = isabella.getEdad();
        System.out.println("Edad de " + isabella.getNombre() + ": " + edadIsabella + " años");

        System.out.println("Promedio de " + isabella.getNombre() + ": " + isabella.getPromedio());


    }
}