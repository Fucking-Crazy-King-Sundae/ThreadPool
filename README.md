# ThreadPool

---

## LocalStack

- docker-compose 띄우기
```linux
$ docker-compose up -d
```

- AWS S3 버킷생성
```liux
$ export AWS_ACCESS_KEY_ID=foobar
$ export AWS_SECRET_ACCESS_KEY=foobar
$ aws --endpoint-url=http://localhost:4566 s3 mb s3://file-bucket
```

---
