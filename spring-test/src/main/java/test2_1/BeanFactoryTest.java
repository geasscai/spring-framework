package test2_1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.AbstractResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.util.AssertionErrors;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

import java.io.*;


/**
 * comments
 *
 * @author qiongwei.cai 2020.01.19
 */
public class BeanFactoryTest {

	private static final Log logger = LogFactory.getLog(ResourceHttpRequestHandler.class);

	@SuppressWarnings("deprecation")
	@Test
	public void testSimpleLoad() throws IOException {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("BeanFactoryConfig.xml"));
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		AssertionErrors.assertEquals("testStr不一致!", "testStr", bean.getTestStr());
	}

	public static void main(String[] args) {
		System.out.println("啥啥啥大饭店(是大声点是大声点".lastIndexOf(")"));

	}

}
