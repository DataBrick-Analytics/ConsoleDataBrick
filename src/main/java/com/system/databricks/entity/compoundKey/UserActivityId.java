package com.system.databricks.entity.compoundKey;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Embeddable

public class UserActivityId implements Serializable {
    @Column(name = "fk_empresa")
    private Integer fkEnterprise;

    @Column(name = "fk_usuario")
    private Integer userId;

    @Column(name = "fk_acao")
    private Integer idActivity;


    public Integer getFkEnterprise() {
        return fkEnterprise;
    }

    public void setFkEnterprise(Integer fkEnterprise) {
        this.fkEnterprise = fkEnterprise;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }
}