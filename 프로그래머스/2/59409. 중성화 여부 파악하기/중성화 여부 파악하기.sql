SELECT ANIMAL_ID, NAME, CASE SEX_UPON_INTAKE
                            WHEN 'Neutered Male' THEN 'O'
                            WHEN 'Spayed Male' THEN 'O'
                            WHEN 'Neutered Female' THEN 'O'
                            WHEN 'Spayed Female' THEN 'O'
                            ELSE 'X'
                         END AS '중성화'
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;