
import java.util.Date;
import java.util.Calendar;
public class Estudiante {

    /**
     * atributos de la clase estudiante
     */
    private String nombre;
    private  Date fechaDeNacimiento;
    private double notaMateria1;
    private double notaMateria2;
    private double notaMateria3;

    /**
     * constructor de la clase estudiante
     * @param nombre   El nombre de la asignatura.
     * @param fechaDeNacimiento     La fecha de nacimiento del estudiante
     */
    public Estudiante(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;


        // Ajustar el año de nacimiento para que sea consistente con el constructor de Date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaDeNacimiento);
        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) - 1900);

        this.fechaDeNacimiento = calendar.getTime();



        this.notaMateria1 = 0.0;
        this.notaMateria2 = 0.0;
        this.notaMateria3 = 0.0;
    }

    public int getEdad() {
        Calendar calendarNacimiento = Calendar.getInstance();
        calendarNacimiento.setTime(fechaDeNacimiento);

        Calendar calendarActual = Calendar.getInstance();

        int añoNacimiento = calendarNacimiento.get(Calendar.YEAR);
        int añoActual = calendarActual.get(Calendar.YEAR);

        int mesNacimiento = calendarNacimiento.get(Calendar.MONTH);
        int mesActual = calendarActual.get(Calendar.MONTH);

        int diaNacimiento = calendarNacimiento.get(Calendar.DAY_OF_MONTH);
        int diaActual = calendarActual.get(Calendar.DAY_OF_MONTH);

        int edad = añoActual - añoNacimiento;

        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--;
        }

        return edad;
    }

    public double getPromedio() {
        return (notaMateria1 + notaMateria2 + notaMateria3) / 3.0;
    }

    public void setNotaMateria1(double notaMateria1) {
        this.notaMateria1 = notaMateria1;
    }

    public void setNotaMateria2(double notaMateria2) {
        this.notaMateria2 = notaMateria2;
    }

    public void setNotaMateria3(double notaMateria3) {
        this.notaMateria3 = notaMateria3;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public double getNotaMateria1() {
        return notaMateria1;
    }

    public double getNotaMateria2() {
        return notaMateria2;
    }

    public double getNotaMateria3() {
        return notaMateria3;
    }
}


