class Stack:
    def __init__(self):
        # Dados iniciais
        self.items = [10, 20, 30]

    def push(self, item):
        self.items.append(item)

    def pop(self):
        if not self.is_empty():
            return self.items.pop()
        return None

    def peek(self):
        if not self.is_empty():
            return self.items[-1]
        return None

    def is_empty(self):
        return len(self.items) == 0

    def display(self):
        print("Pilha:", self.items)


# MENU INTERATIVO
stack = Stack()

while True:
    print("\n=== Menu Pilha ===")
    print("1. Inserir (Push)")
    print("2. Remover (Pop)")
    print("3. Ver Topo (Peek)")
    print("4. Mostrar Pilha")
    print("0. Sair")

    opcao = int(input("Opção: "))

    if opcao == 1:
        valor = int(input("Digite Um Valor: "))
        stack.push(valor)

    elif opcao == 2:
        removido = stack.pop()
        print(f"Removido: {removido}" if removido is not None else "Pilha Vazia")

    elif opcao == 3:
        topo = stack.peek()
        print(f"Topo: {topo}" if topo is not None else "Pilha Vazia")

    elif opcao == 4:
        stack.display()

    elif opcao == 0:
        print("Encerrando...")
        break

    else:
        print("Opção Inválida!")