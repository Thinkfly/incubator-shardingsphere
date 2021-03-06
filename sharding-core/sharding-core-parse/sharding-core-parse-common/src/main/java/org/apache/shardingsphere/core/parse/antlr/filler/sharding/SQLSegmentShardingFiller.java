/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.core.parse.antlr.filler.sharding;

import org.apache.shardingsphere.core.metadata.table.ShardingTableMetaData;
import org.apache.shardingsphere.core.parse.antlr.filler.SQLSegmentFiller;
import org.apache.shardingsphere.core.parse.antlr.sql.segment.SQLSegment;
import org.apache.shardingsphere.core.parse.parser.sql.SQLStatement;
import org.apache.shardingsphere.core.rule.ShardingRule;

/**
 * SQL statement sharding filler.
 * 
 * @author duhongjun
 * @author zhangliang
 * 
 * @param <T> type of SQL segment
 */
public interface SQLSegmentShardingFiller<T extends SQLSegment> extends SQLSegmentFiller {
    
    /**
     * Fill for sharding SQL segment to SQL statement.
     *
     * @param sqlSegment SQL segment
     * @param sqlStatement SQL statement
     * @param sql SQL
     * @param shardingRule databases and tables sharding rule
     * @param shardingTableMetaData sharding table meta data
     */
    void fill(T sqlSegment, SQLStatement sqlStatement, String sql, ShardingRule shardingRule, ShardingTableMetaData shardingTableMetaData);
}
