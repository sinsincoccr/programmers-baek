-- 코드를 입력하세요
SELECT t.flavor
FROM (
  SELECT a.flavor,
         (SUM(a.total_order) + SUM(b.total_order)) AS total_order
  FROM   first_half a
  JOIN   july b
         ON a.flavor = b.flavor
  GROUP BY a.flavor
  ORDER BY total_order DESC
) t
WHERE ROWNUM <= 3;
