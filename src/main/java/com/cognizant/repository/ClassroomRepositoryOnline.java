package com.cognizant.repository;




import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.cognizant.domain.Classroom;
import com.cognizant.Util.Util;

@Transactional(SUPPORTS)
@Default
public class ClassroomRepositoryOnline implements IClassroomRepository {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private Util util;

	public String getAllClassrooms() {
		Query query = manager.createQuery("Select a FROM Movie a");
		Collection<Classroom> classrooms = (Collection<Classroom>) query.getResultList();
		return util.getJSONForObject(classrooms);
	}

	@Transactional(REQUIRED)
	public String createClassroom(String jsonMovie) {
		Classroom anMovie = util.getObjectForJSON(jsonMovie, Classroom.class);
		manager.persist(anMovie);
		return "{\"message\": \"classroom has been sucessfully added\"}";
	}

	@Transactional(REQUIRED)
	public String deleteClassroom(Long id) {
		Classroom classroomInDB = findClassroom(id);
		if (classroomInDB != null) {
			manager.remove(classroomInDB);
		}
		return "{\"message\": \"classroom sucessfully deleted\"}";
	}
	
	public String getClassroom(Long id) {
		Classroom aClassroom =  manager.find(Classroom.class, id);
		return util.getJSONForObject(aClassroom);
	}

	private Classroom findClassroom(Long id) {
		return manager.find(Classroom.class, id);
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(Util util) {
		this.util = util;
	}

}
