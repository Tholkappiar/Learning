select w.id , p.age , w.coins_needed , w.power
from wands as w join wands_property as p 
on w.code = p.code
where w.coins_needed = 
(select min(w2.coins_needed) 
 from wands as w2 join wands_property as p2 on w2.code = p2.code
where p.is_evil  = 0 and w.power = w2.power and w.code = w2.code) 
order by w.power desc , p.age desc  ;
