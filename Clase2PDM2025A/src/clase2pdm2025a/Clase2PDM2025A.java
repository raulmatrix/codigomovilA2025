
package clase2pdm2025a;

public class Clase2PDM2025A {

    
    public static void main(String[] args) {
        String frase = "Nunca dejes de aprender";
        System.out.println("Tamaño frase: "+frase.length());
        //System.out.println(frase.charAt(0));
        frase.toLowerCase();
        
        int contVocales = 0;
        int conCons = 0;
        
        for(int i=0; i<frase.length();i++){
            //System.out.println(frase.charAt(i));
            char letra = frase.charAt(i);
            if(letra == 'a' ||letra == 'e'||letra == 'i'||letra == 'o'||letra == 'u'){
                contVocales++;
            }else if(letra!=' '){
                conCons++;
            }
            
        }
        
        System.out.println("Vocales: "+contVocales+" Obtenidos: "
                +"a-e-a-i-o-u");
        System.out.println("Consonantes: "+conCons);
        
        //while y do while
        
        /*while(condicion){
        }*/
        
        /*int x=10;
        
        do{
            System.out.println(x);
            x++;
        }while(x<=10);*/
        
        int fila = 5;
        int col = 5;
        
        for(int i=1;i<fila;i++){
            for(int j=1;j<col;j++){
                System.out.print(i*j+"-");
            }
            System.out.println(" ");
        }
        
        
    }
    
}
