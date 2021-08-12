package com.example.jasperreports.model;

import com.example.jasperreports.common.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "student", name = "student")
public class Student extends BaseModel<String> {
    @Id
    private String id;

    private String name;

    private int age;

    private String address;
}
