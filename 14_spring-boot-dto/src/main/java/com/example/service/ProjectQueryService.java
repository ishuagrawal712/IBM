package com.example.service;
import java.util.List;


import com.example.dto.ProjectQueryDTO;
import com.example.entity.Project;

public interface ProjectQueryService
{
	public ProjectQueryDTO getProject(Integer id);
	public List<ProjectQueryDTO> getAllProjects();
	public ProjectQueryDTO createProject(ProjectQueryDTO projectQueryDTO);
	public Project updateProject(Project project);
	public Project deleteProject(int id);
}
