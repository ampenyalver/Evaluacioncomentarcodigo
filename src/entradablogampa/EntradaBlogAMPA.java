package entradablogampa;

public class EntradaBlogAMPA {

    /**
     * Clase que maneja entradas de un blog
     *
     * @author AnaM_Peñalver
     * @version 1.0
     * @since 13/01/2021
     */

    /**
     * Atributos de la clase EntradaBlogAMPA
     */
    public static char separador = ':';
    private int id;
    private String texto;
    private String autor;

    /**
     * Constructor de la clase. El constructor recibe como parametro el nombre
     * del autor, y el texto que contiene la entrada. Si el numero de entrada es
     * negativo, lanza una excepción
     *
     * @param id
     * @param autor
     * @param texto
     * @throws IllegalArgumentException
     */
    public EntradaBlogAMPA(int id, String autor, String texto) throws IllegalArgumentException {
        if (id <= 0) {
            throw new IllegalArgumentException("El id no puede ser negativo");
        }
        this.id = id;
        this.autor = autor;
        this.texto = texto;
    }

    /**
     * Método sobreescrito toString, sopb reescribe el método toString que
     * hereda de la calse Object
     *
     * @return cad Devuelve una cadena
     */
    @Override
    public String toString() {
        String cad = "";
        cad += "\nENTRADA DE" + separador + autor;
        cad += "\n " + texto;
        return cad;
    }

    /**
     * Método que devuelve un entero con el número de la entrada
     *
     * @return int id, devuelve el número de entradas
     */
    public int getId() {
        return this.id;
    }

    /**
     * Método que devuelve un String con el texto de la entrada
     *
     * @return String texto
     */
    public String getTexto() {
        return this.texto;
    }

    /**
     * Método que devuelve un String con el nombre del autor de la entrada en
     * mayusculas
     *
     * @return String autor
     */

    public String getAutor() {
        return this.autor.toUpperCase();
    }

    /**
     * Método que hace los mismo que getAutor, Devuelve un String con el nombre
     * del autor
     *
     * @see getAutor()
     * @return Strin autor
     */
    public String devuelveAutor() {
        return this.autor;
    }

    /**
     * Método principal main, puede recibir o no argumentos Crea un objeto de la
     * clase EntradaBlogAMPA, al que se le pasa a su constructor los parametros
     * adecuados para su creación. Imprime el objeto.
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntradaBlogAMPA e1 = new EntradaBlogAMPA(3, "AnaM_Peñalver", "Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }

}
