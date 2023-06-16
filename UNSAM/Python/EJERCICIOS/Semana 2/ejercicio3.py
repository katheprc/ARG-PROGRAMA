fibonacci = [0, 1]

aux = 2
while (aux < 10):
    fibonacci.append(fibonacci[aux-2] + fibonacci[aux-1]) 
    aux = aux + 1
print(fibonacci)