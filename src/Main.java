
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
 public static ArrayList<Persona> miembros;
 public static ArrayList <Escuadron> squad;
 public static ArrayList<Universo> uni = new ArrayList();
    
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
       public static void CrearUniverso(){
        System.out.print("Ingrese el nombre del universo a crear: ");
        String nombreU= sc.next();
        for(Universo universo: uni){
            if(universo!= null && universo.getNombreU()== nombreU){                
                System.out.print(" Este Universo ya existe ");	
            }
		System.out.print("Universo creado");
                uni.add(new Universo(nombreU));
		}
    }
        public static void ModificarUniverso(int pos){
        System.out.print("Ingrese la posicion de ");
        String nombreU= sc.next();
        for(Universo universo: uni){
            if(universo!= null && universo.getNombreU()== nombreU){
                
                uni.get(0).getNombreU()=nombre;
                System.out.print(" Universo creado ");	
            }
		System.out.print("Este universo ya existe");	
		}
    }
        public static void eliminarUniverso(){
        System.out.print("Ingrese nombre del universo a eliminar: ");
         String nombreU= sc.next();
         for(Universo universo: uni){
            if(universo!= null && universo.getNombreU()== nombreU){
                uni.remove(nombreU);
            }
            System.out.print("No se ha encontrado este universo");	
		}
    }
        public static void listarUniversos(){
        for (Universo universo : uni) {
            System.out.println(universo.toString());
        }
    }
        
        public static void CrearEscuadron(){   
        System.out.print("Ingrese el nombre del escuadron a crear: ");
        String nombre= sc.next();
         System.out.print("Ingrese el lugar del escuadron a crear: ");
        String lugar= sc.next();
        System.out.print("Ingrese el lider del escuadron a crear: ");
        Persona lider;
        System.out.print("Ingrese el tipo de escuadron, 1 para Superheroes, 2 para Villanos ");
        int TipoPer=0;
        String TipoPersonaje="";
        if (TipoPer == 1){
            TipoPersonaje="Heroe";
        } else if (TipoPer==2){
            TipoPersonaje="Villano";
        }
        squad.add(new Escuadron(nombre, lugar));
               
        }
        
    
        public static void eliminarEscuadron(){
        System.out.print("Ingrese nombre del escuadron a eliminar: ");
         String nombre= sc.next();
                squad.remove(sc.nextInt());
           
    }
        public static void listarEscuadron(){
        for (Escuadron escuadron : squad) {
            System.out.println(escuadron.toString());
        }
    }
        
        public static void CrearPersona(String nombre, String lugar, Persona lider){   
        System.out.print("Ingrese el nombre: ");
        String nombre= sc.next();
        System.out.print("Ingrese el poder: ");
        String poder= sc.next();
        System.out.print("Ingrese la debilidad: ");
        String debilidad= sc.next();
        squad.add(new Escuadron(nombre,lugar));
    }
        public static void eliminarPersonan(){
        System.out.print("Ingrese nombre del escuadron a eliminar: ");
         String nombre= sc.next();
                squad.remove(sc.nextInt());
           
    }
        public static void listarPersonas(){
        for (Escuadron escuadron : squad) {
            System.out.println(escuadron.toString());
        }
    }
        
       
}

