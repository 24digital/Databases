package Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;


@Component
public class SimpleUtility {
    @Autowired
    XPath xPath;

    @Autowired
    Document document;


    public void searchFile() throws XPathExpressionException {
        document.getDocumentElement().normalize();

        NodeList nodeList = document.getElementsByTagName("Group");

        int size = nodeList.getLength();


        System.out.println(document.getDocumentElement());
        System.out.println("Size:" + " " + size);

        for (int i = 0; i < size; i++) {
            Node node = nodeList.item(i);
            Element el = (Element) node;

            System.out.println(el.getAttribute("id"));
        }

    }


}