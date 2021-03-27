import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

public class Dom4jTest {
    @Test
    public void test1() throws DocumentException {
        //创建一个SAXReader输入流，去读取xml配置文件，生成document对象
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("./xml/books.xml");
        System.out.println(document);

    }

    //读取books.xml文件生成类
    @Test
    public void test2() throws DocumentException {
        //1、读取books.xml
        SAXReader reader = new SAXReader();
        Document document = reader.read("./xml/books.xml");
        //2.根据document对象获取根元素
        Element rootElement = document.getRootElement();
        System.out.println(rootElement);
        //3.根据根元素获取book标签对象
        List<Element> books = rootElement.elements("book");
        //4.遍历，处理每个book标签转换为类
        for (Element book : books) {
            //asXML()把标签对象转换为标签字符串
            //System.out.println(book.asXML());
            Element name = book.element("name");
            String nameText = name.getText();
            //System.out.println(nameText);

            String author = book.elementText("author");
            //System.out.println(author);

            String price = book.elementText("price");

            String sn = book.attributeValue("sn");
            Book bookIn = new Book(sn, nameText, author, Double.parseDouble(price));
            System.out.println(bookIn);
        }
    }
}
