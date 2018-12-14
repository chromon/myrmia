package com.myrmia.model;

import javax.persistence.*;

/**
 * attach do
 * Created by Ellery on 2018/11/30.
 */
@Entity
@Table(name = "t_attach")
public class AttachDO {

    private int id;

    private String fileName;

    private String fileType;

    private String fileKey;

    private int authorId;

    private long created;

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "file_name", nullable = false, columnDefinition = "varchar(100)")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Column(name = "file_type", columnDefinition = "varchar(50)")
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Column(name = "file_key", nullable = false, columnDefinition = "varchar(100)")
    public String getFileKey() {
        return fileKey;
    }

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    @Column(name = "author_id", nullable = false, columnDefinition = "integer(10)")
    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    @Column(name = "created", nullable = false, columnDefinition = "bigint")
    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }
}
