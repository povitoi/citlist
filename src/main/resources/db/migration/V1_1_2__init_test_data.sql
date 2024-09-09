insert into citlist.t_citizen
(c_firstname, c_lastname, c_patronymic, c_phone_number, c_address)
values
    ('Иван', 'Иванов', 'Иванович',
     '9999999999', 'ул. Иванова'),
    ('Петр', 'Петров', 'Петрович',
     '8888888888', 'ул. Петрова'),
    ('Геннадий', 'Геннадьев', 'Геннадьевич',
     '7777777777', 'ул. Геннадьева'),
    ('Наталья', 'Натальева', 'Натальевна',
     '6666666666', 'ул. Натальевой'),
    ('Екатерина', 'Екатеринова', 'Екатериньевна',
     '5555555555', 'ул. Екатериновой');

insert into citlist.t_transport
(c_brand, c_model, c_tail_number, c_color, c_body, c_description)
values
    ('Ауди', '100', 'р100рр',
     'Синий', 'Универсал', 'красный капот'),
    ('УАЗ', 'Буханка', 'г200гг',
     'Зеленый', 'Фургон', ''),
    ('Камаз', '', 'т300тт',
     'Серый', 'Грузовик', 'с прицепом');

insert into citlist.t_shift_status
(c_shift_opened)
values
(false)

-- insert into citlist.t_citizen_transport
-- (id_citizen, id_transport)
-- values
--     (1, 1),
--     (2, 3),
--     (5, 2);