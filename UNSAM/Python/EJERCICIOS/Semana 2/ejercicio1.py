lista_frutas = ["pera", "durazno", "melon", "sandia"]
aux = 1
correcta = lista_frutas[0]
while aux < len(lista_frutas):
    if len(lista_frutas[aux]) > len(correcta):
        correcta = lista_frutas[aux]
    aux = aux + 1

print("La palabra mas larga es: ", correcta)




#Defino la variable donde guardar el input en forma lista (le impongo que lo tome como string, y que separe con comas)
lista_cadenas = str(input("Darme una lista de palabras separadas con comas, por favor:")).split(',')

print("El elemento más largo es:", max(lista_cadenas, key = len)) 
#agrego el argumento para que use como 'llave' (key) len, por length de 'largo' en inglés