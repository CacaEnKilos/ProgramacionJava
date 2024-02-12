# Los niños buenos
Tiempo máximo: 2,000-4,000 s 
Memoria máxima: 4096 KiB

## Los elfos de Papá Noel

Los elfos de Papá Noel quieren ayudarle a organizarse para repartir regalos a los niños. Hackencio, un elfo experto en programación, ha decidido establecer una prioridad para hacer el reparto de los regalos. No va a dejar a ningún niño sin regalos, pero quiere que los niños que mejor se han portado los reciban primero.

Ha dado una puntuación a todos los niños, entre 1 y 100, indicando cómo de bueno ha sido cada uno. Los que mejor se han portado tienen una puntuación más alta que los que ha sido un poco más revoltosos. En el caso de que dos niños hayan sido igual de buenos, quiere llevar primero los regalos a aquél cuyos regalos pesen menos. No parece una decisión muy inteligente, porque cuanto antes se quite el peso mejor; pero justo por eso, ¡hay que premiar un poco a los niños que menos cosas pidan!

## Entrada

El programa deberá leer de la entrada estándar múltiples casos de prueba.

Cada uno comenzará con una línea con un número n ≤ 100.000 indicando la cantidad de niños entre los que hay que repartir regalos.

A continuación, seguirá la descripción de los niños en n líneas, cada una con dos números b y p, indicando cómo de bueno ha sido ese niño (entre 1 y 100) y el peso de sus regalos (entre 1 y 1.000).

La entrada termina con un caso sin niños que no debe procesarse.

## Salida

Por cada caso de prueba, el programa escribirá la lista con las características de los niños ordenados tal y como recibirán sus regalos. Recuerda que primero se quiere dar el regalo a los niños que mejor se hayan portado (mayores valores de b) y, en caso de empate, a los que menos pesen sus regalos (menores valores de p).

Se deberá escribir una línea en blanco después de cada caso de prueba (incluído el último).

## Entrada de ejemplo
3
80 2
100 12
100 1
2
1 1
1 1
0

## Salida de ejemplo
100 1
100 12
80 2

1 1
1 1


