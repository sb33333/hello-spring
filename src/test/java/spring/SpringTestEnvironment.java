package spring;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"classpath*:spring/context-*.xml", "file:src/main/webapp/WEB-INF/config/springmvc/dispatcher-servlet.xml"})
public class SpringTestEnvironment {

	@Resource
	WebApplicationContext wac;
	@Test public void test() {
		System.out.println("hello");
		for (String s: wac.getBeanDefinitionNames()) {
			System.out.println(s);
		}
	}
}
