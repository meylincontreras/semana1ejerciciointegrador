package EjIntegrador1;

public class Main {
    public static void main(String[] args){

        //barcos de prueba
        
        Barco velero1 = new Velero("A001", 3, 1200, 4);
        Barco deportivo1 = new Deportivo("B001", 20, 1800, 107);
        Barco yate1 = new Yate("C001", 10, 3000, 140, 16);
        
        //alquileres
        
        
        Alquiler alquiler1 = new Alquiler("A1", 321, 5, 32, 1, velero1);
        Alquiler alquiler2 = new Alquiler("B1", 123, 7, 45, 2, deportivo1);
        Alquiler alquiler3 = new Alquiler("C1", 534, 11, 91, 3, yate1);

        //lista de alquileres
        Alquiler alquileresEnero[] = new Alquiler[3];
        
        alquileresEnero[0] = alquiler1;
        alquileresEnero[1] = alquiler2;
        alquileresEnero[2] = alquiler3;

        //cálculos
        Calculos calculos = new Calculos();

        Alquiler mayorAlquiler = calculos.devolverMayorAlquiler(alquileresEnero);
        Alquiler menorAlquiler = calculos.devolverMenorAlquiler(alquileresEnero);
        int promedioAlquileres = calculos.devolverPromedioAlquileres(alquileresEnero);

        System.out.println("Enero \nEl mayor alquiler fue: " + mayorAlquiler.toString() + ".\nEl menor fue: " + menorAlquiler.toString() + ".\nEl promedio fue: " + promedioAlquileres);


    }
}