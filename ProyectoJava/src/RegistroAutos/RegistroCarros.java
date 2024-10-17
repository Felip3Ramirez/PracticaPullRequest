package RegistroAutos;

import java.util.Scanner;
import java.util.Random;

public class RegistroCarros {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
        String []carros=new String[5];
        String []placas= new String[5];
        int []modelo=new int[5];
        menu(carros,placas,modelo);
    }
    public static void ingresoAutos(String [] carros ){
        for (int i =0;i<carros.length;i++){
            System.out.println("Marca del Auto Numero "+"("+(i+1)+")");
            carros[i]= sc.next();
        }

    }
    public static void ingresoPlaca(String [] carros,String [] placas){
        for (int i =0;i<placas.length;i++){
            System.out.println("Placa del Auto "+carros[i]);
            placas[i]= sc.next();
        }
    }
    public static void ingresoModelo(String [] carros,String [] placas,int [] modelo){
        for (int i =0;i<modelo.length;i++){
            System.out.println("Modelo del Auto "+carros[i]+" con placas "+placas[i]);
            modelo[i]= sc.nextInt();
        }
    }
    public static void mostrarInfo(String [] carros,String [] placas,int [] modelo){
        for (int i =0;i<carros.length;i++){
            System.out.println("Auto de marca "+carros [i]+" con placas "+placas[i]+" del año "+modelo[i]);
        }
        for (int i =0;i<modelo.length;i++){
            if (modelo[i]<2020){
                System.out.println("Modelos Viejos "+carros[i]);
            } else if (modelo[i]>=2020){
                System.out.println("Modelos Nuevos "+carros[i]);
            }
        }
    }
    public static void juego(){
        int numeroSecreto = random.nextInt(100) ;
        int intentos = 0;
        boolean adivinado = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Adivina el numero entre 1 y 100");

        while (!adivinado) {
            System.out.print("Que numero piensas que es?: ");
            int suposicion = sc.nextInt();
            intentos++;

            if (suposicion == numeroSecreto) {
                adivinado = true;
                System.out.println("Excelente Lo adivinaste en " + intentos + " intentos, El numero es :"+numeroSecreto);
                if (intentos>=8){
                    System.out.println("No sirves para adivinar y ella te engaña :_)");
                } else if (intentos<8) {
                    System.out.println("Si sirves para adivinar y ella talvez no te engaña :)");
                }
            } else if (suposicion < numeroSecreto) {
                System.out.println("El número es MAYOR. Intenta de nuevo.");
            } else {
                System.out.println("El número es MENOR. Intenta de nuevo.");
            }

        }
        System.out.println("\n");
    }

    static void menu (String [] carros,String [] placas,int [] modelo){
        boolean salir = false;
        int opc = 0;


        while (!salir){
            System.out.println("1.Ingresar Marca del Auto");
            System.out.println("2.Ingresar Placa del Auto");
            System.out.println("3.Ingresar Modelo del Auto");
            System.out.println("4.Mostrar Informacion de Autos Ingresados");
            System.out.println("5.Juego por si las Moscas");
            System.out.println("6.Salir");
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    ingresoAutos(carros);
                    break;
                case 2:
                    ingresoPlaca(carros,placas);
                    break;
                case 3:
                    ingresoModelo(carros,placas,modelo);
                    break;
                case 4:
                    mostrarInfo(carros,placas,modelo);
                    break;
                case 5:
                    juego();
                    break;
                case 6:
                    salir=false;
                    break;

                default:
            }
        }
    }
}
