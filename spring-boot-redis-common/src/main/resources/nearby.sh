#!/bin/bash
cd nearby-svr
git pull
mvn clean install -U  -Dmaven.test.skip=true -P prod

#kill tomcat pid
pidlist=`ps -ef|grep nearby-svr |grep -v "grep"|awk '{print $2}'`
echo "tomcat Id list :$pidlist"
kill -9 $pidlist
echo "KILL $pidlist:"
echo "service stop success"
echo "start tomcat"
#rm -rf /root/soft/nearby-svr/webapps/ROOT
nohup /root/soft/nearby-svr/bin/startup.sh &
tail -f /root/soft/nearby-svr/logs/catalina.out


