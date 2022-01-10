package xyz.xionglei.hutool_test_gradle.hutool;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.StrUtil;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * ArrayUtil 测试
 *
 * @author xionglei
 */
public class ArrayUtilTest {

    @Test
    public void testIsEmpty() {
        // 指向空的对象
        String str = null;
        boolean result = ArrayUtil.isEmpty(str);
        Assert.isTrue(result);

        // 指向空的数组
        String[] arr = null;
        Assert.isTrue(ArrayUtil.isEmpty(arr));

        // 长度为零的数组
        arr = new String[0];
        Assert.isTrue(ArrayUtil.isEmpty(arr));

        // 一个对象 理解为此对象为数组的第一个元素，则返回false
        Object o = new Object();
        Assert.isFalse(ArrayUtil.isEmpty(o));
    }

    @Test
    public void max() {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 3, 4, 1};
        int max = ArrayUtil.max(arr);
        Assert.isTrue(max == 6);
    }

    @Test
    public void join() {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6};
        Assert.isTrue(StrUtil.equals("1.2.3.4.5.6", ArrayUtil.join(arr, ".")));
    }


}
