# log-analytics-demo

## Getting Started
### Launch Servers
```sh
# Fluentd, Elasticsearch, Kibana containers are also started by spring-boot-docker-compose
$ ./mvnw spring-boot:run
```

### Generate logs
```sh
$ curl http://localhost:8080/hello
```

### Confirm Logs from Kibana
See the following document of Fluentd.

https://docs.fluentd.org/container-deployment/docker-compose#step-4-confirm-logs-from-kibana