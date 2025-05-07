package com.system.databricks.entity;

import com.system.databricks.entity.compoundKey.UserActivityId;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "acoes_de_usuario")
public class UserActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_acao_usuario")
    private Integer idUserAction;

    @Embedded
    private UserActivityId userActivityId;

    @Column(name = "data_da_acao")
    private Date dtActivity = new Date();

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

    public Date getDtActivity() {
        return dtActivity;
    }

    public void setDtActivity(Date dtActivity) {
        this.dtActivity = dtActivity;
    }
}