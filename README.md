## Kotlin 简介

`kotlin` 的目标是成为一门全栈语言，主要有以下的特点：

- 已经成为`Android`的官方推荐语言
- 百分百的和`java`兼容,两者可以相互转换
- `JS`、`JVM`、`Native`多平台开发

## 数据类型

#### 1. 基本类型

    Boolean true/false
    Double 64
    Float  32
    Long   64
    Int    32
    Short  32
    Byte   8

    val aChar = '0'
    val bChar = '我'
    val cChar = '\u000f'
    
`Char`类型的转义字符

    \t          制表符
    \b          光标后退一个字符
    \n          回车
    \r          光标回到行首
    \'          单引号
    \"          双引号
    \\          反斜杠
    \$          美元符号，Kotlin 支持美元符号开头的字符串模板
    
#### 2. 基本类型的转换

不可隐式转换

    val anInt: Int = 5
    val aLong: Long = anInt.toLong()
    
必须得通过`.to类型`的方式进行数据的转换

**字符串**

- 一串`Char`
- 用双引号""引起来

    val aString: String = "Hello World!"
    
- 字符串比较

    a == b 表示比较内容 类似 Java 中的 equals
    a === b 表示比较对象是否相同

- 字符串模板

    println("hello, $name") -> "hello, 小明"

#### 3. Koltin 中的类和对象初始化

**类的定义**

- 类，一个抽象的概念
- 具有某些特征的事物的概括
- 不特定指代任何一个具体的事物

一般写法：

    /**
    * 其中类参数如果加上 var 修饰，那么他便是成员变量，反之则是普通的参数
    */
    class Student(var name: String, var age: Int){
        init {
            // ... 相当于构造函数中的代码
        }
    }

**对象**

- 是一个具体的概念，与类相对
- 描述某一个类的具体个体
- 举例：

    某些人、领导的车等等
    
**类和对象的关系**

- 一个类通常可以有很多歌具体的对象
- 一个对象本质上只能从属一个类
- 某一个人，他是工程师，但本质上还是属于人这一类

一般写法：

    val student: Student = Student("xiaweizi", 23)

**类的继承**

- 提取多个类的共性得到一个更为抽象的类，即父类
- 子类拥有父类的一切特征
- 子类也可以定义自己的特征
- 所有的类最终继承自`Any`,类似于`java`中的`Object`

#### 4. 空类型和智能转换

**空类型**

    // 定义
    val notNull: String = null // 错误，不可能为空
    val nullanle: String? = null // 正确，可以为空
    // 使用
    notNull.length // 正确，不可能为空所以可以直接使用
    nullable.length // 有可能为空，不能直接获取长度
    // 要想获取长度，可以通过以下两者方式
    nullable!!.length // 正确，强制认定 nullable 不可能为空，如果为空则会抛出空指针异常
    nullable?.length // 正确，若 nullable 为空，则返回 null
    
**智能类型转换**

    val child: Child = parent as Child // 类似于 Java 的类型转换，失败则抛出异常
    val child: Child = parent as? Child // 如果转换失败，返回 null

编译器智能识别转换：

    val parent: Parent = Child()
    if (parent is Child) {
        // parent 直接调用子类方法,不需要再进行强制转换
    }

    val string: String = null
    if (string != null) {
        // string.length 可以直接调用length 方法
    }

#### 5. 区间

一个数学上的概念，表示范围， `ClosedRange`的子类，`IntRange`最常用

基本用法：

    0..100 --> [0, 100]
    0 until 100 --> [0, 100)
    i in 0..100 表示 i 是否在区间[0, 100]中

#### 6. 数组

基本写法：

    val ints: IntArray = IntArrayOf(1,2,3,5)
    var charArray: CharArray = charArrayOf('a', 'b', 'c', 'd', 'e')
    var stringArray: Array<String> = arrayOf("aa", "bb", "cc", "dd", "e")
    
基本操作：

    print(charArray[index])
    ints[0] = 2
    ints.length
    cahrArray.joinToString("") // 讲 char 数组转换成字符串
    stringArray.slice(1..4) // 取出区间里的值

## 程序结构

#### 1. 常亮和变量

**常量**

    val a = 2
    类似 Java 中的 final
    不可被重复赋值
    运行时常量：val x = getX()
    编译期常量：const val x = 2
    
**变量**

    var a = 2
    a = 3 // 可以被再次赋值
    
**类型推导**

    val string = "Hello" // 推导出 String 类型
    val int = 5 // 推导出 Int 类型
    var x = getString() + 5 // String 类型

#### 2. 函数 Function

以特定功能组织起来的代码块

    // 最简单的打印信息，无返回的方法
    fun printMessage(message: String):Unit{
        println("$message")
    }
    // 拥有返回值得方法
    fun sum(first: Int, second: Int):Int {
        return first + second
    }
    // 可以简化成：
    fun sum(first: Int, second: Int) = first + second
    // 或者更简单的匿名函数
    val result = fun(first: Int, second: Int) = first + second

#### 3. Lambda 表达式

