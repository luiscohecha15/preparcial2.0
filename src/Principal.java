import java.util.ArrayList;
import java.util.Optional;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Luis","Cohecha",23));
        personas.add(new Persona("Victoria","Giraldo",19));
        personas.add(new Persona("Valentina","Hoyos",17));

        Optional<Persona> busqueda = personas.stream().filter(persona -> persona.getNombre().equals("Victoria")).findFirst();
        personas.set(0, new Persona("Maria", "Ordoñez",20));
        personas.removeIf(persona -> persona.getNombre().equals("Valentina"));

        personas.forEach(System.out::println);
    }
}
