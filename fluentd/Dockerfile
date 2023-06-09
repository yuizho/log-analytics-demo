FROM fluent/fluentd:v1.12.0-debian-1.0

USER root
RUN ["apt", "update"]
RUN ["apt", "-y", "upgrade", "ruby"]
RUN ["gem", "install", "fluent-plugin-elasticsearch", "--no-document", "--version", "5.2.0"]
USER fluent