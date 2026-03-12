import java.util.ArrayList;

public class Gimnasio {

    private ArrayList<Socio> gimnasio;

    public Gimnasio(ArrayList<Socio> gimnasio) {
        this.gimnasio = gimnasio;
    }

    @Override
    public String toString() {
        return "Gimnasio{" +
                "gimnasio=" + gimnasio +
                '}';
    }

    public void altaSocio(String nombre, String dni, int edad, String fecha){
        for (Socio s : gimnasio){
            if (s.getDni().equals(dni)){
                System.out.println("Ya hay un usuario con ese DNI");
                return;
            }
        }
        gimnasio.add(new Socio(nombre, dni, edad, fecha, true));
        System.out.println("Socio añadido correctamente");
    }


    public void bajaDeSocio(String dni){
        for (Socio s : gimnasio){
            if (s.getDni().equals(dni)){
                s.setActivo(false);
                return;
            }
        }
        System.out.println("No existe un usuario con ese DNI");
    }

    public void listarSociosActivosOrdenados(){
        gimnasio.sort((s1, s2) -> s1.getNombre().compareTo(s2.getNombre()));

        for (Socio s : gimnasio){
            if (s.isActivo()) System.out.println(s);
        }
    }

    public void listarSociosInactivosOrdenados(){
        gimnasio.sort((s1,s2)-> s1.getDni().compareTo(s2.getDni()));

        for (Socio s : gimnasio){
            if (!s.isActivo()) System.out.println(s);
        }
    }

    public void borrarSocio(String dni){

        for (Socio s : gimnasio){
            if (s.getDni().equals(dni)){
                int indice = gimnasio.indexOf(s);
                gimnasio.remove(indice);
                return;
            }
        }
    }
}
