

## 文本块升级

### 概述

预览功能。在Java中，在字符串文字中嵌入HTML，XML，SQL或JSON片段`"..."`通常需要先进行转义和串联的大量编辑，然后才能编译包含该片段的代码。该代码段通常难以阅读且难以维护，因此，如果具有一种语言学机制，可以比多行文字更直观地表示字符串，而且可以跨越多行，而且不会出现转义的视觉混乱，那么这将提高广泛Java类程序的可读性和可写性。从JDK 13到JDK 13开始文本块新特性的提出，提高了Java程序书写大段字符串文本的可读性和方便性

文本块是Java语言的新语法，可以用来表示任何字符串，具有更高的表达能力和更少的复杂度。文本块的开头定界符是由三个双引号 **"""** 开始，从新的一行开始字符串的内容。这里的新起的这行不属于字符串，只表示内容开始，是语法的一部分。以 **"""** 结束。 **"""** 可以紧跟字符串内容，也可以另起一行。另起一行时，字符串内容最后会留有一新行



### 使用

```java
package mao;

/**
 * Project name(项目名称)：JDK13_textBlock
 * Package(包名): mao
 * Class(类名): Test1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/8
 * Time(创建时间)： 11:40
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test1
{
    public static void main(String[] args)
    {
        String html = "<html>\n" +
                "    <body>\n" +
                "        <p>Hello, world</p>\n" +
                "    </body>\n" +
                "</html>\n";
        System.out.println(html);
        //文本块
        html = """
                <html>
                    <body>
                        <p>Hello, world</p>
                    </body>
                </html>
                """;
        System.out.println(html);

    }
}
```



```html
<html>
    <body>
        <p>Hello, world</p>
    </body>
</html>

<html>
    <body>
        <p>Hello, world</p>
    </body>
</html>
```





```java
"""
line 1
line 2
line 3
"""
```

等效于字符串文字：

```java
"line 1\nline 2\nline 3\n"
```

或字符串文字的串联：

```java
"line 1\n" +
"line 2\n" +
"line 3\n"
```





如果在字符串的末尾不需要行终止符，则可以将结束定界符放在内容的最后一行。例如，文本块：

```java
"""
line 1
line 2
line 3"""
```

等效于字符串文字：

```java
"line 1\nline 2\nline 3"
```



文本块可以表示空字符串，尽管不建议这样做，因为它需要两行源代码：

```java
String empty = """
""";
```





```java
package mao;

/**
 * Project name(项目名称)：JDK13_textBlock
 * Package(包名): mao
 * Class(类名): Test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/8
 * Time(创建时间)： 11:44
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test2
{
    public static void main(String[] args)
    {
        String str = "line 1\nline 2\nline 3\n";
        System.out.println(str);
        str = """
                line 1
                line 2
                line 3
                """;
        System.out.println(str);
        str = "line 1\n" +
                "line 2\n" +
                "line 3\n";
        System.out.println(str);

        str = "line 1\nline 2\nline 3";
        System.out.println(str);
        str = """
                line 1
                line 2
                line 3""";
        System.out.println(str);

        String empty = """
                """;
        System.out.println(empty);
    }
}

```



```sh
line 1
line 2
line 3

line 1
line 2
line 3

line 1
line 2
line 3

line 1
line 2
line 3
line 1
line 2
line 3

```





### SQL

```java
package mao;

/**
 * Project name(项目名称)：JDK13_textBlock
 * Package(包名): mao
 * Class(类名): Test3
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/8
 * Time(创建时间)： 11:54
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test3
{
    public static void main(String[] args)
    {
        //分配角色,sys_user_role
        String roleInsertSql = "insert into sys_user_role \n" +
                "(user_role_id,user_id,role_id,add_userid,add_date,tenant_id) \n" +
                "values(?,(select user_id from sys_user where mob_code=?),?,?,now(),?)";
        System.out.println(roleInsertSql);
        System.out.println();
        roleInsertSql = """
                insert into sys_user_role\s
                (user_role_id,user_id,role_id,add_userid,add_date,tenant_id)\s
                values(?,(select user_id from sys_user where mob_code=?),?,?,now(),?)""";
        System.out.println(roleInsertSql);

    }
}
```





```sh
insert into sys_user_role 
(user_role_id,user_id,role_id,add_userid,add_date,tenant_id) 
values(?,(select user_id from sys_user where mob_code=?),?,?,now(),?)

insert into sys_user_role 
(user_role_id,user_id,role_id,add_userid,add_date,tenant_id) 
values(?,(select user_id from sys_user where mob_code=?),?,?,now(),?)
```







### 多语言示例

```java
package mao;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Project name(项目名称)：JDK13_textBlock
 * Package(包名): mao
 * Class(类名): Test4
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/8
 * Time(创建时间)： 11:59
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test4
{
    public static void main(String[] args) throws ScriptException
    {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("js");
        Object obj = engine.eval("function hello() {\n" +
                "    print('\"Hello, world\"');\n" +
                "}\n" +
                "\n" +
                "hello();\n");
        System.out.println(obj);

        //使用文本块
        engine = new ScriptEngineManager().getEngineByName("js");
        obj = engine.eval("""
                         function hello() {
                             print('"Hello, world"');
                         }
                         
                         hello();
                         """);
        System.out.println(obj);
    }
}
```







### 缩进

java编译器会自动删除不需要的缩进：

- 每行结尾的空格都会删除
- 每行开始的共有的空格会自动删除
- 只保留相对缩进





```java
package mao;

/**
 * Project name(项目名称)：JDK13_textBlock
 * Package(包名): mao
 * Class(类名): Test5
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/8
 * Time(创建时间)： 14:17
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test5
{
    public static void main(String[] args)
    {
        String str = """
                a  
                b   c
                 d 
                e""";
        System.out.println(str);
        str = """
           a  
           b   c
            d 
           e""";
        System.out.println(str);
        str = """
           a  
      b   c
            d 
           e""";
        System.out.println(str);

        str = """
           a  
                    b   c
                 d 
              e""";
        System.out.println(str);
    }
}
```



```sh
a
b   c
 d
e
a
b   c
 d
e
     a
b   c
      d
     e
a
         b   c
      d
   e
```



