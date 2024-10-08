

create table players1 as
select * from players;
insert into players1
select * from players;

select distinct player_name,score from players;


select player_name ,
RANK() over(partition by country order by score desc)
from players;
with ranked_players AS(select player_name ,
RANK() over(partition by country order by score desc) as rank_recieved
from players
)
select player_name from ranked_players where 
rank_recieved = 1;
