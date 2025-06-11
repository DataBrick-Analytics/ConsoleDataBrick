package com.system.databricks.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column(name = "id_usuario")
    private Integer idUser;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
}
