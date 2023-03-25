package spring;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"classpath*:spring/context-*.xml", "file:src/main/webapp/WEB-INF/config/springmvc/dispatcher-servlet.xml"})
public abstract class SpringTestEnvironment {

	@Resource
	protected WebApplicationContext wac;
	
	protected MockMvc mockMvc;


}
