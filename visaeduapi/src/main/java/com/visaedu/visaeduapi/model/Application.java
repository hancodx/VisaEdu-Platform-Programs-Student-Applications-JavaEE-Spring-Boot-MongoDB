package com.visaedu.visaeduapi.model;

import java.time.Instant;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "applications")
public class Application {

    @Id
    private String id;

    private String studentId;
    private String programId;
    private String universityId;

    private String status; // under_review, accepted, refused

    private Instant createdAt;

    private Map<String, Object> documents;

    private String counselorNotes;

    public Application() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Map<String, Object> getDocuments() {
        return documents;
    }

    public void setDocuments(Map<String, Object> documents) {
        this.documents = documents;
    }

    public String getCounselorNotes() {
        return counselorNotes;
    }

    public void setCounselorNotes(String counselorNotes) {
        this.counselorNotes = counselorNotes;
    }
}
