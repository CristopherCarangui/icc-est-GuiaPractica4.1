import controllers.SortPersonaMethods;
import java.util.concurrent.Callable;
import moldels.Persona;
import moldels.Resultado;
import utils.Benchmarking;

public class App {
    public static void main(String[] args) throws Exception {
        int[] sample = {10_000,50_000,100_000};
        for (int i = 0; i < sample.length; i++) {
            medirTiempos(generaPersonas(sample[i]), "Desordenado");
            medirTiempos(crearArregloIncrementado(generaPersonas(sample[i])), "CasiOrdenado + 1");
            
        }
    
    }

    public static void medirTiempos(Persona[] personas, String escenario){
            SortPersonaMethods metodo = new SortPersonaMethods();
            Persona[] copiaInsertion = personas.clone();
            Persona[] copiaQuick = personas.clone();

            Callable<Void> insertion = ()->{
                metodo.insertionSort(copiaInsertion);
                return null;            
            };
            Resultado resultado = Benchmarking.medirTiempo(insertion, "Insertion", escenario, personas.length);
            System.out.println("Insertion =" + resultado);

            Callable<Void> quickSort = ()->{
                metodo.quickSort(copiaQuick, 0, copiaQuick.length-1);
                return null;            
            };
            Resultado resultado1 = Benchmarking.medirTiempo(quickSort, "QuickSort", escenario,personas.length);
            System.out.println("Quick Sort =" + resultado1);

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
    public static Persona[] crearArregloIncrementado(Persona[] personas){

        SortPersonaMethods controller= new SortPersonaMethods();

        controller.insertionSort(personas);
        Persona[] personasIncrementado = new Persona[personas.length+1];
        for (int i = 0; i < personas.length; i++) {
            personasIncrementado[i] = personas[i];
        }
        int edad = (int) (Math.random()*101);

        personasIncrementado[personas.length] = new Persona("Persona Agregada", edad);
       
        return personasIncrementado;
    }
}
