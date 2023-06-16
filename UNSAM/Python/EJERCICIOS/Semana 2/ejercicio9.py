nombres = ['Laura', 'Juan', 'Tomás', 'Ana', 'Diego', 'Carla', 'Kim', 'Sofía']
apellidos = ['Pérez', 'Isla', 'Gómez', 'Castro', 'Roca', 'Romero', 'Díaz', 'López']
notas = [7, 4, 9, 5, 7, 8, 6, 10]
#Inicializo las listas donde voy a cargas los valores que correspondan
nombres_completos = []
aprobados = []
lista = []

for i in range(len(nombres)):                             #acá recorro ok porque todas las listas tienen el mismo largo, ojo en otros casos donde hay que recorrerlos con dos 'for'
  apellido_nombre = apellidos[i]+', ' + nombres[i]         #concateno con apellido primero y separado por coma y espacio
  if notas[i]>=7:
    aprobados.append(apellido_nombre) 
                            #agrego el que acabo de unir
  lista.append(notas[i]>=7)
  nombres_completos.append(apellido_nombre)

nombres_completos_ordenados = sorted(nombres_completos)       #ordeno (por apellido, que está primero) fuera del for porque sino lo ordena a cada paso y seria retrasar el programa con algo que puede hacerse al final
print('Lista de nombres completos ordenados según apellidos', nombres_completos_ordenados)

print('El promedio de la clase es:', sum(notas)/len(notas))#promedio = 

print('La nota mínima es:', min(notas))
print('La nota máxima es:', max(notas))
print('Estudiantes aprobados: ', aprobados)
print('Del orden original, \n', nombres_completos,  '\n aprobaron: \n',lista)
