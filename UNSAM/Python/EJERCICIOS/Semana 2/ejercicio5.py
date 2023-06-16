cadena = input("Ingrese una palabra para analizar si es palíndroma: ")
aux = 0
cant = len(cadena) - 1
pali = True
while (aux <= cant):
    if (cadena[aux] != cadena[cant-aux]):
        pali = False
        print("La palabra no es palindroma")
        break

    aux = aux + 1

if (pali):
    print("La palabra es palindroma")


#Palíndromo es que sean iguales de delante que de revés, entonces vamos a pedirle que de vuelta la palabra recorriendola cada -1 pasos

#Input de palabras a chequear, separadas por coma, todas en lowercase
candidatos_palindromo = str(input("Dame una lista de cosas separadas sólo por comas, por favor:")).lower().split(',')

palindromos = []                        #lista vacía donde voy a guardar palabras palindromas
for candidato in candidatos_palindromo:
  reverso = candidato[::-1]             #guardo en la variable 'reverso' la palabra dada vuelta al recorrerla cada -1 lugares                       
  if reverso == candidato:              #condición de palíndromo
    palindromos.append(candidato)       #sólo si son iguales, se actualiza palindromos agregando la palabra en la que se encuentra iterando el for

print("Estas palabras son palindromos:",palindromos)

#Alternativa más completa: condicionar la impresión de la variable según haya o no palíndromas
print("Segunda alternativa de código:")
if len(palindromos)>0:
  print("Estas palabras son palindromos:",palindromos)
else:
  print("Ninguna de tus palabras era palindromo")