DROP TABLE IF EXISTS LOG;
CREATE TABLE LOG (
id INT AUTO_INCREMENT  PRIMARY KEY,
ip VARCHAR(50) NOT NULL,
method VARCHAR(50) NOT NULL,
execution_date TIMESTAMP NOT NULL,
);