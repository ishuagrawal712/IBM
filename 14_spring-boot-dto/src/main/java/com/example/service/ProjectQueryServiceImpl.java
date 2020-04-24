package com.example.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.ProjectQueryDTO;
import com.example.entity.Project;
import com.example.repo.ProjectRepository;

@Service
public class ProjectQueryServiceImpl implements ProjectQueryService
{
	private ProjectRepository projectRepo;
	
	@Autowired
	public ProjectQueryServiceImpl(ProjectRepository projectRepo)
	{
		super();
		this.projectRepo = projectRepo;
	}

	@Override
	public ProjectQueryDTO getProject(Integer id)
	{
		if (projectRepo.findById(id).isPresent())
		{
			Project fetchProject = projectRepo.findById(id).get();
			ProjectQueryDTO dto=new ProjectQueryDTO(fetchProject.getName(), fetchProject.getDescription(),
		    fetchProject.getAgentName());
			return  dto;
			
		}else
		{
			return null;
		}
	}

	@Override
	public List<ProjectQueryDTO> getAllProjects()
	{
		List<ProjectQueryDTO> projectList = new ArrayList<>();
		projectRepo.findAll().forEach(project -> {
			projectList.add(new ProjectQueryDTO( project.getName(), project.getDescription(),project.getAgentName()));});

		return projectList;
	}
	
	@Override
	public ProjectQueryDTO createProject(ProjectQueryDTO projectQueryDTO)
	{
		projectRepo.save(new Project(projectQueryDTO.getName(), projectQueryDTO.getDescription(), projectQueryDTO.getAgentName()));
		return projectQueryDTO;
	}

	@Override
	public Project updateProject(Project project)
	{
		Project fetchProject = projectRepo.findById(project.getId()).get();
		fetchProject.setName(project.getName());
		fetchProject.setDescription(project.getDescription());
		fetchProject.setAgentName(project.getAgentName());
		
		return fetchProject;
		
	}

	@Override
	public Project deleteProject(int id)
	{
		Project fetchProject = projectRepo.findById(id).get();
		projectRepo.deleteById(id);
		
		return fetchProject;
	}
}
