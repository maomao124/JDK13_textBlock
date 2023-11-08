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
