import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map.Entry;
public class Solution2{
    //ESTA CLASE NO TIENE MAIN
    
    
    public static Object[] reportes(ArrayList <Cliente> tienda){
        //EN ESTE ESPACIO PONER SU LÓGICA
        HashMap<String, Integer> calculo = new HashMap<>();
        for (int i = 0; i < tienda.size(); i++){
            calculo.put(tienda.get(i).getNombreCompleto(), tienda.get(i).getTotalAPagar());
          }
        int max=(Collections.max(calculo.values()));
        int min=(Collections.min(calculo.values()));
        String cmax = "";
        String cmin = "";
        int sum = 0;
        double promedio = 0;

        for(Entry<String, Integer> entry: calculo.entrySet()) {
          if(entry.getValue() == max) {
          cmax = entry.getKey();
            break;
          }
        }
        for(Entry<String, Integer> entry2: calculo.entrySet()) {
          if(entry2.getValue() == min) {
          cmin = entry2.getKey();
            break;
            }
        }

        for(Entry<String, Integer> entry3: calculo.entrySet()) {
            sum += entry3.getValue();
          }

        promedio = sum/tienda.size();
        return new Object[]{promedio, cmin, min, cmax, max};   
    }             
}