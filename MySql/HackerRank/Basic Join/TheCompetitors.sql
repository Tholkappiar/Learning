SELECT hack.hacker_id , hack.name 
FROM submissions AS sub JOIN challenges as chal 
ON sub.challenge_id = chal.challenge_id
JOIN difficulty as diff on chal.difficulty_level = diff.difficulty_level
JOIN hackers AS hack ON sub.hacker_id = hack.hacker_id
WHERE sub.score = diff.score
GROUP BY hack.hacker_id ,hack.name
HAVING COUNT(*)  > 1
ORDER BY COUNT(*) DESC , hack.hacker_id;