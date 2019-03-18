CREATE TABLE issue355 (
   id serial8,
   name text,
   label phrase,
   description fulltext
);

CREATE INDEX idxtest ON issue355 USING zombodb(zdb('issue355', ctid), zdb(issue355)) WITH (field_lists='name=[name, label, description]', url='localhost:9200/');

SELECT * FROM zdb_tally('test', 'name', '^.*', '', 10, 'count');