package wmc.devops.spring.boot.reference.architecture;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootReferenceArchitectureApplicationTests {

	@Test
	void contextLoads() {
		int var = 1;
		int var2 = 3;
		assert var + var2 == 4;
	}

}
