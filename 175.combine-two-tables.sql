--
-- @lc app=leetcode id=175 lang=mysql
--
-- [175] Combine Two Tables
--
# Write your MySQL query statement below

SELECT Person.FirstName, Person.LastName, Address.City, Address.State FROM Person LEFT JOIN Address USING(PersonId);


