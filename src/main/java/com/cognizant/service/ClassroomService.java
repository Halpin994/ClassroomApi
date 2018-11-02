package com.cognizant.service;

import javax.inject.Inject;

import com.cognizant.repository.IClassroomRepository;

public class ClassroomService {

	@Inject
	private IClassroomRepository repo;

	public String getAllClassrooms() {
		return repo.getAllClassrooms();
	}

	public String createClassroom(String classroom) {
		return repo.createClassroom(classroom);
	}

	public String deleteClassroom(Long id) {
		return repo.deleteClassroom(id);
	}
	
	public String getClassroom(Long id) {
		return repo.getClassroom(id);
	}

	public void setRepo(IClassroomRepository repo) {
		this.repo = repo;
	}
}
