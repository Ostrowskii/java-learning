package testarea;
public class MinhaClasse {
    
// void = não retorna nada
public static void main (String [] args) {

    // tudo o que eu escrever dentro daqui só vai existir aqui dentro
    // System tem varios metodos. um deles é o out.print com um parametro     
    // System.out.print("ola a todos, sejam bem-vindos");

    //para criar uma constante/ variavel que nunca varia. 
    //tu pode usar o seguinte padrão
    // final String VARIAVEL_QUE_N_VARIA = "I am ostrowski";
    // System.out.println(VARIAVEL_QUE_N_VARIA);
    //perceba que temos o final e o nome é TODO_MAIUSCULO

    // String nome = "Lucy";
    // String sobrenome = "Ostrowskii";
    // String nomeCompleto = nomeCompleto(nome, sobrenome);
    // System.out.println(nomeCompleto);

    exibirTiposDados();
}

public static String nomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome);
}

public static void exibirTiposDados (){
    byte idade = 23;
    short ano = 2025;
    int cep = 12345678;
    long cpf = 12345678909L;
    float pi = 3.14F;
    double salario = 1234.33;
    char sexo = 'F';

    System.out.println(idade);
    System.out.println(ano);
    System.out.println(cep);
    System.out.println(cpf);
    System.out.println(pi);
    System.out.println(salario);
    System.out.println(sexo);

    //se um short recebe um int... pode dar erro
    //semrre use final para constante e letras maiusculas

}


}
