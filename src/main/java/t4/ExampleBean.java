package t4;

/**
 * Project name(项目名称)：Spring注入其他类型的属性
 * Package(包名): t4
 * Class(类名): ExampleBean
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/2/21
 * Time(创建时间)： 22:21
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class ExampleBean
{
    //Null值
    private String propertyNull;
    //空字符串
    private String propertyEmpty;
    //包含特殊符号的字面量
    private String propertyLiteral;
    //依赖的 Bean(对象属性)
    private DependBean dependBean;

    public void setPropertyEmpty(String propertyEmpty)
    {
        this.propertyEmpty = propertyEmpty;
    }

    public void setPropertyNull(String propertyNull)
    {
        this.propertyNull = propertyNull;
    }

    public void setPropertyLiteral(String propertyLiteral)
    {
        this.propertyLiteral = propertyLiteral;
    }

    public void setDependBean(DependBean dependBean)
    {
        this.dependBean = dependBean;
    }

    //使用级联属性赋值时，需提供一个依赖对象的 getXxx() 方法
    public DependBean getDependBean()
    {
        return dependBean;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("propertyNull：").append(propertyNull).append('\n');
        stringbuilder.append("propertyEmpty：").append(propertyEmpty).append('\n');
        stringbuilder.append("propertyLiteral：").append(propertyLiteral).append('\n');
        stringbuilder.append("dependBean：").append(dependBean).append('\n');
        return stringbuilder.toString();
    }
}
