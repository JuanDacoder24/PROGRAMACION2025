
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        //Arraylist
        
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
        System.out.println("-------------------------------------------");
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
        System.out.println("-------------------------------------------");
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
        System.out.println("-------------------------------------------");
        //Ordenar con comparator
        Collections.sort(productos);
        System.out.println("Productos ordenados");
        for (Producto a : productos) {
            System.out.println(a.getNombre() + " " + a.getCantidad());
        }

        //eliminar los productos 
        productos.clear();

//---------------------------------------------------------

        //linkedlist
        System.out.println("-------------------------------------------");
        //creacion de instancias
        Producto a1 = new Producto("Zapatillas", 21);
        Producto a2 = new Producto("Telefonos", 32);
        Producto a3 = new Producto("Audifonos", 21);
        Producto a4 = new Producto("Ordenador", 11);
        Producto a5 = new Producto("Reloj", 12);

        //Creacion de linkedlist
        LinkedList <Producto> articulos = new LinkedList<>();

        //Añadir productos
        articulos.add(a1);
        articulos.add(a2);
        articulos.add(a3);
        articulos.add(a4);
        articulos.add(a5);
        System.out.println("-------------------------------------------");
        //creacion de iterator para visualizar 
        Iterator <Producto> iter = articulos.iterator();
        Producto cadaArticulo;
        while (iter.hasNext()){
            cadaArticulo = iter.next();
            System.out.println(cadaArticulo);
        }
        System.out.println("-------------------------------------------");

        //eliminacion de 2 elementos
        articulos.remove(a1);
        articulos.remove(a2);
        iter = articulos.iterator();
        while (iter.hasNext()){
            cadaArticulo = iter.next();
            System.out.println(cadaArticulo);
        }

        //Añadir nuevo articulo
        Producto nuevoArticulo = new Producto("Tablet", 15);
        articulos.add(2, nuevoArticulo);

        System.out.println("-------------------------------------------");

        //Visualizacion del iterator con el nuevo articulo 
        iter = articulos.iterator();
        while (iter.hasNext()){
            cadaArticulo = iter.next();
            System.out.println(cadaArticulo);
        }
        System.out.println("-------------------------------------------");
         //Ordenar con comparator
         Collections.sort(articulos);
         System.out.println("Articulos ordenados");
         for (Producto b : articulos) {
             System.out.println(b.getNombre() + " " + b.getCantidad());
         }
 
         //eliminar los productos 
         productos.clear();
    }
}
