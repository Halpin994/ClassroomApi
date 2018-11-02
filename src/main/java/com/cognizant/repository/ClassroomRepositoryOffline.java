package com.cognizant.repository;

import com.cognizant.domain.Classroom;
import com.cognizant.Util.Util;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Alternative
public class ClassroomRepositoryOffline implements IClassroomRepository {

    private Map<Long, Classroom> classrooms = new HashMap<>();

    @Inject
    private Util util;

    @Override
    public String createClassroom(String cl) {
        Classroom classroom = util.getObjectForJSON(cl, Classroom.class);
        classrooms.put(classroom.getId(), classroom);
        return "{\"message\": \"trainee has been successfully added\"}";
    }

    @Override
    public String getClassroom(Long Id) {
        return util.getJSONForObject(classrooms.get(Id));
    }

    @Override
    public String deleteClassroom(Long classroomId) {
    	classrooms.remove(classroomId);
        return "{\"message\": \"trainee sucessfully deleted\"}";
    }

    @Override
    public String getAllClassrooms() {
        Collection<Classroom> values = classrooms.values();
        return util.getJSONForObject(values);
    }

}
