## 赛课系统
### 数据库脚本
```sql

-- 角色表
CREATE TABLE `t_role` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `role_name` varchar(100) DEFAULT NULL,
  `role_desc` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='角色表';

INSERT INTO race.t_role (role_name,role_desc) VALUES
    ('老师','勤劳的园丁');

```

