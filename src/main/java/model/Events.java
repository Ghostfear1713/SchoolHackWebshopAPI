package model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titleOfEvent;
    private String discriptionOfEvent;
    private LocalDate dateOfEvent;
    private LocalDate timeEventStarts;
    private int durantionInHours;
    private int capacityOfRegisters;
    private String locationOfEvent;
    private String instructorOfEvent;
    private double prince;
    private String category;
    private String image;
    private String status;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private LocalDate deletedAt;


}
