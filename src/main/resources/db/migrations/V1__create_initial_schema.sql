-- V1: initial schema — the tables Hibernate was auto-creating via ddl-auto.
-- Created WITHOUT the status column on purpose: status is the change V2 introduces.

-- Referenced table first: tb_cadastro has a FK pointing here,
-- so tb_missoes must be created before it (otherwise the FK references nothing).
CREATE TABLE tb_missoes (
                            pk_id_missao BIGINT AUTO_INCREMENT PRIMARY KEY,
                            nome         VARCHAR(255),
                            rank         VARCHAR(255) -- RankMissao enum stored as text (@Enumerated(EnumType.STRING))
);

CREATE TABLE tb_cadastro (
                             pk_id_ninja  BIGINT AUTO_INCREMENT PRIMARY KEY,
                             nome         VARCHAR(255),
                             email        VARCHAR(255) UNIQUE,   -- @Column(unique = true)
                             idade        INT NOT NULL,          -- primitive int can't be null, so NOT NULL
                             fk_id_missao BIGINT,                -- @ManyToOne is optional by default -> nullable
                             CONSTRAINT fk_cadastro_missao FOREIGN KEY (fk_id_missao) REFERENCES tb_missoes (pk_id_missao)
);