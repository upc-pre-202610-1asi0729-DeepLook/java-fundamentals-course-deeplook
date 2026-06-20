

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int cantidad;
        
        do{
            System.out.println("Cuantos pokemones desea registrar?");
            System.out.println("(Maximo 5 pokemones)");
            cantidad=scanner.nextInt();
            scanner.nextLine();
            
        }while(cantidad<1 || cantidad>5);
        
        Pokemon[] equipoPokemon = new Pokemon[cantidad];
        
        for(int i=0;i<cantidad; i++){
            System.out.println("Pokemon "+(i+1));
            System.out.println("Especie: ");
            String especie = scanner.nextLine();
            System.out.println("Tipo: ");
            String tipo = scanner.nextLine();
            System.out.println("Desea poner nombre? (si/no): ");
            String respuesta = scanner.nextLine();
            nombre="";
            if (respuesta.equalsIgnoreCase("si")){
                System.out.println("Nombre: ");
                nombre=scanner.nextLine();
            }
            
            equipoPokemon[i]= new Pokemon(especie,tipo,nombre);
            System.out.println("Pokemon "+ especie + " registrado exitosamente");
            System.out.println();
        }
        System.out.println("POKEMONES REGISTRADOS EXITOSAMENTE");
        
        while(true){
            System.out.println("MENU");
            System.out.println("1. Ver todos los detalles de mis pokemones");
            System.out.println("2. Ver detalle de un solo pokemon");
            System.out.println("3. Cambiar Nombre");
            int opcion=scanner.nextInt();
            if(opcion ==1 ){
                
                for(int i=0; i<cantidad; i++){
                    System.out.println("Pokemon "+ (i+1));
                    equipoPokemon[i].mostrar();
                    System.out.println();
                }
            }
            else if(opcion ==2){
                System.out.println("Escoja una posicion de sus pokemones");
                int seleccion = scanner.nextInt();
                scanner.nextLine();
                if(seleccion>0 && seleccion <= cantidad){//1,2,3,4,5
                    equipoPokemon[seleccion-1].mostrar();
                }
            }
            else if(opcion == 3){
                System.out.println("Que pokemon de tu lista deseas cambiar");
                int seleccion=scanner.nextInt();
                scanner.nextLine();
                if(seleccion >0 && seleccion <= cantidad){
                    System.out.println("Nombre: ");
                    nombre= scanner.nextLine();
                    equipoPokemon[seleccion-1].setNombre(nombre);
                }
            }       
        }
    }
}