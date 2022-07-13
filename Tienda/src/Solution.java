import java.util.ArrayList;
public class Solution{
    //ESTA CLASE NO TIENE MAIN
    
    
    public static Object[] reportes(ArrayList <Cliente> tienda){
        //EN ESTE ESPACIO PONER SU LÓGICA
        //find average of totalAPagar
        int suma = 0;
        for (int i = 0; i < tienda.size(); i++) {
            suma += tienda.get(i).getTotalAPagar();
        }
        int promedio = suma/tienda.size();
        //find the most expensive client
        int max = tienda.get(0).getTotalAPagar();
        int posicion = 0;
        String cmax = tienda.get(0).getNombreCompleto();
        for (int i = 0; i < tienda.size(); i++) {
            if (tienda.get(i).getTotalAPagar() > max) {
                max = tienda.get(i).getTotalAPagar();
                posicion = i;
                cmax = tienda.get(i).getNombreCompleto();
            }
        }
        //find the least expensive client
        int min = tienda.get(0).getTotalAPagar();
        int posicion2 = 0;
        String cmin = tienda.get(0).getNombreCompleto();
        for (int i = 0; i < tienda.size(); i++) {
            if (tienda.get(i).getTotalAPagar() < min) {
                min = tienda.get(i).getTotalAPagar();
                posicion2 = i;
                cmin = tienda.get(i).getNombreCompleto();
            }
        }
        //return the average, the least expensive and the most expensive client
        return new Object[]{promedio, cmin, min, cmax, max};   
    } 
}