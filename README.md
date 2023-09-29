Ejercicio: El Jefe y su único empleado
Realizado en la materia Paradigmas de la Programación del I.F.T.S N°16
Profesor Juan Pablo Converso

Descripción:
Un empresario necesita un sistema para cargar sus datos y los de un único empleado.
Los datos que quiere cargar tanto de él como los de su empleado son nombre y edad y luego 
necesita tener la posibilidad de despedir al empleado, contratar uno nuevo y mostrar la información cargada.
En una primera charla nos indicó que quería un menú como el siguiente:

Bienvenido a la empresa ACME
Ingrese opción:
1. Cargar Jefe / 2. Contratar Empleado / 3. Despedir Empleado / 4. Mostrar información Jefe / 5. Salir

En donde:
    1. Cargar Jefe debe pedirle al usuario el nombre y la edad del jefe y guardarlo en el sistema
    2. Contratar Empleado debe pedirle al usuario el nombre y la edad del empleado 
        ◦ Si el Jefe ya tenia cargado un empleado se debe imprimir un mensaje de error: 
          "Error: Ya tiene un empleado contratado”
        ◦ Si se puede cargar el empleado exitosamente se debe imprimir: 
          "Se contrato al empleado con éxito"
    3. Despedir empleado debe des-asociar el empleado del jefe
        ◦ Si se puede despedir al empleado exitosamente se debe imprimir: "Se despidió al empleado"
        ◦ Si el jefe no tenía empleados asociados se debe imprimir: "Error: No tiene empleados contratados"
    4. Mostrar información debe imprimir la información del jefe y su empleado. 
        ◦ En caso de que tuviera un empleado por ejemplo imprimiría: 
             Tipo: Jefe, Nombre: pedro, Edad: 45
             Datos Empleado: Tipo: Empleado, Nombre: pablo, Edad: 30
        ◦ En caso que no tenga empleados por ejemplo imprimiría
             Tipo: Jefe, Nombre: pedro, Edad: 45
             No tengo empleados a cargo# ProgramaJavaJefeEmpleado
# ProgramaJavaJefeEmpleado
