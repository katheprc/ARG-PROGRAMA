# Podemos hacer una variante mas sofisticada de este código que es controlar si el usuario ingresa correctamente los 
# valores, y si no lo hace, el programa se frena y le avisa al usario.
# Veamos como se hace:
string_lista_numeros = input('Escriba una lista de numeros (separados por "," y los decimales por "."): ')
lista_numeros_str = string_lista_numeros.split(',')
lista_numeros_float = [] # Vamos a llenar esta lista con todos los valores de la lista prompteada (lista_numeros_str), pero hechos float en vez de string.
mal_input = False # Esta variable la usamos para saber si se escribió bien el input. Si detectmos un error la cambiamos a True, entonces el programa no va seguir e imprimir el resultado.
for i in lista_numeros_str:
    if i.replace('.', '', 1).isdigit(): # Acá hicimos un truquito para chequear que sea un float. Si a un decimal le saco el punto (remplazo el "." por nada "") queda una string con un numero entero, que lo puedo evaluar con .isdigit()
        numero_float = float(i)
        lista_numeros_float.append(numero_float)
    else:
        print('La lista ingresada posee un caracter que no es un float')
        mal_input = True
        break

print(lista_numeros_float)
if not mal_input:
  
    tupla = tuple(lista_numeros_float)
    suma_tupla = sum(tupla)
    print(f'Tupla: {tupla} Suma: {suma_tupla}')
#
# Pueden probarlo ingresando un valor que no es lo esperado por el programa.