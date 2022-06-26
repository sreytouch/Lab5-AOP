package com.example.aop.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class ActivityLog {

    @Id
    @GeneratedValue
    private int id;
    @Temporal(value = TemporalType.DATE)
    private Date date;
    private String operation;
    private Long duration;

}
