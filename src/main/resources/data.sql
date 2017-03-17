/*
 * In-memory database initialization.
 */
INSERT INTO sentiment_type(code, name) VALUES ('NEG', 'Negative');
INSERT INTO sentiment_type(code, name) VALUES ('NEU', 'Neutral');
INSERT INTO sentiment_type(code, name) VALUES ('POS', 'Positive');

INSERT INTO sentiment_lookup_domain(id, name) VALUES (1, 'Google');
