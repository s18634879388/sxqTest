
ps -ef|grep sxqTest-1.0-SNAPSHOT.jar|awk '{print $2}'|xargs kill -9

mvn package

cp target/sxqTest-1.0-SNAPSHOT.jar /root/sxqtest/sxqTest/sxqTest-1.0-SNAPSHOT.jar

nohup java -jar /root/sxqtest/sxqTest/sxqTest-1.0-SNAPSHOT.jar > /root/sxqtest/sxqTest/nohup.out &


