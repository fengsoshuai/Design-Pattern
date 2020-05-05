package org.feng.pattern.robot;

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
 * 解析 robot.xml 文件，通过反射获取其对应的实例
 *
 * @author Feng
 * @date 2020/5/5 9:18
 */
public class XmlUtil {
    public static Optional<Robot> getBean(){
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        String packageName = "org.feng.pattern.robot";
        try {
            DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
            Document document;
            // 读取 resources 目录下的 robot.xml 文件
            InputStream in = XmlUtil.class.getClassLoader().getResourceAsStream("robot.xml");
            document = documentBuilder.parse(Objects.requireNonNull(in));

            // 获取标签的文本块
            Node item = document.getElementsByTagName("className").item(0).getFirstChild();
            // 获得文本块中的文本信息，并去除前后空格
            String className = item.getNodeValue().trim();
            return Optional.of((Robot) Class.forName(packageName + "." + className).newInstance());
        } catch (ParserConfigurationException | SAXException | IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }
}
