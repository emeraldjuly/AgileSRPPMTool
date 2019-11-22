package com.studiosus.ppmtool.services;

import com.studiosus.ppmtool.domain.Project;
import com.studiosus.ppmtool.exceptions.ProjectIdException;
import com.studiosus.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;


    public Project saveOrUpdateProject(Project project){
        try{
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            //Logic
            return projectRepository.save(project);

        }catch (Exception e){
            throw new ProjectIdException("Project ID '" +  project.getProjectIdentifier().toUpperCase() + "' already exists");
        }
    }
}
