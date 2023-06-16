precio = float(input("Ingrese el precio: "))
descuento = float(input("Ingrese el porcentaje de descuento sin simbolo de %: "))

print("El importe de descuento es: ", int(((precio*descuento)/ 100)))

print("El importe a pagar es: ", int((precio - ((precio*descuento)/ 100))))