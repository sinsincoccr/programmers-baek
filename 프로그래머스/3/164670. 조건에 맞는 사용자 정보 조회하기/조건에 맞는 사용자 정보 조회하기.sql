-- 코드를 입력하세요
SELECT USER_ID	
     , NICKNAME	
     , (CITY || ' ' || STREET_ADDRESS1 || ' ' || STREET_ADDRESS2) AS 전체주소	
     , substr(TLNO, 1, 3) || '-' || substr(TLNO, 4, 4) || '-' || substr(TLNO, 8, 4) AS 전화번호
FROM USED_GOODS_BOARD A, USED_GOODS_USER B
WHERE WRITER_ID IN (SELECT WRITER_ID
                      FROM USED_GOODS_BOARD 
                     WHERE A.WRITER_ID = B.USER_ID
                  GROUP BY WRITER_ID
                    HAVING COUNT(WRITER_ID) >= 3)
GROUP BY USER_ID
       , NICKNAME
       , (CITY || ' ' || STREET_ADDRESS1 || ' ' || STREET_ADDRESS2)
       , substr(TLNO, 1, 3) || '-' || substr(TLNO, 4, 4) || '-' || substr(TLNO, 8, 4)
ORDER BY USER_ID DESC