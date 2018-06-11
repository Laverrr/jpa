package com.laver.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by L on 2018/6/8.
 */
@Entity
@Table(name = "record", schema = "medical", catalog = "")
public class RecordEntity {
    private int id;
    private Integer userId;
    private Integer diseaseId;
    private Timestamp diseaseTime;
    private String status;
    private String userName;
    private String diseaseName;
    private String des;
    private Integer familyId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "disease_id")
    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    @Basic
    @Column(name = "disease_time")
    public Timestamp getDiseaseTime() {
        return diseaseTime;
    }

    public void setDiseaseTime(Timestamp diseaseTime) {
        this.diseaseTime = diseaseTime;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "disease_name")
    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    @Basic
    @Column(name = "des")
    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Basic
    @Column(name = "family_id")
    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecordEntity that = (RecordEntity) o;

        if (id != that.id) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (diseaseId != null ? !diseaseId.equals(that.diseaseId) : that.diseaseId != null) return false;
        if (diseaseTime != null ? !diseaseTime.equals(that.diseaseTime) : that.diseaseTime != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (diseaseName != null ? !diseaseName.equals(that.diseaseName) : that.diseaseName != null) return false;
        if (des != null ? !des.equals(that.des) : that.des != null) return false;
        if (familyId != null ? !familyId.equals(that.familyId) : that.familyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (diseaseId != null ? diseaseId.hashCode() : 0);
        result = 31 * result + (diseaseTime != null ? diseaseTime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (diseaseName != null ? diseaseName.hashCode() : 0);
        result = 31 * result + (des != null ? des.hashCode() : 0);
        result = 31 * result + (familyId != null ? familyId.hashCode() : 0);
        return result;
    }
}
