package com.istad.mybatisfirstlesson.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private int id;
    private String fullName;
    private String gender;
    private String classroom;
    private float score;

}
