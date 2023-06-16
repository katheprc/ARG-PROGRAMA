nombre = input("Ingrese su nombre: ")
edad = float(input("Ingrese su edad: "))
peso = float(input("Ingrese su peso en Kg: "))
altura = float(input("Ingrese su altura en metros: "))

print(nombre, ", su IMC para su edad, ", edad, ", es: ", (peso/altura**2))