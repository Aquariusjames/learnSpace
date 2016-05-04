#!/bin/bash
#author : jack
#date 20160428
export LANG="en.US.utf-8"

#字段分隔符和迭代器（IFS）

#默认字段分隔符回车(/n) CSV读取
:<<EOF
csvDatas="jack,yu,haoyan,ll,dei"

oldIFS=$IFS
IFS=,
for csvdata in $csvDatas;
do
echo csvdata: $csvdata
done

IFS=$oldIFS

echo IFS:$IFS
EOF
#假如有3个文件（no1/test.csv、no2/test.csv、no3/test.csv），如果文件更多，直接按下面格式操作,以下步骤在data目录下执行：
#下面提供2种方法：
#方法1：
#awk -F, '{print $1","$4","$7}' no1/test.csv no2/test.csv no3/test.csv > newtext.csv
#方法2：
#cat no1/test.csv no2/test.csv no3/test.csv | cut -d, -f1,4,7 > newtext.csv


#按行读取文件
oldIFS=$IFS
aaaaa=0
while read passwdLine
do
IFS=:
 for aaline in $passwdLine;
 do
  [ $aaaaa -eq 0 ] && ss=$aaline;
  [ $aaaaa -eq 6 ] && sa=$aaline;
  echo $ss "--------" $sa
  let aaaaa++
 done
aaaaa=0
IFS=$oldIFS
done < /etc/passwd;

echo $IFS

:<<EOF
cat datafile.txt | while read myline
do 
 echo "LINE:"$myline
done

#读取一行数据
cat datafile.txt | while myline=$(line)
do 
 echo "LINE:"$myline
done

#读取一行数据
while myline=$(line)
do 
 echo "LINE:"$myline
done < datafile.txt

until循环
x=0
until[ $x -eq 9 ]
do let++; echo $x;
done

EOF


