# 解析XML大文件

>5.8G的道琼斯的XML文件并配置好映射关系转入MySQL

# 采用技术

SAX

# TODO

``

``


# 数据库表

```sql
-- auto-generated definition
create table Entity_JSON
(
    id                  char(255) null,
    action              char(255) null,
    date                char(255) null,
    ActiveStatus        char(255) null,
    ProfileNotes        longtext  null,
    Descriptions        text      null,
    NameDetails         text      null,
    DateDetails         text      null,
    CompanyDetails      text      null,
    SanctionsReferences text      null,
    CountryDetails      text      null,
    IDNumberTypers      text      null,
    SourceDescription   text      null,
    VesselsDetails      text      null
) charset = utf8mb4;
```

```sql
-- auto-generated definition
create table Person_JSON
(
    id                  char(255)  null,
    action              char(255)  null,
    date                char(255)  null,
    Gender              char(255)  null,
    ActiveStatus        char(255)  null,
    Deceased            char(255)  null,
    ProfileNotes        longtext   null,
    Descriptions        mediumtext null,
    NameDetails         mediumtext null,
    RoleDetails         mediumtext null,
    DateDetails         mediumtext null,
    BirthPlace          mediumtext null,
    SanctionsReferences mediumtext null,
    Address             mediumtext null,
    CountryDetails      mediumtext null,
    IDNumberTypers      mediumtext null,
    SourceDescription   mediumtext null,
    Images              mediumtext null
) charset = utf8mb4;

-- auto-generated definition
create table publicfigure
(
    id        char(255) null,
    Associate longtext  null
)
    charset = utf8mb4;

-- auto-generated definition
create table specialentity
(
    id        char(255) null,
    Associate longtext  null
)
    charset = utf8mb4;

```