
SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

INSERT INTO public.person (id, address, first_name, gender, last_name) VALUES
(1, 'jaraba''s house', 'Pedro', 'homem', 'Cassote'),
(2, 'jaraba''s house', 'Joao', 'homem', 'Cassote');

SELECT pg_catalog.setval('public.person_id_seq', 4, true);
