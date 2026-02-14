FROM node:24-alpine

WORKDIR /app

COPY package.json .

RUN npm i

COPY . .

ARG SECRET=kfkkdkdkd

ENV SECRET2=fffffffffffffff

EXPOSE $PORT

CMD ["npm","start"]
