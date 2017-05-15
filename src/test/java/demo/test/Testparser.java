package demo.test;

import com.alibaba.druid.sql.ast.SQLExpr;
import com.alibaba.druid.sql.ast.SQLName;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.expr.SQLAggregateExpr;
import com.alibaba.druid.sql.ast.expr.SQLBetweenExpr;
import com.alibaba.druid.sql.ast.expr.SQLBinaryOpExpr;
import com.alibaba.druid.sql.ast.expr.SQLCaseExpr;
import com.alibaba.druid.sql.ast.expr.SQLCastExpr;
import com.alibaba.druid.sql.ast.expr.SQLIdentifierExpr;
import com.alibaba.druid.sql.ast.expr.SQLInListExpr;
import com.alibaba.druid.sql.ast.expr.SQLMethodInvokeExpr;
import com.alibaba.druid.sql.ast.expr.SQLNotExpr;
import com.alibaba.druid.sql.ast.expr.SQLPropertyExpr;
import com.alibaba.druid.sql.ast.expr.SQLUnaryExpr;
import com.alibaba.druid.sql.ast.expr.SQLVariantRefExpr;
import com.alibaba.druid.sql.ast.statement.SQLAlterTableAddColumn;
import com.alibaba.druid.sql.ast.statement.SQLAlterTableAddConstraint;
import com.alibaba.druid.sql.ast.statement.SQLAlterTableAddIndex;
import com.alibaba.druid.sql.ast.statement.SQLAlterTableDropColumnItem;
import com.alibaba.druid.sql.ast.statement.SQLAlterTableDropIndex;
import com.alibaba.druid.sql.ast.statement.SQLAlterTableDropKey;
import com.alibaba.druid.sql.ast.statement.SQLAlterTableDropPrimaryKey;
import com.alibaba.druid.sql.ast.statement.SQLAlterTableItem;
import com.alibaba.druid.sql.ast.statement.SQLAlterTableStatement;
import com.alibaba.druid.sql.ast.statement.SQLColumnDefinition;
import com.alibaba.druid.sql.ast.statement.SQLConstraint;
import com.alibaba.druid.sql.ast.statement.SQLCreateIndexStatement;
import com.alibaba.druid.sql.ast.statement.SQLDropIndexStatement;
import com.alibaba.druid.sql.ast.statement.SQLDropTableStatement;
import com.alibaba.druid.sql.ast.statement.SQLExprTableSource;
import com.alibaba.druid.sql.ast.statement.SQLJoinTableSource;
import com.alibaba.druid.sql.ast.statement.SQLSelectGroupByClause;
import com.alibaba.druid.sql.ast.statement.SQLSelectItem;
import com.alibaba.druid.sql.ast.statement.SQLSelectOrderByItem;
import com.alibaba.druid.sql.ast.statement.SQLSelectQuery;
import com.alibaba.druid.sql.ast.statement.SQLSelectStatement;
import com.alibaba.druid.sql.ast.statement.SQLTableSource;
import com.alibaba.druid.sql.ast.statement.SQLTruncateStatement;
import com.alibaba.druid.sql.dialect.mysql.ast.MySqlPrimaryKey;
import com.alibaba.druid.sql.dialect.mysql.ast.MySqlUnique;
import com.alibaba.druid.sql.dialect.mysql.ast.MysqlForeignKey;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlExtractExpr;
import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableChangeColumn;
import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlAlterTableModifyColumn;
import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlCreateTableStatement;
import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlDeleteStatement;
import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlSelectQueryBlock;
import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUnionQuery;
import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlUpdateStatement;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
import com.alibaba.druid.sql.parser.SQLStatementParser;

