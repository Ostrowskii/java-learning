package testarea;

public class Operadores {
    
public static void main (String[] args){
    int modulo0 = 18 % 3; // resto de divisão = 0
    int modulo1 = 19 % 3; // resto de divisão = 0
    int modulo2 = 20 % 3; // resto de divisão = 0
    int modulo = 18 % 4; // resto de divisão = 0
    System.out.println(modulo);
    System.out.println(modulo0);
    System.out.println(modulo1);
    System.out.println(modulo2);

    //CONCATENAÇÃO

    String nomeCompleto = "LINGUAGEM"+ "JAVA";
    System.out.println(nomeCompleto);



    int a, b;
    a = 5;
    b = 6;
    //true e false
    String resultado = a == b ? "verdadeiro" : "falso";
    System.out.println(resultado);

}

}
