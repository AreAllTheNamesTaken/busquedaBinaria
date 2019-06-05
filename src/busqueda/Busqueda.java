package busqueda;

//@author Ivan
public class Busqueda {

    public static void main(String[] args) {
         int vector[] = {2, 4, 6, 8, 9, 11, 12, 15};
         int valorBuscado = 6;
         int posicion = busquedaBinaria(vector, valorBuscado);
         System.out.println("El valor se encuentra en la posición: " + posicion);
    }
    
    public static int busquedaBinaria(int vector[], int dato){
        
        int n = vector.length;
        int centro;
        int inf = 00;
        int sup = n-1;
        
        while(inf <= sup){
            centro = (sup + inf)/2; 
            if (vector[centro] == dato){
                return centro;
            }else if(dato < vector[centro]){
                sup = centro-1;
            }else{
                inf = centro+1;
            }
        }
        return -1;
    }
    
    
    
}
