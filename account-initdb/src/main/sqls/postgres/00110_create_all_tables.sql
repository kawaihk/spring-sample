CREATE TABLE account (
  userid character varying(8) not null
  , username character varying(64)
  , birthday character varying(64)
  , address character varying(255)
  , phonenumber character varying(64)
  , CONSTRAINT account_pk1 primary key (userid)
);

COMMIT;