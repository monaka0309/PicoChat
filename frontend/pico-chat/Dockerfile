
FROM node:18-alpine AS base
WORKDIR /app
COPY package.json yarn.lock ./
RUN yarn install

# 開発用ステージ
FROM base AS development
COPY . .
EXPOSE 3000
CMD ["yarn", "dev"]


