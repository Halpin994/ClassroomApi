package com.cognizant.service;

public interface IClassroomService {

	String getAllClassrooms();
	String createClassroom(String movie);
	String deleteClassroom(Long id);
	String getClassroom(Long id);
	
}
