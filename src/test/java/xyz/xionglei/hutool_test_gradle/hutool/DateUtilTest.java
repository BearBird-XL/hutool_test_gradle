package xyz.xionglei.hutool_test_gradle.hutool;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Console;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * 日期时间包是Hutool的核心包之一，提供针对JDK中Date和Calendar对象的封装
 * <p>
 * 日期类可以使用静态工具类DateUtil
 * 也可以使用集成自Date，DateUtil静态方法的对象实现的类
 *
 * @author xionglei
 */
public class DateUtilTest {

    /**
     * Date、long、Calendar之间的相互转换
     */
    @Test
    public void testConvert() {
        // 当前时间 返回的类型为继承自Java的Date类
        DateTime date1 = DateUtil.date();
        DateTime date2 = DateUtil.date(Calendar.getInstance());
        DateTime date3 = DateUtil.date(System.currentTimeMillis());
        Console.log("date1:{}", date1);
        Console.log("date2:{}", date2);
        Console.log("date3:{}", date3);
        //当前时间字符串，格式：yyyy-MM-dd HH:mm:ss
        String now = DateUtil.now();
        Console.log(now);
        //当前日期字符串，格式：yyyy-MM-dd
        String today = DateUtil.today();
        Console.log(today);
    }

    /**
     * 测试日期间隔
     */
    @Test
    public void testBetween() {
        String dataStr1 = "2021-03-01 22:33:12";
        String dataStr2 = "2021-04-21 09:13:52";

        Date date1 = DateUtil.parse(dataStr1);
        Date date2 = DateUtil.parse(dataStr2);

        long between = DateUtil.between(date1, date1, DateUnit.DAY);
        Console.log("between: " + between);
        String formatBetween = DateUtil.formatBetween(date1, date2);
        Console.log("formatBetween: " + formatBetween);

    }

    /**
     * 日期时间偏移
     * 日期或时间的偏移指针对某个日期增加或减少分、小时、天等等，达到日期变更的目的。Hutool也针对其做了大量封装
     */
    @Test
    public void testOffset() {
        String dateStr = "2017-03-01 22:33:23";
        Date date = new DateTime(dateStr);
        Console.log(date);
    }
}
