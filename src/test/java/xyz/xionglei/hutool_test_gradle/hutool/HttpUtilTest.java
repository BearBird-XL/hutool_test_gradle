package xyz.xionglei.hutool_test_gradle.hutool;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import org.junit.jupiter.api.Test;

/**
 * @author xionglei
 */
public class HttpUtilTest {
    
    @Test
    public void testGet() {
        String res = HttpUtil.get("http://xionglei.xyz", -1);
        Console.log(res);
    }
    
    @Test
    public void testRequest() {
        String path = "http://xionglei.jiuqi.com.cn:8080/jsp_web_demo_Web_exploded/no-filter/sss.jsp";
        HttpRequest request = HttpUtil.createGet(path);
        HttpResponse response = request.form("username", "lei")
                .execute();
        Console.log(ArrayUtil.toString(response.getCookies()));
        Console.log(response.body());
    }
    
    @Test
    public void testPost() {
        String path = "http://xionglei.jiuqi.com.cn:8080/jsp_web_demo_Web_exploded/no-filter/set.jsp";
        HttpResponse response = HttpUtil.createPost(path).execute();
        Console.log(response.body());
    }
}
