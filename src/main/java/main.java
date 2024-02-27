import ServiceImpl.CounterServiceImpl;
import ServiceImpl.PalindromoServiceImpl;

public class main {
    public static void main(String[] args) {
        //Los hare sin construc mas que el default
        PalindromoServiceImpl pal = new PalindromoServiceImpl();
        CounterServiceImpl count = new CounterServiceImpl();
        //En caso de que se requiere se pueden
        //leer los datos desde consola
        //pero lo hago asi ya que normalmente estos
        //datos vienen desde una interfaz y se meten a metodos
        String pal1 = pal.toPalindromo("Luz azul");
        String pal2 = pal.toPalindromo("somos o no somos");
        String pal3 = pal.toPalindromo("oso");
        String pal4 = pal.toPalindromo("ana");

        System.out.println("Primera palabra: " + pal1 + " Segunda: "+ pal2 + " Tercera: " + pal3 + " Cuarta: " + pal4);

        count.counter(60);
    }
}
