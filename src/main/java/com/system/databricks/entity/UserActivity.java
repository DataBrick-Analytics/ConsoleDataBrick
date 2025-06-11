package com.system.databricks.entity;

import com.system.databricks.entity.compoundKey.UserActivityId;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "acao_de_usuario")
public class UserActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_acao_usuario")
    private Integer idUserAction;

    @Embedded
    private UserActivityId userActivityId;

    @Column(name = "data_criacao")
    private Date dtCreation = new Date();


    @Column(name = "data_edicao")
    private Date dtEdition = new Date();

    public Date getDtCreation() {return dtCreation;}

    public void setDtCreation(Date dtCreation) {this.dtCreation = dtCreation;}

    public Date getDtEdition() {return dtEdition;}

    public void setDtEdition(Date dtEdition) {this.dtEdition = dtEdition;}

    public Integer getIdUserAction() {
        return idUserAction;
    }

    public void setIdUserAction(Integer idUserAction) {
        this.idUserAction = idUserAction;
    }

    public UserActivityId getUserActivityId() {
        return userActivityId;
    }

    public void setUserActivityId(UserActivityId userActivityId) {
        this.userActivityId = userActivityId;
    }


}