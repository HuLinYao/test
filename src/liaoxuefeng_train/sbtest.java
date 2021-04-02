package liaoxuefeng_train;

public class sbtest {
    public static void main(String[] args){
        String[] fields={"name","position","sarary"};
        String table="employee";
        buildInsertSql Inser=new buildInsertSql(table,fields);
        String inser=Inser.buildInsretSql(table,fields);
        System.out.println(inser);
        System.out.println(inser.equals("INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)")?"测试成功":"测试失败");


    }
}

class buildInsertSql {
    private String table;
    private String[] fields;

    public buildInsertSql(String table, String[] fields) {
        this.table=table;
        this.fields=fields;
    }


    public String buildInsretSql(String table, String[] fields) {



        var params=new StringBuilder(1024);
        var positions=new StringBuilder(1024);

        for (String s:fields){
            params.append(s+", ");
            positions.append("?, ");
        }

        String s1=params.toString();
        String s2=positions.toString();



        s1=s1.substring(0,s1.length()-2);
        s2=s2.substring(0,s2.length()-2);

        String insertsql="INSERT INTO %s (%s) VALUES (%s)".formatted(table,s1,s2);

        return insertsql;
    }
}