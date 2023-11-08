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
