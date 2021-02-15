FROM node:latest
USER root

WORKDIR /client
COPY . /client

ARG API_URL
ENV REACT_APP_HOST_IP_ADDRESS $API_URL

RUN npm install
COPY . ./

RUN npm run build