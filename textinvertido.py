texto = input("Digite um texto: ")

invert = ""
i = len(texto) - 1
while i >= 0:
    invert = invert + texto[i]
    i = i - 1

print("Invertido:", invert)
