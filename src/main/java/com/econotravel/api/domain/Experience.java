package com.econotravel.api.domain;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;


import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;
import java.util.Objects;

@SpringBootApplication

@Entity
@Table(name = "experiences")
public class Experience {



<<<<<<< HEAD
    @Lob
    private String description;


=======
>>>>>>> 24a469aca03beff761f091298669dae708ed927b

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String name;
    private BigDecimal price;
    private int duration;
    @Lob
    private String accessibility;
    private String tags;
    @Lob
    private String description;
    private String images;




<<<<<<< HEAD
    public Experience(String name, BigDecimal price, int duration, String accesibility, String tags, String description) {
=======
    public Experience(String name, BigDecimal price, int duration, String accessibility, String tags, String description, String images) {
>>>>>>> 24a469aca03beff761f091298669dae708ed927b
        this.name = name;
        this.price = price;
        this.duration = duration;
        this.accessibility = accessibility;
        this.tags = tags;
        this.description = description;

    }

    public Experience() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(String accessibility) {
        this.accessibility = accessibility;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImages(String coverImage) {
        this.images = images;
    }

    public String getImages() {
        return images;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Experience that = (Experience) o;
        return duration == that.duration && Objects.equals(description, that.description) && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(price, that.price) && Objects.equals(accessibility, that.accessibility) && Objects.equals(tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, id, name, price, duration, accessibility, tags);
    }

    }



