package com.example.jasperreports.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseModel<T> {


    @LastModifiedBy
    private T lastModifiedBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;


    @CreatedBy
    private T createdBy;

    @CreatedDate
    private LocalDateTime createdDate;
}
