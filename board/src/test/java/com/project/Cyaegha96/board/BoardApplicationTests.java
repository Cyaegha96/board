package com.project.Cyaegha96.board;

import com.project.Cyaegha96.board.web.BootWebApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootWebApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BootWebApplicationTests {

	@Test
	public void contextLoads() {
	}

}
