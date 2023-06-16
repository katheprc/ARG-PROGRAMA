cadena = input("Ingrese una cadena para saber cuantas vocales tiene: ")
cont = 0
aux = 0
while (aux < len(cadena)):
    v = cadena[aux]
    if (v == "a" or v == "A" or v == "e" or v == "E" or v == "i" or v == "I" or v == "o" or v == "O" or v == "u" or v == "U"):
        cont = cont + 1
    aux = aux + 1
print("La cantidad de vocales es: ", cont)
