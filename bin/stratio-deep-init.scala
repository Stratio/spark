//Commmons
import com.stratio.deep.commons.annotations._
import com.stratio.deep.commons.config_
import com.stratio.deep.commons.entity_
import com.stratio.deep.commons.exception_
import com.stratio.deep.commons.extractor_
import com.stratio.deep.commons.filter_
import com.stratio.deep.commons.functions_
import com.stratio.deep.commons.impl_
import com.stratio.deep.commons.rdd_
import com.stratio.deep.commons.utils_

//Core
import com.stratio.deep.core.context_
import com.stratio.deep.core.entity_
import com.stratio.deep.core.extractor.client_
import com.stratio.deep.core.function_
import com.stratio.deep.core.rdd_
import com.stratio.deep.core.serializer_
import com.stratio.deep.core.util_

//Cassandra
import com.stratio.deep.cassandra.config_
import com.stratio.deep.cassandra.cql_
import com.stratio.deep.cassandra.entity_
import com.stratio.deep.cassandra.extractor_
import com.stratio.deep.cassandra.functions_
import com.stratio.deep.cassandra.testentity_
import com.stratio.deep.cassandra.util_

//MongoDB
import com.stratio.deep.mongodb.config_
import com.stratio.deep.mongodb.extractor_
import com.stratio.deep.mongodb.testentity_
import com.stratio.deep.mongodb.utils_

//ES
import com.stratio.deep.es.config_
import com.stratio.deep.es.extractor_
import com.stratio.deep.es.testentity_
import com.stratio.deep.es.utils_

//Apache-Cassandra
import org.apache.cassandra.db.marshal.Int32Type;
import org.apache.cassandra.db.marshal.LongType;


//Spark
import org.apache.spark.rdd._
import org.apache.spark.SparkContext._

//Scala
import scala.collection.JavaConversions._



val deepContext = new DeepSparkContext(sc)
