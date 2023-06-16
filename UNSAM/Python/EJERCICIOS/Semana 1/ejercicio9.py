dias = int(input("Ingrese cantidad de dias: "))
horas = int(input("Ingrese cantidad de horas: "))
minutos = int(input("Ingrese cantidad de minutos: "))
segundos = int(input("Ingrese cantidad de segundos: "))

print("La cantidad total de segundos es: ", ((dias*24*60*60) + (horas*60*60) + (minutos*60) + segundos))
