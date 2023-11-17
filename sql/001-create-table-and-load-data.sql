DROP TABLE IF EXISTS books;

CREATE TABLE books (
  id int unsigned AUTO_INCREMENT,
  title VARCHAR(100) NOT NULL,
  author VARCHAR(100) NOT NULL,
  PRIMARY KEY(id)
);
INSERT INTO books (title, author)VALUES ("Where the Wild Things Are", "Maurice Sendak");
INSERT INTO books (title, author)VALUES ("Alice''s Adventures in Wonderland", "Lewis Carroll");
INSERT INTO books (title, author)VALUES ("Pippi Longstocking", "Astrid Lindgren");
INSERT INTO books (title, author)VALUES ("The Little Prince", "Antoine de Saint-Exupéry");
INSERT INTO books (title, author)VALUES ("The Hobbit", "JRR Tolkien");
INSERT INTO books (title, author)VALUES ("Northern Lights ", "Philip Pullman");
INSERT INTO books (title, author)VALUES ("The Lion, the Witch and the Wardrobe", "CS Lewis");
INSERT INTO books (title, author)VALUES ("Winnie-the-Pooh", "AA Milne and EH Shepard");
INSERT INTO books (title, author)VALUES ("Charlotte''s Web ", "EB White and Garth Williams");
INSERT INTO books (title, author)VALUES ("Matilda ", "Roald Dahl and Quentin Blake");
