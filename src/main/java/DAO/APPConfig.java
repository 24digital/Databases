package DAO;

import Util.SimpleUtility;
import jdk.internal.org.xml.sax.SAXException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;

@Configuration

public class APPConfig {
    File xmlFile = new File("C:\\Users\\Marion\\Documents\\My Web Site\\securesystem\\U_Windows2012_MS_v1r3_Manual-xccdf.xml");

    @Bean
    public XPath xpathFactory() {
        return XPathFactory.newInstance().newXPath();
    }

    @Bean
    public Document builder() throws ParserConfigurationException, IOException, SAXException, org.xml.sax.SAXException {
        return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xmlFile);
    }

    @Bean
    public SimpleUtility utility() {
        return new SimpleUtility();
    }


}