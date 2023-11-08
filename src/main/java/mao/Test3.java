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
