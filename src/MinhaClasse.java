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

String nome = "Lucy";
String sobrenome = "Ostrowskii";

String nomeCompleto = nomeCompleto(nome, sobrenome);

System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome);
}

}
