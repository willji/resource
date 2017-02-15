create table field (
  id                            bigint auto_increment not null,
  type_model_id                 bigint not null,
  name                          varchar(255) not null,
  display                       varchar(255) not null,
  field_type                    integer not null,
  default_value                 varchar(255) not null,
  is_required                   tinyint(1) default 0 not null,
  is_multi                      tinyint(1) default 0 not null,
  is_unique                     tinyint(1) default 0 not null,
  created_time                  bigint not null,
  modified_time                 bigint not null,
  created_user                  varchar(64) not null,
  modified_user                 varchar(64) not null,
  constraint ck_field_field_type check ( field_type in (0,1,2,3,4)),
  constraint uq_field_type_model_id_name unique (type_model_id,name),
  constraint pk_field primary key (id)
);

create table history (
  id                            bigint auto_increment not null,
  resource_id                   bigint,
  field_id                      bigint,
  value                         varchar(255) not null,
  created_time                  bigint not null,
  modified_time                 bigint not null,
  created_user                  varchar(64) not null,
  modified_user                 varchar(64) not null,
  constraint pk_history primary key (id)
);

create table reference (
  id                            bigint auto_increment not null,
  constraint_condition          integer not null,
  source_field_id               bigint not null,
  target_field_id               bigint not null,
  created_time                  bigint not null,
  modified_time                 bigint not null,
  created_user                  varchar(64) not null,
  modified_user                 varchar(64) not null,
  constraint ck_reference_constraint_condition check ( constraint_condition in (0,1,2,3)),
  constraint pk_reference primary key (id)
);

create table resource (
  id                            bigint auto_increment not null,
  uuid                          varchar(255) not null,
  name                          varchar(255) not null,
  type_model_id                 bigint not null,
  indexed                       tinyint(1) default 0 not null,
  deleted                       tinyint(1) default 0 not null,
  refs                          integer not null,
  created_time                  bigint not null,
  modified_time                 bigint not null,
  created_user                  varchar(64) not null,
  modified_user                 varchar(64) not null,
  constraint uq_resource_uuid unique (uuid),
  constraint pk_resource primary key (id)
);

create table task (
  id                            bigint auto_increment not null,
  status                        integer not null,
  content                       TEXT not null,
  type_id                       bigint not null,
  message                       TEXT,
  created_time                  bigint not null,
  modified_time                 bigint not null,
  created_user                  varchar(64) not null,
  modified_user                 varchar(64) not null,
  constraint ck_task_status check ( status in (0,1,2)),
  constraint pk_task primary key (id)
);

create table type (
  id                            bigint auto_increment not null,
  name                          varchar(64) not null,
  description                   TEXT,
  locked                        tinyint(1) default 0 not null,
  created_time                  bigint not null,
  modified_time                 bigint not null,
  created_user                  varchar(64) not null,
  modified_user                 varchar(64) not null,
  constraint uq_type_name unique (name),
  constraint pk_type primary key (id)
);

create table value (
  id                            bigint auto_increment not null,
  resource_model_id             bigint not null,
  field_id                      bigint not null,
  value                         varchar(255) not null,
  created_time                  bigint not null,
  modified_time                 bigint not null,
  created_user                  varchar(64) not null,
  modified_user                 varchar(64) not null,
  constraint pk_value primary key (id)
);

create index ix_field_name on field (name);
create index ix_resource_uuid on resource (uuid);
create index ix_task_status on task (status);
create index ix_type_name on type (name);
alter table field add constraint fk_field_type_model_id foreign key (type_model_id) references type (id) on delete restrict on update restrict;
create index ix_field_type_model_id on field (type_model_id);

alter table value add constraint fk_value_resource_model_id foreign key (resource_model_id) references resource (id) on delete restrict on update restrict;
create index ix_value_resource_model_id on value (resource_model_id);

