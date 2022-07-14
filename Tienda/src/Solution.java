import java.util.ArrayList;
public class Solution{
    //ESTA CLASE NO TIENE MAIN
    
    
    public static Object[] reportes(ArrayList <Cliente> tienda){
        //EN ESTE ESPACIO PONER SU LÓGICA
        
        int suma = 0;
        for (int i = 0; i < tienda.size(); i++) {
            suma += tienda.get(i).getTotalAPagar();
        }
        double promedio = suma/tienda.size();
        
        int max = tienda.get(0).getTotalAPagar();
        String cmax = tienda.get(0).getNombreCompleto();
        for (int i = 0; i < tienda.size(); i++) {
            if (tienda.get(i).getTotalAPagar() > max) {
                max = tienda.get(i).getTotalAPagar();
                cmax = tienda.get(i).getNombreCompleto();
            }
        }
        
        int min = tienda.get(0).getTotalAPagar();
        String cmin = tienda.get(0).getNombreCompleto();
        for (int i = 0; i < tienda.size(); i++) {
            if (tienda.get(i).getTotalAPagar() < min) {
                min = tienda.get(i).getTotalAPagar();
                cmin = tienda.get(i).getNombreCompleto();
            }
        }
        
        return new Object[]{promedio, cmin, min, cmax, max};   
    } 
}