public class Testparser {
	public static void main(String args[]) {
		Testparser obj = new Testparser();
//		obj.test("CREATE TABLE `char_columns_test` (`id` int(11) NOT NULL,`c_char` char(255) DEFAULT NULL,PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;");
//		obj.test("CREATE TABLE `xx`.`char_columns_test` (`id` int(11) NOT NULL,`c_char` char(255) DEFAULT NULL,PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;");
//		obj.test("drop table char_columns_test;");
//		obj.test("truncate table char_columns_test;");
		
//		obj.test("create index idx_test on char_columns_test(id) ;");
//		obj.test("drop index  idx_test on char_columns_test;");
		String strAlterSql ="";
//		strAlterSql ="alter table char_columns_test add column id2 int(11) NOT NULL after x;";
//		obj.test(strAlterSql);
//		strAlterSql ="alter table char_columns_test add column id2 int(11) NOT NULL,id3 int(11) NOT NULL;";
//		obj.test(strAlterSql);
//		strAlterSql="alter table char_columns_test add index idx_test(id) ;";
//		obj.test(strAlterSql);
//		strAlterSql="alter table char_columns_test add key idx_test(id) ;";
//		obj.test(strAlterSql);
//		strAlterSql="alter table char_columns_test unique key idx_test(id) ;";
//		obj.test(strAlterSql);
//		strAlterSql = "ALTER TABLE char_columns1 ADD CONSTRAINT MyPrimaryKey PRIMARY KEY (id);";
//		obj.test(strAlterSql);
//		strAlterSql = "ALTER TABLE char_columns1 ADD CONSTRAINT MyUniqueConstraint UNIQUE(c_char);";
//		obj.test(strAlterSql);
//		strAlterSql = "ALTER TABLE char_columns1 drop index idex_test;";
//		obj.test(strAlterSql);
//		strAlterSql = "ALTER TABLE char_columns1 drop key idex_test;";
//		obj.test(strAlterSql);
//		strAlterSql = "ALTER TABLE char_columns1 CHANGE COLUMN c_char c_varchar varchar(255) DEFAULT NULL  ;";
//		obj.test(strAlterSql);
//		strAlterSql = "ALTER TABLE char_columns1 CHANGE COLUMN c_char c_varchar varchar(255) DEFAULT NULL FIRST;";
//		obj.test(strAlterSql);
//		strAlterSql = "ALTER TABLE char_columns1 CHANGE COLUMN c_char c_varchar varchar(255) DEFAULT NULL AFTER id ;";
//		obj.test(strAlterSql);
//		strAlterSql = "ALTER TABLE char_columns1 modify COLUMN c_char  varchar(255) DEFAULT NULL  ;";
//		obj.test(strAlterSql);
//		strAlterSql = "ALTER TABLE char_columns1 modify COLUMN c_char  varchar(255) DEFAULT NULL FIRST;";
//		obj.test(strAlterSql);
//		strAlterSql = "ALTER TABLE char_columns1 modify COLUMN c_char  varchar(255) DEFAULT NULL AFTER id ;";
//		obj.test(strAlterSql);
//		strAlterSql = "ALTER TABLE char_columns1 DROP COLUMN c_char;";
//		obj.test(strAlterSql);
//		strAlterSql = "ALTER TABLE char_columns1 DROP PRIMARY KEY;";
//		obj.test(strAlterSql);
//		strAlterSql = "ALTER TABLE char_columns1 RENAME  TO  char_columns1_1;";
//		obj.test(strAlterSql);
//		strAlterSql = "ALTER TABLE test_yhq.char_columns1 RENAME  AS  test_yhq2.char_columns1_1;";
//		obj.test(strAlterSql);
		
		String strDeleteSql ="";
//		strDeleteSql = "delete a from  test_yhq.char_columns1 a where 1=1;";
//		obj.test(strDeleteSql);
//		strDeleteSql = "delete from  test_yhq.char_columns1 where 1=1;";
//		obj.test(strDeleteSql);
//		strDeleteSql = "delete a from  test_yhq.char_columns1 a inner join  test_yhq.char_columns1 b on a.id =b.id   where 1=1;";
//		obj.test(strDeleteSql);
//		strDeleteSql = "delete a,b from  test_yhq.char_columns1 a inner join  test_yhq.char_columns1 b on a.id =b.id   where 1=1;";
//		obj.test(strDeleteSql);
//		strDeleteSql = "DELETE t1, t2 FROM t1 INNER JOIN t2 INNER JOIN t3 WHERE t1.id=t2.id AND t2.id=t3.id;";
//		obj.test(strDeleteSql);
//		strDeleteSql = "DELETE a, b FROM t1 a INNER JOIN t2 b INNER JOIN t3 WHERE t1.id=t2.id AND t2.id=t3.id;";
//		obj.test(strDeleteSql);
//		strDeleteSql = "DELETE t1, t2 FROM t1 ,t2 using(id)  where 1=1;";
//		obj.test(strDeleteSql);
		
		
		
//	    String strUpdateSql = "";
//		strUpdateSql = "UPDATE t1 SET col1 = col1 + 1,col2 = col1 ;";
//		obj.test(strUpdateSql);
//		strUpdateSql = "UPDATE t SET id = id + 1 ORDER BY id DESC;";
//		obj.test(strUpdateSql);
//		strUpdateSql = "UPDATE items,month SET items.price=month.price WHERE items.id=month.id;";
//		obj.test(strUpdateSql);
//		strUpdateSql = "UPDATE items inner join month on items.id=month.id SET items.price=month.price;";
//		obj.test(strUpdateSql); 
//		strUpdateSql = "UPDATE   EmployeeS AS P SET      P.LEAGUENO = '2000' WHERE    P.EmployeeNO = 95;";
//		obj.test(strUpdateSql);
//		String strCreateIndex = "";
//		strCreateIndex = "CREATE INDEX part_of_name ON customer (name(10));";
//		obj.test(strCreateIndex);
//		strCreateIndex = "CREATE UNIQUE INDEX part_of_name ON customer (name(10));";
//		obj.test(strCreateIndex);
		
		String selectSQl = "select avg(char_columns.id), BIT_AND(char_columns.ID),BIT_OR(char_columns.ID),bit_xor(char_columns.ID),"
				+ "COUNT(char_columns.ID),MAX(distinct char_columns.ID),MIN(distinct char_columns.ID),"
				+ "STD(char_columns.ID),STDDEV(char_columns.ID),STDDEV_POP(char_columns.ID),STDDEV_SAMP(char_columns.ID), "
				+ "sum(id),VAR_POP(char_columns.ID),VAR_SAMP(char_columns.ID),VARIANCE(char_columns.ID)"
				+ " from char_columns where id =1  and name = 'x';";
//		obj.test(selectSQl);
//		selectSQl = "SELECT student_name, GROUP_CONCAT(test_score) "
//				+ "FROM student GROUP BY student_name;";
//		obj.test(selectSQl);
//		selectSQl = "select @@tx_read_only;";
//		obj.test(selectSQl);
//		selectSQl = "SELECT ABS(-1);";
//		obj.test(selectSQl);
//		selectSQl = "SELECT NOT 10,1 AND 1,IF(1<2,'yes','no'),'Monty!' REGEXP '.*';";
//		obj.test(selectSQl);
//		selectSQl = "select 'David_' LIKE 'David|_' ESCAPE '|','a' LIKE 'ae' COLLATE utf8_general_ci";
//		obj.test(selectSQl);
//		selectSQl = "SELECT 1 IS NULL,1 IS NOT UNKNOWN,1 IS TRUE, 0 IS FALSE,2 IN (0,3,5,7), 2 >= 2,1 = 0,2 BETWEEN 1 AND 3;";
//		obj.test(selectSQl);
//		selectSQl = "select CAST(expr AS datetime(6) ), CAST(expr AS date ), CAST(expr AS time(6) ) from char_columns where id =1  and name = 'x';";
//		TODO:NOT SUPPORTED
//		selectSQl = "select CAST(expr AS  nchar(2) CHARACTER SET utf8),CAST(expr AS  char(2)), CAST(expr AS  char(2) CHARACTER SET utf8 ),CAST(expr AS  char(2) CHARACTER SET latin1 )  from char_columns where id =1  and name = 'x';";
//		selectSQl = "select CAST(expr AS  char(2) CHARACTER SET utf8 ),CAST(expr AS  SIGNED INT ),CAST(expr AS unSIGNED INT )  from char_columns where id =1  and name = 'x';";
//		obj.test(selectSQl);
//		selectSQl = "select CONVERT(expr ,  char(2))   from char_columns where id =1  and name = 'x';";
//		obj.test(selectSQl);
//	    selectSQl = "SELECT CASE 1 WHEN 1 THEN 'one'  WHEN 2 THEN 'two' ELSE 'more' END, CASE WHEN 1>0 THEN 'true' ELSE 'false' END;";
//		obj.test(selectSQl);
//		selectSQl = "SELECT 3 DIV 5, - (2), 3/5;";
//		obj.test(selectSQl);
//		selectSQl = "SELECT ~5 , SELECT 29 & 15;";
//		obj.test(selectSQl);
//		selectSQl = "SELECT LTRIM('  barbar'),TRIM(LEADING 'x' FROM 'xxxbarxxx'),SOUNDEX('Hello'), CONVERT('abc' USING utf8);";
//		obj.test(selectSQl);
//		selectSQl = "SELECT SOUNDEX('Hello'),CHAR(77,121,83,81,'76');";
//		obj.test(selectSQl);
//		selectSQl = "SELECT student_name, GROUP_CONCAT(DISTINCT test_score order by id asc,test_score2 DESC SEPARATOR \",,\") FROM student GROUP BY student_name;";
//		obj.test(selectSQl);
//		selectSQl = "select char_columns.id from char_columns  where id =1 order by id desc;";
//		obj.test(selectSQl);
//		selectSQl = "select * from (select * from char_columns where id =1 order by id) x;";
//		obj.test(selectSQl);
//		selectSQl = "select * from char_columns where id in(select id from char_columns where id =1 ) ;";
//		obj.test(selectSQl);
//		selectSQl = "SELECT /*+ NO_RANGE_OPTIMIZATION(t3 PRIMARY, f2_idx) */ f1 FROM t3 WHERE f1 > 30 AND f1 < 33;";
//		obj.test(selectSQl);
//		selectSQl = "SELECT  * FROM t1 inner join t2 on t1.id =t2.id WHERE t1.f1 > 30;";
//		obj.test(selectSQl);
		
//		selectSQl = "SELECT  id,sum(x),(select * from id) FROM t1 group by id desc having count(*)<3 limit 1;";
//		obj.test(selectSQl);
//		selectSQl = "SELECT  id  FROM (select id,name from tb) x   where id =1;";
//		obj.test(selectSQl);
//		selectSQl = "SELECT  id  FROM  x   where id =1 union all SELECT  id  FROM  y   where id =1 ;";
//		obj.test(selectSQl);
//		
//		selectSQl = "SELECT TIMESTAMPADD(WEEK,1,'2003-01-02'), TIMESTAMPDIFF(MONTH,'2003-02-01','2003-05-01'),DATE_ADD(OrderDate,INTERVAL 2 DAY) AS OrderPayDate,ADDDATE('2008-01-02', INTERVAL 31 DAY),ADDDATE('2008-01-02', 31),EXTRACT(YEAR FROM '2009-07-02') FROM Orders;";
//		obj.test(selectSQl);
//		selectSQl = "SELECT * FROM Orders as t;";
//		obj.test(selectSQl);
//		selectSQl = "select 1,null,'x','xxx';";
//		obj.test(selectSQl);
//		selectSQl = "select * from table1 a inner join table2 b on a.id =b.id "
//				+ "inner join table3 c on b.id =c.id;";
//		obj.test(selectSQl);
//		selectSQl = "select * from table1 a inner join table2 b on a.id =b.id "
//				+ "inner join table3 c on a.id =c.id;";
//		obj.test(selectSQl);
//		selectSQl = "select * from table1 a left join table2 b on a.id =b.id "
//				+ "left join table3 c on a.id =c.id;";
//		obj.test(selectSQl);
//		selectSQl = "select * from table1 a left join table2 b on a.id =b.id "
//				+ "inner join table3 c on a.id =c.id;";
//		obj.test(selectSQl);
//		selectSQl = "select  CONCAT(A,b),count(*) from table1 GROUP BY CONCAT(A,b);";
//		obj.test(selectSQl);
//		selectSQl = "select  id,count(*) from table1 GROUP BY id having count(*)>1;";
//		obj.test(selectSQl);
//		selectSQl = "select  id,count(*) from table1 GROUP BY table.id having count(*)>1;";
//		obj.test(selectSQl);
//		selectSQl = "select  id,count(*) from table1 GROUP BY id order by count(*);";
//		obj.test(selectSQl);
//		selectSQl = "select  id from db.table1 GROUP BY db.table1.id;";
//		obj.test(selectSQl);

//		selectSQl = "select  id,'abc' from db.table1 GROUP BY db.table1.id;";
//		selectSQl = "select * from sharding_two_node a natural join sharding_four_node b  ;";
//		obj.test(selectSQl);
//		selectSQl = "select * from sharding_two_node a where id = (select min(id) from sharding_two_node)  ;";
//		obj.test(selectSQl);
//		selectSQl = "SELECT column1 FROM t1 AS x  WHERE x.column1 = (SELECT column1 FROM t2 AS x "
//				+ "WHERE x.column1 = (SELECT column1 FROM t3 "
//				+ "WHERE x.column2 = t3.column1));";
//		obj.test(selectSQl);
//		selectSQl = "SELECT s1 FROM t1 WHERE s1 = ANY (SELECT s1 FROM t2);";
//		obj.test(selectSQl);
//		selectSQl = "SELECT s1 FROM t1 WHERE s1 = SOME (SELECT s1 FROM t2);";
//		obj.test(selectSQl);
//		selectSQl = "SELECT s1 FROM t1 WHERE s1 > ALL (SELECT s1 FROM t2);";
//		obj.test(selectSQl);
//		selectSQl = "SELECT * FROM t1  WHERE (col1,col2) = (SELECT col3, col4 FROM t2 WHERE id = 10);";
//		obj.test(selectSQl);
//		selectSQl = "SELECT column1 FROM t1 WHERE EXISTS (SELECT * FROM t2);";
//		obj.test(selectSQl);
//		selectSQl = "SELECT column1 FROM t1 WHERE Not EXISTS (SELECT * FROM t2);";
//		obj.test(selectSQl);
//		selectSQl = "SELECT (SELECT s2 FROM t1);";
//		obj.test(selectSQl);
//		selectSQl = "SELECT 1 + 1 FROM DUAL;";
//		obj.test(selectSQl);
//		selectSQl = "select * from sharding_two_node where id in(select id from sharding_four_node);";
//		obj.test(selectSQl);
//		selectSQl = "select * from t1 where s1 in(1,(select s1 from t2));";
//		obj.test(selectSQl);
//		selectSQl = "select distinct pad from sbtest1;";
//		obj.test(selectSQl);
//		selectSQl = "select distinctrow pad from sbtest1;";
//		obj.test(selectSQl);
		selectSQl = "select distinct sql_big_result pad from sbtest1;";
		obj.test(selectSQl);
		//not support
		selectSQl = "select sql_big_result distinct pad from sbtest1;";
		obj.test(selectSQl);
		
	}
	public void test(String sql){
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println(sql);
		SQLStatementParser parser = new MySqlStatementParser(sql);
		SQLStatement statement = parser.parseStatement();
		if(statement instanceof MySqlCreateTableStatement){
			MySqlCreateTableStatement createStment = (MySqlCreateTableStatement)statement;
			SQLExpr expr = createStment.getTableSource().getExpr();
			if (expr instanceof SQLPropertyExpr) {
				SQLPropertyExpr propertyExpr = (SQLPropertyExpr) expr;
				System.out.println((propertyExpr.getOwner().toString()));
				System.out.println(propertyExpr.getName());
			} else if (expr instanceof SQLIdentifierExpr) {
				SQLIdentifierExpr identifierExpr = (SQLIdentifierExpr) expr;
				System.out.println(identifierExpr.getName());
			} else {
				System.out.println(expr.getClass() + "\n");
			}
			
		}
		else if (statement instanceof SQLAlterTableStatement) {
			SQLAlterTableStatement alterStatement = (SQLAlterTableStatement) statement;
			SQLExprTableSource tableSource = alterStatement.getTableSource();
			for (SQLAlterTableItem alterItem : alterStatement.getItems()) {
				if (alterItem instanceof SQLAlterTableAddColumn) {
					SQLAlterTableAddColumn addColumn = (SQLAlterTableAddColumn) alterItem;
					boolean isFirst = addColumn.isFirst();
					SQLName afterColumn = addColumn.getAfterColumn();
					if (afterColumn != null) {
						System.out.println(sql + ": afterColumns:\n" + afterColumn.getClass().toString() + "\n");
					}
					for (SQLColumnDefinition columnDef : addColumn.getColumns()) {

					}
				} else if (alterItem instanceof SQLAlterTableAddIndex) {
					SQLAlterTableAddIndex addIndex = (SQLAlterTableAddIndex) alterItem;
					SQLName name = addIndex.getName();
					System.out.println(sql + ":indexname:\n" + name.getClass().toString() + "\n");
					String type = addIndex.getType();
					addIndex.isUnique();// ??
					for(SQLSelectOrderByItem item: addIndex.getItems()){
						System.out.println(sql + ": item.getExpr():\n" + item.getExpr().getClass().toString() + "\n");
					}
				} else if (alterItem instanceof SQLAlterTableAddConstraint) {
					SQLAlterTableAddConstraint addConstraint = (SQLAlterTableAddConstraint) alterItem;
					SQLConstraint constraint = addConstraint.getConstraint();
					if(constraint instanceof MySqlUnique){
						MySqlUnique unique = (MySqlUnique)constraint;
						unique.getName();
					}else if(constraint instanceof MySqlPrimaryKey){
						
					}else if(constraint instanceof MysqlForeignKey){
						System.out.println("NOT SUPPORT\n");
					}
					
					System.out.println(sql + ": constraint:\n" + constraint.getClass().toString() + "\n");
				} else if (alterItem instanceof SQLAlterTableDropIndex) {
					SQLAlterTableDropIndex dropIndex = (SQLAlterTableDropIndex) alterItem;
					SQLIdentifierExpr indexName = (SQLIdentifierExpr)dropIndex.getIndexName();
					String strIndexName = indexName.getName();
				} else if (alterItem instanceof SQLAlterTableDropKey) {
					SQLAlterTableDropKey dropIndex = (SQLAlterTableDropKey) alterItem;
					SQLIdentifierExpr indexName = (SQLIdentifierExpr)dropIndex.getKeyName();
					String strIndexName = indexName.getName();
				} else if (alterItem instanceof MySqlAlterTableChangeColumn) {
					MySqlAlterTableChangeColumn changeColumn = (MySqlAlterTableChangeColumn) alterItem;
					boolean isFirst = changeColumn.isFirst();
					SQLIdentifierExpr afterColumn = (SQLIdentifierExpr)changeColumn.getAfterColumn();
//					SQLExpr afterColumn = changeColumn.getAfterColumn();
					if (afterColumn != null) { 
						String strAfterColumn = afterColumn.getName();
					}
					SQLColumnDefinition columnDef = changeColumn.getNewColumnDefinition();
				} else if (alterItem instanceof MySqlAlterTableModifyColumn) {
					MySqlAlterTableModifyColumn modifyColumn = (MySqlAlterTableModifyColumn) alterItem;
					boolean isFirst = modifyColumn.isFirst();
					SQLExpr afterColumn = modifyColumn.getAfterColumn();
					if (afterColumn != null) {
						System.out.println(sql + ": afterColumns:\n" + afterColumn.getClass().toString() + "\n");
					}
					SQLColumnDefinition columnDef = modifyColumn.getNewColumnDefinition();
				} else if (alterItem instanceof SQLAlterTableDropColumnItem) {
					SQLAlterTableDropColumnItem dropColumn = (SQLAlterTableDropColumnItem) alterItem;
					for (SQLName dropName : dropColumn.getColumns()) {
						System.out.println(sql + ":dropName:\n" + dropName.getClass().toString() + "\n");
					}
				} else if (alterItem instanceof SQLAlterTableDropPrimaryKey) {
					SQLAlterTableDropPrimaryKey dropPrimary = (SQLAlterTableDropPrimaryKey) alterItem;
				} else {
					System.out.println(sql + ":\n" + alterItem.getClass().toString() + "\n");
				}
				System.out.println("\n"+statement.toString());
			}
		} else if (statement instanceof SQLDropTableStatement) { 
		}  else if (statement instanceof SQLTruncateStatement) {
			//TODO:Sequence?
		} else if(statement instanceof SQLDropIndexStatement){
			//TODO
		}else if(statement instanceof MySqlDeleteStatement){
			MySqlDeleteStatement deleteStatement = (MySqlDeleteStatement)statement;
			SQLTableSource tableSource = deleteStatement.getTableSource();
			
			System.out.println(sql + ":getTableSource:" + tableSource.getClass().toString() + "\n");
			if(deleteStatement.getFrom()!= null){
				System.out.println(sql + ":getFrom:" + deleteStatement.getFrom().getClass().toString() + "\n");
			}
			System.out.println("\n");
		} else if(statement instanceof MySqlUpdateStatement){
			MySqlUpdateStatement updateStatement = (MySqlUpdateStatement)statement;
			SQLTableSource tableSource = updateStatement.getTableSource();
			
			System.out.println(sql + ":getTableSource:" + tableSource.getClass().toString() + "\n");
			System.out.println("\n"+statement.toString());
			
		} else if(statement instanceof SQLCreateIndexStatement){
			SQLCreateIndexStatement stament = (SQLCreateIndexStatement)statement;
			SQLTableSource tableSource = stament.getTable();
			System.out.println(sql + ":getTableSource:" + tableSource.getClass().toString() + "\n");
			System.out.println(sql + stament.getType());
		}else if(statement instanceof SQLSelectStatement){
			SQLSelectStatement stament = (SQLSelectStatement)statement;
			SQLSelectQuery sqlSelectQuery  = stament.getSelect().getQuery();
			if (sqlSelectQuery instanceof MySqlSelectQueryBlock) {
				MySqlSelectQueryBlock selectQueryBlock = (MySqlSelectQueryBlock)sqlSelectQuery;
				SQLTableSource fromSource = selectQueryBlock.getFrom();
				if(fromSource instanceof SQLJoinTableSource){
					SQLJoinTableSource fromJoinSource = (SQLJoinTableSource)fromSource;
					System.out.println("SQLJoinTableSource:");
					System.out.println("all:" + fromJoinSource.toString());
					System.out.println("left:" + fromJoinSource.getLeft().toString() + ",class" + fromJoinSource.getLeft().getClass());
					System.out.println("right:" + fromJoinSource.getRight().toString() + ",class" + fromJoinSource.getRight().getClass());
					System.out.println(   "---------------------------" );
				}
				for(SQLSelectItem item :selectQueryBlock.getSelectList()){
					if(item.getExpr()!=null){
						SQLExpr func = item.getExpr();
						if(func instanceof SQLAggregateExpr){
							System.out.println(   "SQLAggregateExpr:" );
							SQLAggregateExpr agg = (SQLAggregateExpr)func;
							System.out.println(   "MethodName:" +agg.getMethodName()+",getArguments size ="+agg.getArguments().size()+",Option:"+agg.getOption());
							System.out.println(   "---------------------------" );
						}
						else if(func instanceof SQLMethodInvokeExpr){
							System.out.println(   "SQLMethodInvokeExpr:" );
							SQLMethodInvokeExpr method = (SQLMethodInvokeExpr)func;
							System.out.println(   "MethodName:" +method.getMethodName()+",getArguments size ="+method.getParameters().size()+",OWNER:"+method.getOwner());
							System.out.println(   "---------------------------" );
						}else if(func instanceof SQLCastExpr){
							SQLCastExpr cast = (SQLCastExpr)func;
							System.out.println(   "SQLCastExpr:" ); 
							System.out.println(   "Expr:" +cast.getExpr().getClass()+",getDataType:"+cast.getDataType()  );
							System.out.println(   "---------------------------" ); 
						}
						else if(func instanceof SQLBinaryOpExpr){
							SQLBinaryOpExpr Op = (SQLBinaryOpExpr)func;
							System.out.println(   "SQLBinaryOpExpr:" ); 
							System.out.println(   "left:" +Op.getLeft().getClass() );
							System.out.println(   "right:"+Op.getRight().getClass());
							System.out.println(   "operator:"+Op.getOperator().getClass() );
							System.out.println(   "dbtype:"+Op.getDbType()  );
							System.out.println(   "---------------------------" ); 
						}else if(func instanceof SQLUnaryExpr){
							SQLUnaryExpr Op = (SQLUnaryExpr)func;
							System.out.println(   "SQLUnaryExpr:" ); 
							System.out.println(   "EXPR:" +Op.getExpr().getClass() );
							System.out.println(   "operator:"+Op.getOperator().getClass() );
							System.out.println(   "---------------------------" ); 
						}
						else if(func instanceof SQLBetweenExpr){
							SQLBetweenExpr between = (SQLBetweenExpr)func;
							System.out.println(   "SQLBetweenExpr:" ); 
							System.out.println(   "begin EXPR:" +between.getBeginExpr() );
							System.out.println(   "end EXPR:" +between.getEndExpr());
							System.out.println(   "isnot :"+between.isNot() );
							System.out.println(   "test :"+between.getTestExpr() );
							System.out.println(   "---------------------------" ); 
						}else if(func instanceof SQLInListExpr){
							SQLInListExpr in = (SQLInListExpr)func;
							System.out.println(   "SQLInListExpr:" ); 
							System.out.println(   "EXPR:" +in.getExpr());
							System.out.println(   "isnot :"+in.isNot() );
							System.out.println(   "getTargetList size :"+in.getTargetList().size());
							System.out.println(   "---------------------------" ); 
						}else if(func instanceof SQLNotExpr){
							SQLNotExpr not = (SQLNotExpr)func;
							System.out.println(   "SQLNotExpr:" ); 
							System.out.println(   "EXPR:" +not.getExpr());
							System.out.println(   "---------------------------" ); 
						}
						else if(func instanceof MySqlExtractExpr){
							MySqlExtractExpr extract = (MySqlExtractExpr)func;
							System.out.println(   "MySqlExtractExpr:" ); 
							System.out.println(   "value:" +extract.getValue());
							System.out.println(   "unit:" +extract.getUnit());
							System.out.println(   "---------------------------" ); 
						}
						else if(func instanceof SQLCaseExpr){
							SQLCaseExpr Case = (SQLCaseExpr)func;
							System.out.println(   "SQLCaseExpr:" ); 
							System.out.println(   "value:" +Case.getValueExpr());
							System.out.println(   "else:" +Case.getElseExpr());
							System.out.println(   "items size:" +Case.getItems().size());
							System.out.println(   "---------------------------" ); 
						}
						else if(func instanceof SQLVariantRefExpr){
							SQLVariantRefExpr variant = (SQLVariantRefExpr)func;
							System.out.println(   "SQLVariantRefExpr:" ); 
							System.out.println(   "name:" +variant.getName());
							System.out.println(   "Global:" +variant.isGlobal());
							System.out.println(   "index:" +variant.getIndex());
							System.out.println(   "---------------------------" ); 
						}
//						SQLAllColumnExpr
						else{
//							MySqlOutputVisitor
							System.out.println(   "item.getExpr():   :"+item.getExpr().getClass().toString() + "\n");
						}
					}
				}
//				SQLBinaryOpExpr
//				MySqlIntervalUnit
//				SQLIntegerExpr
//				SQLOrderBy
//				SQLSelect
//				SQLInSubQueryExpr
				if (selectQueryBlock.getGroupBy() != null) {
					SQLSelectGroupByClause groupBy = selectQueryBlock.getGroupBy();
					for(SQLExpr groupByItem:groupBy.getItems()){
						System.out.println(   "groupByItem:" ); 
						System.out.println(   "class :" +groupByItem.getClass());
						System.out.println(   "---------------------------" ); 
					}
					
					if(groupBy.getHaving()!=null){
						SQLExpr having = groupBy.getHaving();
						System.out.println(   "having:" ); 
						System.out.println(   "class :" +having.getClass());
						System.out.println(   "---------------------------" ); 
					}
					//with rollup...
				}
				if (selectQueryBlock.getOrderBy() != null) {
					for(SQLSelectOrderByItem orderItem :selectQueryBlock.getOrderBy().getItems()){ 
						System.out.println(   "OrderBy:" ); 
						System.out.println(   "class :" +orderItem.getExpr().getClass());
						System.out.println(   "---------------------------" ); 
					}
				}
			} else if (sqlSelectQuery instanceof MySqlUnionQuery) { 
			}
			
		}else{ 
			// to do further
		}
	}
}
