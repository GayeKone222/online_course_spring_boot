package com.springproject.jpa.models;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@SuperBuilder
//@PrimaryKeyJoinColumn(name = "video_id") --> works only with joined strategy
//@DiscriminatorValue("V")  --> works only with single_class strategy
public class Video extends Resource{


    private int length;
}
