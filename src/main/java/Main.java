import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    DataBase dataBase = new DataBase("src/main/resources");
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print(">>>");
      StringBuilder builder = new StringBuilder();
      for(;;) {
        String s = scanner.nextLine();
        String strip = s.strip();
        if (s.endsWith("\\")) {
          builder.append(strip, 0, strip.length() - 1);
        }else {
          builder.append(strip);
          break;
        }
      }
      System.out.println("executing: " + builder.toString());
      dataBase.execute(builder.toString());
    }
  }
}

/**
 *
 create table stu(\
 id int,\
 name string,\
 primary key(id));

 create table student(\
 id int,\
 name string,\
 primary key(id));

 insert into stu(id, name) values(1, huchang);
  select * from stu;
 select avg(id) from stu;
 select name, avg(id), max(id), min(id), count(name) from stu group by name having avg(id) > 6;
 select name, avg(id) from stu group by name having avg(id) > 6;
 select avg(id) from stu group by name having avg(id) > 6;
 select count(name), id - 4, avg(id) from stu;
 select name, avg(id), max(id), min(id), count(name) from stu group by name having avg(id) > 6;
 select * from stu where id == 4;
 update stu set name=tyx where id==666;
 insert into student(id, name) values(1, A);
 insert into student(id, name) values(1, A);
 insert into student(id, name) values(2, A);
 insert into student(id, name) values(3, A);
 insert into student(id, name) values(4, A);
 insert into student(id, name) values(5, A);

 insert into student(id, name) values(6, B);
 insert into student(id, name) values(7, B);
 insert into student(id, name) values(8, B);
 insert into student(id, name) values(9, B);
 insert into student(id, name) values(10, C);

 select * from stu where name like "%chang";
 insert into stu(id, name) values((15, lebron_james), (16, lebron_james), (17, lebron_james));
 insert into stu(id, name) values((21, james_harden), (20, "lebron_james"), (19, james_harden), (18, james_harden));
 */

/**
 * select max(id) from stu;
 * insert into stu(id, name) values(22, QA);
 * select * from unknow; // error checking
 * insert into unknow(id, name) values(22, QA); // error checking
 * delete from unknow where id == 1; // error checking
 * select name, max(id) , avg(id), min(id) from stu; // error checking
 * select name, max(id) , avg(id), min(id) from stu group by name;
 * select name, max(id) , avg(id), min(id) from stu group by name having avg(id) > 10;
 * select max(id) from stu;
 * insert into stu(id, name) values(22, KD); // error checking
 * delete from stu where name == "KD";
 */

/**
 * 1. 先查看实验结果
 * 2. 然后执行 test 查看编译之后的对象
 * 3. 整体介绍 web page
 * 4. 介绍一些实现细节
 */