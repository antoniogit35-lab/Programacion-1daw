import java.util.*;

public class Tienda {

    private Map<String, Producto> tienda;

    public Tienda(Map<String, Producto> tienda) {
        this.tienda = tienda;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "tienda=" + tienda +
                '}';
    }

    public void anadirProducto(Producto p){
        if(!tienda.containsKey(p.getCodigo())){
            tienda.put(p.getCodigo(), p);
            System.out.println("Producto añadido");
        } else {
            System.out.println("Ya existe un producto con ese código");
        }
    }

    public void altaDeProducto(String codigo, String nombre, double precio, int stock){

        if (tienda.containsKey(codigo)){
            System.out.println("Ya existe un producto con este código");
            return;
        }

        Producto p = new Producto(codigo, precio, nombre, stock, true);
        tienda.put(codigo, p);
    }

    public void modificarStock(String codigo, int stockNuevo){

        if (!tienda.containsKey(codigo)){
            System.out.println("No se dispone de este producto");
            return;
        }
        Producto p = tienda.get(codigo);

        p.setStock(p.getStock() + stockNuevo);
    }

    public void listarProductosOrdenados(){

        List<Producto> lista = new ArrayList<>(tienda.values());

        lista.sort((p1,p2) -> p1.getNombre().compareTo(p2.getNombre()));

        for (Producto p : lista){
            if (p.isDisponible()) System.out.println(p);
        }
    }

    public void listadoSinStock(){
        for (Producto p : tienda.values()){
            if (p.getStock()==0) System.out.println(p);
        }
    }

    public void borrarProducto(String codigo){

        if (tienda.containsKey(codigo)){
            tienda.remove(codigo);
            System.out.println("Se ha borrado el producto");
        } else System.out.println("No existe producto con ese código");


    }
}
