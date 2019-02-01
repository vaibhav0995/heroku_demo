package com.metacube.training.service;

import java.util.List;

import com.metacube.training.model.Project;


public interface ProjectService {

	
	Project getProjectById(int id);

	List<Project> getAllProjects();

	boolean deleteProject(int id);

	boolean updateProject(Project project);

	boolean createProject(Project project);

}
