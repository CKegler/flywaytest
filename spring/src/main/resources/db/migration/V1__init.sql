create table catalog_entry
(
	guid uuid,
	vid uuid,
	version bigint,
	name text not null,
	description text,
	owner uuid,
	tags text[],
	created_by uuid not null,
	created_on timestamptz not null,
	updated_by uuid,
	updated_on timestamptz,
	constraint catalog_entry_pk
		primary key (vid, version)
);