其实又是匿名函数

 **一般形式**：

    {传入参数 -> 函数体，最后一行是返回值}
    // 例如
    val sum = {first: Int, second: Int -> first + second}
    val printMessage = {message: String -> println(message)}

**类型标识**

    () -> Unit // 无参，返回值为 null
    (Int) -> Int // 传入整型，返回一个整型
    (String, (String) -> String) -> Boolean // 传入字符串、Lambda 表达式，返回Boolean

**Lambda 表达式的简化**

- 函数参数调用时最后一个`Lambda`可以移出去
- 函数参数只有一个`Lambda`，调用时小括号可以省略
- `Lambda`只有一个参数可默认为`it`
- 入参、返回值与形参一致的函数可以用函数引用方式作为实参传入

#### 4. 成员变量和成员方法

**成员变量的声明**

    // 第一种是在构造函数中声明
    class Student(var age: Int, name: String){
        // age 是成员变量 name 是局部变量
    }
    // 第二种是在函数体内声明
    var a = 0
        get() {
            field += 1
            return field
        }
        set(value) {
            println("set)
            field = value + 1
        }
    // 可以进行对 get 和 set 方法的重新定义
    
    // 属性的初始化尽量在构造方法中完成
    // var 用 lateinit 延迟初始化， val 用 lazy
    
    lateinit var sex: String
    val person: Person by lazy {
        Person()
    }

**成员方法**

在类中直接声明方法可以直接调用,包括`lambda`表达式

    // 方法的声明
    fun sum(a: Int, b: Int) = a + b
    val sum1 = {a: Int, b: Int -> a + b}
    // 方法的调用
    println(person.sum(1,2))
    println(person.sum1(3,5))

#### 5. 运算符

在`java`中运算符是不能重新定义重载的，只能按照原先的逻辑进行计算

而`Kotlin`则可以重新定义运算符，使用`operator`关键字，举了例子：

    // 定义一个用于计算复数的类
    class Complex(var real: Double, var imaginary: Double) {
        operator fun plus(other: Complex): Complex{
            return Complex(real+other.real, imaginary+other.imaginary)
        }
        
        // 重新 toString 方法
        overrride fun toString(): String {
            return "$real + ${imaginary}i"
        }
    }
    // 使用
    val complex1 = Complex(1, 2)
    val complex2 = Complex(2, 3)
    println(complex1 + complex2)
    // 输出结果为
    "3 + 5i"

关键就是这个方法，方法名必须是`plus`或者其他官方定义的运算符，参数有且仅有一个，类型自定义，返回值意识可以自定义的.

    operator fun plus(other: Complex): Complex{
            return Complex(real+other.real, imaginary+other.imaginary)
    }

#### 6. 表达式

**中缀表达式**

通过`infix`关键字修复方法，那么就可以不用通过 对象.方法() 的方式调用，而是直接 对象 方法名 参数的方式调用。举了例子

    class Student(var age: Int){
        infix fun big(student: Student): Boolean {
            return age > student.age
        }
    }
    // 如果没有 infix 的调用方式：
    println(Student(23).big(Student)(12))
    // 如果使用 infix 修饰的调用方式:
    println(Student(23) big Student(12))
    
**`if`表达式**

直接来个例子

    val a = 20
    val b = 30
    val flag: Int = if(a > b) a else b

**`When` 表达式**
 
 加强版的 `switch`，支持任意类型， 支持纯粹表达式条件分支(类似`if`)，举个栗子：
 
    val a = 5
    when(a) {
        is Int -> println("$a is Int")
        in 1..6 -> println("$a is in 1..6")
        !in 1..4 -> println("$a is not in 1..4")
        else -> {
            println("null")
        }
    }

 **`for`循环**
 
 基本写法
 
    for (element in elements)

**`while`循环**

基本写法

    while() {
    }
    do {
    } while()
跳过和终止循环

    跳过当前循环用 continue
    终止循环用 break

#### 6. 异常捕获

同样也是表达式，可以用来赋值，举个例子

    return try{
                x/y
            }
            catch(e: Exception) {
                0
            } finally {
                //...
            }

如果没有异常则返回`x/y`,否则返回`0`,`finally`中的代码无论如何还是要执行的。

#### 7. 具名参数、变长参数和默认参数

**具名参数：**给函数的实参附上形参

    fun sum(first: Int, second: Int) = first + second
    sum(second = 2, first = 1)

**变长参数：**用`varary`修饰，使用起来是和数组一样，某个参数可以接收多个值，可以不作为最后一个参数，如果传参时有歧义，需要使用具名参数。

    fun hello(vararg ints: Int, string: String) = ints.forEach(println(it))
    hello(1,3,4,5,string = "hello")
    // 如果最后一个参数也是 Int
    fun hello(varary ints: Int, anInt: Int)
    // 创建数组
    val arrayInt: IntArray = intArrayOf(1, 2, 3, 4)
    hello(ints = *arrayInt, anInt = 2)

**默认参数：**就是给参数传入一个默认的值

    fun hello(anInt: Int = 1, string: String)
    hello(string = "aaa")

## 面向对象
