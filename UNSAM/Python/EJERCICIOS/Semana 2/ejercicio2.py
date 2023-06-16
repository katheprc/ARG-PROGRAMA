lista1 = str(input("Ingrese elementos, separados por comas, para la primera lista: ")).split(",")
lista2 = str(input("Ingrese elementos, separados por comas, para la segunda lista: ")).split(",")
aux = 0
listafinal = []
while (len(lista1) > aux):
    aux2 = 0
    while(len(lista2) > aux2):
        if (lista1[aux] == lista2[aux2]):
            listafinal.append(lista2[aux2])
        aux2 = aux2 + 1
    aux = aux + 1

print("Los elementos iguales en ambas listas es: ", listafinal)