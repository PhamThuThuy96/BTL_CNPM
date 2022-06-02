Select a.standards, b.vip, c.business, d.royal, e.special from (Select count(1) standards from PHONG  where LOAIPHONG = 'standard') a, (Select count(1) vip from PHONG  where LOAIPHONG = 'vip') b, (Select count(1) business from PHONG  where LOAIPHONG = 'business') c, (Select count(1) royal from PHONG  where LOAIPHONG = 'royal') d, (Select count(1) special from PHONG  where LOAIPHONG = 'special') e;



Select * from PHONG