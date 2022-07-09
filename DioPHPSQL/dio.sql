CREATE TABLE pessoas (
    id INT NOT NULL PRIMARY KEY AUTOINCREMENT,
    nome VARCHAR(30) NOT NULL,
    nascimento DATE
)

INSERT INTO pessoas (nome, nascimento) VALUES ('Breno', '2002-03-21')

INSERT INTO pessoas (nome, nascimento) VALUES ('Marcela', '2007-05-15')

INSERT INTO pessoas (nome, nascimento) VALUES ('Pedro', '1997-07-12')