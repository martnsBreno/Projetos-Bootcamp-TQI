/* CRIANDO TABELA E INSERINDO OS PRIMEIROS DADOS */

CREATE TABLE pessoas (
    id INT NOT NULL PRIMARY KEY AUTOINCREMENT,
    nome VARCHAR(30) NOT NULL,
    nascimento DATE
)

INSERT INTO pessoas (nome, nascimento) VALUES ('Breno', '2002-03-21')

INSERT INTO pessoas (nome, nascimento) VALUES ('Marcela', '2007-05-15')

INSERT INTO pessoas (nome, nascimento) VALUES ('Pedro', '1997-07-12')

/* SELECIONANDO DADOS */

SELECT * FROM pessoas

SELECT nome FROM pessoas

SELECT nome, nascimento FROM 'pessoas'

/* ATUALIZANDO DADOS */

UPDATE pessoas SET nome='Breno Martins' WHERE id=1

/* DELETANDO DADOS */

DELETE FROM pessoas WHERE id=1

/* ORDENANDO OS DADOS */

SELECT * FROM pessoas ORDER BY nome

SELECT * FROM pessoas ORDER BY nome DESC 

/* AGRUPANDO DADOS */

SELECT COUNT(id), genero FROM pessoa GROUP BY genero;