FROM node:18-alpine as base

FROM base as deps
WORKDIR /app
RUN apk add --no-cache libc6-compat

COPY package.json yarn.lock ./

RUN yarn --frozen-lockfile

COPY . .

CMD [ "yarn", "dev" ]