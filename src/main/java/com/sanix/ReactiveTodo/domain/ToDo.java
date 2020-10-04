package com.sanix.ReactiveTodo.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ToDo {

    private String id;
    private String description;
    private LocalDateTime created;
    private LocalDateTime modified;
    private boolean completed;

    public ToDo(){

    }

    public ToDo(String description){
        this.description=description;
    }

    public ToDo(String description, boolean completed){
        this.description=description;
        this.completed=completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
