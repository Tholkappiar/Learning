SELECT hacker_id, name, SUM(max_score) AS total_score from (
    SELECT h.hacker_id, name, MAX(score) AS max_score FROM hackers AS h
    INNER JOIN submissions AS s 
    ON h.hacker_id = s.hacker_id
    GROUP BY h.hacker_id, name, challenge_id
    HAVING max_score > 0
) AS t
GROUP BY hacker_id, name
ORDER BY total_score DESC, hacker_id
