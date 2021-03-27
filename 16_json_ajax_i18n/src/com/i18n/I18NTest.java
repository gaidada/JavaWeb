package com.i18n;

import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18NTest {
    @Test
    public void testLocale() {
        //获取系统默认的语言，国家信息
        Locale locale = Locale.getDefault();
        System.out.println(locale);
    }

    @Test
    public void testI18n() {
        Locale locale = Locale.CHINA;
        //通过指定的basename和locale对象读取相应的配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("i18n", locale);
        System.out.println(bundle.getString("username"));
        System.out.println(bundle.getString("password"));
    }
}
