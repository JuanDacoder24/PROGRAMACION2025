
import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        
        //creacion de instancias 
        Producto p1 = new Producto("Patatas", 2);
        Producto p2 = new Producto("Fideos", 3);
        Producto p3 = new Producto("Tomates", 2);
        Producto p4 = new Producto("Cebolla", 1);
        Producto p5 = new Producto("Champiñones", 2);

        //Creacion de arraylist
        ArrayList <Producto> productos = new ArrayList<>();
        
        //Añadir productos
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);

        //creacion de iterator para visualizar 
        Iterator <Producto> itera = productos.iterator();
        Producto cadaProducto;
        while (itera.hasNext()){
            cadaProducto = itera.next();
            System.out.println(cadaProducto);
        }

        System.out.println("-------------------------------------------");
        //eliminacion de 2 elementos
        productos.remove(p1);
        productos.remove(p2);
        itera = productos.iterator();
        while (itera.hasNext()){
            cadaProducto = itera.next();
            System.out.println(cadaProducto);
        }

        //Nuevo producto añadido 
        Producto nuevoProducto = new Producto("Zanahoria", 2);
        productos.add(2, nuevoProducto);

        System.out.println("-------------------------------------------");
        //Visualizacion del iterator con el nuevo producto 
        itera = productos.iterator();
        while (itera.hasNext()){
            cadaProducto = itera.next();
            System.out.println(cadaProducto);
        }

    }
}
