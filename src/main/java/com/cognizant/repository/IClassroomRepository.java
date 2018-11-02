package com.cognizant.repository;

public interface IClassroomRepository {

	String getAllClassrooms();
	String createClassroom(String classroom);
	String deleteClassroom(Long id);
	String getClassroom(Long id);
	
}
