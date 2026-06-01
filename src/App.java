import java.util.concurrent.Callable;
import moldels.Resultado;
import utils.Benchmarking;
import controllers.SortPeronaMethods;
import moldels.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] aPersonas = App.generaPersonas(10000);
        SortPeronaMethods controles = new SortPeronaMethods();
        System.out.println("Arrelgo Original");
        SortPeronaMethods.imprimirArreglo(aPersonas);
        controles.insertionSort(aPersonas);
        controles.quickSort(aPersonas, 0, aPersonas.length);
        
       



       
    
    }
     public void ejecutarEscenarioOrdenado(int size,SortPeronaMethods metodos){
        Persona[] base = generaPersonas(size);
        Persona[] copiaInsercion = base.clone();
        Persona[] copiaQuickSort = base.clone(); 

        Callable <Void> insertion = () ->{
            metodos.insertionSort(copiaInsercion);
            return null;
        };

        Callable <Void> quickSort = ()->{
            metodos.quickSort(copiaQuickSort, 0,copiaQuickSort.length-1);
            return null;
        };

        Resultado r1 = Benchmarking.medirTiempo(insertion, "insertion", "Desordenado", 10000);
        System.out.println(r1);

        Resultado r2 = Benchmarking.medirTiempo(quickSort, "QuickSort", "Desordenado", 10000);
        System.out.println(r2);

        Resultado r3 = Benchmarking.medirTiempo(insertion, "insertion", "Desordenado", 50000);
        System.out.println(r3);

        Resultado r4 = Benchmarking.medirTiempo(quickSort, "QuickSort", "Desordenado", 50000);
        System.out.println(r4);

        Resultado r5 = Benchmarking.medirTiempo(insertion, "insertion", "Desordenado", 100000);
        System.out.println(r5);

        Resultado r6 = Benchmarking.medirTiempo(quickSort, "QuickSort", "Desordenado", 100000);
        System.out.println(r6);

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

    public static void ejecutarEscenarioDesordenado(int size,SortPeronaMethods metodos){
        Persona[] base = generaPersonas(size);
        Persona[] copiaInsercion = base.clone();
        Persona[] copiaQuickSort = base.clone(); 

        Callable <Void> insertion = () ->{
            metodos.insertionSort(copiaInsercion);
            return null;
        };

        Callable <Void> quickSort = ()->{
            metodos.quickSort(copiaQuickSort, 0,copiaQuickSort.length-1);
            return null;
        };

        Resultado r1 = Benchmarking.medirTiempo(insertion, "insertion", "Desordenado", 10000);
        System.out.println(r1);

        Resultado r2 = Benchmarking.medirTiempo(quickSort, "QuickSort", "Desordenado", 10000);
        System.out.println(r2);

        Resultado r3 = Benchmarking.medirTiempo(insertion, "insertion", "Desordenado", 50000);
        System.out.println(r3);

        Resultado r4 = Benchmarking.medirTiempo(quickSort, "QuickSort", "Desordenado", 50000);
        System.out.println(r4);

        Resultado r5 = Benchmarking.medirTiempo(insertion, "insertion", "Desordenado", 100000);
        System.out.println(r5);

        Resultado r6 = Benchmarking.medirTiempo(quickSort, "QuickSort", "Desordenado", 100000);
        System.out.println(r6);

    }

    public static void ejecutarEscenarioCasiOrdenado(int size,SortPeronaMethods metodos){
        Persona[] base = generaPersonas(size);
        metodos.quickSort(base, 0, base.length-1);

        Persona[] baseMasUno = generaPersonas(size);
        baseMasUno[baseMasUno.length-1]= new Persona("Persona Nueva", size);
        Persona[] copiaInsercion =  baseMasUno.clone();
        Persona[] copiaQuickSort = baseMasUno.clone();

        Callable <Void> insertion = () ->{
            metodos.insertionSort(copiaInsercion);
            return null;
        };

        Callable <Void> quickSort = ()->{
            metodos.quickSort(copiaQuickSort, 0,copiaQuickSort.length-1);
            return null;
        };

        Resultado rUno = Benchmarking.medirTiempo(insertion, "Insertion", "CasiOrdenado +1 persona", 10001);
        System.out.println(rUno);
        Resultado rDos = Benchmarking.medirTiempo(quickSort, "QuickSort", "CasiOrdenado +1 persona", 10001);
        System.out.println(rDos);
        Resultado rTres = Benchmarking.medirTiempo(insertion, "Insertion", "CasiOrdenado +1 persona", 50001);
        System.out.println(rTres);
        Resultado rCuatro = Benchmarking.medirTiempo(quickSort, "QuickSort", "CasiOrdenado +1 persona", 50001);
        System.out.println(rCuatro);
        Resultado rCinco = Benchmarking.medirTiempo(insertion, "Insertion", "CasiOrdenado +1 persona", 100001);
        System.out.println(rCinco);
        Resultado rSeis = Benchmarking.medirTiempo(quickSort, "QuickSort", "CasiOrdenado +1 persona", 100001);
        System.out.println(rSeis);


    }
}
