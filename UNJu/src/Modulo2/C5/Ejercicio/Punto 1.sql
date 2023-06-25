CREATE DATABASE MI_BASE_DE_DATOS

CREATE TABLE DOCENTES_ARG_PROGRAMA (
    Id_Dni VARCHAR(9) NOT NULL,
    Num_Legajo INT NOT NULL,
    Nombre VARCHAR(50) NOT NULL,

    Segundo_Nombre VARCHAR(50) NOT NULL,
    
    Apellido VARCHAR(50) NOT NULL,
    Sexo VARCHAR(1) NOT NULL,
    Telefono VARCHAR(10) NOT NULL,
    Fecha_Nacimiento DATE NOT NULL,
    Fecha_Contrato DATE NOT NULL,
)

ALTER TABLE DOCENTES_ARG_PROGRAMA
ADD PRIMARY KEY (Id_Dni);

CREATE TABLE CURSOS_ARG_PROGRAMA (
    Id_Codigo INT NOT NULL,
    Descripcion VARCHAR(100) NOT NULL,
    Carga_Horaria_Semanal INT NOT NULL,
    Remuneracion INT NOT NULL,

    Institucion VARCHAR(50) NOT NULL,
)

ALTER TABLE DOCENTES_ARG_PROGRAMA ADD FOREIGN KEY(Id_Codigo) REFERENCES CURSOS_ARG_PROGRAMA (Id_Codigo)

INSERT INTO CURSOS_ARG_PROGRAMA (Id_Codigo, Descripcion, Carga_Horaria_Semanal, Remuneracion, Institucion) VALUES(1, "Java",                  6, 100000, "Universidad Nacional de Jujuy");
INSERT INTO CURSOS_ARG_PROGRAMA (Id_Codigo, Descripcion, Carga_Horaria_Semanal, Remuneracion, Institucion) VALUES(2, "Full-Stack",            8, 110000, "Universidad Nacional de Jose C Paz");
INSERT INTO CURSOS_ARG_PROGRAMA (Id_Codigo, Descripcion, Carga_Horaria_Semanal, Remuneracion, Institucion) VALUES(3, "Python",                3, 120000, "Universidad Nacional de La Plata");
INSERT INTO CURSOS_ARG_PROGRAMA (Id_Codigo, Descripcion, Carga_Horaria_Semanal, Remuneracion, Institucion) VALUES(4, "MySQL",                 5, 130000, "Universdad Nacional de Avellaneda");
INSERT INTO CURSOS_ARG_PROGRAMA (Id_Codigo, Descripcion, Carga_Horaria_Semanal, Remuneracion, Institucion) VALUES(5, "HTML, CSS, JavaScript", 2, 140000, "Universidad Nacional de Buenos Aires");

INSERT INTO DOCENTES_ARG_PROGRAMA (Id_Dni, Num_Legajo, Nombre, Segundo_Nombre, Apellido, Sexo, Telefono, Fecha_Nacimiento, Fecha_Contrato, Id_Codigo)            VALUES("11111111", 1, "Viviana",        "",  "Gomez", "F", "1122334455", '1990-12-23', '2022-02-06', 1);
INSERT INTO DOCENTES_ARG_PROGRAMA (Id_Dni, Num_Legajo, Nombre, Segundo_Nombre, Apellido, Sexo, Telefono, Fecha_Nacimiento, Fecha_Contrato, Id_Codigo, Id_Codigo) VALUES("22222222", 2, "Evelyn" , "Valeria",  "Rojas", "F", "1123456789", '1998-07-10', '2020-07-25', 2, 3);
INSERT INTO DOCENTES_ARG_PROGRAMA (Id_Dni, Num_Legajo, Nombre, Segundo_Nombre, Apellido, Sexo, Telefono, Fecha_Nacimiento, Fecha_Contrato, Id_Codigo)            VALUES("33333333", 3, "Agustin",        "",   "Vera", "M", "1198765432", '2000-12-23', '2023-01-30', 4);
INSERT INTO DOCENTES_ARG_PROGRAMA (Id_Dni, Num_Legajo, Nombre, Segundo_Nombre, Apellido, Sexo, Telefono, Fecha_Nacimiento, Fecha_Contrato, Id_Codigo)            VALUES("44444444", 4, "Gonzalo",  "Matias", "Rivera", "M", "1125386479", '1980-10-07', '2019-09-01', 5);