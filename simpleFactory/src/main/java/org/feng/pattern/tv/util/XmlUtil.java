package org.feng.pattern.tv.util;

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

/**
 * 使用 Dom4j 解析 tvConfig.xml 文件
 * @author Feng
 */
public class XmlUtil {
    public static String getBeanName(){
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        String result = null;
        try {
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document document;
            // 读取 resources 目录下的 tvConfig.xml 文件
            InputStream in = XmlUtil.class.getClassLoader().getResourceAsStream("tvConfig.xml");
            document = builder.parse(Objects.requireNonNull(in));

            // 获取 bean 标签
            NodeList nodeList = document.getElementsByTagName("bean");
            // 获取标签的文本块
            Node item = nodeList.item(0).getFirstChild();
            // 获得文本块中的文本信息，并去除前后空格
            result = item.getNodeValue().trim();
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
        return result;
    }
}
