package primeiro;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {
        //Criando um objeto da classe HashMap que implementa a interface Map
        Map<String, Integer> usandoHashMap = new HashMap<>();

        // Adicionando pares chave-valor
        usandoHashMap.put("Gatos", 1);
        usandoHashMap.put("Cachorros", 2);
        usandoHashMap.put("Roedores", 3);

        // Acessando um valor através de uma chave
        int valor = usandoHashMap.get("Cachorros");
        System.out.println("Valor da chave Cachorros: " + valor);

        // Removendo um par chave-valor
        usandoHashMap.remove("Gatos");

        //Elaine: testando

        System.out.println("usandoHashMap    " + usandoHashMap);
        System.out.println("usandoHashMap.keySet()  " + usandoHashMap.keySet());

        // Iterando sobre as chaves
        //.keySet() vai pegar o primeiro definido em Map<String, Integer>, neste caso a String para ser a chave e o valor Integer
        //com o forEach, usandoHashMap.keySet(), for vai iterando e com keySet() vai pegando as chaves "Cachorros" e "Roedores"
        //
        for (String chave : usandoHashMap.keySet()) {
            System.out.println("Chave: " + chave);
            System.out.println("Valor: " + usandoHashMap.get(chave));
        }
    }

}