# Ejercicio A: Equipo de futbol

Clase persona (no se puede instanciar).

- Atributos: identificador, nombre, apellidos, fecha nacimiento, energía.
- Método sin código: doping

3 Clases que extienden persona

- Entrenador:
- Atributo extra: anyoComienzoActividad
- Método doping deja la energía igual

- Jugador Campo:
- Atributo extra: golesMarcados.
- Método doping sube energía 20%

- Portero:
- Atributo extra: porcentajeParadas.
- Método doping sube energía 10% y en 5 el porcentajeParadas (ojo que no
supere el 100% ese porcentaje).

## Clase ejecutable:

Hacer un tipo List/Map y meter porteros, jugadores, entrenadores.

## MÉTODOS:

- Listar Completo
- Dopar porteros cuyo porcentaje de paradas sea menor del 20%.
- Hallar media goles marcados de los jugadores de campo.
- Mostrar entrenador más experimentado.
- Ordenar jugadores de campo de más goles marcados a menos
- Eliminar portero mejor porcentaje de paradas.

## Excepciones en la generación o modificación:

- Portero no puede tener más del 100% de paradas ni menos de 0
- Jugador no puede tener más de 1000 goles marcados.
No se deben meter en el List las personas en las que en la generación pudiera saltar una
excepción.
