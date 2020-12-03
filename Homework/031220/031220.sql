-- 3.2-2
SELECT sname FROM Sailors
WHERE
sid in (select sid from Reserves WHERE bid=103)

-- 3.2-3
SELECT DISTINCT sid FROM Reserves 
WHERE 
bid in (SELECT bid FROM Boats WHERE Color="Red") ;

-- 3.2-4
SELECT sname 
FROM Sailors
WHERE sid IN
(
	SELECT DISTINCT sid 
	FROM Reserves 
	WHERE bid in (
		SELECT bid 
		FROM Boats 
		WHERE Color="Red"
	)
);

-- 3.2-5
SELECT DISTINCT Color
FROM Boats
WHERE bid in
(
	SELECT bid
	FROM Reserves
	WHERE sid =
	(
		SELECT sid
		FROM Sailors
		WHERE sname="Lubber"
	)
);

-- 3.2-6.1
SELECT DISTINCT sname 
FROM Sailors
WHERE sid IN
(
	SELECT DISTINCT sid 
	FROM Reserves
);

-- 3.2-6.2


-- 3.2-7

-- 3.2-8
