alter table field drop foreign key fk_field_type_model_id;
drop index ix_field_type_model_id on field;

alter table value drop foreign key fk_value_resource_model_id;
drop index ix_value_resource_model_id on value;

drop table if exists field;

drop table if exists history;

drop table if exists reference;

drop table if exists resource;

drop table if exists task;

drop table if exists type;

drop table if exists value;

drop index ix_field_name on field;
drop index ix_resource_uuid on resource;
drop index ix_task_status on task;
drop index ix_type_name on type;
