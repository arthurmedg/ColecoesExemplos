void main() {
    // Criando um Map chamado "agenda"
    // A chave será o nome da pessoa (String)
    // O valor será o telefone (String)
    Map<String, String> agenda = new HashMap<>();

    // Adicionando pares chave-valor
    agenda.put("Ana", "9999-1111");
    agenda.put("Bruno", "9999-2222");
    agenda.put("Carlos", "9999-3333");

    // Se adicionarmos novamente a mesma chave ("Ana"),
    // o valor antigo será substituído pelo novo
    agenda.put("Ana", "8888-4444");

    // Tentando buscar pelo valor não funciona, pois o Map busca pela chave
    // agenda.get("9999-3333") não retorna nada, pois "9999-3333" é um valor, não uma chave
    System.out.println("Tentativa incorreta: " + agenda.get("9999-3333"));

    // Exibindo todo o conteúdo do Map
    System.out.println("\nAgenda completa:");
    System.out.println(agenda);

    // Buscando o telefone de Bruno pela chave
    String telefone = agenda.get("Bruno");
    System.out.println("\nTelefone do Bruno: " + telefone);
}
