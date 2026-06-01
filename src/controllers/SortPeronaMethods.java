package controllers;
import moldels.Persona;
public class SortPeronaMethods {
    public void insertionSort(Persona[] personas){
        for(int i =1; i<personas.length;i++){
            Persona valorAcutal= personas[i];
            int j = i-1;
            while(j>=0 && personas[j].getCriterioOrdenamiento() < valorAcutal.getCriterioOrdenamiento()){
                personas[j+1]= personas[j];
                j--;
            }
            personas[j+1]= personas[j];
        }

    }

    public void quickSort(Persona[] personas, int inicio, int fin){
        Persona pivote = personas[fin];
        int i = inicio-1;
        
    }
}
