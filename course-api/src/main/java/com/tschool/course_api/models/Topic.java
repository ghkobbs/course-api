package com.tschool.course_api.models;

import jakarta.persistence.*;

@Entity
public class Topic {

    @Id
    @SequenceGenerator(name = "topic_seq", sequenceName = "TOPIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "topic_seq")
    private Integer id;
    private String identifier;
    private String name;
    private String description;

    public Topic() {
    }

    public Topic(int id, String identifier, String name, String description) {
        this.id = id;
        this.identifier = identifier;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id='" + id + '\'' +
                ", identifier='" + identifier + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
