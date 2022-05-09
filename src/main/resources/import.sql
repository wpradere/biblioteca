INSERT INTO `biblioteca`.`usuarios` (`id_usuario`,`estado_usuario`, `identificacion_usuario`, `nombre`, `tipo_usuario`) VALUES ('1',b'0', '000001RTG', 'Carlos pardo', '1');
INSERT INTO `biblioteca`.`usuarios` (`id_usuario`,`estado_usuario`, `identificacion_usuario`, `nombre`, `tipo_usuario`) VALUES ('2',b'0', '000002RTG', 'Andres', '3');
INSERT INTO `biblioteca`.`usuarios` (`id_usuario`,`estado_usuario`, `identificacion_usuario`, `nombre`, `tipo_usuario`) VALUES ('3',b'0', '000003RTG', 'Felipe', '2');
INSERT INTO `biblioteca`.`usuarios` (`id_usuario`,`estado_usuario`, `identificacion_usuario`, `nombre`, `tipo_usuario`) VALUES ('4',b'0', '000004RTG', 'Chart buster', '4');


INSERT INTO `biblioteca`.`libros` (`id_libro`,`estado_libro`, `isnb`, `nombre_libro` ) VALUES ('1',b'0', 'HK000001', 'Moby Dick');
INSERT INTO `biblioteca`.`libros` (`id_libro`,`estado_libro`, `isnb`, `nombre_libro` ) VALUES ('2',b'0', 'HK000002', 'El Mundo');
INSERT INTO `biblioteca`.`libros` (`id_libro`,`estado_libro`, `isnb`, `nombre_libro` ) VALUES ('3',b'0', 'HK000003', 'SAnt vit');
INSERT INTO `biblioteca`.`libros` (`id_libro`,`estado_libro`, `isnb`, `nombre_libro` ) VALUES ('4',b'0', 'HK000004', 'Caso by Turner');


INSERT INTO `biblioteca`.`prestamos` (`id_prestamo`, `create_at`, `dia_entrega`,`estado_prestamo`, `prestamo_isnb`, `libro_id_libro`, `usuario_id_usuario`) VALUES ('1', '08-07-20', '11-07-20',b'0', 'HK000002', '2', '1');
INSERT INTO `biblioteca`.`prestamos` (`id_prestamo`, `create_at`, `dia_entrega`,`estado_prestamo`, `prestamo_isnb`, `libro_id_libro`, `usuario_id_usuario`) VALUES ('2', '23-08-20', '11-07-20',b'0', 'HK000001', '1', '4');
INSERT INTO `biblioteca`.`prestamos` (`id_prestamo`, `create_at`, `dia_entrega`,`estado_prestamo`, `prestamo_isnb`, `libro_id_libro`, `usuario_id_usuario`) VALUES ('3', '30-09-20', '11-07-20',b'0', 'HK000004', '4', '3');
INSERT INTO `biblioteca`.`prestamos` (`id_prestamo`, `create_at`, `dia_entrega`,`estado_prestamo`, `prestamo_isnb`, `libro_id_libro`, `usuario_id_usuario`) VALUES ('4', '05-10-20', '11-07-20',b'0', 'HK000003', '1', '2');