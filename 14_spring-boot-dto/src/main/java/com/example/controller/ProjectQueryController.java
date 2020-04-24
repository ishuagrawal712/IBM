package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ProjectQueryDTO;
import com.example.entity.Project;
import com.example.service.ProjectQueryService;

@RestController
@RequestMapping("/api")
public class ProjectQueryController
{
	@Autowired
	private ProjectQueryService projectQueryService;
	
	@GetMapping("/projects")
	public ResponseEntity<Object> getAllProjects()
	{
		return new ResponseEntity<>(projectQueryService.getAllProjects(), HttpStatus.OK);
	}
	
	@GetMapping("/projects/{id}")
	public ResponseEntity<Project> getProjectById(@PathVariable("id") Integer id)
	{
		return new ResponseEntity(projectQueryService.getProject(id),HttpStatus.OK);
	}
	
	@PostMapping("/project/create")
	public ResponseEntity<ProjectQueryDTO> createProject(@RequestBody ProjectQueryDTO projectQueryDTO)
	{
		return new ResponseEntity(projectQueryService.createProject(projectQueryDTO), HttpStatus.OK);
	}

	@PutMapping("/project/update")
	public ResponseEntity<Project> updateProject(@RequestBody Project project)
	{
		return new ResponseEntity(projectQueryService.updateProject(project), HttpStatus.OK);
	}
	
	@DeleteMapping("project/delete/{id}")
	public ResponseEntity<Project> updateProject(@PathVariable("id") int id)
	{
		return new ResponseEntity(projectQueryService.deleteProject(id), HttpStatus.OK);
	}
}