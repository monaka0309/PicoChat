# PicoChat
- ユーザーのつぶやきを共有するアプリです。

## 環境構築

```
git clone git@github.com:monaka0309/PicoChat.git
```

## Docker構築

```
docker compose build
```

### 開始時
- `-d` のオプションをつけると、コンテナをバックグラウンドで起動し、すぐにターミナルが戻ります。
- ログは表示されず、コマンドを終了してもコンテナは動作し続けます。
```
docker compose up
```

### 終了時
```
docker compose down
```


