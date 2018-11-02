package com.cognizant.service;

public interface IClassroomService {

	String getAllClassrooms();
	String createClassroom(String classroom);
	String deleteClassroom(Long id);
	String getClassroom(Long id);
	
}
