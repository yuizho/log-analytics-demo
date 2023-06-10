FROM fluent/fluentd:v1.14.0-debian-1.0

USER root
RUN ["apt", "update"]
RUN ["apt", "-y", "upgrade", "ruby"]
# https://github.com/uken/fluent-plugin-elasticsearch/issues/951
RUN ["gem", "install", "elasticsearch", "--version", "<= 7.14"]
RUN ["gem", "install", "fluent-plugin-elasticsearch", "--no-document", "--version", "5.2.5"]
USER fluent