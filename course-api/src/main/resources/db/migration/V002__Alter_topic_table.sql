ALTER TABLE topic DROP COLUMN id;

ALTER TABLE topic ADD COLUMN IF NOT EXISTS id INT PRIMARY KEY;

ALTER TABLE topic ADD COLUMN IF NOT EXISTS identifier VARCHAR NOT NULL;

