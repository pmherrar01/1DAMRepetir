import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionProductos {

    private static Map< String, List<Producto> > dicProducto = new HashMap<>();

    private void CargarDatos(String stRuta){

        Path fichero = Paths.get(stRuta);

        try {
            List<String> lineas =  Files.readAllLines(fichero);

            for (String linea : lineas){
                //Transformar texto a producto
                String[] campos = linea.split(";");
                Producto p = new Producto(Integer.parseInt(campos [0]), Integer.parseInt(campos [1]),campos [2], Double.parseDouble(campos [3]),  campos [4]);

                if (dicProducto.containsKey(campos[4])){
                    dicProducto.get(campos[4]).add(p);
                }else {
                    List<Producto> lAux = new ArrayList<>();
                    lAux.add(p);
                    dicProducto.put(campos[4], lAux);
                }
            }
        } catch (IOException e) {
            System.out.println("Error leyendo");
        }


    }

    private List<Producto> productoPorCategoria(String setCategoria){

        return dicProducto.get(setCategoria);

    }

}
