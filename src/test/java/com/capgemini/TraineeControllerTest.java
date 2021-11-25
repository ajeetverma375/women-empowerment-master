package com.capgemini;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.controller.TraineeController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TraineeControllerTest {
	
	@Autowired
	private TraineeController controller;

	@Test
	public void testviewAllTraineesByLocation() {
		HttpStatus expected = controller.viewAllTraineesByLocation("thane").getStatusCode();
		HttpStatus actual = HttpStatus.OK;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testdeleteTrainee() {
		HttpStatus expected = controller.deleteTrainee(2).getStatusCode();
		HttpStatus actual = HttpStatus.OK;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testviewTrainee() {
		HttpStatus expected = controller.viewTrainee(2).getStatusCode();
		HttpStatus actual = HttpStatus.OK;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testviewTraineeByAadhar() {
		HttpStatus expected = controller.viewTraineeByAadhar(123456789012l).getStatusCode();
		HttpStatus actual = HttpStatus.OK;
		assertEquals(expected, actual);
	}
	


}
// 		Trainee trainee = new Trainee(1,"aka","Akash1@","Akash","Singh","9876543210","aka@gmail.com",123456789012l,2021-9-23,"thane", 1,"java","3 month","started",2021-9-21,2021-9-21,1,5,5,5,"good","2021-9-21");                                                                                 
