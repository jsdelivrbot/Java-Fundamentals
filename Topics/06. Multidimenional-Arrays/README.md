<!-- section start -->

<!-- attr: { id:'title', class:'slide-title', hasScriptWrapper:true } -->

# Multidimentional Arrays
##  Creating and using arrays
<div class="signature">
    <p class="signature-course">Java Fundamentals</p>
    <p class="signature-initiative">Telerik School Academy</p>
    <a href="http://academy.telerik.com" class="signature-link">http://academy.telerik.com</a>
</div>

<!-- section start -->
<!-- attr: {id: 'table-of-contents'} -->
# Table of Contents
- Multi-dimentional arrays
  - Two-dimentional, three-dimentional, etc..
  - Examples
- Jagged Arrays
  - Usages
  - Examples

<!-- section start -->
<!-- attr: { id:'', class:'slide-section', showInPresentation:true } -->
<!-- # Multidimensional Arrays
##  Matrices and Jagged arrays -->

<!-- attr: { hasScriptWrapper:true } -->
# Matrices 
- **Multidimensional arrays** have more than one dimension (2, 3, …)
  - The most important multidimensional arrays are the 2-dimensional
    - Known as **matrices** or **tables**
- Example of matrix of integers with 2 rows and 4 columns:

<img class="slide-image" src="imgs/table.png" style="width:40%; top:60%; left:25%" />

<!-- attr: { style:'font-size:0.9em' } -->
# Declaring and Creating Multidimensional Arrays
- Declaring multidimensional arrays:

```java
int[][] intMatrix;
float[][] floatMatrix;
String[][][] strCube;
```

- Creating a multidimensional array
  - Use the `new` keyword
  - Must specify the size of each dimension

```java
int[][] intMatrix = new int[3][4];
float[][] floatMatrix = new float[8][2];
String[][][] stringCube = new String[5][5][5];
```

<!-- attr: { style:'font-size:0.9em', hasScriptWrapper: true } -->
# Initializing Multidimensional<br/> Arrays with Values
- Creating and initializing multidimensional array with array literal:

```java
int[][] matrix = 
{
    {1, 2, 3, 4}, // row 0 values
    {5, 6, 7, 8}, // row 1 values
}; // The matrix size is 2 x 4 (2 rows, 4 cols)

```
- Matrices are, actually, arrays of arrays
  - **Each element** of the outer array is also **an array**
  - The first dimension comes first, the second comes next (inside the first)

<!-- attr: { hasScriptWrapper:true, style:'font-size:0.75em' } -->
# Accessing The Elements of Multidimensional Arrays
- Accessing N-dimensional array element:

```java
nDimensionalArray[dimention0][dimention1][ … ][dimentionN-1]
```
- Getting element value example:

```java
int[][] array = {
  {1, 2}, 
  {3, 4}
};
int element11 = array[1][1]; // element11 = 4
```
- Setting element value example:

```java
int[][] array = new int[3][4];
for (int row = 0; row < array.length; row++) {
  for (int col = 0; col < array[row].length; col++) {
    array[row][col] = row + col;
  }
}
```

# Reading a Matrix
- Reading a matrix from the console

```java
Scanner scanner = new Scanner(System.in);
int rows = scanner.nextInt();
int cols = scanner.nextInt();
int[][] matrix = new int[rows][columns];
for (int row = 0; row < rows; row++) {
  for (int column = 0; column < cols; column++) {
    String message = 
        String.format("matrix[%d][%d]", row, column);
    System.out.println(message);
    matrix[row][column] = scanner.nextInt();
  }
}
```

# Printing a Matrix
- Printing a matrix to the console

```java
int[][] matrix = {
        {1,   2,  3,  4},
        {5,   6,  7,  8},
        {9,  10, 11, 12},
        {13, 14, 15, 16}
};

for (int i = 0; i < matrix.length; i++) {
    int[] ints = matrix[i];
    System.out.print("| ");
    for (int j = 0; j < ints.length; j++) {
        int anInt = ints[j];
        System.out.print(String.format("%s | ", anInt));
    }
    System.out.println();
}
``` 

