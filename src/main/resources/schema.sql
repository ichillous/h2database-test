create table book(
    id int auto_increment,
    title varchar(255) not null,
    pages int not null,
    author varchar(255) not null
);

INSERT INTO book(title, pages, author) values ( 'Srping boot up and running ', 326, 'Jimmy Butler' )