## Diferenças entre tipos referência e tipos valor:

 _______________________________________________________________________________________
|                                           |                                           |
|                  CLASSE                   |               TIPO PRIMITIVO              |
|___________________________________________|___________________________________________|
|                                           |                                           |
| * Vantagem: usufrui de todos os recursos  | * Vantagem: é mais simples e mais perfor- |
| de Orientação a Objetos.                  | mático.                                   |
|___________________________________________|___________________________________________|
|                                           |                                           |
| * Variáveis são ponteiros.                | * Variáveis são caixas.                   |
|___________________________________________|___________________________________________|
|                                           |                                           |
| * Objetos precisam ser instanciados usan- | * Não instancia. Uma vez declarados, es-  |
| do new ou apontar para um objeto existen- | tão prontos para uso.                     |
| te.                                       |                                           |
|___________________________________________|___________________________________________|
|                                           |                                           |
| * Aceita valor null.                      | * Não aceita valor null.                  |
|___________________________________________|___________________________________________|
|                                           |                                           |
| * Y = X: Y passa a apontar para onde X a- | * Y = X: Y recebe uma cópia de X.         |
| ponta.                                    |                                           |
|___________________________________________|___________________________________________|
|                                           |                                           |
| * Objetos instanciados no heap.           | * "Objetos" instanciados no stack.        |
|___________________________________________|___________________________________________|
|                                           |                                           |
| * Objetos não utilizados são desalocados  | * "Objetos" são desalocados imediatamente |
| em um momento próximo pelo garbage colle- | quando seu escopo de execução é finaliza- |
| tor.                                      | do.                                       |
|___________________________________________|___________________________________________|