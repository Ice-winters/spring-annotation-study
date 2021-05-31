package com.ice;

import org.springframework.transaction.TransactionDefinition;

/**
 * @author : Ice-winters
 * @since : 2021-05-31 14:04
 */
public class TestTemp {


    public static void main(String[] args) {
//        PlatformTransactionManager： （平台）事务管理器
//        TransactionDefinition： 事务定义信息(事务隔离级别、传播行为、超时、只读、回滚规则)
//        TransactionStatus： 事务运行状态


        // 使用后端数据库默认的隔离级别，Mysql 默认采用的 REPEATABLE_READ隔离级别 Oracle 默认采用的 READ_COMMITTED隔离级别.
        int isolationDefault = TransactionDefinition.ISOLATION_DEFAULT;

        // 最低的隔离级别，允许读取尚未提交的数据变更，可能会导致脏读、幻读或不可重复读
        int isolationReadUncommitted = TransactionDefinition.ISOLATION_READ_UNCOMMITTED;

        // 允许读取并发事务已经提交的数据，可以阻止脏读，但是幻读或不可重复读仍有可能发生
        int isolationReadCommitted = TransactionDefinition.ISOLATION_READ_COMMITTED;

        // 对同一字段的多次读取结果都是一致的，除非数据是被本身事务自己所修改，可以阻止脏读和不可重复读，但幻读仍有可能发生。
        int isolationRepeatableRead = TransactionDefinition.ISOLATION_REPEATABLE_READ;



    }


}