<!-- section start -->

<!-- attr: { class: "slide-section"} -->
# Jagged Arrays

<!-- attr: { hasScriptWrapper:true } -->
# Jagged Arrays
- Jagged arrays are like multidimensional arrays
  - But each dimension has different size
  - A jagged array is array of arrays
  - Each of the arrays has different length
- How to create jagged array?

<div style="width:60%">
```java
int[][] jagged = new int[3][];
jagged[0] = new int[3];
jagged[1] = new int[2];
jagged[2] = new int[5];
```
</div>
<img class="slide-image" src="imgs/jagged.png" style="width:30%; top:50%; left:60%" />

# Initialization of Jagged Arrays
- When creating jagged arrays
  - Initially the array is created of `null` arrays
  - Need to initialize each of them

```java
int[][] jagged = new int[n][];
for (int i = 0; i < n; i++) {
   jagged[i] = new int[i];
}
```

<!-- attr: { hasScriptWrapper:true } -->
# Example of Jagged Arrays
- Check a set of numbers and group them by their remainder when dividing to 3 (0, 1 and 2)
- Example: `0, 1, 4, 113, 55, 3, 1, 2, 66, 557, 124, 2`
- First we need to count the numbers
  - Done with a iteration
- Make jagged array with appropriate sizes
- Each number is added into its jagged array

<img class="slide-image" src="imgs/jagged-example.png" style="width:25%; top:40%; left:80%" />


<!-- attr: { hasScriptWrapper:true, style: 'font-size:0.8em' } -->
# Example of Jagged Arrays

- _Example of Jagged Array_:

```java
int base = 3;
int[] numbers = {0, 1, 4, 113, 55, 3, 
                 1, 2, 66, 557, 124, 2};

int[] sizes = new int[base];
int[] offsets = new int[base];
for (int number : numbers) {
  sizes[number % base]++;
}

int[][] numbersByRemainder = new int[base][];
for (int i = 0; i < sizes.length; i++) { 
  numbersByRemainder[i] = new int[sizes[i]];
}

for (int number : numbers) {
   int remainder = number % base;
   int index = offsets[remainder];
   numbersByRemainder[remainder][index] = number;
   offsets[remainder]++;
}
```

<img class="slide-image" src="imgs/jagged-example.png" style="width:40%; top:40%; left:71%" />

<!-- section start -->

<!-- attr: {class: 'slide-section' } -->
# Array Variations

# Array Variations

- When we need a collection/set of elements, arrays are not the only structure available
  - `ArrayList<T>` (one-dimentional array), `ArrayList<ArrayList<T>>` (two-dimentional), etc..
  - `Stack<T>`, `Queue<T>`, etc..
  - `HashSet<T>`, `TreeSet<T>`
  - `HashMap<K, V>`, `TreeMap<K, V>`
  - `List<T>` and many more
- Sometimes it is easier to use something else

# Array Variations: Example

- _Example:_ group by remainder of 3

```java
ArrayList<ArrayList<Integer>> groups = new ArrayList<>();
for (int i = 0; i < base; i++) {
    groups.add(new ArrayList<>());
}
for(int number : numbers) {
    groups.get(number % base).add(number);
}

for(ArrayList<Integer> group: groups) {
    group.sort(Comparator.naturalOrder());
    for (int number : group) {
        System.out.printf("%d, ", number);
    }
    System.out.println();
}
```

# Collections

- `HashSet<T>`, `TreeSet<T>` 
  - Hold only **unique values** 
- `HashMap<K, V>`, `TreeMap<K, V>`
  - **"Arrays"** with indices that can be **not only integers**
- `Stack<T>`, `Queue<T>`, etc..
  - First-in-First-out (FiFo) structure
  - Last-in-First-out (LiFo) structure

# Examples
## Demo

<!-- section start -->
<!-- attr: { id:'questions', class:'slide-section', showInPresentation:true } -->
<!-- # Questions
## Arrays -->
