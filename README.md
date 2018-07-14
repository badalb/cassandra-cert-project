$ cqlsh
Connected to Test Cluster at 127.0.0.1:9042.
[cqlsh 5.0.1 | Cassandra 3.11.2 | CQL spec 3.4.4 | Native protocol v4]
Use HELP for help.
cqlsh> DESCRIBE KEYSPACES;

system_schema  system_auth  system  system_distributed  system_traces  test01

cqlsh> CREATE KEYSPACE edureka
   ...     WITH REPLICATION = {
   ...         'class': 'SimpleStrategy', 
   ...         'replication_factor': 1
   ...     };
cqlsh> DESCRIBE KEYSPACES;

system_schema  system   system_distributed  test01
system_auth    edureka  system_traces     

cqlsh> use edureka;
cqlsh:edureka> CREATE TABLE movies (title text, also_viewed_title text, count int, PRIMARY KEY (title, count));
cqlsh:edureka> describe movies;

CREATE TABLE edureka.movies (
    title text,
    count int,
    also_viewed_title text,
    PRIMARY KEY (title, count)
) WITH CLUSTERING ORDER BY (count ASC)
    AND bloom_filter_fp_chance = 0.01
    AND caching = {'keys': 'ALL', 'rows_per_partition': 'NONE'}
    AND comment = ''
    AND compaction = {'class': 'org.apache.cassandra.db.compaction.SizeTieredCompactionStrategy', 'max_threshold': '32', 'min_threshold': '4'}
    AND compression = {'chunk_length_in_kb': '64', 'class': 'org.apache.cassandra.io.compress.LZ4Compressor'}
    AND crc_check_chance = 1.0
    AND dclocal_read_repair_chance = 0.1
    AND default_time_to_live = 0
    AND gc_grace_seconds = 864000
    AND max_index_interval = 2048
    AND memtable_flush_period_in_ms = 0
    AND min_index_interval = 128
    AND read_repair_chance = 0.0
    AND speculative_retry = '99PERCENTILE';

cqlsh:edureka> select * from movies;

 title | count | also_viewed_title
-------+-------+-------------------

(0 rows)
cqlsh:edureka> 
