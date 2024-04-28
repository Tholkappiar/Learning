select case when gra.grade >= 8 then stu.name else 'NULL' end , gra.grade , stu.marks
from grades as gra , students as stu 
where stu.marks between gra.min_mark and max_mark
order by gra.grade desc , stu.name asc;