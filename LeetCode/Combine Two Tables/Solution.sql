SELECT firstName, lastName, city, state FROM person
LEFT JOIN address adress ON person.personid = adress.personid;