```bash
$ mvn clean package dockerfile:build -DskipTests && docker-compose -f docker/docker-compose.yml up
```
