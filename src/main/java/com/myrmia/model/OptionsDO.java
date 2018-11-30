package com.myrmia.model;

import javax.persistence.*;

/**
 * options do
 * Created by Ellery on 2018/11/30.
 */
@Entity
@Table(name = "t_options")
public class OptionsDO {

    private int id;

    private String optionsName;

    private String optionsValue;

    private String description;

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "options_name", nullable = false, columnDefinition = "varchar(100) unique")
    public String getOptionsName() {
        return optionsName;
    }

    public void setOptionsName(String optionsName) {
        this.optionsName = optionsName;
    }

    @Column(name = "options_value", columnDefinition = "text")
    public String getOptionsValue() {
        return optionsValue;
    }

    public void setOptionsValue(String optionsValue) {
        this.optionsValue = optionsValue;
    }


    @Column(name = "description", columnDefinition = "varchar(255)")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
