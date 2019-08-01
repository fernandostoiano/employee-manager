package com.luizalabs.employeemanager.models;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZoneId;

@MappedSuperclass
public class DomainModel<T extends DomainModel<T>> {

    private static final String AMERICA_SAO_PAULO = "America/Sao_Paulo";

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    private DateModel dateModel;

    @Version
    private Integer version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DateModel getDateModel() {
        return dateModel;
    }

    public void setDateModel(DateModel dateModel) {
        this.dateModel = dateModel;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @PrePersist
    public void initializeDates() {
        LocalDateTime now = LocalDateTime.now(ZoneId.of(AMERICA_SAO_PAULO));
        dateModel = new DateModel(now, now);
    }

    @PreUpdate
    public void updateUpdatedAt() {
        dateModel.setUpdatedAt(LocalDateTime.now(ZoneId.of(AMERICA_SAO_PAULO)));
    }

    @Override
    public String toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.JSON_STYLE).toString();
    }

}
