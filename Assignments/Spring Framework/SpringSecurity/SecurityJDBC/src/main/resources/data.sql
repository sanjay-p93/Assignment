
INSERT INTO users (username, password, enabled) values ('admin', 'qwerty', true);
INSERT INTO users (username, password, enabled) values ('user', 'asdfg', true);

INSERT INTO authorities (username, authority) values ('admin', 'ROLE_ADMIN');
INSERT INTO authorities (username, authority) values ('user', 'ROLE_USER');