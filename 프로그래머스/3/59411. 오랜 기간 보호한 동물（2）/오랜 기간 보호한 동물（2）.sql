-- 코드를 입력하세요
SELECT *
  FROM (SELECT A.ANIMAL_ID	
             , A.NAME
          FROM ANIMAL_OUTS A
          JOIN 
            ANIMAL_INS B
            ON A.ANIMAL_ID = B.ANIMAL_ID
         WHERE A.DATETIME IS NOT NULL
        ORDER BY A.DATETIME - B.DATETIME DESC
        )
 WHERE ROWNUM <= 2;
