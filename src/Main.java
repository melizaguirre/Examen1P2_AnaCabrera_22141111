
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class Main{
 public static ArrayList<Persona> listPersonas = new ArrayList();
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        do{
            opciones( menuUniverso() );
        }while(true);
    }
       public static int menuUniverso(){ 
        System.out.println(" ***** MENU *****");
        System.out.println("1. Opciones Universo");
        System.out.println("2. Opciones Esucadron\n" +
                            "3. Opciones Persona\n" +
                            "Ingrese la opcion: ");
        return sc.nextInt();
}
       
       public static void opciones(int opcion){
        if(opcion == 0)
            System.exit(0);
        else if(opcion == 1){
             System.out.println(" ***** Opciones Universo *****");
        System.out.println("1. Crear");
        System.out.println("2. Modifica\n" +
                            "3. Eliminar\n" +
                            "4. Listar "+
                            "Ingrese la opcion: ");
        int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
        else if(opcion == 2){
             System.out.println(" ***** Opciones Escuadron *****");
        System.out.println("1. Crear");
        System.out.println("2. Modifica\n" +
                            "3. Eliminar\n" +
                            "4. Listar "+
                            "5. Agregar Personas"+
                            "6. Simular Batalla"+
                            "Ingrese la opcion: ");
        int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }
        else if(opcion == 3) {
            System.out.println(" ***** Opciones Persona *****");
        System.out.println("1. Crear");
        System.out.println("2. Modifica\n" +
                            "3. Eliminar\n" +
                            "4. Listar "+
                            "Ingrese la opcion: ");
        int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
    }
       
    
       }
}

