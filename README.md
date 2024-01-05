## Collections Review

- **Armazenamento de Dados:** Uma variável pode conter uma coleção de dados.
- **Formato de Dados:** Aceita apenas elementos em formato de objetos (não aceita tipos primitivos diretamente).
- **Tipos de Dados:** Preferencialmente utiliza um tipo específico de dado.
- **Principais Tipos de Coleções:**
    - **List:** Coleção ordenada que permite elementos duplicados.
    - **Set:** Coleção que não permite elementos duplicados.
    - **Map:** Estrutura de chave-valor para mapeamento de elementos únicos.
    - **Queue:** Coleção para manipulação de elementos em uma ordem específica (FIFO, LIFO).
- **Package:** Utiliza o pacote `java.util` para acesso às classes de coleções.

Todos os frameworks de coleções em Java incluem os seguintes três elementos:
1. **Interfaces**
2. **Implementações ou classes**
3. **Algoritmos de Coleções**

### Tipos Genéricos `<T>` (Diamond)
/**
Versão genérica da classe Box.
@param <T> o tipo do valor sendo armazenado
*/

    public class Box<T> {
        private T t;
    public void set(T t) { this.t = t; }
    public T get() { return t; }
    }

Nomes Comuns para Parâmetros de Tipo:
    E - Elemento (usado extensivamente pelo Java Collections Framework)
    K - Chave
    N - Número
    T - Tipo
    V - Valor
    S, U, V, etc. - 2º, 3º, 4º tipos

### Interfaces Comparable e Comparator
Comparação e organização de dados
- **Comparable:** Fornece uma única sequência de ordenação. Pacote java.util. Método: compareTo()
- **Comparator:** Fornece múltiplas sequências de ordenação. Método: compare()

### Principais Interfaces
#### Interface List
    List
    ├── ArrayList
    ├── LinkedList
    │    └── ArrayDeque
    ├── Vector
    │   └── Stack

- Coleção ordenada que permite elementos duplicados.
- Métodos: sort(), shuffle(), reverse(), binarySearch()

#### Interface Set
    Set
    |-- SortedSet
    |   |-- NavigableSet
    |       |-- TreeSet*
    |-- HashSet*
    |-- LinkedHashSet

- Não pode conter elementos duplicados.
- Não permite acesso aleatório a um elemento da coleção.
- *Principais implementações

#### Interface Map
    Map
    |-- HashMap*
    |-- LinkedHashMap*
    |-- TreeMap*
    |-- ConcurrentHashMap
        |-- ConcurrentSkipListMap
    |-- EnumMap
    |-- WeakHashMap
    |-- IdentityHashMap
    |-- SortedMap
        |-- TreeMap
        |-- ConcurrentSkipListMap
        |-- EnumMap
    |-- HashMap (extends AbstractMap implements Map)

- Mapeia dados em pares de chave-valor.
- Não pode conter chaves duplicadas.
- *Principais implementações

#### Laços for e forEach
- Exemplo de loop for

        for (int i = 0; i < 5; i++) {
            // Faz algo com i
        }

- Exemplo de forEach

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        for (int number : numbers) {
        // Faz algo com number
        }

- Outro exemplo com arrays

        public class Main {
            public static void main(String[] args) {
                String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
                for (String i : cars) {
                    if (i.equals("Volvo")) {
                        System.out.println(i);
                    }
                }
            }
        }

#### Métodos equals() e hashCode()
Os métodos equals() e hashCode() são comumente usados em Java para lidar com comparações e estruturas de dados como em coleções (HashMap, HashSet, etc.).

equals(Object o): Verifica se dois objetos são considerados iguais.
hashCode(): Retorna um código hash para o objeto, utilizado em estruturas de dados como tabelas de hash para otimização de busca.



### Formatação de arquivo .md

- `src`: the folder to maintain sources
[here](https://github.com/deisekinsk/condicionalJava).
> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

