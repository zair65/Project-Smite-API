package com.qa.business.service;

public interface ClassRoomService {

	String AddTrainee(String trainees);
	String DeleteTrainee(Long TraineeId);
	String UpdateTrainee(String TraineeName, Long Id);
	String getAllTrainee();

}