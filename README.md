##  Universidad Politecnica Salesiana

## Practica: Comparacion situacional de algoritmos de ordenamiento
## Estudiante: Cristopher Carangui
### Fecha: 02/06/26
### Descripcion:
### Tabla de Arreglo Completamente Desordenado
| Tamaño de muestra | Tiempo Insertion Sort (ms) | Tiempo Quick Sort (ms) | Algoritmo más rápido | Observación                                                                                                                          |
| ----------------: | -------------------------: | ---------------------: | -------------------- | ------------------------------------------------------------------------------------------------------------------------------------ |
|            10 000 |                     2970,89 |                  20,25 | Quick Sort           | Quick Sort fue el algorimto mas rapido                                                              |
|            50 000 |                    75406,76  |                 106,72 | Quick Sort           | Quick Sort arrazo en este tamaño al tener a insertion un tiempo que se demoro mucho.                                        |
|           100 000 |                   329764,79|                 314,39| Quick Sort           | Quick Sort igual que la segunda muestra matiene una gran diferencia con un tiempo menor en un tamño grande. |
### Tabla de Arreglo Casi Ordenado con 1 persona de mas
| Tamaño de muestra | Tiempo Insertion Sort (ms) | Tiempo Quick Sort (ms) | Algoritmo más rápido | Observación                                                                                                                          |
| ----------------: | -------------------------: | ---------------------: | -------------------- | ------------------------------------------------------------------------------------------------------------------------------------ |
|            10 001 |                    2,64 |                 978,69| Insertion Sort          | Insertion Sort  con un arreglo medio grande termina mas rapido que el quick sort.                                                              |
|            50 001 |                    12,46  |                 20403,63 | Insertion Sort          | Insertion Sort fue eficiente con una persona de mas .                                        |
|           100 001 |                   18,09|                 57636,66| Insertion Sort          | Insertion Sort tiene el mismo resultado que en la anterior comparacion. |

### Analisis Requerido
## ¿Que algoritmo fue mas rapido en el escenario desordenado?
El algoritmo mas rapido fue Quick sort ya que tuvo tiempos mas eficientes en todos  los tamaños que se le presento con tiempos mucho mas rapido a los resultados que obtuvo Insertion que tuvo tiempos demasiados largos.
## ¿Que algoritmo fue mas rapido en el escenario casi ordenado?
El algoritmo que fue mas eficiente fue insertion sort que compracacion en el desordenado tuvo tiempos demasiados rapidos que quick sort le paso lo mismo a insertion en el desordenado tuvo tiempos de demora.
## ¿El crecimiento de tamaño de muestra afecto por igual en los dos algoritmos?
No  ya que los dos en los dos algoritmos tuvieron tiempos demasiados rapidos para quick sort en el desordenado fue el ganador, mientras insertion sort fue el ganador en el  casi ordenado.
## ¿Por que Insercion mejora con arreglo casi ordenado?
Insercion al tener una condicion en el while nunca se ejecuto en el Casi ordenado obtuviendo tiempos rapidos.
## ¿Por que QuickSort suele ser mejor cuando los datos estan muy desordenados?
Quick sort tiene el pivote que divide el arreglo eficientemente a la mitad y acomoda los datos a izquierda o derecha,repitiendo el proceso en los dos lados.

### Conclusiones
## Conclusion 1
Esta practica me ayudo a conocer un nuevo metodo que para mi es muy eficiente en su codigo cuando tengamos datos muy desordenados,a medir tiempos en dos metodos y darme en cuenta cual metodo de sort necesito usar en cada condicion q pueda estar un arreglo desordenado, casi ordenado o ordenado. Obteniendo una opcion para proximos proyectos donde los datos puedan ser mayores a los dados en la practica
## Conclusion 2 
En mi opinion quick sort al poder dividr el arreglo y ir ordenando de izquiera y derecha iba a ganar en los dos algortimos,al ser un nuevo metodo  este iba a ser  mas eficiente en los dos algortimos.
## Conclusion 3
La practica nos da un punto de vista de como los metodos de sort vistos en clases actuan bajo presion al tener varios datos que procesar , cada metodo puede tener un aspecto en el que pueda ser eficiente solo dependiendo del arreglo que se le da donde pueda tener un mejor caso , caso promedio o peor caso teniendo resultados que uno nunca se lo espera