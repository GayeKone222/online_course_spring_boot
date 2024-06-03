package com.springproject.jpa.models;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Polymorphism;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@SuperBuilder
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "resource_type") -->only with SINGLE_TABLE
public class Resource {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String url;

    private int size;

    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;
}
