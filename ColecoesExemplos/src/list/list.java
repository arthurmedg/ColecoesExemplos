import list.Vaca;

public static void main(String[] args) {
    // Criando uma lista de nomes
    List<String> nomes = new ArrayList<>();

    // Adicionando elementos à lista
    nomes.add("Ana");
    nomes.add("Bruno");
    nomes.add("Carlos");
    nomes.add("Ana"); // Aceita duplicatas

    // Exibindo todos os elementos
    System.out.println("Lista de nomes:");
    for (String nome : nomes) {
        System.out.println(nome);
    }

    // Acessando um elemento pelo índice
    System.out.println("\nPrimeiro nome da lista: " + nomes.get(0));

    // Removendo um elemento
    nomes.remove("Bruno");

    // Exibindo a lista atualizada
    System.out.println("\nApós remover 'Bruno':");
    for (String nome : nomes) {
        System.out.println(nome);
    }




    // Exemplo 2:

//    Set<Vaca> vacas = new HashSet<>();
//    Scanner sc = new Scanner(System.in);
//    int opcao;
//    do {
//        System.out.println("1 - Cadastrar");
//        System.out.println("2 - Listar");
//        System.out.println("3 - Atualizar");
//        System.out.println("4 - Remover");
//        System.out.println("0 - Sair");
//        System.out.print("Escolha: ");
//        opcao = sc.nextInt();
//        if (opcao == 1) {
//            System.out.print("ID: ");
//            int id = sc.nextInt();
//            System.out.print("Nome: ");
//            String nome = sc.next();
//            vacas.add(new Vaca(id, nome));
//        } else if (opcao == 2) {
//            for (Vaca v : vacas) {
//                System.out.println(v.getId() + " - " + v.getNome());
//            }
//        } else if (opcao == 3) {
//            System.out.print("ID: ");
//            int id = sc.nextInt();
//            for (Vaca v : vacas) {
//                if (v.getId() == id) {
//                    System.out.print("Novo nome: ");
//                    v.setNome(sc.next());
//                }
//            }
//        } else if (opcao == 4) {
//            System.out.print("ID: ");
//            int id = sc.nextInt();
//            vacas.removeIf(v -> v.getId() == id);
//        }
//    } while (opcao != 0);
//    sc.close();
}
