package com.d.club.common.entity;

import java.io.Serializable;

public class BaseEntity<T> implements Serializable {

    private T entity;
    private Long id;
    private String name;
    private Long version;
    private Long lastAccess;

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

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Long lastAccess) {
        this.lastAccess = lastAccess;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }
}
