# Sneakers shop Backend часть

### Создаём базу данных

    docker run --name <Название источника данных> -e POSTGRESQL_USERNAME=<Имя пользователя> -e POSTGRESQL_PASSWORD=<Пароль пользователя> -e POSTGRESQL_DATABASE=<Название базы данных> -p <Порт на хосте>:<Порт на котейнере> bitnami/postgresql

### Создаём схемы

    create schema liquibase;

### Запускаем