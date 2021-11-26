package com.capgemini;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import com.capgemini.model.Trainee;
import com.capgemini.service.TraineeServiceImpl;


@SpringBootTest
public class TraineeServiceTest {
	
	@Autowired
	private TraineeServiceImpl traineService;
	@Autowired
	private ApplicationContext context;


	@Test
	public void testToViewAllTrainee() {
		int source = traineService.viewAllTrainee().size();
		int count = 0;
		Trainee expected = context.getBean(Trainee.class);
		List<Trainee> list = new ArrayList<Trainee>();
		for (int i = 0; i < source; i++) {
			list.add(expected);
			count += 1;
		}
		List<Trainee> actual = traineService.viewAllTrainee();
		assertEquals(count, actual.size());
	}


}
