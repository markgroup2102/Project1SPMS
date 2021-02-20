create schema project1

create table project1.roles(
	type TEXT PRIMARY key
);

insert into project1.roles(values (
'author'),
('ast-editor'),
('gen-editor'),
('sen-editor')
);

create table genres VALUES(
	genre TEXT PRIMARY KEY
);

insert into genres(
VALUES 
('FICTION'),
('NON-FICTION'),
('FAN-FICTION')
);

create table priority(
	level TEXT PRIMARY KEY
);

insert into priority(
	VALUES
	('NORMAL'),
	('HIGH-PRIORITY')
);

create table story_pitch_status (
	status TEXT PRIMARY KEY
);

insert into story_pitch_status (
VALUES 
('on-hold'),                  -- When a book exceeds allotted points 
('pending-level1-approval'),  -- awaiting assistant approval
('pending-level2-approval'),  -- awaiting general approval
('pending-level3-approval'),  -- awaiting senior approval
('changes-made-pending-author-approval'), -- if the senior 
('pitch-approved-awaiting-draft'),
('draft-submitted-pending-approval'),
('draft-awaiting-author-revision'),
('published'),
('rejected - market dip in subject matter'),
('rejected - inventory glut'),
('rejected - genre conflict'),
('rejected - flat writing'),
('rejected - lack of character depth'),
('rejected - lack of content'),
('rejected - lack of authority'),
('rejected - book tone '),
('rejected - failure to follow instructions ')

);

create table story_type (
	type_id SERIAL PRIMARY KEY,
	type TEXT UNIQUE NOT NULL,
	weighted_value INTEGER NOT NULL
);

insert into story_type(
VALUES
	(default, 'Novel', 50),
	(default,'Novella', 25),
	(default,'Short Story', 20),
	(default,'Atricle', 10)
);

create table people(
	id SERIAL PRIMARY KEY,
	first_name TEXT NOT NULL,
	last_name TEXT NOT NULL,
	role TEXT NOT NULL REFERENCES roles(type),
	points_in_queue INTEGER NOT NULL
);

-- This is inserting the employees we'll need 
insert into people (
VALUES 
(default,'Samuel','Serious','sen-editor',0),
(default,'Tyrone','Thoughtprovoker','gen-editor',0),
(default,'Anita','Goodbook','gen-editor',0),
(default,'Calvin','Bookburner','gen-editor',0),
(default,'Jazmyne ','Factchecker','gen-editor',0),
(default,'Juquanna','Cutloose','sen-editor',0),
(default,'Heywood','Starwarsbegood','gen-editor',0),
(default,'Obviously','Fakename','ast-editor',0),
(default,'Victor','Shun','ast-editor',0),
(default,'Bradley','Pitte','ast-editor',0)
);

-- This is inserting the authors 
insert into people(
VALUES
(default,'Steven','Bling','author',0),
(default,'Tom','Clampsy','author',0),
(default,'Juan','Ghramcracker','author',0),
(default,'Jk','Bowling','author',0),
(default,'Scauld','Doll','author',0),
(default,'Maura','Deeb','author',0),
(default,'James','Trickington','author',0),
(default,'Aural','Stein','author',0),
(default,'Arthur','Seeclark','author',0),
(default,'Phillip','kaydich','author',0),
(default,'Furnace','Hemmingpath','author',0),
(default,'Eyesick','Asimove','author',0),
(default,'Hugh','Mann','author',0)
);

create table story_pitches(
	story_id SERIAL PRIMARY KEY,
	author_id INTEGER NOT NULL REFERENCES people(id),
	title TEXT NOT NULL, 
	tag_line TEXT NOT NULL,
	description TEXT NOT NULL,
	genre TEXT NOT NULL REFERENCES genres(genre),
	page_count INTEGER NOT NULL,
	type INTEGER NOT NULL REFERENCES story_type(type_id),
	est_comp_date DATE NOT NULL,
	status TEXT NOT NULL REFERENCES story_pitch_status(status),
	priority TEXT NOT NULL REFERENCES priority(level)
);

create table story_drafts(
	id SERIAL PRIMARY KEY, 
	story_id INTEGER NOT NULL REFERENCES story_pitches(story_id),
	draft_link TEXT NOT NULL
);

create table story_artifacts(
	artifact_id SERIAL PRIMARY KEY,
	story_id INTEGER NOT NULL REFERENCES story_pitches(story_id),
	artifact_link TEXT NOT NULL
);

create table additional_details_message(
	request_id SERIAL PRIMARY KEY,
	sender_id INTEGER NOT NULL REFERENCES people(id),
	receiver_id INTEGER NOT NULL REFERENCES people(id),
	story_id INTEGER NOT NULL REFERENCES story_pitches(story_id),
	message_text TEXT NOT NULL
);

create table genre_committees(
	tracking_id SERIAL PRIMARY KEY, 
	person_id INTEGER NOT NULL REFERENCES people(id),
	genre TEXT NOT NULL REFERENCES genres(genre)
);

create table story_approval_history(
	approval_id SERIAL PRIMARY KEY,
	approver_id INTEGER NOT NULL REFERENCES people(id),
	story_id INTEGER NOT NULL REFERENCES story_pitches(story_id),
	status TEXT NOT NULL REFERENCES story_pitch_status(status),
	entry_date DATE NOT NULL
);


