#!/bin/bash
docker rm -f system
docker build -t system:latest /dockerhome/system
docker run -d -p 8088:8088 --name system system:latest
dangling_images=$(docker images -qf "dangling=true")

# 判断是否存在悬虚镜像
if [[ -n "$dangling_images" ]]; then
    # 删除悬虚镜像
    docker rmi $dangling_images
    echo "已成功删除悬虚镜像。"
else
    echo "没有悬虚镜像可删除。"
fi