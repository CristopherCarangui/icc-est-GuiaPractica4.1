import moldels.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static Persona[] generaPersonas(int cantidad){
        Persona[] personas = new Persona[cantidad];
        for(int i =0; i< cantidad; i++){
            String nombre = "Personas"+ (i+1);
            int edad = (int) (Math.random()*101);
            personas[i] = new Persona(nombre,edad);
        }
        return personas;
    }
}
