select sum(CITY.population) 
FROM CITY JOIN COUNTRY on CITY.countrycode = country.code where continent = "asia";