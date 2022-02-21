package t4;

/**
 * Project name(项目名称)：Spring注入其他类型的属性
 * Package(包名): t4
 * Class(类名): DependBean
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/21
 * Time(创建时间)： 22:21
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class DependBean
{
    private String dependProperty;

    public void setDependProperty(String dependProperty)
    {
        this.dependProperty = dependProperty;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("dependProperty：").append(dependProperty).append('\n');
        return stringbuilder.toString();
    }
}
