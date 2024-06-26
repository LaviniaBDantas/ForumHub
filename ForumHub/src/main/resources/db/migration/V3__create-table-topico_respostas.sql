CREATE TABLE topico_respostas (
      topico_id BIGINT NOT NULL,
      respostas VARCHAR(255),
      CONSTRAINT FK_topico_id FOREIGN KEY (topico_id) REFERENCES topicos(id)
);
