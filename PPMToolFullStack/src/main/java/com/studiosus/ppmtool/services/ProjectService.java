package com.studiosus.ppmtool.services;

import com.studiosus.ppmtool.domain.Project;
import com.studiosus.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;


    public Project saveOrUpdateProject(Project project){
        //Logic
        return projectRepository.save(project);
    }

}
