compras = []
quantidade = int(input("Quantos itens você quer adicionar? "))
for i in range(quantidade):
    item = input("Digite o item: ")
    compras.append(item)
print("Lista de compras:")
for i in range(len(compras)):
    print(i + 1, "-", compras[i])
