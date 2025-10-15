public class App {
    public static void main(String[] args) throws Exception {
        double precioBase = 8;
        double preciopareja = 11;

        System.out.println("Ventas de entrada CineTuring");

        System.out.print("Número de entradas: ");
        int numEntrada = Integer.parseInt(System.console().readLine());

        System.out.print("Día de la semana: ");
        String diaString = System.console().readLine().toLowerCase();

        System.out.print("¿Tienes tarjeta CineTuring? (s/n): ");
        String tarjetaString = System.console().readLine().toLowerCase();

        System.out.println("Aquí tiene sus entradas gracias por la compra");

        int entradasIndividual = numEntrada;
        int entradasPareja = 0;

        switch (diaString) {
            case "miercoles", "miércoles" -> precioBase = 8;
            case "jueves" -> {
                entradasPareja = numEntrada / 2;
                entradasIndividual = numEntrada % 2;
            }
            default -> {

            }
        }
        double descuento = 0;

        if (entradasPareja > 0) {
            System.out.printf("Entrada pareja %25d%n", entradasPareja);
            System.out.printf("Precio por entrada de pareja %11.2f%n", preciopareja);
        }
        if (entradasIndividual > 0) {
            System.out.printf("Entrada individual %21d%n", entradasIndividual);
            System.out.printf("Precio por entrada individual %10.2f%n", precioBase);
        }
        double total = (entradasIndividual * precioBase) + (entradasPareja * preciopareja);

        System.out.printf("Total %34.2f%n", total);
 
        if (tarjetaString.equals("s")) {
            descuento = total * 0.1;
        }
        System.out.printf("descuento %30.2f%n", descuento);
        System.out.printf("A pagar %32.2f%n", total-descuento);
        

    }
}
