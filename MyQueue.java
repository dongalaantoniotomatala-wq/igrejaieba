import java.util.ArrayList; // Importa a classe ArrayList para armazenar os elementos
import java.util.Scanner; // Importa Scanner para ler os dados do usuário

class  MyQueue{ // Define a classe Queue (Fila)
    private ArrayList<Integer> items = new ArrayList<>(); // Cria lista dinâmica

    // Construtor com dados iniciais
    public MyQueue() {
        items.add(100);
        items.add(200);
        items.add(300);
    }

    public void enqueue(int item) {
        items.add(item); // Adiciona elemento no final da fila
    }

    public Integer dequeue() {
        if (!isEmpty()) { // Verifica se a fila não está vazia
            return items.remove(0); // Remove o primeiro elemento
        }
        return null; // retorna null se estiver vazia
    }

    public Integer front() {
        if (!isEmpty()) {
            return items.get(0); // Retorna o primeiro elemento sem remover
        }
        return null;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void display() {
        System.out.println("Fila: " + items); // Mostra todos os elementos//
    }
}

    class  Queue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(); // Cria a fila
        Scanner sc = new Scanner(System.in);
        int opcao; // Variável para armazenar a opção do menu

        do {
            System.out.println("\n=== Menu Fila ===");
            System.out.println("1. Inserir (Enqueue)");
            System.out.println("2. Remover (Dequeue)");
            System.out.println("3. Verificar Se a Fila Está Vazia (isEmpty)");
            System.out.println("4. Ver Primeiro (Front)");
            System.out.println("5. Mostrar Fila");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt(); // Lê a opção do usuário

            switch (opcao) {
                case 1:
                    System.out.print("Valor: ");
                    int val = sc.nextInt();
                    queue.enqueue(val);
                    break;

                case 2:
                    Integer r = queue.dequeue();
                    System.out.println(r != null ? "Removido: " + r : "Fila vazia");
                    break;

                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("A fila  está vazia");
                    } else {
                        System.out.println("A fila não está vazia");
                    }
                    break;

                case 4:
                    Integer f = queue.front();
                    System.out.println(f != null ? "Primeiro: " + f : "Fila vazia");
                    break;

                case 5:
                    queue.display();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");

            }

        } while (opcao != 0);

        sc.close();
    }
}