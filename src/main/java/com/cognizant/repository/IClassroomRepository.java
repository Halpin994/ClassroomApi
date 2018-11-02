package com.cognizant.repository;

public interface IClassroomRepository {

	String getAllClassrooms();
	String createClassroom(String movie);
	String deleteClassroom(Long id);
	String getClassroom(Long id);
	
}
