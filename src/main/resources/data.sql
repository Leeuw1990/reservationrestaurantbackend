
INSERT INTO users (username, password, enabled) VALUES ('user', '$2a$10$pjYTOZyDXr6mVw5bapgCv.eejcnRMe6GRBsdScPeoJmbKpXPu895u', TRUE);
INSERT INTO users (username, password, enabled) VALUES ('admin', '$2a$10$pjYTOZyDXr6mVw5bapgCv.eejcnRMe6GRBsdScPeoJmbKpXPu895u', TRUE);
INSERT INTO users (username, password, enabled) VALUES ('jeffrey', '$2a$10$pjYTOZyDXr6mVw5bapgCv.eejcnRMe6GRBsdScPeoJmbKpXPu895u', TRUE);

INSERT INTO authorities (username, authority) VALUES ('user', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO authorities (username, authority) VALUES ('jeffrey', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('jeffrey', 'ROLE_ADMIN');