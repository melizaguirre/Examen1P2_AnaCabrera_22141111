
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
                    CrearUniverso();
                    break;
                case 2:
                    ModificarUniverso();
                    break;
                case 3:
                    eliminarUniverso();
                    break;
                case 4:
                   listarUniversos();
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
                    CrearEscuadron();
                    break;
                case 2:
                    ModificarEscuadron();
                    break;
                case 3:
                    eliminarEscuadron();
                    break;
                case 4:
                    listarEscuadron();
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
                    CrearPersona();
                    break;
                case 2:
                    ModificarPersona();
                    break;
                case 3:
                    eliminarPersona();
                    break;
                case 4:
                    ListarPersona();
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
        System.out.print("Ingrese el nombre del Universo a modificar");
        String nombre= sc.next();
        for(Universo universo: uni){
            if(universo!= null && universo.getNombreU()== nombre){
                uni.add(universo);
                System.out.print(" Universo Modificano");	
            }
		System.out.print("Este universo no  existe");	
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
        public static void ModificarEscuadron(){
            
        }
        
        public static void eliminarEscuadron(){
        System.out.print("Ingrese nombre del escuadron a eliminar: ");
         String nombre= sc.next();
         for(Escuadron escuadron: squad){
            if(escuadron!= null && escuadron.getNombre()== nombre){
                squad.remove(escuadron);
               
            }else 
                 System.out.print("No se ha encontrado este escuadron");	
            
         }
    }
        public static void listarEscuadron(){
        for (Escuadron escuadron : squad) {
            System.out.println(escuadron.toString());
        }
    }
        
        public static void CrearPersona(){   
        System.out.print("Ingrese el nombre: ");
        String nombre= sc.next();
        System.out.print("Ingrese el poder: ");
        String poder= sc.next();
        System.out.print("Ingrese la debilidad: ");
        String debilidad= sc.next();
        System.out.print("Ingrese el tipo de persona, 1 para Superheroes, 2 para Villanos ");
        int TipoPer=0;
        System.out.print("Ingrese la fuerza");
        Integer fuerza =0;
        System.out.print("Ingrese la agilidad fisica");
        Integer agilidadFisica=0;
        System.out.print("Ingrese la agilidad mental");
        Integer agilidadMental=0;
        String TipoPersonaje="";
        if (TipoPer == 1){
            TipoPersonaje="Heroe";
        } else if (TipoPer==2){
            TipoPersonaje="Villano";
        }
        miembros.add(new Persona(nombre, poder, debilidad, fuerza, agilidadFisica, agilidadMental, TipoPersonaje));
    }
        public static void eliminarPersonan(){
        System.out.print("Ingrese nombre del escuadron a eliminar: ");
         String nombre= sc.next();
                miembros.remove(sc.nextInt());
                for(Persona persona: miembros){
            if(persona!= null && persona.getNombre()== nombre){
                miembros.remove(nombre);
               
            }else 
                 System.out.print("No se ha encontrado este escuadron");	
            
         }
           
    }
        public static void listarPersonas(){
        for (Persona per : miembros) {
            System.out.println(per.toString());
        }
    }
        
       
}

