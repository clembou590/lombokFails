package com.example.deleg.fail;

import java.time.Instant;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    @Id
    private int id;

    private String message;

    private Date created;

    @PrePersist
    private void saveCreatedDate() {
        if (created == null) {
            created = Date.from(Instant.now());
        }
    }

}
