package com.system.databricks.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "empresa")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private Integer idEmpresa;

    @Column(name = "razao_social", nullable = false, unique = true, length = 45)
    private String razaoSocial;

    @Column(name = "nome_fantasia", nullable = false, length = 50)
    private String nomeFantasia;

    @Column(name = "cnpj", unique = true, length = 45)
    private String cnpj;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Column(name = "date_edicao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEdicao;
}
