package com.example.dto;


public class ProjectQueryDTO
{
	private String name;
	private String description;
	private String agentName;
	
	public ProjectQueryDTO(String name, String description, String agentName)
	{
		this.name = name;
		this.description = description;
		this.agentName = agentName;
	}

	

	public String getName() {
		return name;
	}



	public String getDescription() {
		return description;
	}



	public String getAgentName() {
		return agentName;
	}



	@Override
	public String toString()
	{
		return "ProjectQueryDTO [name=" + name + ", description=" + description + ", agentName=" + agentName + "]";
	}

}
