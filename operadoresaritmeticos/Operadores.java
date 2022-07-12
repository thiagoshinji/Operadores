
package operadoresaritmeticos;

public class Operadores {

    public static void main(String[] args) {
        
        // Operadores Aritmeticos
        
        int resultado = 1 + 2;
        System.out.println("resultado");
        
        resultado = resultado - 1;
        System.out.println(resultado);
        
        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);
        
        resultado = resultado + 8;
        System.out.println(resultado);
        
        resultado = resultado %7;
        System.out.println(resultado);
        
        String primeiroNome = "Esta e";
        String segundoNome = " uma String concatenada";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);
        
        resultado = resultado + 1;
        System.out.println(resultado);
        
        resultado ++;
        System.out.println(resultado);
        
        System.out.println(resultado ++);
        //same that 
        //System.out.println(resultado);
        //resultado = resultado + 1;
        //resultado + = 1;
        
        System.out.println(++ resultado);
        //same that 
        //resultado + = 1;
        //System.out.println(resultado);
        
        resultado --;
        System.out.println(resultado);
        
        System.out.println(resultado --);
        System.out.println(-- resultado);
        
    }
     
}
