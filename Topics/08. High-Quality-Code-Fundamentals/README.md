<!-- section start -->
<!-- attr: { id:'', class:'slide-title', showInPresentation:true, hasScriptWrapper:true } -->
<!-- # High Quality Code Fundamentals -->
## Any fool can write code that a computer can understand. Good programmers write code that humans can understand.  

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic01.png" style="top:65%; left:85%; width:14%; z-index:-1" /> -->

<div class="signature">
	<p class="signature-course">Java Fundamentals</p>
	<p class="signature-initiative">Telerik School Academy</p>
	<a href="http://telerikacademy.com/" class="signature-link">http://telerikacademy.com/</a>
</div>




<!-- section start -->
<!-- attr: { id:'', showInPresentation:true, hasScriptWrapper:true } -->
# Table of Contents
- [Why Do We Need Code Formatting?](#formattingcode)
- [Formatting Methods](#formattingmethods)
- [Formatting Types](#formattingtypes)
- [Common Mistakes](#commonmistakes)
- [Alignments](#alignments)
- [Automated Tools](#automatedtools)  

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic05.png" style="top:25%; left:60%; width:37%; z-index:-1; border:1px solid white;border-radius:5px;" /> -->

<!-- section start -->


<!-- attr: {  class:'slide-section', showInPresentation:true, hasScriptWrapper:true } -->
#   Code Formatting
## Why do we need it? How can white spaces and parenthesis help us?

#   Code Formatting

- This code is computer readable
    -   Can you understand it?

```cs
	public   const    string                    FILE_NAME
	="example.bin"  ;  static void Main   (             ){
	FileStream   fs=     new FileStream(FILE_NAME,FileMode
	.   CreateNew)   // Create the writer      for data  .
	;BinaryWriter w=new BinaryWriter     (    fs      );
    // Write data to
    Test.data.
	for(  int i=0;i<11;i++){w.Write((int)i);}w   .Close();
	fs   .   Close  (  ) // Create the reader    for data.
	;fs=new FileStream(FILE_NAME,FileMode.            Open
	,  FileAccess.Read)     ;BinaryReader                r
	= new BinaryReader(fs);  // Read data from  Test.data.
	 for (int i = 0; i < 11; i++){ Console      .WriteLine
	(r.ReadInt32                                       ())
	;}r       .    Close   (   );  fs .  Close  (  )  ;  }

```



<!-- attr: { id:'formattingcode', showInPresentation:true, hasScriptWrapper:true } -->
<!-- # <a id="formattingcode"></a> Code Formatting -->
- Good formatting goals
  - To improve code readability
  - To improve code maintainability
- Fundamental principle of code formatting:
  - Any (consistent) formatting style that follows the above principle is good
  - Good formatting don’t affect speed, memory use or other aspects of the program

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Formatting Blocks in Java
- Put **{** at the end of the block and **}** alone on a line under the corresponding parent block
- Indent the block contents by a single [Tab]
  - Transformed to 2 spaces
- _Example_:

```cs
if (some condition) {
  // Block contents indented by a single [Tab]
}
```


<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Why are Brackets <br /> Obligatory?

```cs
// swap left and right elements for whole array
for (int i = 0; i < ELEMENTS_COUNT; i++) {
  leftElement = left[i];
  left[i] = right[i];
  right[i] = leftElement;
}
```

```cs
// swap left and right elements for whole array
for (int i = 0; i < ELEMENTS_COUNT; i++)
  leftElement = left[i];
  left[i] = right[i];
  right[i] = leftElement;
```

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Why are Brackets <br /> Obligatory?
```cs
x = 3+4 * 2+7;
```
```cs
x = (3 + 4) * (2 + 7);
```


<!-- attr: { id:'formattingmethods',showInPresentation:true, hasScriptWrapper:true } -->
# <a id="formattingmethods"></a> Empty Lines between <br /> Methods
- Use empty line for separation between methods:

```cs
private static long calcFactorial(int num) {
    if (num == 0) {
        return 1;
    } else {
        return num * calcFactorial(num - 1);
    }
}

static void Main() {
    long factorial = calcFactorial(5);
        System.out.println(factorial);
}
```

<!-- <div class="fragment balloon" style="top:63%; left:47.60%; width:37.02%">Leave empty line between methods</div>
<div class="fragment balloon" style="top:43%; left:49.11%; width:52.27%">Always use **{** and **}** after **if**</div>
<div class="fragment balloon" style="top:43%; left:49.11%; width:52.27%">(there is no space to do it here)</div> -->


<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Methods Indentation
- Methods should be indented with a single [Tab] from the class body
- Methods body should be indented with a single [Tab] as well

```cs
public class IndentationExample {
  private int getZero() {
    return 0;
  }
}
```

<div class="fragment balloon" style="top:48.65%; left:50.25%; width:45.84%">The entire method is indented with a single [Tab]</div>
<div class="fragment balloon" style="top:72.11%; left:21.82%; width:49.37%">Method body is also indented</div>

<!-- attr: { id:'commonmistakes', showInPresentation:true, hasScriptWrapper:true, style: 'font-size:0.9em' } -->
# <a id="commonmistakes"></a> Brackets in Methods Declaration
- Brackets in method declarations should be:

```cs
private static ulong calcFactorial(int num)
```

- Don't use spaces between the brackets:

```cs
private static ulong calcFactorial ( int num )
private static ulong calcFactorial (int num)
```

- The same applies for **if**-conditions and **for**-loops:

```cs
if (condition) { … }

for (int i = 0; i < 10; i++) { … }
```

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic13.png" style="top:21.79%; left:93.83%; width:9.45%; z-index:-1" /> -->
<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic14.png" style="top:40.05%; left:93.83%; width:9.45%; z-index:-1" /> -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style: 'font-size: 0.9em' } -->
# Separating Parameters
- Separate method parameters by comma followed by a space
  - Just in like good-old English
  - Don't put space before the comma
  - Correct examples:

```cs
private void registerUser(string username, string password);
registerUser("academy", "s3cr3t!p@ssw0rd");
```

  - Incorrect examples:

```cs
private void registerUser(string username,string password)
private void registerUser(string username ,string password)
private void registerUser(string username , string password)
```


<!-- attr: { showInPresentation:true, hasScriptWrapper: true, style: 'font-size:0.9em' } -->
# Empty Lines
- Use an empty line to separate logically related code:

```cs
private List<Report> prepareReports() {
    ArrayList<Report> reports = new ArrayList<Report>();

    // Create incomes reports
    Report incomesSalesReport = prepareIncomesSalesReport();
    Report incomesSupportReport = prepareIncomesSupportReport();
    reports.add(incomesSalesReport);
    reports.add(incomesSupportReport);

    // Create expenses reports
    Report expensesPayrollReport = prepareExpensesPayrollReport();
    Report expensesMarketingReport = prepareExpensesMarketingReport();
    reports.add(expensesPayrollReport);
    reports.add(expensesMarketingReport);

    return reports;
}
```

 <!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Formatting Conditional Statements and Loops
- Formatting conditional statements and loops
  - Always use **{ }** block after **if** / **for** / **while**, even when a single operator follows
  - Indent the block body after **if** / **for** / **while**
  - Always put a new line after a **if** / **for** / **while** block!
  - Always put the **{** on the same line
  - Never indent with more than one [Tab]/2 spaces


<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style: 'font-size:0.9em' } -->
# Conditional Statements and Loops Formatting <br/> – _Examples in C#_

- Correct examples:

```cs
for (int i = 0; i < 10; i++) {
  // some very powerful code
}
```

- Incorrect examples:

```cs
for (int i = 0; i < 10; i++)
  // loop body

for (int i = 0; i < 10; i++) // loop body
```

<!--  <div class="fragment balloon" style="top:35%; left:65.50%; width:23.80%">The **{** and **}** are missing</div>
<div class="fragment balloon" style="top:47%; left:67.39%; width:32.22%">Never put multiple statements on the same line!</div>
<div class="fragment balloon" style="top:60%; left:66.12%; width:33.50%">In C# the **{** should be on the next line</div> -->


<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Using Empty Lines
- Empty lines are used to separate logically unrelated parts of the source code
  - Don't put empty lines when not needed!

```cs
static void printList(List<int> ints) {
    System.out.print("{ ");
    for (int item
        : ints) {
        System.out.printf("%d, ", item);
    }

    System.out.println("}");
}

static void Main()
{
    // …
```   

<div class="fragment balloon" style="top:48%; left:58.18%; width:26.86%">An empty line separates the methods</div>
<div class="fragment balloon" style="top:60%; left:58.18%; width:39.67%">An empty line after the foreach block</div>


<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Misplaced Empty Lines – _Example_

```cs
for (int i = 0; i < 10;) {
  System.out.printf("i=%d%n", i);  





		i++;


		System.out.println();
}
```

<div class="fragment balloon" style="top:40.18%; left:55.54%; width:37.44%">What do these empty lines serve for?</div>


<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Breaking Long Lines
- Break long lines **before** punctuation
  - 
- _Examples_:

```cs
if (matrix[x][y] == 0
        || matrix[x - 1][y] == 0
        || matrix[x + 1][y] == 0
        || matrix[x][y - 1] == 0
        || matrix[x][y + 1] == 0) {
  // the code
}

public static List<Book> getFantasyBooks() {
  return getAllBooks()
          .stream()
          .filter(book -> book.getBookStyle() == Book.BOOK_STYLE_FANTASY)
          .sorted(Comparator.comparing(Book::getTitle))
          .collect(Collectors.toList());
}
```  

# Incorrect ways to break long lines (in C#_)

```cs
if (matrix[x, y] == 0 || matrix[x-1, y] ==
  0 || matrix[x+1, y] == 0 || matrix[x,
  y-1] == 0 || matrix[x, y+1] == 0)
{ …
```

```cs
if (matrix[x, y] == 0 || matrix[x-1, y] == 0 ||
      matrix[x+1, y] == 0 || matrix[x, y-1] == 0 ||
      matrix[x, y+1] == 0)
{ …
```

```cs
DictionaryEntry<K, V> newEntry
  = new DictionaryEntry<K, V>(oldEntry
  .Key, oldEntry.Value);
```

<!-- attr: { id:'alignments', showInPresentation:true, hasScriptWrapper:true } -->
# <a id="alignments"></a> Alignments
- All types of alignments are considered harmful
  - Alignments are hard-to-maintain!
  - Modifying one line of code shouldn’t require modifying several others
- Incorrect examples:  

```cs
public void NotCool() {
	student          = new Student("Ivan", "Kolev", 21);
	studentGrades    = new ArrayList<Integer>();
	school           = new SMG("Kopernik");
	studenstInSchool = new ArrayList<Student>();
}

```

<!-- attr: {  id:'automatedtools',showInPresentation:true, hasScriptWrapper:true } -->
# <a id="automatedtools"></a> Automated Tools
- Take advantage of your IDE to help formatting the code
  - Automatic alignment
  - Indentation
- Style Code analysis
  - CheckStyle:
    - [IntelliJ Idea plugin](https://plugins.jetbrains.com/plugin/1065-checkstyle-idea)
    - [Eclipse plugin](http://eclipse-cs.sourceforge.net/#!/)

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Avoid Deep Nesting of Blocks
- **Deep nesting** of conditional statements and loops makes the code unclear
  - More than 2-3 levels is too deep
  - Deeply nested code is complex and hard to read and understand
  - Usually you can extract portions of the code in separate methods
    - This simplifies the logic of the code
    - Using good method name makes the code self-documenting


<!-- attr: { showInPresentation:true, hasScriptWrapper:true, style:'font-size:0.65em' } -->
# Deep Nesting – _Example_

- Consider the examples for finding the min and max of three values

<div style="width: 100%; display: block; text-align: center">
  <div style="display: inline-block; width: 48%">
    <p>Nesting and messy if-else</p>
    <pre><code>if (x < y) {
  if (x < z) {
    min = x;
    if (y < z) {
      max = z;
    } else {
      max = y;
    }
  } else {
    min = z;
    max = y;
  }
} else {
  if (y < z) {
    min = y;
    if (x < z) {
      max = z;
    } else {
      max = x;
    }
  } else {
    min = z;
    max = x;
  }
}</code></pre>
  </div>
  <div style="display: inline-block; width: 48%">
    <p>Methods and simple operations</p>
    <pre><code>static int getMax(int x, int y) {
  if(x < y) {
    return y;
  } else {
    return x;
  }
}

static int getMin(int x, int y) {
  if(x < y) {
    return x;
  } else {
    return y;
  }
}
</code></pre>
<p style="font-size: 0.5em"> + </p>

<pre><code class="java">int min = getMin(getMin(x, y), z);
int max = getMax(getMax(x, y), z);
// for 7 is still OK
int max7 = getMax(d, getMax(
            getMax(getMax(x, y), z),
            getMax(getMax(a, b), c)));</code></pre>
  </div>
</div>


<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Using Case Statement
- Choose the most effective ordering of cases
  - Put the normal (usual) case first
  - Order cases by frequency
  - Put the most unusual (exceptional) case last
  - Order cases alphabetically or numerically
- Keep the actions of each case simple
  - Extract complex logic in separate methods
- Use the default clause in a `case` statement or the last `else` in a chain of `if-else` to trap errors

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic43.png" style="top:11.46%; left:90%; width:9.07%; z-index:1; border-radius:10px;" /> -->


<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Case – Best Practices
- Avoid using fallthroughs
  - When you do use them, document them well

```cs
switch (c)
{
  case 1:
  case 2:
    DoSomething();
    // FALLTHROUGH  
  case 17:
    DoSomethingElse();
    break;
  case 5:
  case 43:
    DoOtherThings();
    break;
}
```

<!-- section start -->
<!-- attr: { class:'slide-section', showInPresentation:true, hasScriptWrapper:true } -->
<!-- # Using Loops
## Choose Appropriate Loop Type<br/>and Don’t Forget to Break -->

<!-- attr: { id:'loops', showInPresentation:true, hasScriptWrapper:true } -->
# <a id="loops"></a>Using Loops
- Choosing the correct type of loop:
  - Use `for` loop to repeat some block of code a certain number of times
  - Use `foreach` loop to process each element of an array or a collection
  - Use `while` / `do-while` loop when you don't know how many times a block should be repeated
  - Use streams when manipulating the collections
- Avoid deep nesting of loops
  - You can extract the loop body in a new method

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Loops: Best Practices
- Keep loops simple
  - This helps readers of your code
- Treat the inside of the loop as it were a routine
  - Don’t make the reader look inside the loop to understand the loop control
- Think of a loop as a black box

# Nested Loops vs. Loops in methods


- TODO

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!-- # Loops: Best Practices -->
- Avoid empty loops

```cs
while ((inputChar = Console.Read()) != '\n')
{
}
```

```cs
do
{
   inputChar = Console.Read();
}
while (inputChar != '\n');
```

- Be aware of your language (loop) semantics
  - Java – access to modified closure
<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic51.png" style="top:17.74%; left:90%; width:6.94%; z-index:1; border-radius:10px;" /> -->
<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic52.png" style="top:38%; left:90%; width:6.94%; z-index:1; border-radius:10px;" /> -->


<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Loops: Tips on for-Loop
- Don’t explicitly change the index value to force the loop to stop
  - Use `while`-loop with `break` instead
- Put only the controlling statements in the loop header

<!-- <img class="slide-image" showInPresentation="true" src="imgs/loops-4.png" style="top:50%; left:10%; width:80%; z-index:-1; border-radius:10px;" /> -->


<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Loops: break and continue
- Use `continue` for tests at the top of a loop to avoid nested `if`-s
- Avoid loops with lots of `break`-s scattered trough it
- Use `break` and `continue` only with caution
<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic57.png" style="top:55%; left:30%; width:38.35%; z-index:-1; border-radius:10px;" /> -->


<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# How Long Should a Loop Be?
- Try to make the loops **short enough** to view it all at once (one screen)
- Use methods to shorten the loop body
- Make long loops especially clear
- Avoid deep nestingin loops
<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic58.png" style="top:50%; left:66.21%; width:29.50%; z-index:-1; border-radius:10px; height:30%" /> -->




<!-- section start -->
<!-- attr: { class:'slide-section', showInPresentation:true, hasScriptWrapper:true } -->
<!-- # Other Control Flow Structures
## To Understand Recursion,One Must First Understand Recursion -->


<!-- attr: { id:'other', showInPresentation:true, hasScriptWrapper:true } -->
# <a id="other"></a> The return Statement
- Use `return` when it enhances readability
- Use `return` to avoid deep nesting
- Avoid multiple `return`-s in long methods
<!-- <img class="slide-image" showInPresentation="true" src="imgs/return-1.png" style="top:40%; left:10%; width:80%; z-index:-1; border-radius:10px;" /> -->



<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Recursion
- Useful when you want to walk a tree / graph-like structures
- Be aware of infinite recursion or indirect recursion
- Recursion example:

```cs
void PrintWindowsRecursive(Window w)
{
  w.Print()
  foreach(childWindow in w.ChildWindows)
  {
     PrintWindowsRecursive(childWindow);
  }}
```

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic62.png" style="top:50%; left:90%; width:6.94%; z-index:1; border-radius:10px;" /> -->


<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Recursion Tips
- Ensure that recursion has end (bottom)
- Verify that recursion is not very high-cost
  - Check the occupied system resources
  - You can always use stack classes and iteration
- Don’t use recursion when there is better **linear** (iteration based) solution, e.g.
  - Factorials
  - Fibonacci numbers
- Some languages optimize tail-call recursions


<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# GOTO
- Avoid `goto`-s, because they have a tendency to introduce spaghetti code
- [“A Case Against the GO TO Statement” by Edsger Dijkstra](http://www.cs.utexas.edu/users/EWD/transcriptions/EWD02xx/EWD215.html)
- Use `goto`-s as a last resort
  - If they make the code more maintainable
- C# supports `goto` with labels, but avoid it!
<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic63.png" style="top:35%; left:65%; width:13.22%; z-index:-1; border-radius:10px;" /> -->


<!-- section start -->
<!-- attr: { class:'slide-title', showInPresentation:true, hasScriptWrapper:true } -->
# High-Quality Methods
## How to Design and Implement High-Quality Methods? Understanding Cohesion and Coupling

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic01.png" style="top:57%; left:69%; width:33.25%; z-index:-1;" /> -->

<div class="signature">
	<p class="signature-course"> High-Quality Code</p>
	<p class="signature-initiative"> Telerik Software Academy</p>
	<a href="http://telerikacademy.com" class="signature-link"> http://telerikacademy.com </a>
</div>

<!-- section start -->
<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Table of Contents
- [Why Do We Need Methods?](#why)
- [Strong Cohesion](#strong)
- [Loose Coupling](#loose)
- [Methods Parameters](#method)
- [Pseudo Code](#pseudo)

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic02.png" style="top:33%; left:54%; width:54.25%; z-index:-1;" /> -->

<!-- section start -->
<!-- attr: { hasScriptWrapper:true, class:"slide-section" } -->
# Why Do We Need Methods?

<!-- attr: { id:'why', showInPresentation:true, hasScriptWrapper:true } -->
<!-- # <a id="why"></a> Why Do We Need Methods? -->

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic03.png" style="top:20.72%; left:66.43%; width:38.24%; z-index:-1" /> -->

<!-- <img class="slide-image" showInPresentation="true" src="imgs\slide1.png" style="top:12.72%; left:5.33%; width:80.88%; z-index:-1" /> -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!-- # Why Do We Need Methods? -->
- **Methods** (functions, routines) are important in software development
  - **Reduce complexity**
    - Divide and conquer: complex problems are split into composition of several simple
  - **Improve code readability**
    - Small methods with good method names make the code self-documenting
  - **Avoid duplicating code**
    - Duplicating code is hard to maintain

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!-- # Why Do We Need Methods? -->
- **Methods** simplify software development
  - **Hide implementation details**
    - Complex logic is encapsulated and hidden behind a simple interface
    - Algorithms and data structures are hidden and can be transparently replaced later
  - **Increase the level of abstraction**
    - Methods address the business problem, not the technical implementation:

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Using Methods: <br> Fundamentals
- Fundamental principle of correct method usage

```md
A method should do what its name says or should indicate an
error (throw an exception). Any other behavior is incorrect!
```

- Methods should do exactly **what their names say**
  - Nothing less (work in all possible scenarios)
  - Nothing more (no side effects)
- In case of incorrect input or incorrect preconditions, an **error** should be indicated

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Bad Methods – Examples
```cs
int Sum(int[] elements)
{
  int sum = 0;
  foreach (int element in elements)
  {
      sum = sum + element;
  }
  return sum;
}
```
- What will happen if we sum `2,000,000,000` + `2,000,000,000`?
  - **Result**: `-294,967,296`

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic06.png" style="top:9.36%; left:89.33%; width:9.07%; z-index:10" /> -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!-- # Bad Methods – Examples -->

```cs
double CalcTriangleArea(double a, double b, double c)
{
  double s = (a + b + c) / 2;
  double area = Math.Sqrt(s * (s - a) * (s - b) * (s - c));
  return area;
}
```
- What will happen if `a = b = c = -1`?
- What will happen if `a = b = c = 1`?
  - Both triangles will have the **same size**.

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic06.png" style="top:9.36%; left:89.33%; width:9.07%; z-index:10" /> -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Good Methods – Examples

```cs
double CalcTriangleArea(double a, double b, double c)
{
  if (a <= 0 || b <= 0 || c <= 0)
  {
    throw new ArgumentException(
      "Sides should be positive.");
  }
  double s = (a + b + c) / 2;
  double area = Math.Sqrt(s * (s - a) * (s - b) * (s - c));
  return area;
}
```

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic07.png" style="top:9.36%; left:89.33%; width:9.07%; z-index:10" /> -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Indicating an Error
- Some methods do not correctly indicate errors
```cs
internal object GetValue(string propertyName)
{
    PropertyDescriptor descriptor =
        this.propertyDescriptors[propertyName];

    return descriptor.GetDataBoundValue();
}
```
- If the property name **does not exist**
  - A null reference exception will be <br>thrown **implicitly** &rarr; it is not meaningful

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic06.png" style="top:21.36%; left:86.33%; width:9.07%; z-index:10" /> -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!--# Indicating an Error-->
- Use the correct exception handling instead:
```cs
internal object GetValue(string propertyName)
{
    PropertyDescriptor descriptor =
        this.propertyDescriptors[propertyName];

    if (descriptor == null)
    {
        throw new ArgumentException("Property name "
         + propertyName + " does not exists!");
    }		

    return descriptor.GetDataBoundValue();
}
```

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic07.png" style="top:21.36%; left:79.33%; width:9.07%; z-index:10" /> -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Symptoms of Wrong <br>Methods
- Method that does something different than its name is wrong for at least one of these reasons:
  - The method sometimes returns incorrect result &rarr; **bug**
  - The method returns incorrect output when its input is incorrect or unusual &rarr; **low** **quality**
    - Could be acceptable for `private` methods only

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!--# Symptoms of Wrong <br>Methods-->
- The method does too many things &rarr; **bad** **cohesion**
- The method has side effects &rarr; **spaghetti** **code**
- Method returns strange value when an error condition happens &rarr; **it should indicate the error**

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Wrong Methods – Examples
```cs
long Sum(int[] elements)
{
  long sum = 0;

  for (int i = 0; i < elements.Length; i++)
  {
    sum = sum + elements[i];
    elements[i] = 0; // Hidden side effect
  }

  return sum;
}
```

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic06.png" style="top:9.36%; left:89.33%; width:9.07%; z-index:10" /> -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!--# Wrong Methods – Examples-->

```cs
double CalcTriangleArea(double a, double b, double c)
{
  if (a <= 0 || b <= 0 || c <= 0)
  {
    return 0; // Incorrect result
  }

  double s = (a + b + c) / 2;
  double area = Math.Sqrt(s * (s - a) * (s - b) * (s - c));

  return area;
}
```

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic06.png" style="top:9.36%; left:89.33%; width:9.07%; z-index:10" /> -->

<!-- section start -->
<!-- attr: { hasScriptWrapper:true, class:"slide-section" } -->
# Strong Cohesion

<!-- attr: { id:'strong', showInPresentation:true, hasScriptWrapper:true } -->
<!--# <a id="strong"></a> Strong Cohesion-->
- Methods should have **strong cohesion**
  - Should address single task and address it well
  - Should have clear intent
- Methods that  address several tasks in the same time are hard to be named
- Strong cohesion is used in engineering
  - In computer hardware any PC component solves a single task
  - E.g. hard disk performs a single task – storage


<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Acceptable Types of <br>Cohesion
- **Functional cohesion** (independent function)
  - Method performs certain well-defined calculation and returns a single result
  - The entire input is passed through parameters and the entire output is returned as result
  - No external dependencies or side effects
	- _Examples_

```cs
Math.Sqrt(value), Char.IsLetterOrDigit(ch), ...
```

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!--# Acceptable Types of <br>Cohesion-->
- **Sequential cohesion** (algorithm)
  - Method performs certain sequence of operations to perform a single task and achieve certain result
    - It encapsulates an algorithm
  - _Example_:
    - Connect to mail server
    - Send message headers
    - Send message body
    - Disconnect from the server

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!--# Acceptable Types of <br>Cohesion-->
- **Communicational cohesion** (common data)
  - A set of operations used to process certain data and produce a result
  - _Example_:
    - Retrieve input data from database
    - Perform internal calculations over retrieved data
    - Build the report
    - Format the report as Excel worksheet
    - Display the Excel worksheet on the screen

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!--# Acceptable Types of <br>Cohesion-->
- **Temporal cohesion**(time related activities)
  - Operations that are generally not related but need to happen in a certain moment
  - _Examples_:
    - Load user settings
    - Check for updates
    - Load all invoices from the database
    - Sequence of actions to handle the event

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Unacceptable Cohesion
- **Logical cohesion**
  - Performs a different operation depending on an input parameter
  - Incorrect example:
	```cs
	object ReadAll(int operationCode)
	{
	  if (operationCode == 1) … // Read person name
	  else if (operationCode == 2) … // Read address
	  else if (operationCode == 3) … // Read date
	  …
	}
	```
  - Can be acceptable in event handlers (e.g. the **KeyDown** event in Windows Forms)

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!--# Unacceptable Cohesion-->
- **Coincidental cohesion** (spaghetti)
  - Not related (random) operations are grouped in a method for unclear reason
  - Incorrect example:
	```cs
	Wtf HandleStuff(customerId, int[], ref sqrtValue,
    mp3FileName, emailAddress)
	```
    - Prepares annual incomes report for given customer
    - Sorts an array of integers in increasing order
    - Calculates the square root of given number
    - Converts given MP3 file into WMA format
    - Sends email to given customer

<!-- section start -->
<!-- attr: { hasScriptWrapper:true, class:"slide-section" } -->
# Loose Coupling

<!-- attr: { id:'loose', showInPresentation:true, hasScriptWrapper:true } -->
<!--# <a id="loose"></a> Loose Coupling-->
- What is **loose coupling**?
  - Minimal dependences of the method on the other parts of the source code
  - Minimal dependences on the class members or external classes and their members
  - No side effects
  - If the coupling is loose, we can easily reuse a method or group of methods in a new project
- Tight coupling &rarr; **spaghetti code**

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!--# Loose Coupling-->
- **The ideal coupling**
  - A methods depends only on its parameters
  - Does not have any other input or output
  - _Example_: `Math.Sqrt()`
- **Real world**
  - Complex software cannot avoid coupling but could make it as loose as possible
  - _Example_: complex encryption algorithm performs initialization, encryption, finalization


<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Coupling – _Example_
- Intentionally increased coupling for more flexibility (.NET cryptography API):

```cs
byte[] EncryptAES(byte[] inputData, byte[] secretKey)
{
  Rijndael cryptoAlg = new RijndaelManaged();
  cryptoAlg.Key = secretKey;
  cryptoAlg.GenerateIV();
  MemoryStream destStream = new MemoryStream();
  CryptoStream csEncryptor = new CryptoStream(
    destStream, cryptoAlg.CreateEncryptor(),
    CryptoStreamMode.Write);
  csEncryptor.Write(inputData, 0, inputData.Length);
  csEncryptor.FlushFinalBlock();
  byte[] encryptedData = destStream.ToArray();
  return encryptedData;
}
```

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic07.png" style="top:24.36%; left:89.33%; width:9.07%; z-index:10" /> -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Loose Coupling – _Example_
- To reduce coupling we can make **utility classes**
  - Hide the complex logic and provide simple straightforward interface (a.k.a. **façade**):

```cs
byte[] EncryptAES(byte[] inputData, byte[] secretKey)
{
  MemoryStream inputStream = MemoryStream(inputData);
  MemoryStream outputStream = new MemoryStream();

  EncryptionUtils.EncryptAES(, outputStream, secretKey);
  byte[] encryptedData = outputStream.ToArray();

  return encryptedData;
}
```

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic07.png" style="top:30.36%; left:89.33%; width:9.07%; z-index:10" /> -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Tight Coupling – _Example_
- Passing parameters through class fields
  - Typical example of tight coupling
  - Don't do this unless you have a good reason!

```cs
class Sumator
{
  public int a, b;
  int Sum()
  {
    return a + b;
  }
  static void Main()
  {
    Sumator sumator = new Sumator() { a = 3, b = 5 };
    Console.WriteLine(sumator.Sum());
  }
}
```

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic06.png" style="top:30.36%; left:89.33%; width:9.07%; z-index:10" /> -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Tight Coupling in Real Code
- Say, we have a large piece of software
  - We need to update subsystems and the subsystems are not really independent
  - E.g. a change in filtering affects sorting, etc:

```cs
class GlobalManager
{
    public void UpdateSorting() {…}
    public void UpdateFiltering() {…}
    public void UpdateData() {…}
    public void UpdateAll () {…}
}
```

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic06.png" style="top:40.36%; left:89.33%; width:9.07%; z-index:10" /> -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Loose Coupling and OOP
- Reducing coupling with OOP techniques
  - **Abstraction**
    - Define a `public` interface and hide the implementation details
  - **Encapsulation**
    - Make methods and fields `private` unless they are definitely needed
    - Define new members as `private`
    - Increase visibility as soon as this is needed


<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Acceptable Coupling
- Method is coupled to its **parameters**
  - This is the best type of coupling

```cs
static int Sum(int[] elements) { … }
```

- Method in a class is coupled to some **class fields**
  - This coupling is usual, do not worry too much

```cs
static int CalcArea()
{
	return this.Width * this.Height;
}
```

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic07.png" style="top:23.36%; left:89.33%; width:9.07%; z-index:10" /> -->

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic07.png" style="top:52.36%; left:89.33%; width:9.07%; z-index:10" /> -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!--# Acceptable Coupling-->

- Method in a class is coupled to **static** methods, properties or constants in **external class**
  - This is normal, usually is not a problem

```cs
static double CalcCircleArea(double radius)
{
	return Math.PI * radius * radius;
}
```

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic07.png" style="top:31.36%; left:89.33%; width:9.07%; z-index:10" /> -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Non-Acceptable Coupling
- Method in a class is coupled to **static fields** in external class
  - Use `private` fields and `public` properties
- Methods take as input data some fields that could be passed as parameters
  - Check the intent of the method
  - Is it designed to process `internal` class data or is utility method?
- Method is defined `public` without being part of the `public` class's interface &rarr; **possible coupling**

<!-- section start -->
<!-- attr: { hasScriptWrapper:true, class:"slide-section" } -->
# Methods Parameters

<!-- attr: { id:'method', showInPresentation:true, hasScriptWrapper:true } -->
<!--# <a id="method"></a> Methods Parameters-->
- Put most important parameters first
  - Put the main input parameters first
  - Put non-important optional parameters last
  - _Example_:

```cs
void RegisterUser(string username, string password,
	Date accountExpirationDate, Role[] roles)
```

- _Incorrect example_:

```cs
void RegisterUser(Role[] roles, string password,
	string username, Date accountExpirationDate)
```

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic07.png" style="top:37.36%; left:89.33%; width:9.07%; z-index:10" /> -->

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic06.png" style="top:65.36%; left:89.33%; width:9.07%; z-index:10" /> -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!--# Methods Parameters-->
- Do not modify the input parameters
- _Incorrect example_:

```cs
bool CheckLogin(string username, string password)
{
  username = username.ToLower();
  // Check the username / password here …
}
```

  - _Correct example_:

```cs
bool CheckLogin(string username, string password)
{
  string usernameLowercase = username.ToLower();
  // Check the username / password here …
}
```

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic06.png" style="top:23.36%; left:89.33%; width:9.07%; z-index:10" /> -->

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic07.png" style="top:62.36%; left:89.33%; width:9.07%; z-index:10" /> -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!--# Methods Parameters-->
- Use parameters consistently
- Use the same names and the same order in all methods
  - _Incorrect example_:

```cs
void EncryptFile(Stream input, Stream output, string key);
void DecryptFile(string key, Stream output, Stream input);
```

  - Output parameters should be put last

```cs
FindCustomersAndIncomes(Region region,
	out Customer[] customers, out decimal[] incomes)
```

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic06.png" style="top:41.36%; left:89.33%; width:9.07%; z-index:10" /> -->

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic07.png" style="top:65.36%; left:89.33%; width:9.07%; z-index:10" /> -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Pass Entire Object or <br> Its Fields?
- When should we pass an object containing few values and when these values separately?
  - Sometime we pass an object and use only a single field of it. **Is this a good practice?**

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Pass Entire Object or Its <br> Fields? - Examples

```cs
decimal CalculateSalary(Employee employee, int months);
```

```cs
decimal CalculateSalary(double rate, int months);
```

- Look at the method's level of abstraction
  - Is it intended to operate with employees or with rates and months? &rarr; **the first is incorrect**

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# How Much Parameters <br> Methods Should Have?
- Limit the number of parameters to `7 (+/-2)`
  - `7` is a "magic" number in psychology
  - Human brain cannot process more than `7 (+/-2)` things in the same time
- If the parameters need to be too many, reconsider the method's intent
  - Does it have a **clear intent**?
  - Consider extracting few of the parameters in a new method


<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Methods Length
- How long should a method be?
  - There is no specific restriction
  - Avoid methods longer than **one screen** (`30` lines)
  - Long methods are not always bad
    - Be sure you have a good reason for their length
  - **Cohesion** and **coupling** are more important than the method length!
  - Long methods often contain portions that could be extracted as separate methods with good name and clear intent

<!-- section start -->
<!-- attr: { hasScriptWrapper:true, class:"slide-section" } -->
# Pseudocode

<!-- attr: { id:'pseudo', showInPresentation:true, hasScriptWrapper:true } -->
<!--# <a id="pseudo"></a> Pseudocode-->
- **Pseudocode** can be helpful in:
  - Routines design
  - Routines coding
  - Code verification
  - Cleaning up unreachable <br> branches in a routine

<!-- <img class="slide-image" showInPresentation="true" src="imgs\pic37.png" style="top:33.16%; left:61.40%; width:43.87%; z-index:-1" /> -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Designing in Pseudocode
- What the routine will abstract  i.e. the information a routine will **hide**?
- Routine input parameters
- Routine output
- Preconditions
  - Conditions that have to be true before a routine is called
- Postconditions
  - Conditions that have to be true after routine execution


<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Design Before Coding
- Why it is better to spend time on design before you start coding?
  - The functionality may be already available in a library, **so you do not need to code at all!**
  - You need to think of the best way to implement the task considering your project requirements
  - If you fail on writing the code right the first time, you need to know that **programmers get emotional to their code**


<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Pseudocode _Example_

```md
Routine that evaluates an aggregate expression for a
database column (e.g. Sum, Avg, Min)

Parameters: Column Name, Expression

Preconditions:
- Check whether the column exists and throw an argument
exception if not
- If  the expression parser cannot parse the expression
 throw an ExpressionParsingException

Routine code: Call the evaluate method on the DataView class
and return the resulting value as string
```

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Public Routines in Libraries
- `Public` routines in libraries and system software is hard to change
  - Because customers want **no breaking changes**
- Two reasons why you need to change a `public` routine:
  - New functionality has to be added conflicting with the old features
  - The name is confusing and makes the usage of the library unintuitive
- Design better upfront, or refactor carefully


<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Method Deprecation
- **Deprecated** method
  - About to be removed in future versions
- When deprecating an old method
  - Include that in the documentation
  - **Specify the new routine that has to be used**
- Use the **[Obsolete]** attribute in .NET

```cs
[Obsolete("CreateXml() method is deprecated.
	Use CreateXmlReader instead.")]
public void CreateXml (…)
{
  …
}
```

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Conclusion
- Designing and coding routines is engineering activity
  - **There is no perfect solution**
- Competing solutions usually demonstrate different trade-offs
  - The challenge of the programmer is to
    - Evaluate the **requirements**
    - Choose the **most appropriate** solution from the available options
    - Ensure **loose coupling** / **strong cohesion**

<!-- section start -->
<!-- attr: { hasScriptWrapper:true, class:"slide-section", showInPresentation: true } -->
<!-- # High Quality Methods
## Questions? -->

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
# Free Trainings @ Telerik Academy
- C# Programming @ Telerik Academy
    - [High Quality Code - Part 1](http://academy.telerik.com/student-courses/programming/high-quality-code-part-1/about)
  - Telerik Software Academy
    - [telerikacademy.com](https://telerikacademy.com)
  - Telerik Academy @ Facebook
    - [facebook.com/TelerikAcademy](facebook.com/TelerikAcademy)
  - Telerik Software Academy Forums
    - [forums.academy.telerik.com](forums.academy.telerik.com)