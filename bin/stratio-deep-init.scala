//Commmons
import com.stratio.deep.commons.annotations._
import com.stratio.deep.commons.config._
import com.stratio.deep.commons.entity._


//Core
import com.stratio.deep.core.context._

//Cassandra
import com.stratio.deep.cassandra.config._
import com.stratio.deep.cassandra.extractor._


//MongoDB
import com.stratio.deep.mongodb.config._
import com.stratio.deep.mongodb.extractor._

//ES
import com.stratio.deep.es.config._
import com.stratio.deep.es.extractor._

//Aerospike
import com.stratio.deep.aerospike.config._
import com.stratio.deep.aerospike.extractor._

//Spark
import org.apache.spark.rdd._
import org.apache.spark.SparkContext._
import org.apache.spark.sql.api.java.JavaSQLContext;
import org.apache.spark.sql.api.java.JavaSchemaRDD;
import org.apache.spark.sql.api.java.Row;

//Scala
import scala.collection.JavaConversions._



val deepContext = new DeepSparkContext(sc)
