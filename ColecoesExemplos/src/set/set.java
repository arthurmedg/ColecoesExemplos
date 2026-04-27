public static void main(String[] args) {
    // Criando um Set de números inteiros
    Set<Integer> numeros = new HashSet<>();

    // Adicionando elementos
    numeros.add(10);
    numeros.add(20);
    numeros.add(30);
    numeros.add(20); // duplicata, não será adicionada

    // Exibindo os elementos
    System.out.println("Elementos do Set:");
    for (Integer numero : numeros) {
        System.out.println(numero);
    }

    // Verificando se um elemento existe
    if (numeros.contains(10)) {
        System.out.println("\nO número 10 está presente no Set.");
    }

    // Removendo um elemento
    numeros.remove(30);
    System.out.println("\nApós remover 30:");
    for (Integer numero : numeros) {
        System.out.println(numero);
    }
}