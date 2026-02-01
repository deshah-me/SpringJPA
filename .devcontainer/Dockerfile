FROM maven:3.9.6-eclipse-temurin-17
ARG USERNAME=vscode
ARG UID=1000
ARG GID=1000
RUN groupadd -g ${GID} ${USERNAME} && useradd -s /bin/bash -u ${UID} -g ${GID} -m ${USERNAME}
WORKDIR /workspace
USER ${USERNAME}
