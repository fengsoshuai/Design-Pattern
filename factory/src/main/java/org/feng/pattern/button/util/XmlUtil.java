package org.feng.pattern.button.util;

import org.feng.pattern.button.AbstractButtonFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Optional;

/**
 * 解析 bean.xml 文件，获取类名之后直接通过反射获得指定的工厂实例
 *
 * @author Feng
 */
public class XmlUtil {
    public static Optional<AbstractButtonFactory> getBean(){
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        String packageName = "org.feng.pattern.button.factory";
        try {
            DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
            Document document;
            // 读取 resources 目录下的 tvConfig.xml 文件
            InputStream in = XmlUtil.class.getClassLoader().getResourceAsStream("bean.xml");
            document = documentBuilder.parse(Objects.requireNonNull(in));

            // 获取 className 标签
            NodeList nodeList = document.getElementsByTagName("className");
            // 获取标签的文本块
            Node item = nodeList.item(0).getFirstChild();
            // 获得文本块中的文本信息，并去除前后空格
            String className = item.getNodeValue().trim();
            return Optional.of((AbstractButtonFactory)Class.forName(packageName + "." + className).newInstance());
        } catch (ParserConfigurationException | SAXException | IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }
}
