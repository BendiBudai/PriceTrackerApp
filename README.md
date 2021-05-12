# PriceTrackerApp

Egy folyamatban lévő Spring Boot Web project, melynek végső célja, hogy - a felhaszálói felületen keresztül - bármely webáruház termékeit hozzá lehessen adni az adatbázishoz, mely ezután periodikusan - felhaszáló által megadott idő intervallumban - scrapeli a termékek árát -Selenium headless browser felhasználásával -  és amennyiben változás történt frissíti azokat. Bizonyos előre definiált áreséseknél Spring Boot Starter Mail haszálatával a regisztált felhaszálóknak e-mail küldése az adott termék(ek) áreséséről. 
Az adatbázis PostgreSQL server, Spring Data JPA alapú, Hibernate implementációval. 
