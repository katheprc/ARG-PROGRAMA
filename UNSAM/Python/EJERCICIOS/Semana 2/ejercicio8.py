lista = []
for aux in range(1, 31):
    if (aux % 5 == 0) and (aux % 3 == 0):
        lista.append("fizzbuzz")
    elif (aux % 3 == 0):
        lista.append("fizz")
    elif (aux % 5 == 0):
        lista.append("buzz")
    else:
        lista.append(aux)
    
print(lista)

