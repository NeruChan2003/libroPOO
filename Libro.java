import java.util.Scanner;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    // Constructor con todos los atributos pasados por parámetro
    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // Constructor vacío
    public Libro() {
        // No hace nada
    }

    // Método para cargar un libro pidiendo los datos al usuario
    public void cargarLibro() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el ISBN del libro: ");
        ISBN = scan.nextLine();
        System.out.print("Ingrese el título del libro: ");
        titulo = scan.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        autor = scan.nextLine();
        System.out.print("Ingrese el número de páginas del libro: ");

        numPaginas = scan.nextInt();
    }

    // Método para informar los datos del libro
    public void informarDatos() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
    }
}