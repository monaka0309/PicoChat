
FROM node:18-alpine AS base
WORKDIR /app
COPY package.json yarn.lock ./
RUN yarn install

# 開発用ステージ
FROM base AS development
COPY . .
ENV NODE_ENV=development
EXPOSE 3000
CMD ["yarn", "dev"]

# 本番用ステージ
FROM base AS production
COPY . .
ENV NODE_ENV=production
RUN yarn build
RUN yarn install --production --frozen-lockfile
RUN rm -rf /app/.next/cache
RUN addgroup -S appgroup && adduser -S appuser -G appgroup
USER appuser
EXPOSE 3000
CMD ["yarn", "start"]





