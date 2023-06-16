materia1 = float(input("Ingrese las 3 notas de la primera materia: "))
materia1 = materia1 + float(input())
materia1 = materia1 + float(input())

materia2 = float(input("Ingrese las 3 notas de la segunda materia: "))
materia2 = materia2 + float(input())
materia2 = materia2 + float(input())

materia3 = float(input("Ingrese las 3 notas de la tercera materia: "))
materia3 = materia3 + float(input())
materia3 = materia3 + float(input())

materia1 = materia1 / 3
materia2 = materia2 / 3
materia3 = materia3 / 3

if ((materia1 + materia2 + materia3) >= 21):
    print("El alumno aprobó con los promedios: ", int(materia1), ",", int(materia2), ",", int(materia3))