INSERT INTO `biblioteca`.`usuarios` (`id_usuario`,`estado_usuario`, `identificacion_usuario`, `nombre`) VALUES ('1',b'0', '154515485', 'Carlos pardo');
INSERT INTO `biblioteca`.`usuarios` (`id_usuario`,`estado_usuario`, `identificacion_usuario`, `nombre`) VALUES ('2',b'0', '78954744', 'Andres');
INSERT INTO `biblioteca`.`usuarios` (`id_usuario`,`estado_usuario`, `identificacion_usuario`, `nombre`) VALUES ('3',b'0', '122002155', 'Felipe');
INSERT INTO `biblioteca`.`usuarios` (`id_usuario`,`estado_usuario`, `identificacion_usuario`, `nombre`) VALUES ('4',b'0', '7651482124', 'Chart buster');
INSERT INTO `biblioteca`.`usuarios` (`id_usuario`,`estado_usuario`, `identificacion_usuario`, `nombre`) VALUES ('5',b'0', '888888888', 'Chart buster');


INSERT INTO `biblioteca`.`libros` (`id_libro`,`estado_libro`, `isbn`, `nombre_libro` ) VALUES ('1',b'0', 'DASD154212', 'Moby Dick');
INSERT INTO `biblioteca`.`libros` (`id_libro`,`estado_libro`, `isbn`, `nombre_libro` ) VALUES ('2',b'0', 'DASD889885', 'El Mundo');
INSERT INTO `biblioteca`.`libros` (`id_libro`,`estado_libro`, `isbn`, `nombre_libro` ) VALUES ('3',b'0', 'DASD478547', 'SAnt vit');
INSERT INTO `biblioteca`.`libros` (`id_libro`,`estado_libro`, `isbn`, `nombre_libro` ) VALUES ('4',b'0', 'DASD369852', 'Caso by Turner');
INSERT INTO `biblioteca`.`libros` (`id_libro`,`estado_libro`, `isbn`, `nombre_libro` ) VALUES ('5',b'0', 'DASD154216', 'El mas alla');


INSERT INTO `biblioteca`.`prestamos` (`id_prestamo`, `create_at`, `dia_entrega`,`estado_prestamo`,`prestamo_isbn`,`tipo_usuario`,`libro_id_libro`, `usuario_id_usuario`) VALUES ('1', '08-07-20', '11-07-20',b'0','DASD889885','2', '2', '1');
INSERT INTO `biblioteca`.`prestamos` (`id_prestamo`, `create_at`, `dia_entrega`,`estado_prestamo`,`prestamo_isbn`,`tipo_usuario`,`libro_id_libro`, `usuario_id_usuario`) VALUES ('2', '23-08-20', '11-07-20',b'0','DASD369852','1', '1', '4');
INSERT INTO `biblioteca`.`prestamos` (`id_prestamo`, `create_at`, `dia_entrega`,`estado_prestamo`,`prestamo_isbn`,`tipo_usuario`,`libro_id_libro`, `usuario_id_usuario`) VALUES ('3', '30-09-20', '11-07-20',b'0','DASD478547','3', '4', '3');
INSERT INTO `biblioteca`.`prestamos` (`id_prestamo`, `create_at`, `dia_entrega`,`estado_prestamo`,`prestamo_isbn`,`tipo_usuario`,`libro_id_libro`, `usuario_id_usuario`) VALUES ('4', '05-10-20', '11-07-20',b'0','DASD154212','1', '1', '2');