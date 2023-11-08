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
