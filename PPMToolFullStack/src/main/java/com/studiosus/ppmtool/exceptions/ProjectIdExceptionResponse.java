package com.studiosus.ppmtool.exceptions;

public class ProjectIdExceptionResponse {

    private String projectIdentifier;
    //pass the message which is going to return projectIdentifier
    public ProjectIdExceptionResponse(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }
}
