package spring.home;

import org.junit.Test;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

import spring.SpringTestEnvironment;

public class Question1 extends SpringTestEnvironment {

	@Test
	public void test1() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
		mockMvc.perform(get("/home.do")).andDo(print());
	}
}
