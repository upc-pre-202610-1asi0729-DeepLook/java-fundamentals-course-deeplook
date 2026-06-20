import java.util.Scanner;
import java.util.Random;

class Pokemon{
    //atributos
    private String especie;
    private String nombre;
    private String tipo;
    private int nivel;
    private int[] estadisticas;//{hp, ataque, defensa}== {0, 1, 2}= 3 espacios
    //constructor
    
    public Pokemon(String _especie, String _tipo, String _nombre){
        this.especie=_especie;
        this.tipo=_tipo;
        
        if(_nombre==null || _nombre.equals("")){
            this.nombre=_especie;
        }else{
            this.nombre=_nombre;
        }
        
        Random random = new Random();
        
        this.nivel=random.nextInt(5)+3;
        this.estadisticas = new int[3];
        this.estadisticas[0]= random.nextInt(31)+20;
        this.estadisticas[1]= random.nextInt(16)+10;
        this.estadisticas[2]= random.nextInt(16)+10;        
    }
    //getters
    public String getEspecie(){return especie;} 
    public String getNombre(){return nombre;}
    public String getTipo(){return tipo;}
    public int getNivel(){return nivel;}
    public int getHp(){return estadisticas[0];}
    public int getAtaque(){return estadisticas[1];}
    public int getDefensa(){return estadisticas[2];} 
    //setters
    public void setEspecie(String _especie){
        this.especie=_especie;
    }
    public void setNombre(String _nombre){
        this.nombre=_nombre;
    }
    public void setTipo(String _tipo){
        this.tipo=_tipo;
    }
    public void setNivel(int _nivel){
        this.nivel=_nivel;
    }
    public void setHp(int _hp){
        this.estadisticas[0]=_hp;
    }
    public void setAtaque(int _ataque){
        this.estadisticas[1]=_ataque;
    }
    public void setDefensa(int _defensa){
        this.estadisticas[2]=_defensa;
    }
    //metodos
    
    public void mostrar(){
        System.out.println("Especie: "+ especie);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Tipo: "+ tipo);
        System.out.println("Nivel: "+ nivel);
        System.out.println("HP: "+ estadisticas[0]);
        System.out.println("Ataque: "+ estadisticas[1]);
        System.out.println("Defensa: "+ estadisticas[2]);
        System.out.println();
    }
    
}
/*
 * ============================================================
 * NOTA IMPORTANTE PARA QUIEN REVISE ESTE REPOSITORIO:
 * ============================================================
 * Este archivo contiene TANTO la clase Pokemon COMO la clase
 * Main en un solo bloque, tal como se trabajó en el editor
 * online OnlineGDB (https://onlinegdb.com), donde el proyecto
 * se ejecuta como un único archivo.
 *
 * Si deseas EJECUTAR este código:
 * 1. Copia todo el contenido de este archivo (Pokemon.java)
 * 2. Pégalo en un nuevo proyecto Java en https://onlinegdb.com
 * 3. Copia todo el contenido del archivo (Main.java)
 * 4. Pégalo debajo del codigo Pokemon.java que pegaste en https://onlinegdb.com
 * 4. Ejecuta directamente — no se requiere ningún otro archivo
 *
 * A partir de aquí comienza la clase Main, equivalente al
 * archivo Main.java mencionado en la documentación del curso.
 * ============================================================
 */
