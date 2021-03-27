package com.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.pojo.Person;
import org.junit.Test;

import javax.print.attribute.standard.JobSheets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonTest {
    @Test
    public void test1() {
        Person person = new Person(1, "zhang");
        //创建gson对象实例
        Gson gson = new Gson();
        //toJson方法可以把java对象转换成json字符串
        String perJsonStr = gson.toJson(person);
        System.out.println(perJsonStr);
        //fromJson把json字符串转换JAVA对象
        Person person1 = gson.fromJson(perJsonStr, Person.class);
        System.out.println(person1);
    }

    @Test
    public void test2() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "li"));
        personList.add(new Person(2, "wang"));

        Gson gson = new Gson();
        String personListJson = gson.toJson(personList);
        System.out.println(personList);

        List list = gson.fromJson(personListJson, new PersonListType().getType());
        System.out.println(list.get(1));
    }

    @Test
    public void test3() {
        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, new Person(1, "gai"));
        personMap.put(2, new Person(2, "dada"));
        Gson gson = new Gson();
        //把map集合转换成为json字符串
        String jsonString = gson.toJson(personMap);
        System.out.println(jsonString);

        Map<Integer, Person> personMap1 = gson.fromJson(jsonString, new TypeToken<HashMap<Integer, Person>>() {
        }.getType());
        System.out.println(personMap1);
        System.out.println(personMap1.get(1));
    }
}
