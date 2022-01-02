CREATE TABLE cat
(
    id         bigint GENERATED ALWAYS AS IDENTITY,
    name       VARCHAR(255),
    PRIMARY KEY (id)
);
