-- V2: Migrations para adicionar a coluna de STATUS na tabela de cadastros

ALTER TABLE TB_CADASTRO
ADD COLUMN STATUS ENUM('Vivo', 'Morto', 'Ressuscitado') DEFAULT 'Vivo';